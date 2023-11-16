class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Solution:
    def __init__(self):
        self.head = None
    
    def insertAtEnd(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head

            while current.next is not None:
                current = current.next
            
            current.next = new_node
    
    def deleteNode(self, value):
        if self.head is None:
            return
        

        if self.head.data == value:
            self.head = self.head.next
            return
        
        current = self.head
        while current.next is not None and current.next.data != value:
            current = current.next
        
        if current.next is not None:
            current.next = current.next.next
            

    def insertBeforeElement(self, element, value):
        if self.head is None:
            return

        new_node = Node(value)

        current = self.head
        while current.next is not None and current.next.data != element:
            current = current.next
        
        if current.next is not None:
            new_node.next = current.next
            current.next = new_node
    
    def insertAfterElement(self, element, value):
        if self.head is None:
            return
        
        new_node = Node(value)

        current = self.head
        while current is not None and current.data != element:
            current = current.next
        
        if current is None:
            new_node.next = current.next
            current.next = new_node

    def printList(self):
        current = self.head
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()


        
    
    
# Implementation test
if __name__ == "__main__":
    sol = Solution()

    # Insert elements at the end
    sol.insertAtEnd(1)
    sol.insertAtEnd(2)
    sol.insertAtEnd(3)

    # Print the original list
    print("Original List:")
    sol.printList()

    # Delete a node
    sol.deleteNode(2)

    # Print the list after deletion
    print("List after deletion:")
    sol.printList()

    # Insert before an element
    sol.insertBeforeElement(3, 4)

    # Print the list after insertion
    print("List after insertion before element:")
    sol.printList()

    # Insert after an element
    sol.insertAfterElement(1, 5)

    # Print the final modified list
    print("Final Modified List:")
    sol.printList()