                  /*  File:  astroidB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class astroidB extends Template {

     static {templateClass = new astroidB() ; }

     public void setup() {
          filePrefix = "astroidB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5 ;   
          ysize = 1.5 ;   
          xmin = -1.1 ;
          xmax = 1.1 ;
          ymin = -1.1 ;
          ymax = 1.1 ;
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
          String Red = "0 1 1 0 setcmykcolor  " ;
          double th = 1.7*Math.PI ; double cth=Math.cos(th) ;  double sth=Math.sin(th) ;
          double r = 0.05 ;
          fEnv("lineWidth", 1.0) ;
          fCurve("[cos(t)*cos(t)*cos(t), sin(t)*sin(t)*sin(t)]", 1, 0, 2*Math.PI, CLOSED);
          fEnv("lineWidth", 0.5) ;
          fLine(xmin,0, xmax,0) ;
          fLine(0,ymin, 0,ymax) ;
          fEnv("lineWidth", 1.0) ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          double phi = 0.05*Math.PI ;
          double cphi = Math.cos(phi) ;  double sphi = Math.sin(phi) ;
          double x = cphi*cphi*cphi ;   double y = sphi*sphi*sphi ;
          double m = -sphi/cphi ;
          double ym = y +m*(xmin-x) ; double yM = y +m*(xmax-x) ;
          fDisk(x,y, r,r, FILLED) ;
          fLine(xmin, ym,   xmax,yM) ;

          phi = 0.45*Math.PI ;
          cphi = Math.cos(phi) ;  sphi = Math.sin(phi) ;
          x = cphi*cphi*cphi ;   y = sphi*sphi*sphi ;
          m = -sphi/cphi ;
          ym = y +m*(xmin-x) ; yM = y +m*(xmax-x) ;
          fDisk(x,y, r,r, FILLED) ;
          fLine(xmin, ym,   xmax,yM) ;
     }
}
