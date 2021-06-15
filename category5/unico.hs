unico x xs = length (filter (==x) xs) == 1
{-
unico y [] = False
unico y (x:xs)
   | x == y = not $ unico y xs 
   | otherwise = unico y xs 
-}
main = do
    a <- readLn :: IO Int 
    b <- readLn :: IO [Int]
    print $ unico a b
