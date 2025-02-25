package testClases.mercadoLibre;

import Base.BaseWebMercado;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.mercadoLibre.*;

import static constans.Constants.*;

public class CPA0002BusquedaProductoPorCategoria extends BaseWebMercado {

    @Test(groups = {"BUSQUEDA PRODUCTO MERCADO LIBRE POR CATEGORIA"},description = "TOOLSQA ")
    @Parameters({""})

    public void CPA0002BusquedaProductoPorCategoria (){
//        homeMercadoLibreWeb homeMercLibre= new homeMercadoLibreWeb();
//        seleccionProductoCategoriaWeb seleccionDeProd= new seleccionProductoCategoriaWeb();
//        categoriaDeBusquedaWeb categoriaDeBus= new categoriaDeBusquedaWeb();
//
//        homeMercLibre.homePagina();
//        homeMercLibre.informacionCookie();
//        homeMercLibre.ingresoProducto(productoModa);
//        homeMercLibre.busquedaProducto();
//        /**Genero MUJER*/
//        categoriaDeBus.busquedaPorGenero(generoMujer);
//        seleccionDeProd.obtieneDescrPrimerProducto();
//        homeMercLibre.ingresoProducto(productoModa);
//        homeMercLibre.busquedaProducto();
//
//        /**Categoria Ropa Interior*/
//        categoriaDeBus.busquedaPorCategoria("Ropa Interior");
//        seleccionDeProd.obtieneDescrSegundoProducto();


        homeMercadoLibre.pageObject().homePagina();
        homeMercadoLibre.pageObject().informacionCookie();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();

        /**Genero MUJER*/
        categoriaDeBusqueda.pageObject().busquedaPorCategoria(generoMujer);
        seleccionProductoCategoria.pageObject().obtieneDescrPrimerProducto();
        homeMercadoLibre.pageObject().ingresoProducto(productoModa);
        homeMercadoLibre.pageObject().busquedaProducto();

        /**Categoria Ropa Interior*/
        categoriaDeBusqueda.pageObject().busquedaPorCategoria(categoriaRopaInt);
        seleccionProductoCategoria.pageObject().obtieneDescrSegundoProducto();


    }


}
