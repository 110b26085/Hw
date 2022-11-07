interface Math
{
   public void show();
   public void add(int a,int b);  // 計算a+b
   public void sub(int a,int b);  // 計算a-b
   public void mul(int a,int b);  // 計算a*b
   public void div(int a,int b);  // 計算a/b
}
class Compute implements Math
{
   public int ans;
   public void add(int a,int b)
   {
      ans=a+b;
   }
   public void sub(int a,int b)
   {
      ans=a-b;
   }
   public void mul(int a,int b)
   {
      ans=a*b;
   }
   public void div(int a,int b)
   {
      ans=a/b;
   }
   public void show()
   {
      System.out.println("ans="+ans);
   }
}
public class 1105
{
   public static void main(String args[])
   {
      Compute cmp=new Compute();
      cmp.mul(3,5);  // 計算3*5
      cmp.show();    // 此行會回應"ans=15"字串
   }
}
