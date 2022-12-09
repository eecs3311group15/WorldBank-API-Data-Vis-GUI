package gui;
import static org.junit.Assert.*;
import org.junit.Test;

public class UC3 {

    @Test
    public void SomeAnalysisInDropDownMenu(){

        boolean actual = false;
        MainUI.getInstance();
    if(MainUI.methodsList.getSelectedItem() != null){
       actual = true;
    }
    assertTrue(actual);
    }
    @Test
    public void SomeAnalysisInDropDownMenu2(){

        boolean actual = false;
        MainUI.getInstance();
        if(MainUI.methodsList.getSelectedItem() == "Annual % change of CO2 - Energy use - PM2.5"){
            actual = true;
        }
        assertTrue(actual);
    }
    @Test
    public void NoAnalysisSelected(){

        boolean actual = false;
        MainUI.getInstance();
        if(MainUI.methodsList.getSelectedItem() == ""){
            actual = true;
        }
        assertFalse(actual);
    }

    @Test
    public void NoAnalysisSelectedInDropDownMenu(){
        boolean actual = false;
        MainUI.getInstance();
        if(MainUI.methodsList.getSelectedItem() == null){
            actual = true;
        }
        assertFalse(actual);
    }
}
