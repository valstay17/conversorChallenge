package org.example;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
