line 0 = []
line n = sum[1..n-1] + 1 : map (+n) (line (n-1))

triangle :: (Eq t, Num t, Enum t) => t -> [[t]]
triangle' 0 = []
triangle' n =  line n : triangle'(n-1)

triangle n = reverse (triangle' n)

main = do
    a <- readLn :: IO Int 
    print $ triangle a  