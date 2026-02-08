package Exam.work_Deq;

public class circleDeq {
    private Object[] buf;
    private int size;
    private int offset;
     public circleDeq(){
         buf = new Object[10];
         size = 0;
         offset = 0;
     }

      public int position(int i){
         return (offset + i)% buf.length;
      }

      public Object get(int i){
         if(i<0 || i>= size){
             throw new RuntimeException("Ошибка");
         }
         return buf[position(i)];
      }

      public void pushBack(int value){

            int pos = position(size);
            buf[pos] = value;
            size++;
      }




}
