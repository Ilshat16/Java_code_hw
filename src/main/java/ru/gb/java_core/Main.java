package ru.gb.java_core;

public class Main {
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		FileManager fileManager = new FileManager();
		notebook.addNote("Вася", "Вечером нужно сходить в магазин");
		notebook.addNote("Маша", "Перед сном включить будильник");
		fileManager.writeAllToFile(notebook.getNoteList());
		System.out.println(new Notebook(fileManager.readFromFile()));
	}
}
