/* ## 2. Implementação de Pilhas

### a) Apresente os métodos definidos a seguir para uma classe StackOfInterger que lida com números inteiros em um estrutura de pilha, considerando que os elementos da pilha devem ser armazenados em uma DoubleLinkedListOfInteger. Crie uma classe App e inclua nela o método main. Dentro deste método main instancie a pilha implementada, inclua elementos e use o restante dos métodos implementados.

     void pop()
     int push(Integer element)
     int top()
     int size()
     boolean isEmpty()
     void clear()

### b) Construa o método estático abaixo seguindo as instruções dos comentários javadoc. Este método recebe um arranjo de 
inteiros por parâmetro e utiliza uma instância da pilha implementada para inverter o seu conteúdo. Chame este método main da classe App para testar o seu funcionamento. 

    
     * Método reverseArrayUsingStack()
     * Método estático que recebe um arranjo de inteiros e utiliza uma pilha implementada para inverter seu conteúdo
     * @param vet[] um arranjo inteiros
     * @return o vetor com os dados invertidos
     
     boolean reverseArrayUsingStack( ... )
 */

public class StackOfInterger {

    DoubleLinkedListOfInteger pilha = new DoubleLinkedListOfInteger();

    public static boolean reverseArrayUsingStack(int[] vetor) {
        StackOfInterger pilhaReserva = new StackOfInterger();
        boolean verificacao = true;
        int tamanhoVetor = vetor.length;
        int[] vetorReserva = new int[vetor.length];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetorReserva[i] = vetor[i];
            pilhaReserva.push(vetor[i]);
        }
        for (int t = 0; t < tamanhoVetor; t++) {
            vetor[t] = pilhaReserva.top();
            pilhaReserva.pop();
        }
        int x = tamanhoVetor - 1;
        for (int y = 0; y < tamanhoVetor; y++) {
            if (vetorReserva[y] != vetor[x]) {
                verificacao = false;
            }
            x--;
        }
        return verificacao;
    }

    public void info() {
        if (pilha.size() == 0)
            System.out.println("Pilha is Empty");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            System.out.println(pilha.get(i));
        }
    }

    public int push(Integer element) {
        pilha.add(element);
        return pilha.get(pilha.size() - 1);
    }

    public void pop() {
        Integer removedElement = pilha.removeByIndex(pilha.size() - 1);
        if (removedElement == null) {
            System.out.println("ERROR ERROR PILHA IS EMPTY");
        } else {
            System.out.println("ELEMENT REMOVIDO: " + removedElement);
        }
    }

    public int top() {
        int top;
        if (pilha.isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            top = pilha.get(pilha.size() - 1);
        }

        return top;
    }

    public int size() {
        int size = 0;
        if (pilha.isEmpty()) {
            System.out.println("Pilha está vazia");
            // throw new IndexOutOfBoundsException();
        } else {
            size = pilha.size();
            return size;
        }
        return size;
    }

    public boolean isEmpty() {
        if (pilha.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {

        if (pilha.isEmpty())
            throw new IndexOutOfBoundsException();
        else {
            for (int i = pilha.size() - 1; i >= 0; i--) {
                pilha.removeByIndex(i);

            }
        }
    }
}