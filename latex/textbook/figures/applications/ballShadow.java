                  /*  File:  ballShadow.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class ballShadow extends Template {

     static {templateClass = new ballShadow() ; }

     public void setup() {
          filePrefix = "ballShadow" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0*1.5 ;   
          ysize = 1.0*1.5 ;   
          xmin = -100.0 ;
          xmax = 100.0 ;
          ymin = -10.0 ;
          ymax = 90.0 ;
          topmargin = 0.0 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          String Black = "0 0 0 1 setcmykcolor  " ;
          String Yellow = "0 0 1 0 setcmykcolor  " ;

          fTeXlabel(-15.0, 78.0, "bc", "$10$") ;
          fTeXlabel(3.0, 62.5, "cl", "$4.9 t^2$") ;
          fTeXlabel(30.0, -3.0, "tc", "$s(t)$") ;
          fTeXlabel(3.0, 62.5, "cl", "$4.9 t^2$") ;
          fTeXlabel(-3.0, 25.0, "rc", "$49-4.9 t^2$") ;
          fEnv("lineWidth", 0.5) ;
          fLine(0.0, 0.0, 0.0, 75.0) ;
          fLine(0.0, 75.0, -30.0, 75.0) ;
          fLine(60.0, 0.0, 0.0, 0.0) ;
          fEnv("lineWidth", 1.0) ;
          canvas.append( new fPsWrite("0.7 setgray\n")) ;
          fLine(60.0, 0.0,  0.0, 50.0) ;
          canvas.append( new fPsWrite(Yellow+"\n")) ;
          fLine(0.0, 50.0, -30.0, 75.0) ;
          canvas.append( new fPsWrite(Black+"\n")) ;
          fDisk(0.0, 50.0, 1.5, 1.5, FILLED) ;


     }
}
