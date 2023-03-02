class ArraySum
{

    int sum = 0;
    int i = 0;
    void soma_recursiva( int[] nums)
    {
        if (nums.length == 0)
            System.out.println("Lista vazia");
        else
        {

            if (i+1 <= nums.length){

                sum += nums[i];
                i++;
                soma_recursiva(nums);
            }else {System.out.println(sum);}
        }

    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8};
        ArraySum obj = new ArraySum();
        obj.soma_recursiva(nums);
    }
}
