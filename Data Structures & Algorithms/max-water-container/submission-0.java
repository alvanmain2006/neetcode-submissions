class Solution {
    public int maxArea(int[] heights) {
        int largest = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int hl = heights[l];
            int hr = heights[r];
            int curHeight = Math.min(hl, hr);
            int curArea = curHeight * (r - l);
            largest = Math.max(largest, curArea);
            if (hl <= hr) {
                l++;
            } else if (hl > hr) {
                r--;
            }
        }
        return largest;
    }
}
