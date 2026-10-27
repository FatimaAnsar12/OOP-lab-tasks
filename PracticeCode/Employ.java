class Employe{
	private int id;
	private String name;
	private double salary;
	private static final double MIN_SALARY = 25000;

	Employe(int id,String name,double salary){
		if (salary<MIN_SALARY){
			this.salary=MIN_SALARY;}
		else{
		this.salary=salary;
	}
		if(id<=0){
			this.id=-1;}
		else{
			this.id=id;}
		this.name=(name==null||name.trim().isEmpty())?"unnamed":name;
		}

	Employe(int id,String name){
		this(id,name,MIN_SALARY);
		}
	Employe(){
		this(-1,"unnamed",MIN_SALARY);
	}
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public double raiseSalary(double percent){
		if(percent>0)
		salary =System.out.println( salary + (salary *percent/100));
		return salary;
	}
		
	void showSummary(){
	System.out.println(id +" "+name+ " "+salary);
	}
}

	
		
