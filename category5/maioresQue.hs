{-
maioresQue _ [] = []
maioresQue y (x:xs)
 | x > y = x : maioresQue y xs
 | otherwise = maioresQue y xs
-}

maioresQue y xs = filter (>y) xs



main = do
    a <- readLn :: IO Int 
    b <- readLn :: IO [Int] 
    print $ maioresQue a b 