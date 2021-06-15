sequencia n m
 | m > m+n-1 = []
 | otherwise = m : sequencia (n-1) (m+1)

main = do
    a <- readLn :: IO Int 
    b <- readLn :: IO Int 
    print $ sequencia a b 