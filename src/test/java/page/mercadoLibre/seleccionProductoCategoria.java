package page.mercadoLibre;

public interface seleccionProductoCategoria {

    static seleccionProductoCategoria pageObject()
    { seleccionProductoCategoria seleccionProductoCat  = null;
        seleccionProductoCat  =  new seleccionProductoCategoriaWeb();
        return seleccionProductoCat;
    }

    void obtieneDescrPrimerProducto();
    void obtieneDescrSegundoProducto();

}
