package com.satyam.primitives;

class Classroom
{
	private int chairs;
	private int tables;
	private int boards;
	public int getChairs() {
		return chairs;
	}
	public void setChairs(int chairs) {
		this.chairs = chairs;
	}
	public int getTables() {
		return tables;
	}
	public void setTables(int tables) {
		this.tables = tables;
	}
	public int getBoards() {
		return boards;
	}
	public void setBoards(int boards) {
		this.boards = boards;
	}
	@Override
	public String toString() {
		return "Classroom [chairs=" + chairs + ", tables=" + tables + ", boards=" + boards + "]";
	}
	
	
	
}


public class Typewrapperdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom cr=new Classroom();

		//create references for TypWrapper Integer class
		Integer boards,chairs,tables;
		//auto boxing - converting values to objects
		boards=1;
		chairs=33;
		tables=2;
		//set values to properties of Classroom object by passing Typewrapper class objects as agruments
		cr.setBoards(boards);
		cr.setChairs(chairs);
		cr.setTables(tables);

		//Display classroom info
		System.out.println(cr);
		
	}

}
