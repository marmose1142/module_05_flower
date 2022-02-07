package by.epam.flower_composition.main;

import java.math.BigDecimal;

import by.epam.flower_composition.entity.*;
import by.epam.flower_composition.logic.*;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
 * -Корректно спроектируйте и реализуйте предметную область задачи;
 * -Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования;
 * -Реализуйте проверку данных вводимых пользователем, но не на стороне клиента;
 * -Для проверки корректности переданных данных можно применить регулярные выражения;
 * -Меню выбора действий пользователем можно не реализовывать, используйте заглушку;
 * -Особое условие:переопределить, где необходимо, методы toString(), equals(),hashCode();
 * 
 *  Вариант А.Цветочная композиция.Реализовать приложение, позволяющее создавать цветочные композиции(объект, представляющий
 *  собой цветочную композицию).Состовляющими цветочной композиции являются цветы и упаковка.
 */

public class Main {

	public static void main(String[] args) {

		String client;

		BouquetLogic logic = new BouquetLogic();

		Flower rose = new Rose.Builder().withNameOfFlower("Роза").withSort("Стрела Амура").withColor("Красные")
				.withHeight(30).withNumberOfFlower(3).withPrice(new BigDecimal(25.50)).build();
		Flower fern = new Fern.Builder().withNameOfFlower("Папаратник").withSort("Декоративный").withColor("Зеленый")
				.withHeight(30).withNumberOfFlower(3).withPrice(new BigDecimal(5.25)).build();

		Wrapping pack = new Wrapping.Builder().withComposition("Упаковочная пленка").withColor("Прозрачная")
				.withPrice(new BigDecimal(2.50)).build();

		Bouquet bouquet = new Bouquet(pack);
		bouquet.addFlower(rose);
		bouquet.addFlower(fern);

		client = logic.enterFromConsole("Введите цветок, который должен входить в букет");

		logic.checkClient(client, bouquet, logic);

	}
}