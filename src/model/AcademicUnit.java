package model;

public class AcademicUnit {

	
	private String name;
	private int code; 
	private String director;
	
	private AcademicUnit right;
	private AcademicUnit left;
	
	public AcademicUnit(String n, int c, String d) {
		name = n;
		code = c;
		director =d;
	}

	public String getName() {
		return name;
	}


	public int getCode() {
		return code;
	}


	public String getDirector() {
		return director;
	}


	public AcademicUnit getRight() {
		return right;
	}

	public void setRight(AcademicUnit right) {
		this.right = right;
	}

	public AcademicUnit getLeft() {
		return left;
	}

	public void setLeft(AcademicUnit left) {
		this.left = left;
	}
	
	
	
	
	
}
