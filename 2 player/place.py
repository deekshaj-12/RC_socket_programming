def place(i, x, a):
    int(x)
    s1 = x // 10
    s2 = x % 10
    s = a[s1][s2]
    try:
        if i % 2 == 0:
            s = s.replace('-', 'o')
        else:
            s = s.replace('-', 'x')
        a[s1][s2] = s
        return a
    except:
        print(type(i))