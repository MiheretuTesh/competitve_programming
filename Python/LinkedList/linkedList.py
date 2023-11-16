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
        
        current = self.head

        if self.head.data == value:
            self.head = self.head.next
            return
        while current.next is not None and current.next.data is not None:
            current = current.next
        
        if current.next is not None:
            current.next = current.next.next

    def inserBeforeElement(self, element, value):
        if self.head is None:
            return

        new_node = Node(value)

        current = self.head
        while current.next is not None and current.next.data != element:
            current = current.next
        
        if current.next is not None:
            new_node.next = current.next
            current.next = new_node
    
    # def insertAfterElement(self, element, value):


        
    
    

    