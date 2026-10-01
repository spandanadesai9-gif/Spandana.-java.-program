Simple Java Pattern Programs:

*1. Star Triangle:*
public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
Output:
*
* *
* * *
* * * *
* * * * *
*2. Number Pattern:*
for(int i=1; i<=5; i++){
  for(int j=1; j<=i; j++){
    System.out.print(j+" ");
  }
  System.out.println();
}