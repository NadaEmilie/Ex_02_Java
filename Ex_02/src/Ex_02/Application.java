package Ex_02;

public class Application {

	public static void main(String[] args) {
		
		int i=0;
		float f=0;
		double d=0;
		byte b=0;
		
		Casting c = new Casting();
		c.fx(i, f);
		c.fx(b, i);
		c.fx(b+1000000000, b);
		//c.fx(i, d); error
		c.fx(i, (float) d);
		//c.fx(i+5, f+0.5); error
		c.fx(i+5, (float) (f+0.5));
		c.gx(b);
		//c.gx(b+1); b+1=int error
		c.gx(b++);
		//c.gx(3); 3int error

	}

}
