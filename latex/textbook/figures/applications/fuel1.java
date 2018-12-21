                  /*  File:  fuel1.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class fuel1 extends Template {

     static {templateClass = new fuel1() ; }

     public void setup() {
          filePrefix = "fuel1" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 6.0*0.25 ;   
          ysize = 3.75*0.25 ;   
          xmin = -100.0 ;
          xmax = 100.0 ;
          ymin = -50.0 ;
          ymax = 75.0 ;
          topmargin = -.25 ;
          bottommargin = 0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 1.0) ;
          fDisk(-50.0, 0.0, 20, 45, BOUNDARY) ;
          fEllipticalArc(50.0, 0.0, 20, 45, -90, 90, OPEN) ;
          fLine(-50.0, 45, 50.0, 45) ;
          fLine(-50.0, -45, 50.0, -45) ;
          fEnv("lineWidth", 0.5) ;
          fEllipticalArc(50.0, 0.0, 20, 45, 90, 270, OPEN) ;
          fLine(-50, 0, -50, 45) ;
          fTeXlabel(-48, 22.5, "lc", "$r$") ; 
          fTeXlabel(0, -48, "tc", "$L$") ; 

     }
}
