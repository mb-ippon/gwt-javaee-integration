package com.ippon.formation.gwt.server.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.ippon.formation.gwt.server.domain.dao.CountryDao;
import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

@Stateless
public class CountryServiceImpl implements CountryService {

    @EJB
    CountryDao dao;

    @Override
    public List<CountryEntity> findCountries() {
        return dao.findCountries();
    }

    @Override
    public CountryEntity findCountry(Long id) {
        return dao.findCountry(id);
    }

}
