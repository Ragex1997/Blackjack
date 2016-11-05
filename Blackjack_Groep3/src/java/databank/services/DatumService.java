/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.DatumDAO;
import databank.util.Conversie;
import java.util.Calendar;

/**
 *
 * @author Julie
 */
public class DatumService {
    
    //datum opvragen per spel
    public Calendar getGameDateById(int id){
        Calendar gameDate = Conversie.convertResultSetToGame(DatumDAO.selectDateById("game", id));
        return gameDate;
    }
    
    //datum per spel in db steken
    public void insertGameDate(int id){
        DatumDAO.insertGameDatum(id);
    }
    
}
