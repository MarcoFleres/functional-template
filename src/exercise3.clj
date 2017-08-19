(ns exercise3)

(defn fibonacci
  "Fibonacci Series."
  [x]
  (if (<= x 0)
    0
    (if (= x 1)
      1
      (+ (fibonacci (- x 1))  (fibonacci(- x 2))))))




