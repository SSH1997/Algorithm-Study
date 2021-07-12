def han(n) :
  tmp = str(n)
  gap = None;

  for i in range(0, len(tmp) - 1) :
    if (gap == None) :
      gap = int(tmp[i]) - int(tmp[i + 1])
    else : 
      if (int(tmp[i]) - int(tmp[i + 1]) == gap) : 
        continue
      else :
        return False

  return True;

n = int(input())

count = 0

for i in range(n, 0, -1) :
  if (han(i)) :
    count += 1

print(count)