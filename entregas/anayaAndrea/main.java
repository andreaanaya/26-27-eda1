  private final int MAXIMO_PERSONAS = 30;
    private final double PROBABILIDAD_ABURRIRSE = 0.30;
@mmasias
mmasias
last week
Owner
Mejor inicializarlo en el constructor

@andreaanaya	Reply...
mmasias
mmasias reviewed last week
entregas/moralesLucas/reto-001/Fila.java
Comment on lines +48 to +50
        if (!hayGente()) {
            return null;
        }
@mmasias
mmasias
last week
Owner
Recuérdame que comentemos esto en clase: hay que evitarlo

@andreaanaya	Reply...
mmasias
mmasias reviewed last week
entregas/moralesLucas/reto-001/Fila.java
        return numeroClientes;
    }

    public Cliente obtenerPrimero() {
@mmasias
mmasias
last week
Owner
Qué diferencia hay entre obtenerPrimero() y sacarPrimero()?

@andreaanaya	Reply...
mmasias
mmasias reviewed last week
entregas/moralesLucas/reto-001/Fila.java
        return true;
    }

    public boolean colocarDetrasDeConocido(Cliente cliente) {
@mmasias
mmasias
last week
Owner
Lo mismo: comentamos esto en clase: ¿qué implica que la fila sea la que coloca a alguien detrás de un conocido? ¿La fila rompe sus propias reglas? Recuérdamelo en clase para debatirlo!

