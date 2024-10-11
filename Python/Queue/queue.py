from collections import deque

class Queue:
    def __init__(self):
        self.data = deque()

    def enqueue(self, node):
        self.data.append(node)
    
    def dequeue(self):
        self.data.popleft()
    

if __name__ == "__main__":
    queue = Queue()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    print(queue.data)
    queue.dequeue()
    queue.dequeue()
    print(queue.data)
    queue.dequeue()
    print(queue.data)
    queue.dequeue()
    print(queue.data)