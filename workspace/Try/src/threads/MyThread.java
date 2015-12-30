package threads;

class WorkingContext implements Runnable
{
                MyStack1 stack = new MyStack1(10);
               
                public void run()
                {
                                String name = Thread.currentThread().getName();
                               
                                if(name.equalsIgnoreCase("sun"))                         
                                {
                                                long data=1;
                                                for(int i=0;i<10;i++)
                                                {
                                                                stack.push(new Long(data));
                                                                data++;
                                                                try{Thread.sleep(1500);}catch(Exception e){}
                                                }
                                }
                                else if(name.equalsIgnoreCase("earth"))                               
                                {
                                                for(int j=0;j<10;j++)
                                                {
                                                                stack.pop();
                                                                try{Thread.sleep(1000);}catch(Exception e){}
                                                }
                                }
                }
}
 
 
public class MyThread
{
                public static void main(String[] args)
                {
                               
                                System.out.println("In Main....");
                                WorkingContext c = new WorkingContext();
               
                                Thread t1 = new Thread(c,"sun");           
                                Thread t2 = new Thread(c,"earth");          
                               
                                t1.start();
                                t2.start();
                               
                                try{
                                                t1.join();
                                                t2.join();
                                               
                                }catch(Exception e){}
                               
                                System.out.println("Bye Main....");
                               
                }                             
}