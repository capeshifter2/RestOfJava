import java.awt.Color;
import java.util.Scanner;

import graphics.Canvas;

public class Program {
    // Canvas GUI instance providing the drawing area on which to plot the functions
    private static Canvas canvas;

    public static void main(String[] args) {
        
        // Create the canvas instance, set its range to x:[-360, 360] and y:[-240, 240] then 
        // open it on the screen. Use canvas.plot(pX, pY) to plot a point at the (pX, pY) coords
        canvas = new Canvas();
        canvas.setRange(-360, -240, 360, 240);
        canvas.open();

        getInput();

        

        // Pause and close the canvas then terminate the program.

        canvas.close();
    }
    //Receives user input and exits when done
    private static void getInput() {
    	Scanner input = new Scanner(System.in);
    	boolean exit = false;
    	while (exit == false) {
	    	String in = input.next();
	    	switch (in) {
	    	case "S":
	    		sin();
	    		break;
	    	case "Q":
	    		quad();
	    		break;
	    	case "L":
	    		Log();
	    		break;
	    	case "C":
	    		Cube();
	    		break;
	    	case "A":
	    		System.out.println("plotter> AYYYYY");
	    		break;
			default:
				exit = true;
				break;
	    	}
    	}
    }
    private static void plot(GetY... y) {
    	for (int i = 0; i < y.length; i++) {
	    	for (int x = -360; x < 360; x++) {
	            canvas.plot(x, y[i].calcY(x));
	        }
    	}
    }
    private static void sin() {
    	canvas.setColor(Color.red);
        GetY sin =  (x)->{return (int)(200 * Math.sin(Math.PI*x/360));};
        plot(sin);
    }
    private static void quad() {
    	canvas.setColor(Color.blue);
    	GetY quad =  (x)->{return (int)(((x - 200) * (x + 200))/ 250);};
        plot(quad);
    }
    private static void Log() {
    	canvas.setColor(Color.black);
    	GetY log =  (x)->{return (int)(20 * Math.log(x));};
        plot(log);
    }
    private static void Cube() {
    	canvas.setColor(Color.pink);
    	GetY cube =  (x)->{return (int)((x * x * x)/200000);};
        plot(cube);
    }
}
