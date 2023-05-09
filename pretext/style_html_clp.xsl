<?xml version='1.0'?>

<!DOCTYPE xsl:stylesheet [
    <!ENTITY % entities SYSTEM "entities.ent">
    %entities;
]>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:import href="./core/pretext-html.xsl"/>
  <!-- <xsl:import pretext-href="pretext-html.xsl"/> -->
  
<!-- Replace exercise types with stages -->
<xsl:template match="conceptual">
  Exercises &#8212; Stage 1
</xsl:template>
<xsl:template match="procedural">
Exercises &#8212; Stage 2
</xsl:template>
<xsl:template match="application">
Exercises &#8212; Stage 3
</xsl:template>

<!-- a nice asterisk next to questions from old exams / tests -->
<xsl:template match="fromexam">(&#x2733;)</xsl:template>

<!-- styling of required question set -->
<xsl:template match="exercise" mode="body-css-class">
  <!-- CLP-styling of representative problem set questions -->
  <xsl:choose>
    <xsl:when test="@purpose='RQS'">
      <xsl:text>exercise-like boxed</xsl:text>
    </xsl:when>
    <xsl:otherwise>
      <xsl:text>exercise-like</xsl:text>
    </xsl:otherwise>
  </xsl:choose>
</xsl:template>


<!-- a nice section symbol -->
<xsl:template match="sect"> <xsl:text>&#167;</xsl:text></xsl:template>


<!-- red text -->
<xsl:template match="textred">
    <font color="red">
            <xsl:apply-templates />
    </font>
</xsl:template>
<!-- blue text -->
<xsl:template match="textblue">
    <font color="blue">
            <xsl:apply-templates />
    </font>
</xsl:template>

<xsl:template match="shortrule">
  <span class="process-math">\(\Rule{2cm}{1pt}{0pt}\)</span>
</xsl:template>

</xsl:stylesheet>
