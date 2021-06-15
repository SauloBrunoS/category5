line 0 = []
line n = sum[1..n-1] + 1 : map (+n) (line (n-1))

main = do
    a <- readLn :: IO Int 
    print $ line a  