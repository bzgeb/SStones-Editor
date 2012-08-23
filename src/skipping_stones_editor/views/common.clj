(ns skipping-stones-editor.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-js include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "skipping-stones-editor"]
               (include-css "/css/reset.css")
               (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")]
              [:body
               [:div#wrapper
                content]
               (include-js "/cljs/bootstrap.js")]))
