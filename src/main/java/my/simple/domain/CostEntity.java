package my.simple.domain;

import javax.persistence.*;

/**
 * Created by jmfedorov on 02.04.17.
 */
@Entity
@Table(name = "cost", schema = "public", catalog = "postgres")
public class CostEntity {
    private int id;
    private int amount;
    private int idAuthor;
    private String object;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount", nullable = false)
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "id_author", nullable = false)
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Basic
    @Column(name = "object", nullable = false, length = 300)
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
        if (idAuthor != that.idAuthor) return false;
        if (object != null ? !object.equals(that.object) : that.object != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + amount;
        result = 31 * result + idAuthor;
        result = 31 * result + (object != null ? object.hashCode() : 0);
        return result;
    }
}
