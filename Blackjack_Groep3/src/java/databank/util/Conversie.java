/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julie
 */
public class Conversie {
    
    public static List<String> convertResultsetToList(ResultSet rs){
        List lijst = new ArrayList();
        
        try{
            while(rs.next()){
                String str = null;
                
                str = rs.getString("nickname");
                
                lijst.add(str);
            }
            
        } catch(SQLException ex){
            
        }
        return lijst;
    }
    
}
