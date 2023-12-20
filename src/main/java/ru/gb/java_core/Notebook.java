package ru.gb.java_core;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
	private List<Note> noteList;

	public Notebook() {
		noteList = new ArrayList<>();
	}
	
	public Notebook(List<Note> noteList) {
		this.noteList = noteList;
	}

	public void addNote(String creatorName, String text) {
		Note note = new Note(creatorName, text);
		noteList.add(note);
	}
	
	public void updateContent(String creatorName, String newContent) {
		Note note = findByName(creatorName);
		if(note != null)
			note.setContent(newContent);
		else
			System.out.println("Записи с таким именем нет в блокноте");
		
	}
	
	public void deleteNote(String name) {
		Note note = findByName(name);
		if(note != null)
			noteList.remove(note);
		else
			System.out.println("Записи с таким именем нет в блокноте");
	}
	
	private Note findByName(String name) {
		for(Note note : noteList) {
			if (note.getCreatorName().equals(name))
				return note;
		}
		return null;
	}
	
	public List<Note> getNoteList() {
		return noteList;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		noteList.stream().forEach(sb::append);
		return sb.toString();
	}
	
	
}
