package com.isil.appperuanisimosversion10.ENTIDAD;

public class Producto {
  private String nomProducto;
  private String description;
  private String cantidadProducto;
  private String precioProducto;
  private String msg="";
  private double total;

    public Producto(String nomProducto, String description, String precioProducto) {
        this.nomProducto = nomProducto;
        this.description = description;
        this.precioProducto = precioProducto;
    }

    public Producto(String cantidadProducto, String precioProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
    }

    private double ConversionPrecio(){
        double precio=Double.parseDouble(precioProducto.toString());
        return precio;
    }
    private double ConversionCantidad(){
        double cantidad=Double.parseDouble(cantidadProducto.toString());
        return cantidad;
    }

    public String MostrarInfo(){
        return msg= "    NOMBRE DEL PLATO : "+"\n"+nomProducto+"\n\n"+
                    "    DESCRIPCION : "+"\n"+description+"\n\n"+
                    "    PRECIO: S/."+precioProducto;
    }

    public double MostrarTotal(){
        return total=ConversionPrecio()*ConversionCantidad();
    }

}

