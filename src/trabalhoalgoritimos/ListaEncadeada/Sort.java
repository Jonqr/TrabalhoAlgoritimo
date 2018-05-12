/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoalgoritimos.ListaEncadeada;

import java.util.Comparator;

/**
 *
 * @author jonh_
 * @param <T> Algum tipo de dado
 */
public interface Sort<T> {
        
        void efficientSort (Comparator<T> cmp);

}


// Fiz interface só pro sort separada porque tava dando erro no implement e no metodo 