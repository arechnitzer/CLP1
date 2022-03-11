# CLP-1 PreTexT source files
* The text and problem sets were originally written as separate texts in LaTeX.
* In order to provide a good online text we translated the LaTeX into [PreTexT](https://pretextbook.org/) XML.
* The resulting PreTexT sources compile into a combined text with exercises.

## Figure files
* In order to compile the PreTexT into both HTML and PDF, the figures have been saved as both SVG and PDF.
* See the LaTeX sources for information on how they were produced.

## Minimal PreTexT installation
* You do not need to install all of [PreTexT](https://pretextbook.org/) to build CLP-1.
* We include here the minimum necessary PreTexT XSL files needed.
* Minor changes have been made to allow for CLP styling - those changes are tagged in the source.
* In time those styling options will be absorbed into the standard PreTexT code base.

## Compilation instructions
* The PreTexT source files can be compiled into HTML and PDF.
* The user does not need to install PreTexT, but only the `xsltproc` command.
* `xsltproc` is a standard package in most Linux and macOS distributions. For Windows we recommend taking a look at the [PreTexT installation instructions](https://pretextbook.org/tools.html).

### Compiling to LaTeX and PDF
* Move into the directory containing `clp_1_dc.xml`
* Run the following command:
`xsltproc --xinclude ./xsl/makeit-latex.xsl clp_1_dc.xml`
* This command takes a few minutes to run.
* This will produce a (large) LaTeX file `clp_1_dc.tex`
* Compile this with `pdflatex clp_1_dc.tex`
* This will also take a few minutes to run and you'll have to run it a few times to get all the internal references right.

### Compiling to HTML
* Move into the directory called `site` which contains a single file `RQS.css`
* We will build the website in this directory, which should then be uploaded to its final hosting location.
* Run the following command
`xsltproc --xinclude ../xsl/makeit-html.xsl ../clp_1_dc.xml`
* This will take a few minutes to run and produce a large number of HTML files.
* We still need to build all the TikZ figures. To do so we run the PreTexT helper script `mbx`
* In the site directory, first create an `images` subdirectory.
* Then run `../script/mbx -v -c latex-image -f svg -d ./images ../clp_1_dc.xml`  - this needs `pdf2svg` installed
* This will take some time since there are many images to compile.
* Finally - copy the non-TikZ figures into place by copying the `text/figs/*.svg` directory to `site/text/figs` and copying the `problems/figs/*.svg` directory to `site/problems/figs`and copying `misc/by-nc-sa.svg`  to `text/figs/by-nc-sa.svg`.
* Now the HTML is ready and you can upload the entire `site` directory to the webserver of your choice.
