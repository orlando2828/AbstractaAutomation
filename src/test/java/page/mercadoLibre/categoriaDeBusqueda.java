package page.mercadoLibre;

public interface categoriaDeBusqueda {

    static categoriaDeBusqueda pageObject()
    { categoriaDeBusqueda categoriaBusqueda  = null;
        categoriaBusqueda  =  new categoriaDeBusquedaWeb();
        return categoriaBusqueda;
    }

    void  tipoDeEnvio(String tipoEnvio);
    void busquedaPorGenero(String genero);
    void busquedaPorCategoria(String categoria);
}
