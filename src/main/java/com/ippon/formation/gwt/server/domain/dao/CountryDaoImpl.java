package com.ippon.formation.gwt.server.domain.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.google.common.collect.Lists;
import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

@Stateless
public class CountryDaoImpl implements CountryDao {

    @PersistenceContext(unitName = "GWTFormationPU")
    private EntityManager entityManager;

    @Override
    public List<CountryEntity> findCountries() {
        List<CountryEntity> countryEntities = Lists.newArrayList();
        List<?> countries = entityManager.createQuery("select c from Country c").getResultList();
        for (Object c : countries) {
            if (c instanceof CountryEntity) {
                countryEntities.add((CountryEntity) c);
            }
        }
        return countryEntities;
    }

    @Override
    public CountryEntity findCountry(Long id) {
        CountryEntity country = entityManager.find(CountryEntity.class, id);
        return country;
    }

}
