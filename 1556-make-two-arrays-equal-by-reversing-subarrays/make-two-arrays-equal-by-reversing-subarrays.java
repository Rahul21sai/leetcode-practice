class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      Arrays.sort(target);
      Arrays.sort(arr);
      boolean value = Arrays.equals(target,arr);
      if(value == true){
        return true;
      }
      return false;
    }
}