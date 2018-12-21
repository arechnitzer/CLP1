                  /*  File:  sinInv.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class sinInv extends Template {

     static {templateClass = new sinInv() ; }

     public void setup() {
          filePrefix = "sinInv" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
          xmin = -2.2*Math.PI ;
          xmax = 2.2*Math.PI ;
          ymin = -1.5 ;
          ymax = 1.5 ;
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
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fTeXlabel(xmax+0.2, 0, "cl", "$x=Y$") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$") ;
          fTeXlabel(xmax+0.2, Math.sin(xmax), "cl", "$y=\\sin(Y)$") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y = sin(x)", 0, xmin, xmax, OPEN) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fLine(xmin, 0.3, xmax, 0.3) ;
          fTeXlabel(xmin-0.2, 0.3, "cr", "$y=0.3$") ;
          fLine(xmin, -1.2, xmax, -1.2) ;
          fTeXlabel(xmin-0.2, -1.2, "cr", "$y=-1.2$") ;
     }
}
