def flip(b, i, x):
    global ctr
    ctr = 0
    j = x // 10
    k = x % 10
    s = b[j][k]
    if i % 2 == 0:
        s2 = 'x'
        s1 = 'o'
    else:
        s2 = 'o'
        s1 = 'x'
    for l in range(j-1, 0, -1):
        s3 = b[l][k]
        if s3[1] == '-':
            break
        if s3[1] == s2:
            continue
        if s3[1] == s1:
            if l == j-1:
                break
            for o in range(l+1, j):
                c = ""
                if i % 2 == 0:
                    c = b[o][k].replace('x', 'o')
                    ctr += 1
                else:
                    c = b[o][k].replace('o', 'x')
                    ctr += 1
                b[o][k] = c
            break
    for l in range(j+1, 9):
        s3 = b[l][k]
        if s3[1] == '-':
            break
        if s3[1] == s2:
            continue
        if s3[1] == s1:
            if l == j+1:
                break
            for o in range(l-1, j, -1):
                c = ""
                if i % 2 == 0:
                    c = b[o][k].replace('x', 'o')
                    ctr += 1
                else:
                    c = b[o][k].replace('o', 'x')
                    ctr += 1
                b[o][k] = c
            break
    for l in range(k-1, 0, -1):
        s3 = b[j][l]
        if s3[1] == '-':
            break
        if s3[1] == s2:
            continue
        if s3[1] == s1:
            if l == k-1:
                break
            for o in range(l+1, k):
                c = ""
                if i % 2 == 0:
                    c = b[j][o].replace('x', 'o')
                    ctr += 1
                else:
                    c = b[j][o].replace('o', 'x')
                    ctr += 1
                b[j][o] = c
            break
    for l in range(k+1, 9):
        s3 = b[j][l]
        if s3[1] == '-':
            break
        if s3[1] == s2:
            continue
        if s3[1] == s1:
            if l == k+1:
                break
            for o in range(l-1, k, -1):
                c = ""
                if i % 2 == 0:
                    c = b[j][o].replace('x', 'o')
                    ctr += 1
                else:
                    c = b[j][o].replace('o', 'x')
                    ctr += 1
                b[j][o] = c
            break
    for a, l in zip(range(j-1, 0, -1), range(k-1, 0, -1)):
        s3 = b[a][l]
        if s3[1] == '-':
            break
        if s3[1] == s2:
            continue
        if s3[1] == s1:
            if l == k+1:
                break
            for o in range(l-1, k, -1):
                c = ""
                if i % 2 == 0:
                    c = b[j][o].replace('x', 'o')
                    ctr += 1
                else:
                    c = b[j][o].replace('o', 'x')
                    ctr += 1
                b[j][o] = c
            break
    for a in range(j+1, 9):
        for l in range(k-1, 0, -1):
            s3 = b[a][l]
            if s3[1] == '-':
                break
            if s3[1] == s2:
                continue
            if s3[1] == s1:
                if l == k+1:
                    break
                for o in range(l-1, k, -1):
                    c = ""
                    if i % 2 == 0:
                        c = b[j][o].replace('x', 'o')
                        ctr += 1
                    else:
                        c = b[j][o].replace('o', 'x')
                        ctr += 1
                    b[j][o] = c
                break

    for a in range(j-1, 0, -1):
        for l in range(k+1, 9):
            s3 = b[a][l]
            if s3[1] == '-':
                break
            if s3[1] == s2:
                continue
            if s3[1] == s1:
                if l == k+1:
                    break
                for o in range(l-1, k, -1):
                    c = ""
                    if i % 2 == 0:
                        c = b[j][o].replace('x', 'o')
                        ctr += 1
                    else:
                        c = b[j][o].replace('o', 'x')
                        ctr += 1
                    b[j][o] = c
                break
    for a in range(j+1, 9):
        for l in range(k+1, 9):
            s3 = b[a][l]
            if s3[1] == '-':
                break
            if s3[1] == s2:
                continue
            if s3[1] == s1:
                if l == k+1:
                    break
                for o in range(l-1, k, -1):
                    c = ""
                    if i % 2 == 0:
                        c = b[j][o].replace('x', 'o')
                        ctr += 1
                    else:
                        c = b[j][o].replace('o', 'x')
                        ctr += 1
                    b[j][o] = c
                break

    return b