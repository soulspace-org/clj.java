;;;;
;;;;   Copyright (c) Ludger Solbach. All rights reserved.
;;;;
;;;;   The use and distribution terms for this software are covered by the
;;;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;;;   which can be found in the file license.txt at the root of this distribution.
;;;;   By using this software in any fashion, you are agreeing to be bound by
;;;;   the terms of this license.
;;;;
;;;;   You must not remove this notice, or any other, from this software.
;;;;

(ns org.soulspace.clj.java.beans-test
  (:require [clojure.test :refer :all]
            [org.soulspace.clj.java.beans :as beans]))

(defn method-name [^java.lang.reflect.Method method]
  (.getName method))

(deftest get-method-test
  (is (= (beans/getter-method javax.swing.JFrame "menuBar") nil)))

(deftest set-method-test
  (is (= (method-name (beans/setter-method javax.swing.JFrame "menuBar")) "setMenuBar")))
