
menores' :: Int -> Int -> [Int] -> [Int]
menores' _ _ [] = []
menores' 0 _ _ = []
menores' size y (x:xs)
 | position <= y = x : menores' (size-1) y (xs ++ [x])
 | otherwise =  menores' size y (xs ++ [x])
 where position = count x (x:xs)


menores :: Int -> [Int] -> [Int]
menores y xs = if(y > length xs) then menores' v v xs else menores' y y xs 
 where v = length xs
 
count _ [] = error "element doesn't belong to the list"
count y xs
 | y == minimum = 1
 | otherwise = 1 + count y (deletee minimum xs)
 where minimum = minimo xs

minimo :: [Int] -> Int
minimo = foldl1 (\acc x -> if x < acc then x else acc)

deletee _ [] = []
deletee y (x:xs)
 | x == y = xs
 | otherwise = x: deletee y xs

main = do
    a <- readLn :: IO Int 
    b <- readLn :: IO [Int] 
    print $ menores a b