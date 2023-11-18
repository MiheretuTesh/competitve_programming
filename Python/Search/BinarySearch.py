def binarySearch(arr, target):
    low = 0
    high = len(arr) - 1

    mid = low + (high - low) // 2

    for i in range(0, len(arr)):
        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            high = mid
            mid = low + (high - low) // 2
        else:
            low = mid
            mid = low + (high - low) // 2
    return -1

if __name__ == "__main__": 
    arr = [2, 3, 4, 10, 40] 
    x = 1
  
    result = binarySearch(arr, x) 
    if(result == -1): 
        print("Element is not present in array") 
    else: 
        print("Element is present at index", result) 