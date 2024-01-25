
public class Home_Assgn_2 {

	public static double volume(double r) {
		return (4/3)*Math.PI*r*r*r;			//sphere
	}
	public static double volume(int s) {
		return s*s*s;						//cube
	}public static double volume(double l, double b, double h) {
		return l*b*h;
	}
	public static void main(String[] args) {
			
		System.out.println("The volume of sphere: "+volume(4.6));
		System.out.println("The volume of cube: "+ volume(6));
		System.out.println("The volume of cuboid: "+volume(4.2,6.5,7.9));
	}

}