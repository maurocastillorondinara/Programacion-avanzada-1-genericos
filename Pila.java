package unidad2;

public class Pila<R> {

    private Nodo<R> primero;

    public Pila()
    {
        primero = null;
    }

    public Nodo<R> getPrimero() {
        return primero;
    }

    public void push(R data) {
        if (primero == null) {
            this.primero = new Nodo<R>(data);
        } else {
            Nodo<R> prox = primero;
            while (prox.getNext()!=null) {
                prox = prox.getNext();
            }
            prox.setNext(new Nodo<R>(data));
        }
    }

    public R pop () {
        Nodo<R> prox = primero;
        Nodo<R> ant = primero;
        R retur = null;

        while (prox != null) {
            if (prox.getNext() != null)
            {
                ant = prox;
                prox = prox.getNext();

            }else if(ant == prox)
            {
                retur = ant.getData();
                primero = null;
                prox=null;
            }else
            {
                retur = prox.getData();
                ant.setNext(null);
                prox = null;
            }
        }
        return retur;
    }



    public int size()
    {
        Nodo<R> prox = primero;
        Nodo<R> ant = primero;
        int cant = 0;
        while (prox != null) {
            cant++;
            ant = prox;
            prox = prox.getNext();

        }
        return cant;
    }
}
