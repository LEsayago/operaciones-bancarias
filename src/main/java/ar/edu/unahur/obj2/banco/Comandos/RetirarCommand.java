package ar.edu.unahur.obj2.banco.Comandos;

import ar.edu.unahur.obj2.banco.Cuenta;

public class RetirarCommand implements IComando{
    
    private final Cuenta cuenta;
    private final Double monto;

    public RetirarCommand(Cuenta cuenta, Double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuenta.retirar(monto);
    }

}
