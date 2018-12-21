                  /*  File:  triangle45.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class triangle45 extends Template {

     static {templateClass = new triangle45() ; }

     public void setup() {
          filePrefix = "triangle45" ;    // used as the prefix for any ps or lbl files written
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;      // in inches
          ysize = 1.2 ;   // in inches. 
          xmin = -20 ;
          xmax = 280 ;
          ymin = -20 ;
          ymax = 100 ;
          topmargin =-.5 ;   // in inches
          bottommargin =-.5 ;   // in inches
          leftmargin = 0.25 ;   // in inches
          rightmargin = -2 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
     


     double angle = Math.PI/4 ;
     double hyp   = 100 ;

     fEnv("lineWidth", 1) ;
     fLine(0, 0, hyp*Math.cos(angle), 0) ;
     fLine(0, 0, hyp*Math.cos(angle), hyp*Math.sin(angle)) ;
     fLine(hyp*Math.cos(angle), 0,  hyp*Math.cos(angle), hyp*Math.sin(angle)) ;
     fEnv("lineWidth", 0.5) ;
     fLine(hyp*Math.cos(angle), 8, hyp*Math.cos(angle)-8, 8) ;
     fLine(hyp*Math.cos(angle)-8, 0,   hyp*Math.cos(angle)-8, 8) ;

     fTeXlabel(27, 10, "cc", "$45^\\circ$") ;
     fEllipticalArc( 0, 0, 12, 12, 0, angle*180/Math.PI, OPEN) ;

     fTeXlabel(hyp*Math.cos(angle+.3)/2, hyp*Math.sin(angle+.3)/2, "cc", "$\\sqrt{2}$") ;
     fTeXlabel(hyp*Math.cos(angle)+3, hyp*Math.sin(angle)/2, "lc", "$1$") ;
     fTeXlabel(hyp*Math.cos(angle)/2, -3, "tc", "$1$") ;
          
     }
}
