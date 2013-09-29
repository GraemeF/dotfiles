{:user {:dependencies [[spyscope "0.1.3"]
                       [redl "0.1.0"]]
        :injections [(require 'spyscope.core)
                     (require '[redl complete core])]
        :plugins [[lein-pprint "1.1.1"]
                  [lein-ancient "0.4.4"]
                  [lein-autoexpect "1.0"]
                  [lein-midje "3.1.0"]] }}
