class Stack:
    def __init__(self):
        self.data = []
    def push(self, node):
        self.data.append(node)
    def pop(self):
        self.data.pop()
    def is_empty(self):
        return self.data == []
    def peek(self):
        return self.data[-1]
    def size(self):
        return len(self.data)
    def __str__(self):
        return str(self.data)
    
if __name__ == "__main__":
    s = Stack()
    s.push(1)
    print(s)
    s.push(2)
    print(s)    
    s.push(3)
    s.push(4)
    s.push(5)
    s.push(6)
    s.push(7)
    s.push(8)
    s.push(9)
    s.push(10)
    s.push(11)
    s.push(12)
    s.push(13)
    s.push(14)
    s.push(29)
    print(s)
    s.pop()
    print(s)
    s.pop()
    print(s)
    s.pop()
    print(s)
    s.pop()
    print(s)
    s.pop()
    print(s)
