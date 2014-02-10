package com.ippon.formation.gwt.server.service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.ippon.formation.gwt.server.domain.dao.PlayerDao;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;

@Stateless
@LocalBean
public class PlayerServiceImpl {

    @EJB
    PlayerDao dao;

    public PlayerEntity findPlayer(String name) {
        return dao.findPlayer(name);
    }

    public void addPlayer(PlayerEntity player) {
        dao.addPlayer(player);
    }

    public void updatePlayer(PlayerEntity player) {
        dao.updatePlayer(player);
    }

    public PlayerEntity findPlayer(Long id) {
        return dao.findPlayer(id);
    }
}
