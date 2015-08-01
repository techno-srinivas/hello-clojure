(defn remove-duplicates [coll] (
                                map (fn [[x freq]] x)
                                    (filter (fn [[x freq]] (>= freq 1))
                                            (frequencies coll))))

(= [1 2 3 4 5] (remove-duplicates [1 1 1 2 3 3 4 4 5]))
