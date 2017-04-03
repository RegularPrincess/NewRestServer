package my.simple.domain;

import javax.persistence.*;

/**
 * Created by jmfedorov on 02.04.17.
 */
@Entity
@Table(name = "debit", schema = "public", catalog = "postgres")
public class DebitEntity {
    private int pyingUser;
    private int idCost;
    private int id;

    @Basic
    @Column(name = "pying_user", nullable = false)
    public int getPyingUser() {
        return pyingUser;
    }

    public void setPyingUser(int pyingUser) {
        this.pyingUser = pyingUser;
    }

    @Basic
    @Column(name = "id_cost", nullable = false)
    public int getIdCost() {
        return idCost;
    }

    public void setIdCost(int idCost) {
        this.idCost = idCost;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DebitEntity that = (DebitEntity) o;

        if (pyingUser != that.pyingUser) return false;
        if (idCost != that.idCost) return false;
        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pyingUser;
        result = 31 * result + idCost;
        result = 31 * result + id;
        return result;
    }
}
