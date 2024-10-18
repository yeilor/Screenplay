package co.com.sanangel.compras.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SanAngelData {

    private String CantidadProducto;
    private String NombreCliente;
    private String ApellidoCliente;
    private String Documento;
    private String TelefonoCliente;
    private String CorreoCliente;
    private String NombreDestinatario;
    private String Municipio;
    private String Direccion;
    private String InfoAdicional;
    private String TelefonoDestinatario;
    private String Mensaje;
    private String Fecha;
    private String Hora;
    private String Observaciones;
    private String CelularPago;
    private String CantidadProducto2;

    // Constructor
    public SanAngelData(String cantidadProducto, String nombreCliente, String apellidoCliente, String documento,
                        String telefonoCliente, String correoCliente, String nombreDestinatario, String municipio,
                        String direccion, String infoAdicional, String telefonoDestinatario, String mensaje,
                        String fecha, String hora, String observaciones, String celularPago, String cantidadProducto2) {
        this.CantidadProducto = cantidadProducto;
        this.NombreCliente = nombreCliente;
        this.ApellidoCliente = apellidoCliente;
        this.Documento = documento;
        this.TelefonoCliente = telefonoCliente;
        this.CorreoCliente = correoCliente;
        this.NombreDestinatario = nombreDestinatario;
        this.Municipio = municipio;
        this.Direccion = direccion;
        this.InfoAdicional = infoAdicional;
        this.TelefonoDestinatario = telefonoDestinatario;
        this.Mensaje = mensaje;
        this.Fecha = fecha;
        this.Hora = hora;
        this.Observaciones = observaciones;
        this.CelularPago = celularPago;
        this.CantidadProducto2 = cantidadProducto2;
    }

    public SanAngelData() {

    }

    // Getters
    public String getCantidadProducto() { return CantidadProducto; }
    public String getNombreCliente() { return NombreCliente; }
    public String getApellidoCliente() { return ApellidoCliente; }
    public String getDocumento() { return Documento; }
    public String getTelefonoCliente() { return TelefonoCliente; }
    public String getCorreoCliente() { return CorreoCliente; }
    public String getNombreDestinatario() { return NombreDestinatario; }
    public String getMunicipio() { return Municipio; }
    public String getDireccion() { return Direccion; }
    public String getInfoAdicional() { return InfoAdicional; }
    public String getTelefonoDestinatario() { return TelefonoDestinatario; }
    public String getMensaje() { return Mensaje; }
    public String getFecha() { return Fecha; }
    public String getHora() { return Hora; }
    public String getObservaciones() { return Observaciones; }
    public String getCelularPago() { return CelularPago; }
    public String getCantidadProducto2() { return CantidadProducto2; }

    // Setters
    public void setCantidadProducto(String cantidadProducto) { this.CantidadProducto = cantidadProducto; }
    public void setCantidadProducto2(String cantidadProducto2) { this.CantidadProducto2 = cantidadProducto2; }

    public static List<SanAngelData> setData(DataTable dataTable) {
        List<SanAngelData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, SanAngelData.class));
        }
        return dates;
    }
}
