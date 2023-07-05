class InfosysRunner{
	public static void main(String[] infosys){
		System.out.println("Running main...");
		Infosys detail = new Infosys("Narayan Murthi","Sudha Narayan Murthi",1981,35186);
		System.out.println("FounderName :"+detail.founderName);
		System.out.println("FounderWifeName :"+detail.founderWifeName);
		System.out.println("Founded :"+detail.founded);
		System.out.println("TotalEmployees :"+detail.totalEmployees);
	}
}	