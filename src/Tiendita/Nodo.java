package Tiendita;

public class Nodo {
	private String Nombre;
	private float Peso;
	private String Color;
	public Nodo Siguiente;
	
	public Nodo (String nombre, float peso, String color) {
		Nombre=nombre;
		Peso=peso;
		Color=color;
		Siguiente=null;		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public float getPeso(){
		return Peso;
	}
	public String getColor() {
		return Color;
	}
}

