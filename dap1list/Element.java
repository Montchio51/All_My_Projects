package dap1list;

public class Element
{
    private Object content;
    private Element pred, succ;

    public Element( Object c )
    {
        content = c;
        pred = succ = null;
    }

    public Object getContent()
    {
        return content;
    }

    public void setContent( Object c )
    {
        content = c;
    }

    public boolean hasSucc()
    {
        return succ != null;
    }

    public Element getSucc()
    {
        return succ;
    }

    public void disconnectSucc()
    {
        if ( hasSucc() ) 
        {
            succ.pred = null;
            succ = null;
        }
    }

    public void connectAsSucc( Element e)
    {
        disconnectSucc();
        if ( e != null ) 
        {
            e.disconnectPred();
            e.pred = this;
        }
        succ = e;
    }

    public boolean hasPred()
    {
        return pred != null;
    }

    public Element getPred()
    {
        return pred;
    }

    public void disconnectPred()
    {
        if ( hasPred() )
        {
            pred.succ = null;
            pred = null;

        }
    }

    public void connectAsPred( Element e )
    {
        disconnectPred();
        if ( e != null )
        {
            e.disconnectSucc();
            e.succ = this;
        }
        pred = e;
    }
}
