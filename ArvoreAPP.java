package ABB;

public class ArvoreAPP {
    public static void main(String[] args) {
        BinarySearchTree minhaABB = new BinarySearchTree();
        minhaABB.insert(8);
        minhaABB.insert(2);
        minhaABB.insert(4);
        minhaABB.insert(6);
        minhaABB.insert(4);
        minhaABB.insert(3);
        minhaABB.insert(15);
        minhaABB.insert(5);
        minhaABB.insert(7);
        minhaABB.insert(12);
        minhaABB.insert(16);
        minhaABB.insert(10);
        minhaABB.insert(14);
        minhaABB.insert(9);
        minhaABB.insert(11);
        System.out.println("Em ordem");
        minhaABB.print(0);
        System.out.println("Pré ordem");
        minhaABB.print(-1);
        System.out.println("Pós ordem");
        minhaABB.print(1);


        System.out.println("Depois de remover");
        minhaABB.remove(2);
        minhaABB.remove(4);
        minhaABB.print(0);




    }

}
