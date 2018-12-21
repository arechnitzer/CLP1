                  /*  File:  inscribed.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class inscribed extends Template {

     static {templateClass = new inscribed() ; }

     public void setup() {
          filePrefix = "inscribed" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.5*0.6 ;   
          ysize = 2.0*0.6 ;   
          xmin = -1.25 ;
          xmax = 1.25 ;
          ymin = -0.1 ;
          ymax = 1.9 ;
          topmargin = 0.1 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;
          double x = .5 ;
          double y = Math.sqrt(3)*(1-x) ;
          {
              double[] xlist = { -1.0, 1.0, 0.0} ;
              double[] ylist = { 0.0, 0.0, Math.sqrt(3)} ;
              fPolygon(xlist, ylist, 3, CLOSED) ;
          }
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          {
              double[] xlist = { x, x, -x,-x} ;
              double[] ylist = { 0, y, y, 0} ;
              fPolygon(xlist, ylist, 4, CLOSED) ;
          }

          fTeXlabel(x+.05, y, "bl", "$(x,y)$") ;
          fTeXlabel(-x-.05, y, "br", "$(-x,y)$") ;
          fTeXlabel(1.1,0, "lc", "$(a/2,0)$") ;
          fTeXlabel(-1.1,0, "rc", "$(-a/2,0)$") ;
          fTeXlabel(.15,Math.sqrt(3), "lc", "$(0,\\sqrt{3}a/2)$") ;
     }
}
