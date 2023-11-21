def bubleSort(arr):
    size = len(arr)

    for i in range(0, size):
        for j in range(i+1, size):
            if arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
            else: 
                pass
    return arr

if __name__ == "__main__": 
    arr = [100, 80, 20, 10, 40] 
  
    result = bubleSort(arr) 
    print("Array is Sorted", result) 