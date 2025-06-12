package com.dslist.dslist.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")// criar a tabela
public class Belonging {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();

    private Integer position;

    public Belonging() {}

    public Belonging(Game gameId, GameList List, Integer position) {
        id.setGame(gameId);
        id.setList(List);
        this.position = position;
    }


    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public BelongingPk getId() {
        return id;
    }

    public void setId(BelongingPk id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
