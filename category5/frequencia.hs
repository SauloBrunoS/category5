--frequencia x u = length $ filter (==x) u

--frequencia x u =  length $ [z | z <- u, z == x]

frequencia y [] = 0
frequencia y (x:xs)
  | x == y = 1 + frequencia y xs
  | otherwise = 0 + frequencia y xs 


--frequencia x = foldl (\acc z -> if z == x then acc+1 else acc) 0  
  
main = do
    a <- readLn :: IO Int      
    b <- readLn :: IO [Int]  
    print $ frequencia a b