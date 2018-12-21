                  /*  File:  corridor.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class corridor extends Template {

     static {templateClass = new corridor() ; }

     public void setup() {
          filePrefix = "corridor" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 7.4*0.23 ;   
          ysize = 7.4*0.23 ;   
          xmin = -5.2 ;
          xmax =  2.2 ;
          ymin = -4.2 ;
          ymax =  3.2 ;
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
          double th = 50.0*Math.PI/180.0 ;
          double xt = -3.0/Math.tan(th) ; double yt = 3 ;
          double xb = 2 ; double yb = -2.0*Math.tan(th) ;
          {
              double[] xlist = { -5.0, 2.0, 2.0} ;
              double[] ylist = {  3.0, 3.0, -4.0} ;
              fPolygon(xlist, ylist, 3, OPEN) ;
          }
          {
              double[] xlist = { -5.0, 0.0, 0.0} ;
              double[] ylist = {  0.0, 0.0, -4.0} ;
              fPolygon(xlist, ylist, 3, OPEN) ;
          }
          fEnv("lineWidth", 0.5) ;
          fLine(xt,0, xt,yt) ;
          fLine(0,yb, 2,yb) ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 1.5) ;
          fLine(xt,yt, xb, yb) ;
          
          fTeXlabel(-0.7,0.2, "br", "$\\theta$") ;
          fTeXlabel(xb-0.7,yb+0.2, "br", "$\\theta$") ;
          fTeXlabel(xt-0.2,yt/2.0, "cr", "$3$m") ;
          fTeXlabel(xb/2.0,yb-0.2, "tc", "$2$m") ;
          fTeXlabel(xt/2.0+0.3,yt/2.0, "cl", "${\\scriptstyle\\ell_1(\\theta)}$") ;
          fTeXlabel(xb/4.0+0.3,yb/4.0, "cl", "${\\scriptstyle\\ell_2(\\theta)}$") ;
     }
}
