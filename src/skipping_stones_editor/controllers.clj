(ns skipping-stones-editor.controllers
  (:use overtone.osc))

(def PORT 9001)

(def client (osc-client "localhost" PORT))

(defn send-message []
  (osc-send client "/test/voice" (int 0)))

(defn editor [layout]
  (layout [:p "Welcome to skpping-stones-editor"]))