package entidades;

public class Vendedor extends Empleado {
	private float porcenComision;
	private float totalVtas;
	public float getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(float porcenComision) {
		this.porcenComision = porcenComision;
	}
	public float getTotalVtas() {
		return totalVtas;
	}
	public void setTotalVtas(float totalVtas) {
		this.totalVtas = totalVtas;
	}
	public double getSueldo() {
		return this.getSueldoBase()+(this.porcenComision*this.getTotalVtas())/100;
	}
	public String getDetalle() {
		return "Vendedor  "+super.getDetalle();
	}
}
