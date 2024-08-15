### New html build instructions August 2024 

* First install the new python pretext package
```
pip3 install pretext
```
If you have an existing pretext installation then you can upgrade it with 
```
pip3 install --upgrade pretext
```

* Then build using the pretext-cli (much easier)
```
pretext build html -g
```
  * this can take some time - its a big document.
  * the `-g` tells pretext to also build all the extra (latex encoded) images.

* Then copy `external/RQS.css` to `site/external/RQS.css`

#### Some notes
* At this point I don't have CLP-styling for the latex build working. 
* Images have been moved into the `assets` subdirectory which the pretext-cli expects them
* To get google-analytics working you have to comment out the associated line in the publication.ptx file
