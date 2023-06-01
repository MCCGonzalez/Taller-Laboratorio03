import java.util.*;
import java.util.ArrayList;

public class Empreza {

	private ArrayList<String> listaViajes;
	private String rut;
	private String direccion;
	private List<String> redesSociales;
	private ArrayList<Conductor> listaConductores;
	private ArrayList<Bus> listaBuses;

	public Empreza() {

	}

	public void AddConductor(Conductor conductor) {
		listaConductores.add(conductor);
	}

	public void AddBus(Bus bus) {
		listaBuses.add(bus);
	}

	public void RemoveBus() {
		// TODO - implement Empreza.RemoveBus
		throw new UnsupportedOperationException();
	}

	public ArrayList<String> GetViajes() {
		return listaViajes;
	}

	public void AddViaje() {
		// TODO - implement Empreza.AddViaje
		throw new UnsupportedOperationException();
	}

	public void RemoveViaje() {
		// TODO - implement Empreza.removeViaje
		throw new UnsupportedOperationException();
	}

	/*/**
	 * 
	 * @param rut
	 * @param direccion
	 * @param redesSociales
	 * @param listaBuses
	 * @param listaViajes
	 * @param listaConductores
	 */
	public Empreza(String rut, String direccion, ArrayList<String> redesSociales, ArrayList<Bus> listaBuses, ArrayList<String> listaViajes, ArrayList<String> listaConductores) {

		this.rut = rut;
		this.direccion = direccion;
		this.redesSociales = redesSociales;
		this.listaBuses = listaBuses;
		//this.listaConductores = listaConductores;
		this.listaViajes = listaViajes;
	}


}