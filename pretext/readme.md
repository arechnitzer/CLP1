### New html build instructions March 2022 

* First install the new python pretext package
```
pip3 install pretextbook
```

* Then build using the pretext-cli (much easier)
```
pretext build html -x style_html_clp.xsl
```
  * this can take some time - its a big document.
  * the `-x blah.xsl` tells pretext to use that extra chunk of xsl that we require to do a little bit of non-standard pretext styling.
  * To (re)build the tikz images run with `-d` flag
  ```
  pretext build html -x style_html_clp.xsl -d
  ```


#### Some notes
* At this point I don't have CLP-styling for the latex build working. Is TODO.
* Images have been moved into the `assets` subdirectory which the pretext-cli expects them
* To get google-analytics working you have to comment out the associated line in the publication.ptx file
