package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	//Constructor
	public Zoologico() {
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		
		for(int i=0; i < this.zonas.size(); i++) {
			totalAnimales += this.zonas.get(i).cantidadAnimales();
		}
		
		return totalAnimales;
	}

}
