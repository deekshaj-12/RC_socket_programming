def place(i, x, a):
    s1 = x // 10
    s2 = x % 10
    s = a[s1][s2]
    if i % 2 == 0:
        s = s.replace('-', 'o')
    else:
        s = s.replace('-', 'x')
    a[s1][s2] = s
    return a