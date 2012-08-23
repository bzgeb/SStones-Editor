(ns skipping-stones-editor.client.main
  (:require [fetch.remotes :as remotes])
  (:require-macros [fetch.macros :as fm]))

(remotes/remote-callback "note" [65] nil)
