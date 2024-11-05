package ABB;

public class BinarySearchTree {
    private BinaryNode root;
    private class BinaryNode {
        private int element;
        private BinaryNode left;
        private BinaryNode right;
        private int contador;

        BinaryNode(int element,BinaryNode left,BinaryNode right) {
            this.element=element;
            this.left=left;
            this.right=right;
            this.contador=1;
        }
    }
    public BinarySearchTree( ) {
        root=null;
    }
    public void clear( ) {
        root=null;
    }

    public boolean isEmpty( ) {
        return (root==null);
    }
    public void insert( int x ) {
        root=insert(x,root);

    }
    private BinaryNode insert( int x, BinaryNode t ) {
        if ( t == null ) {
            t = new BinaryNode(x, null, null);
        } else if(x < t.element)
            t.left = insert( x, t.left );
        else if( x > t.element)
            t.right = insert( x, t.right );
        else if ( x == t.element)
            t.contador++;

        return t;
    }
    public void print(int ordem) {
        if( isEmpty( ))
            System.out.println( "Arvore Vazia" );
        else {
            if (ordem==0)
                print_em_ordem(root);
            if (ordem==-1)
                print_pre_ordem(root);
            if (ordem==1)
                print_pos_ordem(root);
        }

    }

    private void print_em_ordem(BinaryNode t) {
        // percorre a árvore em ordem
        if ( t != null ) {
            print_em_ordem( t.left );
            System.out.println(t.element  + "(" + t.contador + ")");
            print_em_ordem( t.right );
        }
    }
    private void print_pre_ordem(BinaryNode t) {
        if(t != null) {
            System.out.println(t.element + "(" + t.contador + ")");
            print_pre_ordem(t.left);
            print_pre_ordem(t.right);
        }

    }
    private void print_pos_ordem(BinaryNode t) {
        if(t != null) {
            print_pos_ordem(t.left);
            print_pos_ordem(t.right);
            System.out.println(t.element  + "(" + t.contador + ")");
        }

    }
    public boolean find( int x ) {
        return find(x,root) != null ? true:false;
    }
    private BinaryNode find( int x, BinaryNode t ) {
        if (t == null)
            return null;  // elemento não está na árvore
        if ( x < t.element )
            return find( x, t.left );
        else if( x > t.element )
            return find( x, t.right );
        else
            return t;    // encontrou
    }
    public int findMin()  {
        if (isEmpty())
            throw new EmptyTreeException();
        return findMin(root).element;
    }
    private BinaryNode findMin(BinaryNode t) {
        if( t.left == null )
            return t;
        return findMin( t.left );
    }
    public int findMax( ) {
        if (isEmpty())
            throw new EmptyTreeException();
        return findMax(root).element;
    }

    private BinaryNode findMax( BinaryNode t ) {
        while( t.right != null )
            t = t.right;
        return t;
    }
    public void remove( int x ) {
        root=remove(x,root);
    }
    private BinaryNode remove( int x, BinaryNode t ) {
        if( t == null ){                          // Item não está na árvore ou árvore vazia, não faça nada
            return t;
        }
        if( x == t.element && t.contador>1){
            t.contador--;
            return t;
        }
        if( x < t.element)
            t.left = remove( x, t.left );
        else if( x > t.element )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) {  // Caso 3 – nó com dois filhos
            t.element = findMin( t.right ).element;
            t.right = remove( t.element, t.right );
        }
        else  // Caso 1 e 2 – nó com um ou nenhum filho
            t = (t.left != null) ? t.left : t.right;
        return t;
    }

}
