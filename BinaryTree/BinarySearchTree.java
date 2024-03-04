package BinaryTree;

public class BinarySearchTree<T extends Comparable<T>>
implements Iterable<T>
{
    private T content;
    private BinarySearchTree<T> leftChild, rightChild;

    public BinarySearchTree() 
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    public T getContent()
    {
        if (!isEmpty() )
        {
            return content;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean isEmpty() 
    {
        return content == null;
    }

    public boolean isLeaf() 
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public void add( T t )
    {
        if ( isEmpty() ) 
        {
            content = t;
            leftChild = new BinarySearchTree<T>();
            rightChild = new BinarySearchTree<T>();
        }
        else
        {
            if ( content.compareTo( t ) > 0 )
            {
                leftChild.add( t );
            }
            else if ( content.compareTo( t ) < 0 )
            {
                rightChild.add( t );
            }
        }
    }

    public boolean contains( T t )
    {
        if ( isEmpty() ) 
        {
            return false;
        }
        else
        {
            if ( content.compareTo( t ) > 0 )
            {
                return leftChild.contains( t );
            }
            else if ( content.compareTo( t ) < 0 )
            {
                return rightChild.contains( t );
            } 
            return true;
        }
    }

    public int size() 
    {
        if ( isEmpty() ) 
        {
            return 0;
        }
        else
        {
            return 1 + leftChild.size() + rightChild.size();
        }       
    }

    public void show()
    {
        if ( !isEmpty() ) 
        {
            leftChild.show();
            System.out.println( content );
            rightChild.show();
        }
    } 

    public Iterator<T> listBasedIterator()
    {
        DoublyLinkedList<T> list = new DoublyLinkedList<T>();
        toList( list );
        return list.iterator();
    }

    private void toList( DoublyLinkedList<T> list )
    {
        if ( !isEmpty() ) 
        {
            leftChild.toList( list );
            list.add( content );
            rightChild.toList( list );
        }
    }

    private class StackBasedIterator implements Iterator<T>
    {
        private Stack<BinarySearchTree<T>> nodes;

        public StackBasedIterator()
        {
            nodes = new Stack<BinarySearchTree<T>>();
            descendLeftAndPush( BinarySearchTree.this );
        }

        public T next() 
        {
            if ( hasNext() ) {
                T content = nodes.peek().getContent();
                descendLeftAndPush( nodes.pop().rightChild ); 
                return content;
            } else {
                throw new IllegalStateException();
            }
        }

        public boolean hasNext()
        {
            return !nodes.isEmpty();
        } 

        private void descendLeftAndPush( BinarySearchTree<T> root )
        {
            BinarySearchTree<T> current = root;
            while ( !current.isEmpty() )
            {
                nodes.push( current );
                current = current.leftChild;
            }
        }

    }
    
    public Iterator<T> iterator()
    {
        return new StackBasedIterator();
    }

    public T bigOn (int lev){
        if (!isEmpty()){
            if (lev ==0){
                return content;
            } else{
                T left = leftChild.bigOn(lev -1);
                T right = rightChild.bigOn(lev-1);
                if (left != null && right != null){
                    if (left.compareTo(right)>0){
                        return left;
                    } else {
                        return right;
                    }
                } else if(left ==null ) {
                    return right;
                } else if (right==null){
                    return left;
                }
                else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
    public int checkTreee(){
        if (isEmpty()){
            return 0;
        } else {
            int left = leftChild.checkTreee()+1;
            int right = rightChild.checkTreee()+1;
            if (Math.abs(left - right)>2){
                return -1;
            } else if (left>right){
                return left;
            } else {
                return right;
            }
        }
    }
    public static boolean contains (int [] arr, int n, int limit){
        if (limit<0 || limit >= arr.length){
            throw new IllegalArgumentException();
        } else {
            if (limit==0){
                return arr[limit] ==n;
            } else {
                if (contains(arr,n,limit-1)){
                    return true;
                } else {
                    return arr[limit] ==n;
                }
            }
        }
    }
}