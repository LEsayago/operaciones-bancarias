package ar.edu.unahur.obj2.banco.Comandos;

import java.util.*;

public class Invoker {

    private List<IComando> lote= new ArrayList<>();

// ejecucion individual
    public void ejecutarComando(IComando comando) {
        comando.ejecutar();
    }

// ejecucion en lote
    public void ejecutarLote() {
       lote.forEach(IComando :: ejecutar);
       lote.clear();
    }

    public void agregarComando(IComando comando) {
        lote.add(comando);
    }

}
