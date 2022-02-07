package by.epam.flower_composition.view;

import java.math.BigDecimal;

import by.epam.flower_composition.entity.*;

public class BouquetView {
	
	public void print(Bouquet bouquet) {
		System.out.println("Состав букета");
		for (int i = 0; i < bouquet.getFlowers().size(); i++) {
			System.out.println(bouquet.getFlowers().get(i));
		}
		System.out.println(bouquet.getWrappings());
	}

	public void printTotalPrice(BigDecimal price) {
		System.out.println("Общая стоимость букета равна: " + price);
	}
}
