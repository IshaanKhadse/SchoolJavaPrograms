public class Mean{
  float findMean (int a, int b){
    return ((a+b)/2.0f));
  }
  float findMean(int a[]){
  float s = 0.0f;
  for (int i=0;i<a.length; i++){
  s += a[i]; 
  }
  float m = 0.0f;
  m= s/a.length;
  return m;
  }
public static void main(String args[]){
System.out.println(findMean(6,7));
System.out.println(findMean({3,4,5,6,7,8,9,10,11,12}));
}
