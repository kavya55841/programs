class maximum
{
    public static void main(String args[])
    {
        int arr[]={1,5,6,18,50,9};
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}