import java.util.*;
public class PointMap {
	Map<Coords, NamedPoint> coordsNamedPoints = new HashMap<Coords, NamedPoint>();
	public void add(NamedPoint np) {
		coordsNamedPoints.put(np.location, np);
	}
	public void remove(NamedPoint np) {
		coordsNamedPoints.remove(np.location);
	}
	public void remove(Coords c) {
		NamedPoint np = get(c);
		if (np == null) return;
		remove(np);
	}
	 public NamedPoint get(Coords c) {
		return coordsNamedPoints.get(c);
	}
	public NamedPoint[] getAll() {
		NamedPoint[] nps = new NamedPoint[coordsNamedPoints.size()];
		int index = 0;
		Iterator i = coordsNamedPoints.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry e = (Map.Entry)i.next();
			NamedPoint np = (NamedPoint)e.getValue();
			nps[index] = np;
			index++;
		}
		return nps;
	}
	public void clear() {
		coordsNamedPoints.clear();
	}
	public int size() {
		return coordsNamedPoints.size();
	}
}