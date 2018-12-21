                  /*  File: inflection.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class inflection extends Template {

     static {templateClass = new inflection() ; }

     public void setup() {
          filePrefix = "inflection" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5 ;   
          ysize = 1.0 ;   
          xmin = -1.0 ;
          xmax = 1.0 ;
          ymin = -1.0 ;
          ymax = 1.0;
          topmargin = 0.0 ;
          bottommargin = 0.0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {

          fEnv("lineWidth", 1.0) ;
          fCurve("y=sin(3*x)", 0, xmin, xmax, OPEN) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ;
          double r = 0.04 ;
          double x = 0 ; double y = 0 ;
          fDisk(x,y, r,r*aspect, FILLED) ;
          fTeXlabel(x,y+0.2, "cr", "${\\scriptstyle(c, f(c))}$") ;
          fTeXlabel(-0.5, -0.5, "cb", "${\\scriptstyle\\rm concave}$") ;
          fTeXlabel(-0.5, -0.7, "cb", "${\\scriptstyle\\rm up}$") ;
          fTeXlabel( 0.525,  0.6, "ct", "${\\scriptstyle\\rm concave}$") ;
          fTeXlabel( 0.525,  0.4, "ct", "${\\scriptstyle\\rm down}$") ;

     }
}
