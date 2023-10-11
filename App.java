
public class App {

    public static void main(String[] args) {
        // 1
        // teste do método A
        DoubleLinkedListOfInteger dlist3 = new DoubleLinkedListOfInteger();
        dlist3.add(10);
        dlist3.add(10);
        dlist3.add(10);
        dlist3.add(10);
        System.out.println(dlist3.countOccurrences(10));

        // teste do método B
        System.out.println(dlist3.removeEvenNumbers());
        System.out.println(dlist3.countOccurrences(10)); // vê se os '10' que foram adicionados foram removidos, já que
                                                         // são numeros par.

        // 2
        // teste do exercício 2a
        System.out.println("OUTPUT DA PILHA");

        StackOfInterger pilha = new StackOfInterger();
        System.out.println(pilha.push(2));
        System.out.println(pilha.push(55));
        System.out.println(pilha.push(66));
        pilha.info();
        pilha.pop();
        System.out.println("Tamanho da Pilha: " + pilha.size());
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        System.out.println("PILHA TOP: " + pilha.top());
        System.out.println("Clearing Pilha");
        pilha.clear();
        System.out.println("Tamanho da Pilha: " + pilha.size());
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        int[] vetorLetraB = new int[5];
        for (int i = 0; i < vetorLetraB.length; i++) {
            vetorLetraB[i] = i;
            System.out.println(i);
        }
        System.out.println(StackOfInterger.reverseArrayUsingStack(vetorLetraB));
        for (int t = 0; t < vetorLetraB.length; t++) {

            System.out.println(vetorLetraB[t]);
        }
        System.out.println("FIM DO OUTPUT DAS PILHAS");
        // 3
        // testes do exercício 3a
        QueueOfInterger fila = new QueueOfInterger();
        boolean estaVazia = fila.isEmpty(); // cria a variável para verificar se a lista está vazia ou não

        fila.enqueue(10); // adiciona elemento na fila

        int head = fila.head(); // cria a variável para armazenar o head da lista
        System.out.println("Elemento no início da fila: " + head);

        fila.enqueue(20);
        head = fila.head();
        System.out.println("Elemento no início da fila: " + head);

        fila.dequeue(); // remove elemento do inicio da fila
        head = fila.head();
        System.out.println("Elemento no início da fila: " + head);

        fila.enqueue(20);
        int size = fila.size(); // cria a variável para ver o tamanho da fila
        System.out.println("Tamanho da fila: " + size);

        estaVazia = fila.isEmpty();
        System.out.println("A fila está vazia? " + estaVazia);

        fila.clear(); // esvazia a fila
        estaVazia = fila.isEmpty();
        System.out.println("A fila está vazia? " + estaVazia);

        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        head = fila.head();
        System.out.println("Elemento no início da fila: " + head);

        fila.enqueuePriority(10); // executa o método 3b e verifica se a operação funcionou
        head = fila.head();
        System.out.println("Elemento no início da fila: " + head);

    }

}
