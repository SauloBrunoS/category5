rotRig 0 xs = xs
rotRig n xs = rotRig(n - 1) (last xs : init xs) 

main = do
    a <- readLn :: IO Int 
    b <- getLine
    print $ rotRig a b
