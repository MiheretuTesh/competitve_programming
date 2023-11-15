def twoSum(arr, target):
    indexes = []
    size = len(arr)

    for i in range(0, size):
        for j in range(i+1, size):
            if(arr[i]+arr[j] == target):
                indexes.append(i)
                indexes.append(j)
                break
            else:
                continue
    return indexes


nums = [2,7,11,15]
target = 9

a = twoSum(nums, target)

print(a)