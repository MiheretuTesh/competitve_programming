def bubleSort(arr):
    size = len(arr)

    for i in range(size):
        swapped = False
        for j in range(0, size-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if swapped == False:
            break
         
    return arr

if __name__ == "__main__": 
    arr = [100, 80, 20, 10, 40] 
  
    result = bubleSort(arr) 
    print("Array is Sorted", result) 