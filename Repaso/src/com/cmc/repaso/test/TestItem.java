package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item = new Item("Mouse",20,20,20);
		item.imprimir();
		item.vender(10);
		item.devolver(10);
		item.imprimir();
	}

}
