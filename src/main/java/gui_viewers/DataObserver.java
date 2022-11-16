package gui_viewers;

import java.util.ArrayList;
import java.util.HashMap;

public interface DataObserver {
	public void update(HashMap<String, ArrayList<Double>> resultMap);
}
