package viewers;

import java.util.ArrayList;
import java.util.HashMap;

import analyses.DataContainer;

public interface DataObserver {
	public void update(DataContainer data);
}
