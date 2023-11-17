def search(arr, N, target):
    size = len(arr)

    for i in range(0, size):
        if arr[i] == target:
            return i
    return -1
    
if __name__ == "__main__": 
    arr = [2, 3, 4, 10, 40] 
    x = 10
    N = len(arr) 
  
    result = search(arr, N, x) 
    if(result == -1): 
        print("Element is not present in array") 
    else: 
        print("Element is present at index", result) 