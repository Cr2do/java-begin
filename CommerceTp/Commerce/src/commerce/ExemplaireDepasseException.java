/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerce;

/**
 *
 * @author Sulain ADONNEKPO
 */
public class ExemplaireDepasseException extends Exception {
    String Msg;
    ExemplaireDepasseException(){
        Msg="Le nombre voulu depasse celui en stock";
    }
    
}
