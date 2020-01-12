package com.isil.appperuanisimosversion10.ENTIDAD;

public class Administrador {
    private String nomUsuario;
    private String password;

    public Administrador(String nomUsuario, String password) {
        this.nomUsuario = nomUsuario;
        this.password = password;
    }

    private String AdminNombre(){return "q";}
    private String AdminPass(){return "q";}
    public String NOMBRE(){return AdminNombre();}
    public String PASS(){return AdminPass(); }
}

