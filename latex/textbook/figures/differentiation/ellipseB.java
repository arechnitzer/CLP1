                  /*  File:  ellipseB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class ellipseB extends Template {

     static {templateClass = new ellipseB() ; }

     public void setup() {
          filePrefix = "ellipseB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.5 ;   
          xmin = -2.0 ;
          xmax = 2.0 ;
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
          String Red = "0 1 1 0 setcmykcolor  " ;
          double a = Math.sqrt(7.0/3.0) ;
          double b = Math.sqrt(7.0/5.0) ;
          double th = 1.55*Math.PI ;
          double phi = 0.25*Math.PI ;
          double x0 = a*Math.cos(phi) ;
          double y0 = b*Math.sin(phi) ;
          double r = 0.075 ;
          fEnv("lineWidth", 1.0) ;
          fCurve("["+a+"*cos(t),"+b+"*sin(t)]", 1, 0, 2*Math.PI, CLOSED) ;
          fDisk(x0,y0, r, r, FILLED) ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin,0, xmax,0) ;
          fLine(0,ymin, 0,ymax) ;
          fEnv("lineWidth", 1.0) ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          double yl = (7-3*x0*xmin)/(5*y0) ;
          double yr = (7-3*x0*xmax)/(5*y0) ;
          fLine(xmin,yl,  xmax,yr) ;

          fTeXlabel(a*Math.cos(th), b*Math.sin(th), "tl", "$3x^3+5y^2=7$") ;
          fTeXlabel(x0, y0-0.1, "tr", "$(x_0,y_0)$") ;
     }
}
