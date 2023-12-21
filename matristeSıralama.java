
public class Main {

    public static void main(String[] args) {
        int a[][] = {{100, 20, 300}, {44, 55, 666}, {7, 80, 9}, {10, 11, 12}};
        int enKüçük=a[0][0];
        for(int i=0; i<4; i++){
            for (int j=0; j<3; j++){
                for(int k=0; k<4; k++){
                    for (int n=0; n<3; n++){
                        if(a[k][n]<=a[i][j]){
                            enKüçük=a[k][n];
                            a[k][n]=a[i][j];
                            a[i][j]=enKüçük;
                        }
                    }
                }
            }
        }
        for (int c=0; c<4; c++){
            for (int d=0; d<3; d++){
                System.out.print(a[c][d] + " ");
            }
            System.out.println();
        }

    }
}
