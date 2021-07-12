d = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

n = input()

count = 0

i = 0

while (i < len(n)) :
  count += 1

  if (n[i] == "d") :
    if (n[slice(i, i + 3)] in d) :
      i += 2
    elif (n[slice(i, i + 2)] in d) :
      i += 1
  else :
    if (n[slice(i, i + 2)] in d) :
      i += 1

  i += 1

print(count)
