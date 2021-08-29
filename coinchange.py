def ways(S, m, n, dict={}):
    key = str(m) + "," + str(n)
    if n == 0:
        return 1
    elif n < 0:
        return 0
    elif m <= 0 and n >= 1:
        return 0
    elif key in dict.keys():
        return dict[key]
    dict[key] = ways(S, m-1, n, dict ) + ways(S, m, n-S[m-1], dict)
    return dict[key]

arr = [8, 3, 1, 2]
m = len(arr)
print(ways(arr, m, 3))


