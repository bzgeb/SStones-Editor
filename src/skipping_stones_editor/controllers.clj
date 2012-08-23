(ns skipping-stones-editor.controllers)
(use 'overtone.osc)
(use 'noir.fetch.remotes)

(def PORT 9001)

(def client (osc-client "localhost" PORT))

(defn send-note 
  ([]
  (osc-send client "/test/voice" (int 0)))
  ([note]
  (osc-send client "/text/voice" (int note))))

(defremote note [n]
  (send-note n))

(defn editor [layout]
  (send-note)
  (layout [:p "Welcome to skipping-stones-editor"]))
