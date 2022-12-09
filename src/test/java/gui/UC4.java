package gui;

import org.junit.Test;

import static org.junit.Assert.*;

public class UC4 {

    @Test
    public void StartDateGreaterThanEndDate(){

        try {
            AnalysisFacade.startAnalysis("", "", "", 2000, 1999);

        } catch (IllegalArgumentException e) {
            assertEquals("Starting year has to be less or equal to Ending year", e.getMessage());
        }

            }
    @Test
    public void StartDateGreaterThanEndDateAgain() {
        int from = 2000;
        int to = 1999;
        assertFalse(AnalysisFacade.yearCheck(from, to));
    }

    public void StartDateGreaterThanEndDate2(){

        try {
            AnalysisFacade.startAnalysis("", "", "", 2005, 2000);

        } catch (IllegalArgumentException e) {
            assertEquals("Starting year has to be less or equal to Ending year", e.getMessage());
        }

    }
    @Test
    public void StartDateLessThanEndDate(){
        boolean expected = true;
        boolean actual = false;
        int from = 1990;
        int to = 2000;

            assertTrue(AnalysisFacade.yearCheck(from,to));

    }
    @Test
    public void StartDateLessThanEndDate2(){
        boolean expected = true;
        boolean actual = false;
        int from = 2010;
        int to = 2016;

        assertTrue(AnalysisFacade.yearCheck(from,to));

    }

    @Test
    public void StartDateLessThanEndDateAgain(){
        boolean expected = true;
        boolean actual = false;
        int from = 2001;
        int to = 2005;

        assertTrue(AnalysisFacade.yearCheck(from,to));

    }
    }


