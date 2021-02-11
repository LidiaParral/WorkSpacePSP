 HILOS
-------
Un hilo (en inglés “thread”) es la menor de las estructuras lógicas de programación que se ejecuta de forma secuencial por parte del planificador del sistema operativo

Si tenemos más de un hilo de ejecucción podemos hacer una programacion
multihilo, pudiendo realizar multitarea y reducir los tiempos 
de ejecución en las aplicaciones

Tenemos dos maneras de programar hilos en java

1) Crear una clase y extendiendo de la clase Thread
2) Crear una clase que implemente la interfaz Runnable

En Ambas maneras hay que sobreescribir el metodo run() en la clase
y lo que haya dentro de dicho metodo será el ciclo de vida del 
hilo. Este método podemos entenderlo como si fuera un metodo
"main"

Una vez programado podemos arrancar un hilo a traves del metodo
start() de la clase Thread, debiendo crear previamente el objeto

