package ej2;

public  class Carta extends Envio{

    public Carta(String numeroTracking, String destinatario, String direccionDestinatario, String remitente, String direccionRemitente, double peso, boolean envioADomicilio) {
        super(numeroTracking, destinatario, direccionDestinatario, remitente, direccionRemitente, peso, envioADomicilio);
    }


    @Override
    public double calculaPeso() {
        return getPeso();
    }

}