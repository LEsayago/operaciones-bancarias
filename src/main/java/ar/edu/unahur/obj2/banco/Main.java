package ar.edu.unahur.obj2.banco;

import ar.edu.unahur.obj2.banco.Comandos.*;

public class Main {
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(1234, 10000.0);
        Invoker invoker = new Invoker();
        IComando depositar = new DepositarCommand(cuenta, 70000.0);
        IComando retirar = new RetirarCommand(cuenta, 5000.0);
        IComando retirar2 = new RetirarCommand(cuenta, 16000.0);
        IComando depositar2 = new DepositarCommand(cuenta, 900.0);
        
        System.out.println("Ejecucion Individual");
        System.out.println("Saldo: " + cuenta.getSaldo());
        invoker.ejecutarComando(depositar);
        System.out.println("Saldo: " + cuenta.getSaldo());
        invoker.ejecutarComando(retirar);
        System.out.println("Saldo: " + cuenta.getSaldo());
        invoker.ejecutarComando(retirar2);
        System.out.println("Saldo: " + cuenta.getSaldo());
        invoker.ejecutarComando(depositar2);
        System.out.println("Saldo: " + cuenta.getSaldo());

        /*
         * Ejecucion en Lote
retira 5000
deposita 300000
retira 50000
         */
        System.out.println("\nEjecucion en Lote");
        System.out.println("Saldo: " + cuenta.getSaldo());
        invoker.agregarComando(new RetirarCommand(cuenta, 5000.0));
        invoker.agregarComando(new DepositarCommand(cuenta, 300000.0));
        invoker.agregarComando(new RetirarCommand(cuenta, 50000.0));
        invoker.ejecutarLote();
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}
