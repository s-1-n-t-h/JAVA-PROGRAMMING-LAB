class BinarySearch
{
    void Binarysearch(int[] a,int s,int e,int k)
    {
        int mid;
        while(s<=e)
        {
            mid = (s+e)/2;

            if(a[mid]<k)
            {
                s=mid+1;
            }
            else if(a[mid]>k)
            {
                e = mid-1;
            }
            else
            {
                System.out.println("\nElement is Found at Index: "+mid);
                return;
            }

        }
        if(s>e)
        {
            System.out.println("\nElement is not Found");
        }

    }

    public static void main(String[] args)
    {
        int[] a = {12,15,17,23,33,37,49,57,63};
        int k = 37;
        int e = a.length-1;
        
        BinarySearch B = new BinarySearch();
        B.Binarysearch(a,0,e,k);
    }
}