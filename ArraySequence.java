import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex = 0;
  private int[] data;
  private int[] dataseq;

  public ArraySequence(int[] other){
    this.data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public void reset() {
    currentIndex = 0;
  }
  public int length() {
    return data.length;
  }
  public int next() {
    return data[currentIndex++];
  }
  public boolean hasNext() {
    return currentIndex < data.length;
  }

  public ArraySequence(IntegerSequence otherseq){
    this.data = new int[otherseq.length()];
    int j = 0;
    while(otherseq.hasNext()) {
      this.data[j] = otherseq.next();      
      j += 1;
    }

  }

}
