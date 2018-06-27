/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.util.ArrayList;

/**
 *
 * @author ogc
 */
public interface Strategy {
    public ArrayList<String> SendCommandWithReturns (String command);
    
    public void SendCommand (String command);
}
