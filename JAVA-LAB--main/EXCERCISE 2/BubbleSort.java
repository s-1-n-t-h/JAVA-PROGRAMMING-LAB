class BubbleSort
{
    void bubbleSort(int[] a)
    {
        
        int n = a.length;
        int t = 0;
   
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                {
                    t = a[i];a[i]=a[j];a[j]=t;
                }
            }
        }

    }
    public static void main(String[] args)
    {
        int a[] = {11,21,45,67,34,43,10,3,2,14};

        BubbleSort b = new BubbleSort();

        System.out.print("The Un Sorted Array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("");
        b.bubbleSort(a);

        System.out.print("The Sorted Array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}