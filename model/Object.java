public abstract class Object {
	private double mass, velocity, force, density, restitution;

	public Object(double mass, double velocity, double force, 
		double density, double resitution) {
		this.mass = mass;
		this.velocity = velocity;
		this.force = force;
		this.density = density;
		this.resitution = restitution;
	}

	public boolean collision() {
		
	}
}