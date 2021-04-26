<%@page import="logica.productos"%>
<%@page import="java.util.ArrayList"%>
<%@include file="layout/header.jsp" %>

   <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">Negrito Cristian</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
          <a class="nav-link" href="#">Resultados</a>
      </li>
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>    
        <h1 class="titulo_d">Dispensadora de productos</h1>
        
  <table class="table tabla_t">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Codigo</th>
      <th scope="col">Nombre</th>
      <th scope="col">Marca</th>
      <th scope="col">Cantidad</th>
       <th scope="col">Precio</th>
      <th scope="col">Acciones</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
     
      <td><button type="button" class="btn-success" data-toggle="modal" data-target="#exampleModal">Comprar</button></td>        
    </tr>
    <tr>
      <th scope="row">2</th>
      
      <td><button type="button" class="btn-success" data-toggle="modal" data-target="#exampleModal">Comprar</button></td>
    </tr>
    <tr>
      <th scope="row">3</th>
      
      <td><button type="button" class="btn-success" data-toggle="modal" data-target="#exampleModal">Comprar</button></td>
    </tr>
  </tbody>
</table>
        <%
          ArrayList Listaproductos= new ArrayList();
          
          if(Listaproductos==null){
             session.setAttribute("usuario", Listaproductos);
            
          }
        
        %>
        
        
        
        
        <h1 class="titulo_c">Carrito de compras</h1>
        
        <table class="table tabla_c">
            <tbody>
    <tr>
      <th scope="row">1</th>
      
    
      <td><button type="button" class="btn-secondary" data-toggle="modal" data-target="#compraModal" >Finalizar Comprar</button></td>        
    </tr>
    <tr>
      <th scope="row">2</th>
      
      <td><button type="button" class="btn-secondary" data-toggle="modal" data-target="#compraModal">Finalizar compra</button></td>
    </tr>
    <tr>
      <th scope="row">3</th>

      <td>
          <button type="button" class="btn-secondary" data-toggle="modal" data-target="#compraModal">Finalizar compra</button>
      </td>
    </tr>
  </tbody>
        </table>
             
    
 <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title tama_b" id="exampleModalLabel">Compra producto</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        <form action="controlador" method="post">
      <div class="modal-body">
       <h5 class="modal-title tama_b" id="exampleModalLabel">Buscar producto</h5>
      <input class="form-control form-control-lg ta_label " type="text" placeholder="Ingrese codigo del producto" name="codigo">
      
        <h5 class="modal-title tama_b" id="exampleModalLabel">Cantidad</h5>
        <input class="form-control form-control-lg " type="text" placeholder="Ingrese cantidad de compra" name="cantidad">
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        <input type="submit" class="btn btn-primary" value="Enviar" name="btn-busqueda">
      </div>
        </form>
    </div>
    </div>
  </div>

        
        
   <div class="modal fade" id="compraModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Finalizar compra</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        <form action="controlador" method="post">
      <div class="modal-body">
        <div class="input-group mb-3">
      <div class="input-group-prepend">
      <h5 class="modal-title ta" id="exampleModalLabel">Ingrese dinero</h5>
      <span class="input-group-text">$</span>
       </div>
  <input type="text" class="form-control" name="dinero" aria-label="Dollar amount (with dot and two decimal places)">
</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
        <button type="submit" class="btn btn-primary" name="comprar">Comprar</button>
      </div>
        </form>
    </div>
  </div>
</div>
        
        
        
        <%@include file="layout/footer.jsp" %>
        



