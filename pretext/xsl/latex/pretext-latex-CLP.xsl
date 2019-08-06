<?xml version='1.0'?>

<!--********************************************************************
Copyright 2018 Andrew Rechnitzer

This file is part of PreTeXt.

PreTeXt is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 2 or version 3 of the
License (at your option).

PreTeXt is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with PreTeXt.  If not, see <http://www.gnu.org/licenses/>.
*********************************************************************-->

<!-- Conveniences for classes of similar elements -->
<!DOCTYPE xsl:stylesheet [
    <!ENTITY % entities SYSTEM "../entities.ent">
    %entities;
]>

<!-- Identify as a stylesheet -->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:xml="http://www.w3.org/XML/1998/namespace"
>

<!-- Override specific tenplates of the standard conversion -->
<xsl:import href="../mathbook-latex.xsl" />

<!-- Intend output for rendering by pdflatex -->
<xsl:output method="text" />

<!-- ################### -->
<!-- Define colours -->
<!-- ################### -->
<xsl:template name="style-default-colours">
  <xsl:text>\definecolor{colour1}{HTML}{006070}</xsl:text>
  <xsl:text>\definecolor{colour2}{HTML}{007090}</xsl:text>
  <xsl:text>\definecolor{colour3}{HTML}{FF8822}</xsl:text>
  <xsl:text>\definecolor{colour4}{HTML}{FF55aa}</xsl:text>
</xsl:template>

<!-- ################### -->
<!-- Titles of Divisions -->
<!-- ################### -->

<xsl:template name="titlesec-chapter-style">
    <!-- should be a global style definitions -->
    <!-- MOVE ME!!!!!!!!!!!!!!!!!!!!!! -->
    <xsl:text>\usepackage[geometry]{ifsym} %to get nice triangles&#xa;</xsl:text>
    <!-- MOVE ME!!!!!!!!!!!!!!!!!!!!!! -->
    <xsl:text>\tikzset{weird fill/.style={append after command={
    \pgfextra
        \draw[sharp corners, fill=#1]%
    (\tikzlastnode.west)%
    [rounded corners=0pt] |- (\tikzlastnode.north)%
    [rounded corners=5pt] -| (\tikzlastnode.east)%
    [rounded corners=0pt] |- (\tikzlastnode.south)%
    [rounded corners=5pt] -| (\tikzlastnode.west)%
    ;
    \endpgfextra}}}&#xa;</xsl:text>
    <!-- NB: #1 used in chapter/numberless because we     -->
    <!-- can't control the Table of Contents anyway other -->
    <!-- than redefining the actual name used elsewhere   -->
    <xsl:text>\titleformat{name=\chapter}
    {\normalfont}
    {}
    {8pt}
    {
    \begin{center}\begin{tikzpicture}
    \draw node[
    inner sep=10pt, inner ysep=20pt, very thick,
    weird fill=colour1, text=white, minimum width={0.9\textwidth},
    text width={0.9\textwidth}, align=center
    ](b) {\scshape\huge\filcenter\titleptx};
    \node[right=10pt, rounded corners=0pt, draw, fill=white] at (b.north west)
    {\divisionnameptx\space\thechapter};
    \end{tikzpicture}\end{center}
    }
    [\hfill{\Large\authorsptx}]
    %%
    \titleformat{name=\chapter,numberless}
    {\normalfont}
    {}
    {8pt}
    {
    \begin{center}\begin{tikzpicture}
    \draw node[
    inner sep=10pt, inner ysep=20pt, very thick,
    weird fill=colour1, text=white, minimum width={0.9\textwidth},
    text width={0.9\textwidth}, align=center
    ](b) {\scshape\huge\filcenter#1};
    \end{tikzpicture}\end{center}
    }&#xa;</xsl:text>
</xsl:template>

<xsl:template name="titlesec-section-style">
    <xsl:text>\titleformat{\section}
    {\titlerule
    \vspace{.8ex}%
    \Large\bfseries}
    {\llap{\thesection}}{0.0em}{{\small\FilledSmallTriangleUp}\space\titleptx}
    [\hfill{\large\authorsptx}]&#xa;</xsl:text>
    <xsl:text>\titleformat{name=\section,numberless}
    {\titlerule
    \vspace{.8ex}%
    \Large\bfseries}
    {}{0.0em}{{\small\FilledSmallTriangleUp}\space#1}&#xa;</xsl:text>
</xsl:template>

<xsl:template name="titlesec-subsection-style">
    <xsl:text>\titleformat{\subsection}{\large\bfseries}
    {\llap{\thesubsection}}{0.0em}{ {\small\FilledSmallTriangleRight\!\!\!\FilledSmallTriangleRight}\space\titleptx}
    [\hfill{\normalsize\authorsptx}]&#xa;</xsl:text>
</xsl:template>

<xsl:template name="titlesec-subsubsection-style">
    <xsl:text>\titleformat{\subsubsection}{\bfseries}{\llap{\thesubsubsection}}{0.0em}{{\small\FilledSmallTriangleRight\!\!\!\FilledSmallTriangleRight\!\!\!\FilledSmallTriangleRight}\space\titleptx}
    [\hfill{\normalsize\authorsptx}]&#xa;</xsl:text>
</xsl:template>


<!-- ################### -->
<!-- Environments for proofs, theorems etc -->
<!-- ################### -->

<!-- "proof" -->
<!-- Changes: Bold upright font, abnormally large spacing after title, keep the tombstone. -->
<!-- bwminimalstyle is part of the mathbook-latex.xsl file, uncertain                -->
<!-- if we are committed to making it universally available to be used               -->
<!-- like this by style writers.                                                     -->
<xsl:template match="proof" mode="tcb-style">
    <xsl:text>boxrule=0.25pt, colframe=gray, enhanced jigsaw, breakable, colback=white, colbacktitle=white, coltitle=black, fonttitle=\normalfont\bfseries, attach title to upper, after title={\qquad}, after upper={\begin{flushright}\(\square\)\end{flushright}}&#xa;</xsl:text>
</xsl:template>


<!-- THEOREM-LIKE: "theorem", "corollary", "lemma",    -->
<!--               "algorithm", "proposition",         -->
<!--               "claim", "fact", "identity"         -->
<!-- AXIOM-LIKE: "axiom", "conjecture", "principle",   -->
<!--             "heuristic", "hypothesis",            -->
<!--             "assumption                           -->
<xsl:template match="&THEOREM-LIKE;|&AXIOM-LIKE;" mode="tcb-style">
  <xsl:text>
    enlarge top initially by=3ex,
    enlarge bottom finally by=3ex,
    colframe=colour2, colback=colour2!5, colbacktitle=colour3!15, coltitle=black,
    sharp corners=northwest, arc=5pt,
    breakable, enhanced,
    attach boxed title to top left={xshift=4mm, yshift*=-\tcboxedtitleheight/2},
    boxed title style={sharp corners, colframe=colour3},
    fontupper=\normalfont
  </xsl:text>
</xsl:template>

<xsl:template match="lemma" mode="tcb-style">
    <xsl:text>
      theoremstyle,
      colback=white, colbacktitle=white,
      boxed title style={rounded corners, colframe=black}
    </xsl:text>
</xsl:template>

<xsl:template match="claim" mode="tcb-style">
    <xsl:text>
      theoremstyle,
      colback=white, colbacktitle=white, colframe=colour3,
      boxed title style={rounded corners, colframe=colour3}
    </xsl:text>
</xsl:template>

<!-- DEFINITION-LIKE: "definition"   -->
<xsl:template match="&DEFINITION-LIKE;" mode="tcb-style">
  breakable, colframe=colour2, colback=colour2!5, colbacktitle=colour2!70, coltitle=black, enhanced, attach boxed title to top left={xshift=7mm, yshift*=-2ex},sharp corners=northwest, arc=10pt,
</xsl:template>

<!-- REMARK-LIKE: "remark", "convention", "note",   -->
<!--            "observation", "warning", "insight" -->
<!-- COMPUTATION-LIKE: "computation", "technology"  -->
 <!--White title text, but title backgounds vary    -->
 <!--by category, and remarks have sharp corners    -->
 <xsl:template match="&REMARK-LIKE;" mode="tcb-style">
     <xsl:text>
       colframe=white, colback=white, coltitle=black, frame hidden,
       oversize, breakable, enhanced,
       detach title, before upper={\tcbtitle\quad},
       fonttitle=\bfseries,
     </xsl:text>
 </xsl:template>

 <xsl:template match="warning" mode="tcb-style">
     <xsl:text>
       theoremstyle,
       colback=white, colbacktitle=white, colframe=colour3,
       boxed title style={rounded corners, colframe=colour3}
     </xsl:text>
 </xsl:template>

 <xsl:template match="&COMPUTATION-LIKE;" mode="tcb-style">
     <xsl:text>colbacktitle=colour2</xsl:text>
 </xsl:template>

<!-- EXAMPLE-LIKE: "example", "question", "problem" -->
<!-- Default tcolorbox, but with tricolor titles    -->
<!-- Each just slightly different                   -->

<xsl:template match="example" mode="tcb-style">
    <xsl:text>
      enlarge top initially by=2ex,
      enlarge bottom finally by=2ex,
      colback=white, colframe=black, colbacktitle=white, coltitle=black,
      oversize, enhanced, breakable,
      attach boxed title to top left={xshift=7mm, yshift*=-\tcboxedtitleheight/2},
      frame hidden,
      overlay unbroken={
        \draw[thick, stealth-, rounded corners] ([yshift=-3ex]interior.north west)--(interior.north west)--(title);
        \draw[thick, -stealth, rounded corners] (title)--(interior.north east)--([yshift=-3ex]interior.north east);
        \draw[thick, stealth-stealth, rounded corners] ([yshift=3ex]interior.south west)--(interior.south west)--(interior.south east)--([yshift=3ex]interior.south east);
      },
      overlay first={
        \draw[thick, stealth-, rounded corners] ([yshift=-3ex]interior.north west)--(interior.north west)--(title);
        \draw[thick, -stealth, rounded corners] (title)--(interior.north east)--([yshift=-3ex]interior.north east);
        },
      overlay middle={},
      extras last={boxsep=1ex,},
      overlay last ={
        \tikzset{overlay=false};
        \node[draw, thick, rectangle, rounded corners] (repeatTitle) at ([xshift=-12ex]interior.south east) {Example~\thetcbcounter};
        \draw[thick, stealth-, rounded corners] ([yshift=3ex]interior.south west)--(interior.south west)--(repeatTitle);
        \draw[thick,-stealth,rounded corners] (repeatTitle)--(interior.south east)--([yshift=3ex]interior.south east);
        \node[below=1ex] (padDown) at (repeatTitle) {};
        },
    </xsl:text>
</xsl:template>

<xsl:template match="question" mode="tcb-style">
    <xsl:text>
      enlarge top initially by=2ex,
      enlarge bottom finally by=2ex,
      colback=white, colframe=blue, colbacktitle=white, coltitle=black,
      oversize, enhanced, breakable,
      attach boxed title to top left={xshift=7mm, yshift*=-\tcboxedtitleheight/2},
      frame hidden,
      overlay unbroken={
        \draw[blue, thick, open square-, rounded corners] ([yshift=-3ex]interior.north west)--(interior.north west)--(title);
        \draw[blue,thick, -open square, rounded corners] (title)--(interior.north east)--([yshift=-3ex]interior.north east);
        \draw[blue,thick, open square-open square, rounded corners] ([yshift=3ex]interior.south west)--(interior.south west)--(interior.south east)--([yshift=3ex]interior.south east);
      },
      overlay first={
        \draw[blue,thick, open square-, rounded corners] ([yshift=-3ex]interior.north west)--(interior.north west)--(title);
        \draw[blue,thick, -open square, rounded corners] (title)--(interior.north east)--([yshift=-3ex]interior.north east);
          },
      overlay middle={},
      extras last={boxsep=1ex,},
      overlay last={
        \tikzset{overlay=false};
        \node[draw, blue, thick, rectangle, rounded corners, text=black] (repeatTitle) at ([xshift=-12ex]interior.south east) {Question~\thetcbcounter};
        \draw[blue, thick, open square-, rounded corners] ([yshift=3ex]interior.south west)--(interior.south west)--(repeatTitle);
        \draw[blue, thick, -open square,rounded corners] (repeatTitle)--(interior.south east)--([yshift=3ex]interior.south east);
        \node[below=1ex] (padDown) at (repeatTitle) {};
      },
    </xsl:text>
</xsl:template>

<xsl:template match="problem" mode="tcb-style">
    <xsl:text>
      enlarge top initially by=2ex,
      enlarge bottom finally by=2ex,
      colback=white, colframe=red, colbacktitle=white, coltitle=black,
      oversize, enhanced, breakable,
      attach boxed title to top left={xshift=7mm, yshift*=-\tcboxedtitleheight/2},
      frame hidden,
      overlay unbroken={
        \draw[red, thick, right to-, rounded corners] ([yshift=-3ex]interior.north west)--(interior.north west)--(title);
        \draw[red,thick, -left to, rounded corners] (title)--(interior.north east)--([yshift=-3ex]interior.north east);
        \draw[red,thick, left to-right to, rounded corners] ([yshift=3ex]interior.south west)--(interior.south west)--(interior.south east)--([yshift=3ex]interior.south east);
      },
      overlay first={
        \draw[red,thick, right to-, rounded corners] ([yshift=-3ex]interior.north west)--(interior.north west)--(title);
        \draw[red,thick, -left to, rounded corners] (title)--(interior.north east)--([yshift=-3ex]interior.north east);
      },
      overlay middle={},
      extras last={boxsep=1ex,},
      overlay last={
        \tikzset{overlay=false};
        \node[draw, thick, red, rectangle, rounded corners, text=black] (repeatTitle) at ([xshift=-12ex]interior.south east) {Problem~\thetcbcounter};
        \draw[red, thick, left to-, rounded corners] ([yshift=3ex]interior.south west)--(interior.south west)--(repeatTitle);
        \draw[red, thick, -right to,rounded corners] (repeatTitle)--(interior.south east)--([yshift=3ex]interior.south east);
        \node[below=1ex] (padDown) at (repeatTitle) {};
      },
    </xsl:text>
</xsl:template>

<!-- ASIDE-LIKE: "aside", "historical", "biographical" -->
<xsl:template match="&ASIDE-LIKE;" mode="tcb-style">
    <xsl:text>
      colframe=gray, colback=white, colbacktitle=white, coltitle=black,
      boxrule=0.5pt, sharp corners=northwest, arc=5pt, enhanced, breakable,
      attach boxed title to top left={xshift=4mm, yshift*=-\tcboxedtitleheight/2},
      boxed title style={rounded corners, colframe=gray, boxrule=0.5pt}
    </xsl:text>
</xsl:template>

<!-- LaTeX uses four page styles, and we use the "titleps" package  -->
<!-- to redefine the "empty", "plain", and "headings" styles.  The  -->
<!-- actual management of which style is used, and when, is         -->
<!-- controlled by LaTeX with help from PreTeXt.  You can use the   -->
<!-- "titleps-global-style" template to change which style is the   -->
<!-- global default, optionally in concert with redefinitions of    -->
<!-- the style.                                                     -->
<!--                                                                -->
<!-- We do limited demonstration with the head, and use the         -->
<!-- left-side of the foot to display information on which          -->
<!-- pagestyle is in effect, so you could experiment here before    -->
<!-- making your own style.                                         -->
<!--                                                                -->
<!-- Note: the templates will be placed after a "\renewpagestyle{}" -->
<!-- command, so should be an optional argument, followed by a      -->
<!-- mandatory argument with commands like \setfoot, \sethead,      -->
<!-- \headrule, and \footrule.                                      -->
<!-- See titleps.pdf in the "titlesec" package for more             -->
<xsl:template match="book|article|letter|memo" mode="titleps-empty">
    <xsl:text>{\setfoot[foot/even/empty][\thepage][]{}{\thepage}{}}</xsl:text>
</xsl:template>

<xsl:template match="book|article|letter|memo" mode="titleps-plain">
    <xsl:text>{\setfoot[foot/even/plain][\thepage][]{}{\thepage}{}}</xsl:text>
</xsl:template>

<!-- This is cribbed from Section 8 of "titleps.pdf" (2016-03-15) -->
<xsl:template match="book|article" mode="titleps-headings">
    <xsl:text>[]{
    \headrule
    \sethead[\textsc{\thesection~\sectiontitle}][]
    [\textsc{\chaptertitle}]
    {\textsc{\chaptertitle}}
    {}
    {\textsc{\thesection~\sectiontitle}}
    \footrule
    \setfoot[foot/even/headings/book][][]{}{\thepage}{}}
  </xsl:text>
</xsl:template>



<!-- Footnote styling - needs to go in preamble somewhere -->
<!-- Also needs better naming and placement in code -->
<xsl:template name="style-footnote-preamble">
<xsl:text>
%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Styling of footnotes
\newcommand{\neghphantom}[1]{\begingroup\sbox0{#1}\hspace*{-\wd0}\endgroup}
\makeatletter
\renewcommand\@makefntext[1]{\leftskip=2em\hskip-2em \@thefnmark
\neghphantom{\@thefnmark}\hskip2em #1}
\makeatother
%
\usepackage{tikz}\usetikzlibrary{arrows}
\renewcommand{\footnoterule}{%
\vspace*{0ex}%
\centering\begin{tikzpicture}%
\draw[*-open diamond,] (0.1\textwidth,0) -- (0.5\textwidth,0);%
\draw[open diamond-*,] (0.5\textwidth,0) -- (0.9\textwidth,0);%
\end{tikzpicture}\vspace*{2ex}%
}%
%%%%%%%%%%%%%%%%%%%%%%%%%%%
</xsl:text>
</xsl:template>


<!-- Figure styling -->
<xsl:template name="style-figure-preamble">
  <xsl:text>\newtcolorbox{figbox}[1][]{colframe=colour4, colback=white, arc=5pt, sharp corners=northwest, halign=center, oversize, #1}&#xa;</xsl:text>
</xsl:template>
<xsl:template name="style-figure-head">
  <xsl:text>\begin{figbox}\begin{figure}&#xa;</xsl:text>
</xsl:template>
<xsl:template name="style-figure-before-caption">
  <xsl:text>\centering&#xa;</xsl:text>
</xsl:template>
<xsl:template name="style-figure-foot">
<xsl:text>\end{figure}\end{figbox}&#xa;</xsl:text>
</xsl:template>


<!-- SBS styling -->
<xsl:template name="style-sbs-preamble">
  <xsl:text>\newtcolorbox{sbsgbox}[1][]{boxrule=0.5pt, colframe=gray, colback=white, arc=5pt, sharp corners=northwest, halign=center, oversize, enhanced, breakable, #1}&#xa;</xsl:text>
  <xsl:text>\newtcolorbox{sbsbox}[1][]{boxrule=0.5pt, colframe=gray, colback=white, arc=5pt, sharp corners=northwest, halign=center, #1}&#xa;</xsl:text>
</xsl:template>
<xsl:template name="style-sbs-head">
  <xsl:text>\begin{sbsbox}\centering&#xa;</xsl:text>
</xsl:template>
<xsl:template name="style-sbs-foot">
<xsl:text>\end{sbsbox}&#xa;</xsl:text>
</xsl:template>
<xsl:template name="style-sbsgroup-head">
<xsl:text>\begin{sbsgbox}\centering&#xa;</xsl:text>
</xsl:template>
<xsl:template name="style-sbsgroup-foot">
  <xsl:text>\end{sbsgbox}&#xa;</xsl:text>
</xsl:template>

<!--  styling of marked exercises -->
<!--  this is for CLP recommended-problem-set -->
<!--  could be applied to "do these for homework" sets too -->
<xsl:template name="style-exercise-preamble">
  <xsl:text>\tcbset{markedexstyle/.style={runintitlestyle, exercisespacingstyle, left=5.5ex, enhanced, breakable, colframe=colour1!75, colback=colour1!3, coltitle=black, leftrule=1ex, valign=top, grow to left by=2ex, grow to right by=2ex, rounded corners=all, arc=1mm,}}&#xa;</xsl:text>
  <xsl:text>\tcbset{markedexegstyle/.style={runintitlestyle, exercisespacingstyle, left=5.5ex, left skip=\egindent, enhanced, breakable, colframe=colour1!75, colback=colour1!3, coltitle=black, leftrule=1ex, valign=top, grow to left by=-1.5ex, grow to right by=3ex, rounded corners=all, arc=1mm,}}&#xa;</xsl:text>
</xsl:template>


</xsl:stylesheet>
