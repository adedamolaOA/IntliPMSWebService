/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.web.controller;

import com.intlipms.web.entities.CustomerRoomRate;
import com.intlipms.web.entities.MaintRequest;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Adedamola
 */
public class CustomerRoomRateController {
    private static final String PERSISTENCE_UNIT_NAME = "IntliPMSWebServicePU";
    private static EntityManagerFactory factory;
    
    
    public boolean add(CustomerRoomRate c) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        boolean addState = true;
        // read the existing entries and write to console
        try {
            // create new todo
            em.getTransaction().begin();

            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            addState = false;
        }
        em.close();
        return addState;
    } 
}
