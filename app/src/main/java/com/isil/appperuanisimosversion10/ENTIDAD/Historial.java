package com.isil.appperuanisimosversion10.ENTIDAD;

public class Historial {
  String cliente,nomPlato;

    public Historial(String cliente, String nomPlato) {
        this.cliente = cliente;
        this.nomPlato = nomPlato;
    }

    public String getCliente() {
        return cliente;
    }

    private void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNomPlato() {
        return nomPlato;
    }

    private void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }
}
