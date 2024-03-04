package Praktikumsblatt5;

public class CharacterSearchTree
{

    // Vorgaben

    private HuffmanTriple content;
    private CharacterSearchTree leftChild, rightChild;

    public CharacterSearchTree() 
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }
    public CharacterSearchTree ( char [] arr){
        for (int i=0; i< arr.length; i++){
            iterativeAdd(arr[i]);
        }
    }

    public HuffmanTriple getContent()
    {
        if ( !isEmpty() )
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

    public void iterativeAdd( char t )
    {
        CharacterSearchTree current = this;
        while ( !current.isEmpty() && current.content.getToken() != t )
        {
            if ( current.content.getToken() > t )
            {
                current = current.leftChild;
            }
            else
            {
                current = current.rightChild;
            }
        }
        if ( current.isEmpty() ) 
        {
            current.content = new HuffmanTriple( t );
            current.leftChild = new CharacterSearchTree();
            current.rightChild = new CharacterSearchTree();
        }
        else
        {
            current.content.incrementQuantity();
        }
    }
    public void add (char t, int q, String c){
        for (int i=0; i<q; i++){
            iterativeAdd(t);
        }
    }
    public void showPreOrder (){
        if ( !isEmpty() )
        {
            System.out.print(content.toString() + " * " );
            leftChild.showPreOrder();
            rightChild.showPreOrder();
        }
    }
    public void show()
    {
        if ( !isEmpty() ) 
        {
            leftChild.show();
            System.out.println( content.toString() );
            rightChild.show();
        }
    }
    public int height (){
        if (isEmpty()){
            return 0;
        } else {
            if (leftChild.height() > rightChild.height()){
                return leftChild.height()+1;
            } else {
                return rightChild.height()+1;
            }
        }
    }
    public int countCharacters (){
        if (isEmpty()){
            return 0;
        } else {
            return leftChild.countCharacters() + rightChild.countCharacters() + content.getQuantity();
        }
    }
    public int longestCode (){
        if (isEmpty()){
            return 0;
        } else {
            if (leftChild.getContent().getCode().compareTo(rightChild.getContent().getCode()) >0){
                return leftChild.getContent().getCode().length();
            } else {
                return rightChild.getContent().getCode().length();
            }
        }
    }
    public HuffmanTriple minimum (){
        CharacterSearchTree wurzel = this;
        while (!wurzel.isEmpty()) {
            if (!leftChild.isEmpty()){
                wurzel = wurzel.leftChild;
                leftChild = wurzel.leftChild;
                rightChild = wurzel.rightChild;
            } else {
                return wurzel.content;
            }
        }
        return null;
    }
    public boolean hasOnlyCompleteNode (){
        if (!isEmpty()) {
            if (!isLeaf()) {
                return false;
            } else {
                if (!leftChild.hasOnlyCompleteNode()){
                    return false;
                } else if (!rightChild.hasOnlyCompleteNode()) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean containsCharacter (char t){
        if (!isEmpty()) {
            if (content.getToken() == t) {
                return true;
            } else {
                if (leftChild.containsCharacter(t) || rightChild.containsCharacter(t)){
                return true;
                } else{
                    return false;
                }
            }
        } else {
            return  false;
        }
    }
}

/*
public CharacterSearchTree biggestInLeft(){
        if (isEmpty()){
            return null;
        } else {
            if (rightChild.isEmpty()){
                return null;
            } else {
                CharacterSearchTree current = this.rightChild;
                while (!current.rightChild.isEmpty()){
                    current = current.rightChild;
                }
                return current;
            }
        }
    }
    public void delete (){
        if (biggestInLeft().getContent() != null){
            HuffmanTriple toDelete =  biggestInLeft().getContent();
            CharacterSearchTree current = this;
            CharacterSearchTree left = this.leftChild;
            while (!left.isEmpty()){
                current = current.rightChild;
            }

        }
    }
*/

