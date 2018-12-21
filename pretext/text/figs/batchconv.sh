for i in *.pdf ; do pdf2svg "$i" "${i%.pdf}.svg" ; done
