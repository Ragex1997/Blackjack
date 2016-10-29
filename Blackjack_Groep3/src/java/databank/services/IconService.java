/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.IconDAO;
import databank.util.Conversie;
import javax.enterprise.context.Conversation;
import model.Icon;

/**
 *
 * @author Anthony Lannoote
 */
public class IconService {
    
    /**
     * Geeft een Icon Object terug gebaseerd op het Id die je mee geeft 
     * wordt gebruikt in UserService voor het opvragen van een lijst van Users
     * @param id
     * @return 
     */
    public Icon getIconById(int id){
        Icon icon = Conversie.convertResultSetToIcon(IconDAO.getIconById(id));   
        return icon;
    }
    
    public void InsertIcon(Icon icon){
        
        String name = icon.getName();
        String location = icon.getLocation();
        
        
        
    }
    
}
