class Infosys{
	String founderName;
	String founderWifeName;
	int founded;
	double totalEmployees;
	
	Infosys(String founderName) {
		System.out.println(" Infosys running with String argument :");
		this.founderName=founderName;
	}
	
	Infosys(String founderName, String founderWifeName) {
		this(founderName);
		System.out.println(" Infosys running with String and String argument :");
		this.founderWifeName=founderWifeName;
	}

	Infosys(String founderName, String founderWifeName, int founded) {
		this(founderName,founderWifeName);
		System.out.println(" Infosys running with String, String and int argument :");
		this.founded=founded;
	}
	
	Infosys(String founderName, String founderWifeName, int founded, int totalEmployees) {
		this(founderName,founderWifeName,founded);
		System.out.println(" Infosys running with String, String, int and int argument ");
		this.totalEmployees=totalEmployees;
	}
	
}

		