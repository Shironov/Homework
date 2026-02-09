package Exam.work_Deq;

public class CircleDeq {
    private Object[] buf;
    private int size;
    private int offset;
    private int reserved;
     public CircleDeq(){
         reserved = 10;
         buf = new Object[reserved];
         size = 0;
         offset = 0;


     }

      public int position(int i){
         return (offset + i)% reserved;
      }

      public Object get(int i){

         if(i<0 || i>= size){
             throw new RuntimeException("Ошибка");
         }
         return buf[position(i)];
      }

      public void pushBack(int value){
            ensureCapacity();
            int pos = position(size);
            buf[pos] = value;
            size++;
      }
      private void ensureCapacity(){
         if(size == reserved){
             int newCapacity = reserved*2;
             Object[] newBuf = new Object[newCapacity];
             for(int i = 0; i < size; i++){
                 newBuf[i] = buf[position(i)];
             }
             buf = newBuf;
             offset = 0;
         }

      }
    public void pushFront(Object value) {
        ensureCapacity();
        offset = (offset - 1 + reserved) % reserved;
        buf[offset] = value;
        size++;
    }
    public Object popBack() {
        // Проверка на пустоту дека
        if (size == 0) {
            throw new RuntimeException("Дек пуст. Невозможно удалить элемент.");
        }
        int index = position(size - 1);
        Object value = buf[index];
        buf[index] = null;
        return value;
    }
    public Object popFront() {
        if (size == 0) {
            throw new RuntimeException("Дек пуст. Невозможно удалить элемент.");
        }
        Object value = buf[offset];


        buf[offset] = null;

        offset = (offset + 1) % reserved;

        size--;

        return value;
    }

    public int size(){
         return size;
    }

    public boolean isEmpty(){
        return size == 0;

    }
    @Override
    public String toString(){
         if(size == 0) return "[]";
         StringBuilder sb = new StringBuilder("[");
         for(int i = 0; i < size; i++){
             sb.append(buf[position(i)]);
             if(i < size - 1) sb.append(", ");

         }
         sb.append("]");
         return sb.toString();
    }

    public static void main(){
        CircleDeq dq = new CircleDeq();
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());

        System.out.println(dq.toString());
        for(int i = 0; i < 10; i++){
            dq.pushBack(i);
        }
        System.out.println(dq.toString());

        dq.popBack();
        System.out.println(dq.toString());
    }






}
