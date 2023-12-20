package ru.gb.java_core;

import java.util.Date;

public class Note {
	
	private String creatorName;
	private String content;
	private Date creationTime;
	
	public Note() {};
	
	public Note(String creatorName, String content) {
		this.creatorName = creatorName;
		this.content = content;
		this.creationTime = new Date();
	}

	public String getCreatorName() {
		return creatorName;
	}

	public String getContent() {
		return content;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "Имя создателя заметки = " + creatorName + "\n" + 
				"creationTime = " + creationTime + "\n" +
				"Текст заметки = " + content + "\n";
	}


	
}
