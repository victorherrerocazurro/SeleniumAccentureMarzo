package modelo;

public class User {
	private String nombre;
	private String password;
	private String DNI = "";
	private boolean validado;
	public User(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
		if (nombre.equals("Juan") && password.equals("Password")){
			this.validado = true;
			this.DNI = "11111111-C";
		}else{
			this.validado = false;
		}
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public String getPassword() {
		return password;
	}
	public boolean isValidado() {
		return validado;
	}
}
