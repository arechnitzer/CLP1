                  /*  File:  ellipse.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class ellipse extends Template {

     static {templateClass = new ellipse() ; }

     public void setup() {
          filePrefix = "ellipse" ;
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
          double r = 0.075 ;
          fEnv("lineWidth", 1.0) ;
          fCurve("["+a+"*cos(t),"+b+"*sin(t)]", 1, 0, 2*Math.PI, CLOSED) ;
          fDisk(a,0, r, r, FILLED) ;
          fDisk(-a,0, r, r, FILLED) ;
          fEnv("lineWidth", 0.5) ;
          fLine(xmin,0, xmax,0) ;
          fLine(0,ymin, 0,ymax) ;
          fEnv("lineWidth", 1.0) ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fLine(a,b*Math.sin(th)+0.1, a,ymax) ;
          fLine(-a,ymin, -a,ymax) ;

          fTeXlabel(a*Math.cos(th), b*Math.sin(th), "tl", "$3x^2+5y^2=7$") ;
          fTeXlabel(a+0.05, 0.1, "bl", "$\\big(\\sqrt{\\nicefrac{7}{3}},0\\big)$") ;
          fTeXlabel(-a-0.05, 0.1, "br", "$\\big(-\\sqrt{\\nicefrac{7}{3}},0\\big)$") ;
     }
}
