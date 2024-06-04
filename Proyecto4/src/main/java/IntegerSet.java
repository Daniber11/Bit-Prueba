package src.main.java;

public class IntegerSet {
    private boolean[] set;

    // Constructor sin argumentos que inicializa el conjunto vacío
    public IntegerSet() {
        set = new boolean[101];
    }

    // Método para realizar la unión de dos conjuntos
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] || set2.set[i];
        }
        return resultSet;
    }

    // Método para realizar la intersección de dos conjuntos
    public static IntegerSet interseccion(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] && set2.set[i];
        }
        return resultSet;
    }

    // Método para insertar un elemento en el conjunto
    public void insertarElemento(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    // Método para eliminar un elemento del conjunto
    public void eliminarElemento(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    // Método para convertir el conjunto a una cadena
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean empty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                empty = false;
            }
        }
        if (empty) {
            return "-";
        } else {
            return sb.toString().trim();
        }
    }

    // Método para comparar dos conjuntos
    public boolean equalTo(IntegerSet otherSet) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }

    // Clase de prueba para IntegerSet
    public static class IntegerSetTest {
        public static void main(String[] args) {
            IntegerSet set1 = new IntegerSet();
            IntegerSet set2 = new IntegerSet();

            set1.insertarElemento(5);
            set1.insertarElemento(10);
            set2.insertarElemento(10);
            set2.insertarElemento(20);

            IntegerSet unionSet = IntegerSet.union(set1, set2);
            IntegerSet interseccionSet = IntegerSet.interseccion(set1, set2);

            System.out.println("Conjunto 1: " + set1.toSetString());
            System.out.println("Conjunto 2: " + set2.toSetString());
            System.out.println("Unión de conjuntos: " + unionSet.toSetString());
            System.out.println("Intersección de conjuntos: " + interseccionSet.toSetString());

            System.out.println("Conjuntos son iguales: " + set1.equalTo(set2));
        }
    }
}
