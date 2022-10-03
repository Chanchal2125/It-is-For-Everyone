
public class Quicksort {
    public static int partition(int a[],int l,int h){
        int pivot=a[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }
        int temp=a[i+1];
        a[i+1]=a[h];
        a[h]=temp;

        return i+1;
    }

    public static void qsort(int a[],int l ,int h){
        if(l<h){
            int p=partition(a,l,h);
            qsort(a,l,p-1);
            qsort(a,p+1,h);
        }
    }
    public static void main(String[] args) {
int a[]={4,2,4,6,3,1,9};
qsort(a,0,6);
for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
}

    }
}
