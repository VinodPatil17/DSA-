class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i < n1 && j < n2){
            
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums2[j] < nums1[i]){
                j++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] newArr = new int[arr.size()];
        int k = 0;
        for(int val : arr){
            newArr[k++] = val;
        }

        return newArr;
    }
}