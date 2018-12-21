                  /*  File: ellipseMaxMin.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class ellipseMaxMin extends Template {

     static {templateClass = new ellipseMaxMin() ; }

     public void setup() {
          filePrefix = "ellipseMaxMin" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.6*0.7 ;   
          ysize = 2.4*0.7 ;   
          xmin = -2.2 ;
          xmax = 2.4 ;
          ymin = -1.1 ;
          ymax = 1.3;
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
          fTeXlabel(xmax, -0.05, "tr", "$x$", "x") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$", "y") ;
          
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          double x = 0.3 ; double y = Math.sqrt(1-x*x/4.0) ;
          double r = 0.05 ;
          fLine(1,0, x,y) ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          fEllipticalArc(0,0, 2, 1, 0, 360, OPEN) ;
          fDisk(2,0,r,r, FILLED) ;
          fTeXlabel(2.05, 0.05, "bl", "$(2,0)$") ;
          fDisk(1,0,r,r, FILLED) ;
          fTeXlabel(1.05, 0.05, "bl", "$(1,0)$") ;
          fDisk(-2,0,r,r, FILLED) ;
          fTeXlabel(-2.05, 0.05, "br", "$(-2,0)$") ;
          fDisk(x,y,r,r, FILLED) ;
          fTeXlabel(x+0.05, y+0.05, "bl", "$\\big(x, y(x)\\big)$") ;


     }
}
