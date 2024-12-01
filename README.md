# La WEB

En general está representado como un conjunto de computadoras interconectadas entre si que se relacionan o pueden relacionarse mediante **diferentes protocolos** sin importar la distancia entre ellos.
La arquitectura cliente-servidor consiste en las computadoras ofreciendo un servicio o información para ser consumido y los consumidores de esta que serían los clientes.
La dirección  que representa a los recursos y que permite su acceso a ellos es conocida como URL.

## Protocolo HTTP
Es un conjunto de reglas que se debe seguir para obtener o lograr un determinado resultado o acceder a un determinado recurso o servicio. HTTP es el protocolo utilizado actualmente para acceder a Internet. HTTP permite que las solicitudes y respuestas entre clientes y servidores, tengan un determinado formato a seguir y respetar para que se puedan comunicar sin inconvenientes.
- ***Una Request*** es el mensaje que se lleva a cabo desde un cliente hacia un servidor para poder acceder a un determinado servicio. 
- ***Header***: Contiene atributos o especificaciones necesarias para una correcta comunicación.
- ***Body***: Campo opcional donde en caso de ser necesario pueden incluirse objetos, textos, datos necesarios para transmitir en la solicitud. 
- ***Una Response*** Tienen un formato particular que les permiten transportar la información necesaria para atender a las solicitudes recibidas.

### Códigos de status
- 100: Respuestas de tipo informativas. Generalmente se usan para informar el proceso de solicitudes.
- 200: Informan que una solicitud fue procesada correctamente.
- 300: Informan que se producirá una redirección.
- 400: Representan errores causados principalmente por la solicitud del cliente.
- 500: Manifiestan errores causados por el servidor.

## Librerias
Conjunto de bloques de código para resolver problemas o necesidades especificas que pueden ser reutilizadas optimizando el código desarrollado.
## Frameworks
Marcos o entornos de trabajo que incluyen dentro de si un conjunto de herramientas y librerias que pueden ser utilizadas de forma sencilla.

## Maven
Herramienta de software para la gestión y construcción de proyectos Java que se caracteriza por tener un modelo de configuración muy simple basado en el formato XML.

## ¿Qué es JSP?
Java Server Pages es una tecnología que permite crear aplicaciones web dinámicas basadas en HTML y XML entre otros tipos. Requiere de un servidor web compatible con contenedores servlet como Apache Tomcat o Glassfish;

## ¿Qué es Apache Tomcat?
Es un servidor web y contenedor de servlets de código abierto, proporciona un entorno en el que las aplicaciones web Java basadas en JSP y Servlets pueden ejecutarse de manera eficiente.

### Etiquetas JSP
- <%-- --%> Comentarios
- <%@ %> Apertura y cierre para directivas/ atributos de configuración
- <% %> Apertura y cierre para inclusión de sentencias o código Java.
- <%= %> Apertura y cierre para mostrar el resultado de una expresión o contenido de una variable.
- <%! %> Apertura y cierre para hacer uso exclusivo de declaración de variables y métodos de instancia que se compartirán entre varios JSP asociados al mismo servlet.

## ¿Qué es un Servlet?
Es una clase especial de Java que se utiliza como punto intermedio entre una ***página JSP*** y el ***servidor web*** donde está alojada la lógica(backend) de una aplicación. El Servlet es el encargado de recibir peticiones o request desde un cliente, de tratarlas y analizar si es necesario realizar alguna solicitud en particular o brindar una determinada respuesta o response. Los servlets utilizan una serie de métodos que dependen del <<verbo>> por el cual se reciba la petición(GET, POST, PUT, DELETE, etc).

### Métodos
Los servlets tienen diferentes métodos que pueden ser utilizados dependiendo del tipo de solicitud que reciban por parte del cliente. Los más usados son:
- doGet() que se encarga de recibir las solicitudes que provienen mediante GET.
- doPost() que se encarga de recibir las solicitudes que provienen mediante POST.

### Pasaje de datos a un Servlet con getParameter()
El método getParameter() es una función importante en los servlets de Java que se utiliza para enviar datos desde un formulario HTML o para recuperar los parámetros de una solicitud HTTP GET en un servlet.
Permite que los servlets accedan a la información proporcionada por el cliente a través de una solicitud HTTP.
Ejemplo: Si enviamos un dato desde un formulario en un JSP y el mismo está en una caja de texto llamada txtNombre, entonces la forma de obtener ese dato será:
- String dato = request.getParameter("txtNombre");

El método getParameter() siempre devuelve una cadena de texto(String). Sólo se puede utilizar para recuperar datos de ***formularios HTML*** o ***parámetros en la url*** de una solicitud GET. 

