package com.isil.appperuanisimosversion10.ENTIDAD;

public class Usuario {
    private static String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    private String confirmacion;
    private int age;

    public Usuario (String apellido, String usuario, String clave, String confirmacion, String s, int age) {

        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.confirmacion = confirmacion;
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    private void setClave(String clave) {
        this.clave = clave;
    }

    public String getConfirmacion() {return confirmacion;}

    private void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }


}
