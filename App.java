
public class App {

    public static void main(String[] args) {

        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();
        dlist.add(10);
        dlist.add(20);
        dlist.add(30);
        dlist.add(40);
        dlist.add(50);
        dlist.add(60);
        dlist.add(70);
        dlist.add(80);
        
        System.out.println(dlist);
        System.out.println("Size: " + dlist.size());

        System.out.println("Get da posicao 2: " + dlist.get(2));
        System.out.println("Get da posicao 6: " + dlist.get(6));
        
        System.out.println("Trocou " + dlist.set(2, 35) + " por 35 na posicao 2.");
        
        System.out.println("Removeu 50? " + dlist.remove(50));
        System.out.println("Removeu 57? " + dlist.remove(57));
        
        System.out.println(dlist);

        dlist.add(0,0);
        dlist.add(dlist.size(),90);
        dlist.add(4,44);
        System.out.println(dlist);

        System.out.println("dlist de trás para frente: " + dlist.toStringBackToFront());

        DoubleLinkedListOfInteger dlist2 = new DoubleLinkedListOfInteger();
        dlist2.add(35);
        dlist2.add(5);
        dlist2.add(50);
        dlist2.add(60);
        dlist2.add(20);
        dlist2.add(10);

        System.out.println("Conteudo lista dlist2:\n" + dlist2);

        System.out.println("Maior valor comum entre as listas: " + Operations.getBiggestComumValue(dlist, dlist2));

        //1
        //teste do método A
        DoubleLinkedListOfInteger dlist3 = new DoubleLinkedListOfInteger();
        dlist3.add(10);
        dlist3.add(10);
        dlist3.add(10);
        dlist3.add(10);
        System.out.println(dlist3.countOccurrences(10));

        //teste do método B
        System.out.println(dlist3.removeEvenNumbers());
        System.out.println(dlist3.countOccurrences(10)); //vê se os '10' que foram adicionados foram removidos, já que são numeros par.



        //3
        QueueOfInterger fila = new QueueOfInterger();
        boolean estaVazia = fila.isEmpty(); //cria a variável para verificar se a lista está vazia ou não

        fila.enqueue(10); //adiciona elemento na fila

        int head = fila.head(); //cria a variável para armazenar o head da lista
        System.out.println("Elemento no início da fila: " + head);

        fila.enqueue(20);
        head = fila.head();
        System.out.println("Elemento no início da fila: " + head);

        fila.dequeue(); //remove elemento do inicio da fila
        head=fila.head();
        System.out.println("Elemento no início da fila: " + head);

        fila.enqueue(20);
        int size=fila.size(); //cria a variável para ver o tamanho da fila
        System.out.println("Tamanho da fila: " + size);

        estaVazia = fila.isEmpty();
        System.out.println("A fila está vazia? " + estaVazia);

        fila.clear(); //esvazia a fila
        estaVazia = fila.isEmpty();
        System.out.println("A fila está vazia? " + estaVazia);





    }

}
