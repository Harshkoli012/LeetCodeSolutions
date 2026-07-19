class Solution {
    public int addDigits(int num) {
        while(num >=10)
        {
        int Sum = 0;
        while(num >0){
            Sum += num % 10;
            num = num /10;
        }
        num  = Sum;
        }
        return num;


        
    }
}