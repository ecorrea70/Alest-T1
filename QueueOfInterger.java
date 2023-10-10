public class QueueOfInterger {

    DoubleLinkedListOfInteger fila = new DoubleLinkedListOfInteger();

    public void enqueue(Integer element){
        fila.add(element);
    }

    public int dequeue(){
        int removido = 0;
        if (fila.isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            removido = fila.removeByIndex(0);

        }
        return removido;
    }

    public int head(){
        int head = 0;
        if (fila.isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            head = fila.get(0);
        }
        return head;
    }

    public int size(){
        int size = 0;
        if (fila.isEmpty()){
            throw new IndexOutOfBoundsException();
        }else{
            size = fila.size();
        }
        return size;
    }
    public boolean isEmpty(){
        if (fila.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void clear(){
        if (fila.isEmpty()){
            throw new IndexOutOfBoundsException();
        }else {
            fila.clear();
        }
    }
}