public class max_min {
    public static void main(String[] args) {
        int [] arr = {3,1,4,1,5,9,2};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i< arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            else if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("this is the minimum in this array = " +min);
        System.out.println("this is the maximum in this array = " +max);

    }
}
