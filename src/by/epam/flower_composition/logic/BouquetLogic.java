package by.epam.flower_composition.logic;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.flower_composition.entity.*;
import by.epam.flower_composition.view.*;

public class BouquetLogic {

	public BigDecimal totalPrice(Bouquet bouquet) {
		BigDecimal total = new BigDecimal(0.00);

		for (int i = 0; i < bouquet.getFlowers().size(); i++) {
			total = total.add(bouquet.getFlowers().get(i).getPrice());
		}
		total = total.add(bouquet.getWrappings().getPrice());

		return total;
	}

	public String enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();
	}

	public void checkClient(String flower, Bouquet b, BouquetLogic logic) {

		BouquetView view = new BouquetView();

		boolean composition;
		boolean check;

		Pattern pattern = Pattern.compile("[а-яА-Я]+");
		Matcher m = pattern.matcher(flower);

		check = true;
		composition = false;

		if (check == m.matches()) {
			for (int i = 0; i < b.getFlowers().size(); i++) {
				if (b.getFlowers().get(i).getNameOfFlower().equalsIgnoreCase(flower)) {
					view.print(b);
					view.printTotalPrice(logic.totalPrice(b));
					composition = true;
				}
			}
			if (composition == false) {
				System.out.println("Таких цветов в составе букета нет");
			}
		} else {
			System.out.println("Вы ввели недопустимые символы");
		}
	}
}