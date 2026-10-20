public class Bus {
	private String route ;
	private int seats ;
	
	public Bus(){
		this.route="unassighned";
		this.seats=40;
		}
	public Bus(String route,int seats){
		this.route=route;
		this.seats=seats;
}
	public String getRoute(){
		return route;
		}
	
	public int getSeats(){
		return seats;
		}

}
