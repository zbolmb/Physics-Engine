import java.lang.Math;

public class Vec {
	private double mag, a, x, y;

	public Vec(double m, double a) {
		mag = m;
		this.a = a;
		x = mag * Math.cos(Math.toRadians(a));
		y = mag * Math.sin(Math.toRadians(a));
	}

	public double getM() {return mag;}
	public void setM(double m) {mag = m;}
	public double getA() {return a;}
	public void setA(double a) {this.a = a;}
	public double getX() {return x;}
	public void setX(double x) {this.x = x;}
	public double getY() {return y;}
	public void setY(double y) {this.y = y;}
}