package multithreading;

class MyDataa
{
    int value;
    boolean flag=true;
    
    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}
        
        value=v;
        flag=false;
        notify();
    }
    
    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}
        
        
        x=value;
        flag=true;
        notify();
        
        return x;            
    }
}

class Producer extends Thread
{
    MyDataa data;
    
    public Producer(MyDataa d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyDataa data;
    
    public Consumer(MyDataa d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class InterProcess 
{
    public static void main(String[] args) 
    {
        MyDataa data=new MyDataa();
        
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);
        
        p.start();
        c.start();
        
    }
}