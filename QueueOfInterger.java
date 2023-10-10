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

    //método 3b
    /**
     * Método enqueuePriority()
     * Recebe como parâmetro um elemento que deve ser inserido na fila de acordo com a sua prioridade
     * @param element elemento a ser inserido
     */
    public void enqueuePriority(Integer element) {
        int index = 0;
        for (int i = 0; i < fila.size(); i++) {
            if (element < fila.get(i)) {
                break;
            }
            index++;
        }
        fila.add(index, element);
    }

}