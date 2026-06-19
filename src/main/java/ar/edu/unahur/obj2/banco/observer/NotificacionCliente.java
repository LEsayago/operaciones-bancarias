package ar.edu.unahur.obj2.banco.observer;

import ar.edu.unahur.obj2.banco.Cuenta;

public class NotificacionCliente implements IObservador {
    @Override
    public void notificar(Cuenta cuenta, String operacio, Double monto) {
        if (operacio.equals("Depósito")) {
            System.out.println(
                "Se acreditaron $" + monto
            );

        } else if (operacio.equals("Retiro")) {
        
        System.out.println(
            "Se debitaron $" + monto);
    }

    }
}
