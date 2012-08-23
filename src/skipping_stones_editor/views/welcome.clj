(ns skipping-stones-editor.views.welcome
  (:require [skipping-stones-editor.views.common :as common]
            [skipping-stones-editor.controllers :as controllers]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to skipping-stones-editor"]))

(defpage "/editor" []
  (controllers/editor common/layout))
