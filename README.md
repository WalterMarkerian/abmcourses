# abm-cursos
SPRING MVC
    -simplifica el manejo de solicitudes y respuestas HTTP 
    -MVC model-view-controller
        -Separacion de la logica empresarial, la logica de presentacion y la logica de navegacion.
    
    El cliente hace peticiones por medio de la vista, y la capa de los controladores obtiene las peticiones y se comunica a servicios creado por JPA Repository CRUD(SPRING DATA) los Servicios se vinculan con las base de datos y tambien con la capa de modelo, esta ultima contiene las clases de modelo que vincula con las tablas en la bd. Conectando objetos con las tablas. Luego de recibir la informacion de la base de datos, se la devuelve al controlador, que valida la informacion y la pasa a las vistas para que pueda visualizar el cliente el resultado de su peticion.  

    Controlador, obtencion de peticiones que realice el cliente desde la interfaz de usuario. Encargado de gestionar las peticiones, verifica si es para ejecutar una vista o ejecutar un servicio. Intermediario entre la capa vista y la capa model.

@Anotaciones
    Controller
    -cambia el comportamiento de la clase
        -lleva un metodo de accion
    
    GetMapping("valor_por_la_url")
    -se ejecutara de forma automatica cuando pasemos informacion por la url del navegador, con la peticion GET(HTTP)

    RequestMapping
    -Permite capturar multiples solicitudes GET/POST dependiendo a la info que se le brinde a la anotacion.
    -POST es oculta

    PostMapping
    -Utilizada para enviar informacion al servidor con la peticion por POST donde la informacion va oculta.

    NotNull
    -Objeto que puede estar vacio pero no con el valor de null.

    NotEmpty
    -Podemos validar colecciones de objeto, siempre y cuando la longitud de la coleccion sea > 0
    -No queremos que no este vacio ni tenga valor de null.

    NotBlank
    -No valida colecciones de objeto.
    -No acepta valores nulos, ni objetos vacios.

    EntityListeners()
    -Escucha el entity de nuestra clase, reacciona a las diferentes operaciones relacionadas a la tabla.
    -(AuditingEntityListener.class) 

DIFERENCIAS ENTRE Controller y RestController
    Controller
    -Utilizada para desplegar vistas o plantillas con la interfaz para la interaccion del cliente.
    RestController
    -Devuelve (informacion) objetos de tipo JSON o XML o respuestas HTTP

Spring Boot Redis Session
    -Interface usada para administrar las variables de sesiones para los usuarios que pueden iniciar sesion en la aplicacion