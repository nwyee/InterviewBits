/*
https://www.interviewbit.com/problems/add-one-to-number/
Given a non-negative number represented as an array of digits,
add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.
Example:
If the vector has [1, 2, 3]
the returned vector should be [1, 2, 4]
as 123 + 1 = 124.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
*/
public class Solution {
    public int[] plusOne(int[] A) {
        int index_zero = 0;
        for(int n : A){
            if( n != 0) {
                break;
            }
            index_zero ++;
        }
        int[] b = new int[A.length - index_zero];
        for (int i = index_zero,j = 0; i < A.length; i++,j++) 
            b[j] = A[i]; 
        for(int i = b.length - 1; i >= 0 ; i-- ) {
            if(b[i] < 9) {
                b[i] ++;
                return b;
            }
            b[i] = 0;
        }
        int[] res = new int[b.length+1];
        res[0] = 1;
        return res;
    }
}