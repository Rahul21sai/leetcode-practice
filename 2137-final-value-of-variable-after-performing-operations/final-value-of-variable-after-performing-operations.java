class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int sum = 0;

        for(int i = 0; i < n;i++){
            if(operations[i].equals("++X")|| operations[i].equals("X++")){
                sum = sum +1;
            }
            else{
                sum = sum -1;
            }
        }
        return sum;
    }
}