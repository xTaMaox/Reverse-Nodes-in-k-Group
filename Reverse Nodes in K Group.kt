/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        
        var cur = head
        var prev: ListNode? = null
        var newHead = head
        while(cur != null)
        {
            var i = 0
            var end = cur
            while( end != null && i < k)
            {
                end = end?.next
                i++
            }
            if(i == k)
            {
                if(cur == head)
                newHead = reverse(cur,end)
                else
                prev?.next = reverse(cur,end)
            }
            prev = cur
            cur = end
        }
    return newHead
    }

    fun reverse(cur1: ListNode?, end: ListNode?): ListNode?{

        var prev = end
        var cur = cur1
        while(cur != end)
        {
            val temp = cur?.next
            cur?.next = prev
            prev = cur
            cur = temp
        }

        return prev
    }
}