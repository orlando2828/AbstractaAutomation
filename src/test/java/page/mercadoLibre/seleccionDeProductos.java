package page.mercadoLibre;

public interface seleccionDeProductos {

    static seleccionDeProductos pageObject()
    { seleccionDeProductos seleccionProduc  = null;
        seleccionProduc  =  new seleccionDeProductosWeb();
        return seleccionProduc;
    }

    void obtieneDescrPrimerProducto();
    void obtieneDescrSegundoProducto();
    void obtieneDescrTercerProducto();
}
