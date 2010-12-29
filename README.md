# Compiling #
Use apache-ant to compile and create `HeyRunesTeleport.jar` by executing `ant`.

# Installing #
* Make sure you have HeyRunes installed and enabled.
* Copy `HeyRunesTeleport.jar` to your `minecraft_server/plugins/`.
* Add HeyRunesTeleport to your plugins in `server.properties`:

	plugins=HeyRunes,HeyRunesTeleport

# Usage #
In Minecraft you can now create a *teleporter* and a *waypoint* (Note: HeyRunesTeleport waypoints are different from the ones in hMod).

Waypoints are the portals where one can teleport to. Teleporters are portals where one can be teleported from.

## Creating a waypoint ##
Place 4 gold blocks on a flat ground and place one standing sign in the middle:

	.G.
	GSG
	.G.
	
	G = gold block
	S = standing sign

In the sign write the name of your waypoint on the first line (the other lines are ignored).

Hit the sign with left mouse.

The sign will turn into a pool of water: the waypoint is made.

## Creating a teleporter ##
This is quite similar to the waypoint. Instead of using gold blocks, now use iron blocks.

Place 4 iron blocks on a flat ground and place one standing sign in the middle:

	.I.
	ISI
	.I.
	
	I = iron block
	S = standing sign

In the sign write the name of your previously made waypoint on the first line (the other lines are ignored).

Hit the sign with left mouse.

The sign will turn into a pool of water: the teleporter to the waypoint is made. Jump in the water and you will get teleported.

Note that there can be multiple teleports made for a single waypoint. Though there can only be made one waypoint for a name.

# Commands #

	/teleporters - Shows a list of all teleporters with name and coordinates.
	/waypoints - Shows a list of all waypoints with name and coordinates.

# Files #
The teleporters get saved in the file `minecraft_server/heyrunesteleport_teleporters.txt` and the waypoints in `minecraft_server/heyrunesteleport_waypoints.txt`.