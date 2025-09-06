public class Servicio {
    private String Tipo;
    private int Tiempo_estimado;
    private int Costo_Base;


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getTiempo_estimado() {
        return Tiempo_estimado;
    }

    public void setTiempo_estimado(int tiempo_estimado) {
        Tiempo_estimado = tiempo_estimado;
    }

    public int getCosto_Base() {
        return Costo_Base;
    }

    public void setCosto_Base(int costo_Base) {
        Costo_Base = costo_Base;
    }
}
