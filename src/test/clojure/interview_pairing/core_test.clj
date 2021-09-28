(ns interview-pairing.core-test
  (:require [clojure.test :refer [deftest is testing]]
           [interview-pairing.core :as sut]))

(deftest aFunction-tests
  (testing "should take a value and return a value"
    (is (= 1 (sut/aFunction 1)))))

