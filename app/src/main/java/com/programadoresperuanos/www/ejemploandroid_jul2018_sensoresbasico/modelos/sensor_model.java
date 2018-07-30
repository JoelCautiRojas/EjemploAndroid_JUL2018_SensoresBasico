package com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico.modelos;

public class sensor_model {

    String constante;
    String nombre;
    String grupo;
    String descripcion;
    String usos;
    String tipo;
    String api;
    int dimensiones;
    String unidadMedida;
    boolean obsoleto;
    String apiObsoleto;


    public sensor_model(String constante, String nombre, String grupo, String descripcion, String usos, String tipo, String api, int dimensiones, String unidadMedida, boolean obsoleto, String apiObsoleto) {
        this.constante = constante;
        this.nombre = nombre;
        this.grupo = grupo;
        this.descripcion = descripcion;
        this.usos = usos;
        this.tipo = tipo;
        this.api = api;
        this.dimensiones = dimensiones;
        this.unidadMedida = unidadMedida;
        this.obsoleto = obsoleto;
        this.apiObsoleto = apiObsoleto;
    }

    public String getConstante() {
        return constante;
    }

    public void setConstante(String constante) {
        this.constante = constante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsos() {
        return usos;
    }

    public void setUsos(String usos) {
        this.usos = usos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public boolean isObsoleto() {
        return obsoleto;
    }

    public void setObsoleto(boolean obsoleto) {
        this.obsoleto = obsoleto;
    }

    public String getApiObsoleto() {
        return apiObsoleto;
    }

    public void setApiObsoleto(String apiObsoleto) {
        this.apiObsoleto = apiObsoleto;
    }
}
