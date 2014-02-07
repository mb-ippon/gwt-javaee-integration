package com.ippon.formation.gwt.server.domain.dao;

import java.util.List;

import javax.ejb.Local;

import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;

@Local
public interface PlayerDao {

    List<PlayerEntity> findClassement();

    PlayerEntity findPlayer(String name);

    PlayerEntity findPlayer(Long id);

    void addPlayer(PlayerEntity player);

    void updatePlayer(PlayerEntity player);
}
