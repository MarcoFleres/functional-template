(ns exercise2)

(defn only-greater-than-five
  "Filter a list returning only results greater than five."
  [x]
  (filter (fn [x] (> x 5) ) x ))




