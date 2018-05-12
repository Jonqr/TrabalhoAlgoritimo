/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoalgoritimos.ListaEncadeada;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author jonh_
 */
class DadoTeste<T> {
		T data;
		public DadoTeste previous;
		public DadoTeste next;
		
		DadoTeste(T data) {
			this.data = data;
		}		
		void insert(DadoTeste before, DadoTeste after) {
			this.previous = before;
			this.next = after;
			if (before != null)
				before.next = this;
			if (after != null)
				after.previous = this;
		}
		void remove() {
			if (previous != null)
				previous.next = next;
			if (next != null)
				next.previous = previous;
			next = null;
			previous = null;
		}
	}
