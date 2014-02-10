package com.ippon.formation.gwt.server.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.ippon.formation.gwt.server.domain.dao.CountryDao;
import com.ippon.formation.gwt.server.domain.entities.CountryEntity;

@Stateless
@LocalBean
public class CountryServiceImpl {

    @EJB
    CountryDao dao;

    public List<CountryEntity> findCountries() {
        return dao.findCountries();
    }

    public CountryEntity findCountry(Long id) {
        return dao.findCountry(id);
    }

}
