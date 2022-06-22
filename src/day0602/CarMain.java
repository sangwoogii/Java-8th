package day0602;

public class CarMain {

	public static void main(String[] args) {
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Vehicle b2 = t.getVehicle();
		b2.run(55, 33);
		
		System.out.println();
		
		b.run(100, 200);
		t.run(200, 300);
		
		System.out.println();
		
		Driver d = new Bus();
		
		b.stop(b);
		t.stop(t);
		
		System.out.println();
		
		Driver d1 = new Bus();
		d1.checkPass();
		Driver t1 = new Taxi();
		t1.checkPass();
		
		
	}

}
