public abstract class Object {
	private double mass, velocity, force, restitution;

	public Object(double mass, double velocity, double force, 
		double density, double resitution) {
		this.mass = mass;
		this.velocity = velocity;
		this.force = force;
		this.restitution = restitution;
	}
	public double getMass() {return mass;}
	public void setMass(double m) {return m;}
	public double getVel() {return vel;}
	public void setVel(double vel) {velocity = vel;}
        public double getForce() {return force;}
	public void setForce(double force) {this.force = force;}
	public double getRestitution() {return restitution;}
	
}