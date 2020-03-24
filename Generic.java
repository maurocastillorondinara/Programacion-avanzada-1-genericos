package unidad2;

import java.util.ArrayList;
import java.util.List;

public class Generic <T extends Comparable>{
    private List<T> arreglo;

    public Generic()
    {
        arreglo = new ArrayList<T>();
    }

    public List<T> getArreglo()
    {
        return this.arreglo;
    }

    public void agregar(T o)
    {
        arreglo.add(o);
    }

    public void eliminar(T o)
    {
        arreglo.remove(o);
    }

    public boolean existe( T a )
    {
        boolean flag = false;
        for (T celda:
                arreglo)
        {
                if(a.equals(celda))
                    flag = true;

        }
        return flag;
    }

    public T max()
    {
        T maximo = null;
        if (!arreglo.isEmpty())
        {
            maximo = arreglo.get(0);
            for (T celda:
                 arreglo)
            {
                if(celda.compareTo(maximo) == 1)
                {
                    maximo = celda;
                }
            }
        }

        return maximo;
    }

    public T min()
    {
        T minimo = null;
        if (!arreglo.isEmpty())
        {
            minimo = arreglo.get(0);
            for (T celda:
                    arreglo)
            {
                if(celda.compareTo(minimo) == -1)
                {
                    minimo = celda;
                }
            }
        }

        return minimo;
    }

    public T removerUltimo()
    {
        return arreglo.remove(arreglo.size()-1);
    }

    @Override
    public String toString()
    {
        String cadena =  "Generic{";
        for (T celda: arreglo)
        {
           cadena = cadena.concat(" " + celda.toString() + ",");
        }
        cadena = cadena.concat(" }");
        return cadena;
    }
}
