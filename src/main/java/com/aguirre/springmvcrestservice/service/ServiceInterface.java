/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirre.springmvcrestservice.service;

import com.aguirre.springmvcrestservice.model.User;
import java.util.List;

/**
 *
 * @author AGUIRREMR
 */
public interface ServiceInterface<T> {

    User findById(long id);

    User findByName(String name);

    void save(T modelObject);

    void update(T modelObject);

    void deleteById(long id);

    List<T> findAll();

    void deleteAll();

    public boolean isExist(T modelObject);

}
