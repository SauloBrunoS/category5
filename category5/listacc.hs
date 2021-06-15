
count z [] = 0
count z (x:xs)
 | z >= 0 = x + (count (z-1) xs)
 | otherwise = 0

listacc' index xs
 | index < length xs = count index xs : listacc' (index+1) xs
 | otherwise = []

listacc [] = []
listacc ys = listacc' 0 ys

main = do 
    a <- readLn :: IO [Int] 
    print $ listacc a 