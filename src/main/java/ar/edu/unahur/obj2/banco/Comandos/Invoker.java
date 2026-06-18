package ar.edu.unahur.obj2.banco.Comandos;

import java.util.*;

public class Invoker {

    private List<IComando> lote= new ArrayList<>();
    private IComando ultimoComando;
// ejecucion individual
    public void ejecutarComando(IComando comando) {
        comando.ejecutar();
        ultimoComando = comando;
    }

// ejecucion en lote
    public void ejecutarLote() {
       lote.forEach(IComando :: ejecutar);
       lote.clear();
    }

    public void agregarComando(IComando comando) {
        lote.add(comando);
    }

    public void deshacerUltimoComando() {
        if (ultimoComando != null) {
            ultimoComando.deshacer();
            ultimoComando = null;
        }
    }

}
