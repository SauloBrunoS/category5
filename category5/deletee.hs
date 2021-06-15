deletee _ [] = []
deletee y (x:xs)
 | x == y = xs
 | otherwise = x: deletee y xs
 
main :: IO ()
main = do
    a <- readLn :: IO Int 
    b <- readLn :: IO [Int] 
    print $ deletee a b 