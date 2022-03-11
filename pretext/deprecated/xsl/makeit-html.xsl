<?xml version='1.0'?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:import href="mathbook-html.xsl" />

<!-- to get solutions and answers at back only, and statements in text but not with answers/solutions  -->
<xsl:param name="exercise.divisional.hint" select="'no'" />
<xsl:param name="exercise.divisional.answer" select="'no'" />
<xsl:param name="exercise.divisional.solution" select="'no'" />



<xsl:template match="conceptual">
<p><alert>Exercises &#8212; Stage 1</alert></p>
</xsl:template>
<xsl:template match="procedural">
<p><alert>Exercises &#8212; Stage 2</alert></p>
</xsl:template>
<xsl:template match="application">
<p><alert>Exercises &#8212; Stage 3</alert></p>
</xsl:template>
<!-- a nice asterisk next to questions from old exams / tests -->
<xsl:template match="fromexam">(&#x2733;)</xsl:template>
<!--  extra css styling for highlighting the representative question set-->
<xsl:param name="html.css.extra"  select="'RQS.css'" />


<xsl:param name="chunk.level" select="3" />
<xsl:template match="sect"> <xsl:text>&#167;</xsl:text></xsl:template>


<!-- A fix from RobBeezer for references in titles. -->
<xsl:template match="title/xref">
     <xsl:apply-templates select="." mode="xref-text">
	 <xsl:with-param name="target" select="id(@ref)" />
     <xsl:with-param name="text-style" select="'global'"/>
     </xsl:apply-templates>
</xsl:template>

<!-- the  -->
<xsl:param name="debug.chapter.start" select="0" />


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

<xsl:template match="shortrule">\(\Rule{2cm}{1pt}{0pt}\)</xsl:template>

</xsl:stylesheet>
