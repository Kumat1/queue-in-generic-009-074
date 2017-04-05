/**
 * Created by USER on 05/04/2017.
 */
/**
 * Created by USER on 04/04/2017.
 */
public class queue {
    int queue[]=new int[5];

    public static void main(String[] args) {
        queue t=new queue();
        t.push(7);
        t.push(2);
        t.push(4);
        t.cetak();
        t.pop();
        t.cetak();
        t.clear();
    }

    public void push(int value){
        if(queue[0]==0){
            queue[0]=value;
            System.out.println("Input "+queue[0]);
        }
        else if(queue[1]==0)
        {
            queue[1]=value;
            System.out.println("Input "+queue[1]);
        }
        else if(queue[2]==0)
        {
            queue[2]=value;
            System.out.println("Input "+queue[2]);
        }
        else
        {
            isFull();
        }

    }

    public void isFull(){
        System.out.println("Queue Penuh");
    }

    public void pop(){
        if(queue[0]!=0){
            System.out.println("POP "+queue[0]);
            queue[0]=0;
        }
        else if(queue[1]!=0){
            System.out.println("POP "+queue[1]);
            queue[1]=0;
        }else if(queue[2]!=0){
            System.out.println("POP "+queue[2]);
            queue[2]=0;
        }else{
            isEmpty();
        }
    }

    public void isEmpty(){
        System.out.println("Queue is empty");
    }

    public void clear(){
        queue[0]=0;
        queue[1]=0;
        queue[2]=0;
        System.out.println("Queue is clear");
    }

    public void cetak()
    {
        System.out.println("---------------------------");
        for(int i=0;i<queue.length;i++){
            if(queue[i]!=0){
                System.out.println(queue[i]+" ");
            }
        }
        System.out.println("--------------------------------");
    }
}