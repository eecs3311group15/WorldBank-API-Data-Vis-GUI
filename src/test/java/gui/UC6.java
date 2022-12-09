package gui;

import org.junit.Test;


/*
 * Simulation and description of how our GUI works for Removal of viewers through test cases
 *
 */


import viewers.Viewer;

import static org.junit.Assert.*;

public class UC6 {

    @Test
    public void doubleRemove_1(){
    	Viewer v1 = new Viewer("Pie Chart");
    	AnalysisFacade.viewers.add(v1);
    	AnalysisFacade.viewers.remove(v1);
    	boolean actual = true;

    	
    	if(AnalysisFacade.viewers.remove(v1) == false) {
    		actual = false;
    	}

    	assertFalse(actual);
    	AnalysisFacade.viewers.clear();
 

            }
    @Test
    public void removalNormal() {
    	Viewer v1 = new Viewer("Pie Chart");
    	Viewer v2 = new Viewer("Line Chart");

    	AnalysisFacade.viewers.add(v1);
    	AnalysisFacade.viewers.add(v2);

    	boolean actual = true;
    	
    	if(AnalysisFacade.viewers.remove(v1) == false) {
    		actual = false;
    	}

    	assertTrue(actual);
    	AnalysisFacade.viewers.clear();

    }
    @Test
    public void removalofNonExisting(){
    	Viewer v1 = new Viewer("Line Chart");
    	//AnalysisFacade.viewers.add(v1);
    	boolean actual = true;
    	
    	if(AnalysisFacade.viewers.remove(v1) == false) {
    		actual = false;
    	}

    	assertFalse(actual);
    	AnalysisFacade.viewers.clear();

    }
    @Test
    public void doubleRemove_2(){
    	Viewer v1 = new Viewer("Scatter Chart");
    	Viewer v2 = new Viewer("Bar Chart");
    	AnalysisFacade.viewers.add(v1);
    	AnalysisFacade.viewers.add(v2);
    	AnalysisFacade.viewers.remove(v1);
    	boolean actual = true;

    	
    	if(AnalysisFacade.viewers.remove(v1) == false) {
    		actual = false;
    	}

    	assertFalse(actual);
    	AnalysisFacade.viewers.clear();

    }

    @Test
    public void removeAll(){
    	Viewer v1 = new Viewer("Scatter Chart");
    	Viewer v2 = new Viewer("Bar Chart");
    	Viewer v3 = new Viewer("Scatter Chart");
    	boolean actual = true;
    	AnalysisFacade.viewers.add(v1);
    	AnalysisFacade.viewers.add(v2);
    	AnalysisFacade.viewers.add(v3);
    	System.out.print(AnalysisFacade.viewers);
    	AnalysisFacade.viewers.clear();
    	
    	if(AnalysisFacade.viewers.remove(v3) == false) {
    		actual = false;
    	}

    	assertFalse(actual);
    	AnalysisFacade.viewers.clear();
    }
    }


