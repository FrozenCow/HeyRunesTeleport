import java.util.*;
public class NamedPointMap extends PointMap {
	Map<String, NamedPoint> namedPoints = new HashMap<String, NamedPoint>();
	public void add(NamedPoint np) {
		remove(np.name);

		super.add(np);
		namedPoints.put(np.name, np);
	}
	public void remove(NamedPoint np) {
		super.remove(np);
		namedPoints.remove(np.name);
	}
	public void remove(String name) {
		NamedPoint np = get(name);
		if (np == null) return;
		remove(np);
	}
	public NamedPoint get(String name) {
		return namedPoints.get(name);
	}
	public void clear() {
		super.clear();
		namedPoints.clear();
	}
}
