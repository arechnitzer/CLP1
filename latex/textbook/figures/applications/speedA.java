                  /*  File:  speedA.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class speedA extends Template {

     static {templateClass = new speedA() ; }

     public void setup() {
          filePrefix = "speedA" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 6.0*0.5 ;   
          ysize = 3.0*0.5 ;   
          xmin = -300.0 ;
          xmax = 300.0 ;
          ymin = 400.0 ;
          ymax = 700.0 ;
          topmargin = 0.2 ;
          bottommargin = 0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {

          fEnv("lineWidth", 0.5) ;
          fLine(-250.0, 500.0, 250.0, 500.0) ;
          fLine(0.0, 700.0, -0.0, 400.0) ;

          fCurve("y = 10*(3*(x/80)*(x/80)-3 )+ 500", 0, -80.0, 80.0, 1) ;

          fTeXlabel(-5, 700, "tr", "$v$") ;
          fTeXlabel(250, 495, "tr", "$t$") ;
          
          fLine(80, 500, 80, 490) ;
          fLine(-80, 500, -80, 490) ;
          fTeXlabel(80, 485, "tc", "$1$") ;
          fTeXlabel(-80, 485, "tc", "$-1$") ;
          fLine(0, 470, -10, 470) ;
          fTeXlabel(-10, 460, "rt", "$-3$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 2) ;
          fCurve("y = 10*(3*(x/80)*(x/80)-3 )+ 500", 0, -250.0, -80.0, 1) ;
          fCurve("y = 10*(3*(x/80)*(x/80)-3 )+ 500", 0, 80.0, 250.0, 1) ;

     }
}
