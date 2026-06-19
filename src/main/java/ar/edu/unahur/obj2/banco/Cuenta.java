package ar.edu.unahur.obj2.banco;

import java.util.*;

import ar.edu.unahur.obj2.banco.observer.IObservador;

public class Cuenta {
    private final Integer numero;
    private Double saldo;
    private List<IObservador> observadores = new ArrayList<>();

    public Cuenta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    
    public void depositar(Double monto) {
        this.saldo += monto;
        notificar("Depósito", monto);
    }

    public void retirar(Double monto) {
        this.saldo -= monto;
        notificar("Retiro", monto);
    }

    public void agregarObservador(IObservador observador) {
        this.observadores.add(observador);
    }

    public void eliminarObservador(IObservador observador) {
        this.observadores.remove(observador);
    }

    public void notificar(String operacion, Double monto){
        observadores.forEach(observador -> observador.notificar(this, operacion, monto));
    }

}
