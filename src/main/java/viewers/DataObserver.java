package viewers;

import analyses.DataContainer;

public interface DataObserver {
	public void update(DataContainer data);
}
