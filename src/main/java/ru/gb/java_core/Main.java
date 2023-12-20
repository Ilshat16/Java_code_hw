package ru.gb.java_core;

public class Main {
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		notebook.addNote("Вася", "Вечером нужно сходить в магазин");
		notebook.addNote("Маша", "Перед сном включить будильник");
		System.out.println(notebook);
	}
}
