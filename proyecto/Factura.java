package Semana_03;

public class Factura {
	
	// Atributos privados de objeto
	
	private String ruc;
	private String empresa;
	private int unidades;
	private double precioUnitario;
	
	

	 // Variables de clase privadas (static)
	
	private static int cantidad;
	private static double sumaImportes;
	
	// Constante publica de clase
	
	public static final String ENTIDAD;
	
	// Bloque de inicialización estático
	
	static {
		ENTIDAD = "Sunat";
		cantidad = 0;
		sumaImportes = 0;
	}

	// Constructor 1: Inicializa todos los atributos
	
	public Factura(String ruc, String empresa, int unidades, double precioUnitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
		
	// Conteo y acumulación
        cantidad++;
        sumaImportes += importesFacturados(); //this.calcularImporteFacturado();
    }

    // Constructor 2: Recibe ruc y empresa, invoca al primero
    public Factura(String ruc, String empresa) {
        this(ruc, empresa, 10, 50.0);
	}
    
    // Constructor 3: Sin parámetros, invoca al segundo
    public Factura() {
        this("11111111111", "MN-Global SRL");
    }
    
 // Métodos set de acceso público usando 'this'
    
    

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Factura.cantidad = cantidad;
	}

	public static double getSumaImportes() {
		return sumaImportes;
	}

	public static void setSumaImportes(double sumaImportes) {
		Factura.sumaImportes = sumaImportes;
	}
	
	
	
	// Método que retorna el importe facturado
    public double importesFacturados() {
        return unidades * precioUnitario;
    }
	
}
