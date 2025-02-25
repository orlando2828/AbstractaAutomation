package page.mercadoLibre;

public interface homeMercadoLibre {

    static homeMercadoLibre pageObject()
    { homeMercadoLibre homeMercLibre  = null;
        homeMercLibre  =  new homeMercadoLibreWeb();
        return homeMercLibre;
   }

    void homePagina();
    void ingresoProducto( String producto);
    void busquedaProducto();
    void informacionCookie();


}
