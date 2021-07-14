n = int(input())

count = 0

for t in range(0, n) :
  d = []
  s = input()

  for idx, val in enumerate(s) :
    if (val in d) :
      break;
    else :
      if (idx == len(s) - 1 and not val in d) :
        count += 1
      elif (idx < len(s) - 1 and s[idx] != s[idx + 1]) :
        d.append(val)

print(count)
