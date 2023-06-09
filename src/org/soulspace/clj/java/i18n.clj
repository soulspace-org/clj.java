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

(ns org.soulspace.clj.java.i18n
  "Functions for internationalization via Java resource bundles."
  (:import [java.util ResourceBundle] ))

;;;;
;;;; Functions for internationalization via Java resource bundles
;;;;

(defn bundle
  "Returns the resource bundle of the name (default name is resources)."
  ([]
   (ResourceBundle/getBundle "resources"))
  ([bundle-name]
   (ResourceBundle/getBundle bundle-name)))

(defn bundle-lookup
  "Looks up the key in the resource bundle and returns the resulting string."
  ([^ResourceBundle bundle str-key]
   (.getString bundle str-key)))

(comment
; TODO
  (defn switch-locale [])
  )
