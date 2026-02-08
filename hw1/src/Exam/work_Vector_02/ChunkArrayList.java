package Exam.work_Vector_02;

import java.util.ArrayList;
import java.util.List;

public class ChunkArrayList {
    private static final int CHUNK_SIZE_BYTES = 512;
    private static final int CHUNK_SIZE = CHUNK_SIZE_BYTES/Integer.BYTES;
    private List<int[]> chunks;
    private int size;

    public ChunkArrayList() {
        this.chunks = new ArrayList<>();
        this.size = 0;

    }

    public int get(int i){
        if(i < 0 || i > size ){
            throw new RuntimeException("Ошибка");
        }
          int chunkIndex = i / CHUNK_SIZE;
          int off = i % CHUNK_SIZE;

          return chunks.get(chunkIndex)[off];
    }
    public void pushBack(int x){

        int indexChunk = size / CHUNK_SIZE;
        int off = size % CHUNK_SIZE;

        if(indexChunk >= chunks.size()){
            chunks.add(new int[CHUNK_SIZE]);
        }

        chunks.get(indexChunk)[off] = x;
        size++;
    }
}
