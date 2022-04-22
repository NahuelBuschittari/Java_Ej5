package entidades;

public abstract class Empleado {
	private int dni;
	private String nombre;
	private String apellido;
	private float sueldoBase;
	private String email;
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDetalle(){
		return this.getDni()+"   "+this.getNomApe();
	}
	public String getNomApe() {
	return  this.getNombre()+"   "+this.getApellido();
	}
	
	public abstract double getSueldo();
	
	public Empleado(){}
	
	public Empleado(int DNI,String NOM,String APE){
		this.setDni(DNI);
		this.setNombre(NOM);
		this.setApellido(APE);
	}
}
