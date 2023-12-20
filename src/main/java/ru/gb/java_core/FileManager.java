package ru.gb.java_core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileManager {
	private String FILE_PATH = "data.txt";
	private SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss dd/MMM/yyyy");
	
	public void writeAllToFile(List<Note> noteList) {
		for(Note note : noteList) {
			writeToFile(note);
		}
	}
	
	public void writeToFile(Note note) {
		try(FileWriter fileWriter = new FileWriter(FILE_PATH, true)) {
			fileWriter.write(note.getCreatorName() + "\n");
			fileWriter.write(formatToString(note.getCreationTime()) + "\n");
			fileWriter.write(note.getContent() + "\n");
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public List<Note> readFromFile() {
		List<Note> noteList = new ArrayList<>();
		try(BufferedReader fileReader = new BufferedReader(new FileReader(FILE_PATH))) {
			String line = fileReader.readLine();
			Note note = new Note();
			int noteBorder = 3;
			while(line != null) {
				for (int i = 0; i < noteBorder; i++) {
					loadToNote(i, line, note);
					line = fileReader.readLine();
				}
				noteList.add(note);
				note = new Note();
			}
		} catch (IOException e) {
			e.getMessage();
		}
		return noteList;
	}
	
	private String formatToString(Date date) {
		return SDF.format(date);
	}
	
	private Date formateToDate(String date) {
		try {
			return SDF.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private void loadToNote(int i, String line, Note note) {
		switch (i) {
			case 0:
				note.setCreatorName(line);
				break;
			case 1:
				note.setCreationTime(formateToDate(line));
				break;
			case 2:
				note.setContent(line);
				break;
		}
	}

}
