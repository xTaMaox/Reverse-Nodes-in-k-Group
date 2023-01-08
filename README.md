# Reverse-Nodes-in-k-Group

Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:

![reverse_ex1](https://user-images.githubusercontent.com/88260025/211199370-8eefa310-b8f8-44bd-87cf-9344309cbe44.jpg)

Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]


Example 2:

![reverse_ex2](https://user-images.githubusercontent.com/88260025/211199380-bd4c3421-b36d-4d2c-879b-2f71d751e6d9.jpg)

Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 5000
0 <= Node.val <= 1000

solve the problem in O(1) extra memory space
