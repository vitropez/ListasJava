package myPeople;

public class Person {
private String nombre;
private String apellido;
private int edad;
private String comentario;

public Person(String nombre, String apellido, int edad, String comentario) {
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.comentario = comentario;
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
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getComentario() {
	return comentario;
}
public void setComentario(String comentario) {
	this.comentario = comentario;
}
@Override
public String toString() {
	return "Person [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", comentario=" + comentario
			+ "]";
}

}
