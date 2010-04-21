package com.prop.cluster10.common.test.app.model.estrategia;

import com.prop.cluster10.blackjack.test.app.model.estadistiquesblackjack.inout;

public class CartaStub {
	String pal;
	int numero;
	int valor;
	
	
	public void testEscriuCarta() throws Exception {
		inout io = new inout();
		io.write("Pal: ");
		io.write(pal);
		io.write("   Numero: ");
		io.write(numero);
		io.write("   Valor: ");
		io.writeln(valor);
	}

	public String getPal() {
		return pal;
	}

	public void setPal(String pal) {
		this.pal = pal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
