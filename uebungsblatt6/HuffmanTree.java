package uebungsblatt6;

public class HuffmanTree
{
    private HuffmanTriple content;
    private HuffmanTree leftChild, rightChild; 

    // empty tree
    public HuffmanTree() 
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    // single node tree 
    public HuffmanTree( HuffmanTriple t ) 
    {
        content = t;
        leftChild = new HuffmanTree();
        rightChild = new HuffmanTree();
    }

    // new root for multiple nodes tree 
    public HuffmanTree( HuffmanTree lc, HuffmanTree rc ) 
    {
        content = new HuffmanTriple ( ' ', lc.getContent().getQuantity() + rc.getContent().getQuantity() );
        leftChild = lc;
        rightChild = rc;
    }

    public boolean isEmpty()
    {
        return content == null;
    }

    public boolean isLeaf()
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public HuffmanTriple getContent() 
    {
        if ( !isEmpty() )
        {
            return content;
        } else {
            throw new IllegalStateException();
        }
    }
    public void setContent(HuffmanTriple toSet){
        if (!isEmpty()){
            content = toSet;
        } else {
            throw new IllegalStateException();
        }
    }

    public int compareTo ( HuffmanTree other ) 
    {
        if ( !isEmpty() && !other.isEmpty() )
        {
            return content.compareTo( other.content );
        } else {
            throw new IllegalStateException();
        }
    }
    
    public void generateCodes()
    {

        if ( !isEmpty() && !isLeaf() ) 
        {
            leftChild.content.setCode( content.getCode() + "0" );
            leftChild.generateCodes();
            rightChild.content.setCode( content.getCode() + "1" );
            rightChild.generateCodes();
        }

    }

    public void showCodes()
    {
        if ( !isEmpty() )
        {
            if ( isLeaf() )
            {
                System.out.println( content.toString() );
            }
            else
            {
                leftChild.showCodes();
                rightChild.showCodes();
            }
        }
    }
    public String decode (String encoded){
        HuffmanTree current = this;
        int i=0;
        while (!current.isEmpty() && !current.isLeaf()){
            if (encoded.charAt(i) == 0){
                current = leftChild;
            }else {
                current = rightChild;
            }
            i++;
        }
        return  current.getContent().toString();
    }
    public String rekDecode (String encoded, int position, HuffmanTree word){
        // if (issleaf,.........
        if (position > encoded.length()) {
            if (encoded.charAt(position) == 0) {
                //leftChild.rekDecode()
                word.setContent(leftChild.content);
            } else {
                word.setContent(rightChild.content);
            }
            return rekDecode(encoded, position+1, word);
        }
        return word.content.toString();
    }

}
