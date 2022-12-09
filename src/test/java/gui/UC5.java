package gui;

import org.junit.Test;

import analyses.ANN_PCT_CHG_co2EnergyPM25;
import analyses.Analysis;
import analyses.GRAPH_AccHealthCareToMortalityRate;
import analyses.RATIO_co2GDP;
import viewers.Viewer;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

/*
 * Simulation and description of how our GUI works for Addition of viewers through test cases
 *
 */

public class UC5 {

    @Test
    public void additionOfViewers_1(){
    	Viewer v1 = new Viewer("Pie Chart");
    	Viewer v2 = new Viewer("Bar Chart");
    	Viewer v3 = new Viewer("Scatter Chart");
    	AnalysisFacade.viewers.add(v1);
    	AnalysisFacade.viewers.add(v2);
    	AnalysisFacade.viewers.add(v3);

    	
    	boolean actual = true;

    	
    	if(AnalysisFacade.viewers.size() == 3) {
    		actual = true;
    	}

    	assertTrue(actual);
    	AnalysisFacade.viewers.clear();

            }
    @Test
    public void doubleAddition() {
    	Viewer v1 = new Viewer("Pie Chart");
    	Viewer v2 = new Viewer("Line Chart");

    	AnalysisFacade.viewers.add(v1);
    	AnalysisFacade.viewers.add(v2);
    	AnalysisFacade.viewers.add(v2);

    	boolean actual = false;
    	
    	Set<Viewer> set = new HashSet<Viewer>(AnalysisFacade.viewers);
    	AnalysisFacade.viewers.clear();
    	AnalysisFacade.viewers.addAll(set);
    	
    	if(AnalysisFacade.viewers.size() == 2) {
    		actual = true;
    	}

    	assertTrue(actual);
    	AnalysisFacade.viewers.clear();
    }
    @Test
    public void additionOfNonCompatibleViewers_1(){
    	
    	boolean actual = false;
    	Viewer v1 = new Viewer("Line Chart");
    	
    	Analysis test = new ANN_PCT_CHG_co2EnergyPM25();
    	if(test.getCompatibility().get(v1.getTitle())) {
    		AnalysisFacade.viewers.add(v1);
    	}

    	Viewer v2 = new Viewer("Pie Chart");
    	if(test.getCompatibility().get(v2.getTitle()) == true){
    		AnalysisFacade.viewers.add(v2);
    	}

    	
    	if(AnalysisFacade.viewers.size() == 1) {
    		actual = true;
    	}

    	assertTrue(actual);
    	AnalysisFacade.viewers.clear();
    }
    @Test
    public void additionOfNonCompatibleViewers_2(){
    	
    	boolean actual = false;
    	Viewer v1 = new Viewer("Line Chart");
    	
    	Analysis test = new GRAPH_AccHealthCareToMortalityRate();
    	if(test.getCompatibility().get(v1.getTitle())) {
    		AnalysisFacade.viewers.add(v1);
    	}

    	Viewer v2 = new Viewer("Pie Chart");
    	if(test.getCompatibility().get(v2.getTitle()) == true){
    		AnalysisFacade.viewers.add(v2);
    	}

    	
    	if(AnalysisFacade.viewers.size() == 2) {
    		actual = true;
    	}

    	assertTrue(actual);
    	AnalysisFacade.viewers.clear();
    }

    @Test
    public void additionOfNonCompatibleViewers_3(){
    	
    	boolean actual = false;
    	Viewer v1 = new Viewer("Pie Chart");
    	
    	Analysis test = new RATIO_co2GDP();
    	System.out.print(test.getCompatibility());
    	if(test.getCompatibility().get(v1.getTitle())) {
    		AnalysisFacade.viewers.add(v1);
    	}

    	Viewer v2 = new Viewer("Bar Chart");
    	if(test.getCompatibility().get(v2.getTitle()) == true){
    		AnalysisFacade.viewers.add(v2);
    	}

    	
    	if(AnalysisFacade.viewers.size() == 1) {
    		actual = true;
    	}

    	assertTrue(actual);
    	AnalysisFacade.viewers.clear();
    }
    }


