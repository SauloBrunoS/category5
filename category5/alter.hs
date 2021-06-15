alter n
 | n /= 0 = alter(n-1) ++ [n, -n] 
 | otherwise = []

main = do
    a <- readLn :: IO Int 
    print $ alter a 