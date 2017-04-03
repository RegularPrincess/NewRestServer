package my.simple.domain;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Created by jmfedorov on 02.04.17.
 */
@Entity
@Table(name = "room", schema = "public", catalog = "postgres")
public class RoomEntity implements my.simple.domain.Entity{
    private int id;
    private Integer number;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoomEntity that = (RoomEntity) o;

        if (id != that.id) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public Class gettype() {
        return this.getClass();
    }
}
