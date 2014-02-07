package com.ippon.formation.gwt.server.domain.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.google.common.collect.Lists;
import com.ippon.formation.gwt.server.domain.entities.PlayerEntity;

@Stateless
public class PlayerDaoImpl implements PlayerDao {

    @PersistenceContext(unitName = "GWTFormationPU")
    private EntityManager entityManager;

    @Override
    public List<PlayerEntity> findClassement() {
        List<PlayerEntity> playerEntities = Lists.newArrayList();
        List<?> players = entityManager.createQuery("select p from Player p").getResultList();
        for (Object p : players) {
            if (p instanceof PlayerEntity) {
                playerEntities.add((PlayerEntity) p);
            }
        }
        return playerEntities;
    }

    @Override
    public PlayerEntity findPlayer(String name) {
        PlayerEntity player = (PlayerEntity) entityManager.createQuery("select p from Player p where p.name = :name")
                .setParameter("name", name).getSingleResult();
        return player;
    }

    @Override
    public PlayerEntity findPlayer(Long id) {
        PlayerEntity player = entityManager.find(PlayerEntity.class, id);
        return player;
    }

    @Override
    public void addPlayer(PlayerEntity player) {
        entityManager.persist(player);
    }

    @Override
    public void updatePlayer(PlayerEntity player) {
        entityManager.merge(player);
    }

}
