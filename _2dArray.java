public class _2dArray {
        public static void main(String[] args) {
         int a[][]={{1,2,3},{4,5,6}};
         int b[][]={{7,8,9},{5,6,7}};
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
               a[i][j]=a[i][j];
             }
         } 
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                 a[i][j]=a[i][j];
             }
         }
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
              a[i][j]=a[i][j]+b[i][j];
             }
         }
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }
        }
     }

