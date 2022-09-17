package org.redquark.grind.problems.easy;

public class FirstBadVersion {

    /**
     * Code works but logically this solution is incorrect
     * Time complexity - O(log(n))
     * Space complexity - O(1)
     */
    public int firstBadVersionSolutionOne(int n) {
        // Special case
        if (n <= 0) {
            throw new IllegalArgumentException("A version should be greater than 0.");
        }
        // Left and right pointers
        int left = 1;
        int right = n;
        // Loop until the two pointers meet
        while (left <= right) {
            // Calculate the middle version
            int middle = left + (right - left) / 2;
            // IF the middle version is the bad version, then we check
            // if the previous version to middle is also a bad one, if
            // so, we are sure that the first bad version lies in the
            // first half of the array
            if (isBadVersion(middle) && isBadVersion(middle - 1)) {
                right = middle - 1;
            }
            // If the middle version is not the bad one, we are sure that
            // the first bad version lies the second half of the array
            else if (!isBadVersion(middle)) {
                left = middle + 1;
            }
            // This code works but this is incorrect due to the logic of
            // above two if-elseif conditions
            else {
                return middle;
            }
        }
        return n;
    }

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(1)
     */
    public int firstBadVersionSolutionTwo(int n) {
        // Special case
        if (n <= 0) {
            throw new IllegalArgumentException("A version should be greater than 0.");
        }
        // Left and right pointers
        int left = 1;
        int right = n;
        // Loop until the two pointers meet
        while (left <= right) {
            // Calculate the middle version
            int middle = left + (right - left) / 2;
            // Check if the middle index is the bad version. If this is
            // the case then the first bad version can only be found in
            // the first half of the array
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
            if (left == right) {
                return middle;
            }
        }
        return n;
    }

    private boolean isBadVersion(int version) {
        return version == 4;
    }
}
