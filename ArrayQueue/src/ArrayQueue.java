public class ArrayQueue<T> implements IQueue<T> {

private Object[] data;
private int front;//primero en la fila
private int rear; // para saber en que posicion va el siguiente dato
private int size; //tamaño de la queue

public ArrayQueue(){
this(10);

}

public ArrayQueue(int tam){
this.data=new Object[tam];
this.front=0;
this.rear=0;
this.size=0;
}

@SuppressWarnings("unchecked")
@Override
public T poll() {
if(isEmpty()){
System.out.println("La queue esta vacia");
return null;
}
T result=(T) data[front];//Elemento a retirar
data[front]=null;//limpiamos elemento en la posicion de front
front=(front+1)%data.length; //calculamos el nuevo frente
size--; //redicimos el tamaño de la queue
return result; //devolver el elemento eliminado
}

@Override
public void offer(T element) {
//validar si el arreglo esta lleano, lo vamos a incrementar;
this.data[rear]=element;//agregar un nuevo elemento en rear (posicionb)
this.rear=(rear+1)%data.length; //calculo de rear, si llega al final, se reinicia a 0
size++;

}

@SuppressWarnings("unchecked")
@Override
public T peek() {
if(isEmpty()){
System.out.println("La queue esta vacia");
return null;
}
return (T) data[front];
}

@Override
public void println() {
StringBuilder sb=new StringBuilder();
sb.append("[");
for (int i = 0; i < size; i++) {
sb.append( data[ (front+i)%data.length ] );
sb.append("->");

}
sb.append("]");
System.out.println(sb.toString());

}

@Override
public boolean isEmpty() {
return size==0;
}

@Override
public int size() {
return this.size;
}

}