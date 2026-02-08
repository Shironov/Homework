O(g(n)) = O(g(n)) * c
O(c * g(n)) = O(g(n))


O(f(n)) * O(g(n))  = O(f(n) * g(n))


O(f(n)) + O(f(n))  = O(f(n))


O(f(n)) + o(f(n))  = O(f(n))



n^2 + 2*n^3 + n*log2(n) = O(n^3)

n >= 1: n^2 <= n^3
n >= 1: n*log2(n) <= n^3

n^2 + 2*n^3 + n*log2(n) <= 1* n^3 + 2* n^3 + 1*n^3 = 4n^3

O(f(n)) - O(f(n))  != 0
f(n) - g(n) -> O(1) f(n) = n; g(n) = n-1
f(n) - g(n) ->  f(n) < g(n)