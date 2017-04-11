package my.simple.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jmfedorov on 02.04.17.
 */
@Entity
public class CostEntity {
    private int id;
    private int amount;
    private String object;
    private Date createTime;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CostEntity that = (CostEntity) o;

        if (id != that.id) return false;
        if (amount != that.amount) return false;
        return object != null ? object.equals(that.object) : that.object == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + amount;
        result = 31 * result + (object != null ? object.hashCode() : 0);
        return result;
    }
}
