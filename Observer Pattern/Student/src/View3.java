class View3 {
	private Student student;

	public View3(Student s) {
		this.student = s;
	}

	public void changeStudent() {
		// change the student
		// når jeg ændrer students id, skal view1 og view2 også ændre sig
		student.setId(42);
	}
}