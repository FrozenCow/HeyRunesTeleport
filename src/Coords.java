public class Coords
{
	public int X,Y,Z;
	public Coords(int x, int y, int z) {
		X = x; Y = y; Z = z;
	}
	public Coords(Block b) {
		X = b.getX();
		Y = b.getY();
		Z = b.getZ();
	}
	public Coords(ComplexBlock b) {
		X = b.getX();
		Y = b.getY();
		Z = b.getZ();
	}
	public int hashCode() {
		return X * Y * Z;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Coords) {
			Coords c = (Coords)obj;
			return	(X == c.X) &&
				(Y == c.Y) &&
				(Z == c.Z);
		}
		return false;
	}
}