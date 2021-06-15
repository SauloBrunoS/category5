
quadperf' n i 
 | i * i == n = True 
 | i * i < n = quadperf' n (i+1)
 | otherwise = False

quadperf x = quadperf' x 0

main = do
    a <- readLn :: IO Int 
    print $ quadperf a