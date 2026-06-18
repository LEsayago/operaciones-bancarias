package ar.edu.unahur.obj2.banco.Comandos;

import ar.edu.unahur.obj2.banco.Cuenta;

public class DepositarCommand implements IComando{
    
    private final Cuenta cuenta;
    private final Double monto;

    public DepositarCommand(Cuenta cuenta, Double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuenta.depositar(monto);
    }



}
