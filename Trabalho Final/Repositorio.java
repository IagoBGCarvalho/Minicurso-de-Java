import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Repositorio<T> {
    protected List<T> elementos;

    public Repositorio() {
        this.elementos = new ArrayList<>();
    }

    public void salvar(T elemento) {
        elementos.add(elemento);
    }

    public T buscar(T outro) {
        for (T elemento : elementos) {
            if (elemento.equals(outro)) {
                return elemento;
            }
        }
        return null;
    }

    public T buscarPorFiltro(Function<T, Boolean> f) {
        for (T elemento : elementos) {
            if (f.apply(elemento)) {
                return elemento;
            }
        }
        return null;
    }

    public boolean removerPorFiltro(Predicate<? super T> f) {
        return elementos.removeIf(f);
    }

}
