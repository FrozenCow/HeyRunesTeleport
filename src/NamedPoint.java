public class NamedPoint {
	public String name;
	public Coords location;
	public NamedPoint(String name, Coords location) { this.name = name; this.location = location; }
	public NamedPoint(String name, int x, int y, int z) { this.name = name; this.location = new Coords(x,y,z); }
}
