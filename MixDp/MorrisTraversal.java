
import java.util.ArrayList;

public class MorrisTraversal {

    public static class node{
        int data;
        node l;
        node r;
        public node(int d){
            data=d;
        }
    }
    public static void f(node root){
        if(root!=null){
            System.out.println(root.data);
            f(root.l);
            f(root.r);
        }
    }
    public static void main(String[] args) {
        
        node a= new node(1); 
      node b= new node(2); 
      node c= new node(3); 
      node d= new node(4); 
      node e= new node(5); 
      node f= new node(6); 
      node k= new node(7); 
 
      a.l=b;
      a.r=c;
      c.l=d;
      c.r=e;
      e.l=f;
      e.r=k;

      node p=a;
      node g=null;
      ArrayList<Integer>ans=new ArrayList<>();
      while(p!=null){
        if(p.l!=null){
            g=p.l;
            while(g.r!=null&&g.r!=p){
                g=g.r;
            }
            if(g.r==p){
               // ans.add(g.data);
                ans.add(p.data);
                g.r=null;
                p=p.r;
            }
            else{
                g.r=p;
                p=p.l;
            }
        }
        else{
         ans.add(p.data);
        p=p.r;

        }


      }
      System.out.println(ans);
      
    }
}
