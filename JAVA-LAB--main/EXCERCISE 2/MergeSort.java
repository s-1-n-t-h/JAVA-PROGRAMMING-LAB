class MergeSort
{
    void merge(int arr[],int l,int mid,int r)
    {
        int i,j,k;
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] a = new int[n1];int[] b = new int[n2];

        for(i=0;i<n1;i++)
        {
            a[i]=arr[l+i];
        }
        for(i=0;i<n2;i++)
        {
            b[i]=arr[mid+1+i];
        }
        i=0;j=0;k=l;
        while(i<n1 && j<n2)
        {
            if(a[i] < b[j])
            {
                arr[k]=a[i];
                k++;i++;
            }
            else
            {
                arr[k]=b[j];
                k++;j++;
            }
        }
        while(i<n1)
        {
            arr[k]=a[i];
            k++;i++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            k++;j++;
        }

    }

    void Mergesort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            Mergesort(arr,l,mid);
            Mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void main(String[] args)
    {
        int[] a = {12,21,34,5,67,80,8,43,32,11};
        int l=0;int r=a.length-1;
        MergeSort m = new MergeSort();

        System.out.print("The Un Sorted Array is: ");
        for(int p=0;p<a.length;p++){
            System.out.print(a[p]+" ");
        }

        System.out.println("");

        m.Mergesort(a, l, r);

        System.out.print("The Sorted Array is: ");
        for(int p=0;p<a.length;p++){
            System.out.print(a[p]+" ");
        }
    }

    

}