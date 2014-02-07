package com.ippon.formation.gwt.server.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.ippon.formation.gwt.server.domain.dao.PlayerDao;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;

@Stateless
public class PlayerServiceImpl implements PlayerService {

    @EJB
    PlayerDao dao;

    @Override
    public PlayerEntity findPlayer(String name) {
        return dao.findPlayer(name);
    }

    @Override
    public void addPlayer(PlayerEntity player) {
        dao.addPlayer(player);
    }

    @Override
    public void updatePlayer(PlayerEntity player) {
        dao.updatePlayer(player);
    }

    @Override
    public PlayerEntity findPlayer(Long id) {
        return dao.findPlayer(id);
    }
}
