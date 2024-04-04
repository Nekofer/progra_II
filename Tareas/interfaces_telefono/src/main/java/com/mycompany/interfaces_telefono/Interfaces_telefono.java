/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_telefono;



/**
 *
 * @author Fernando
 */
public class Interfaces_telefono {

    public static void main(String[] args) {
        telefonocelular T = new telefonocelular("IPHONE 11", "1.792*828", "4495264018", "AT&T");
        T.caracterisiticas1();
        T.enviarmensaje();
        
        palomamensajera P= new palomamensajera("Cuervo", "Karen Delgado","Terry","Negro" );
        P.caracterisiticas2();
        P.enviarmensaje();
        
        telegrafo TE= new telegrafo("2564","25*100","milister","central de llamadas de AGS");
        TE.caracterisiticas3();
        TE.enviarmensaje();
        
    }
}
