import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){  }
  public void reset(){
    current = start;
  }
  public int length(){
    return end - start;
  }
  public boolean hasNext(){
    if(current < end) return true;
  }

  //@throws NoSuchElementException
  public int next(){
    return current++;
  }

}
