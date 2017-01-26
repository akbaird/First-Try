package edu.utc.bkf926.WorldStream;

import java.util.LinkedList;

/*
 * This class represents a chunk.
 * In the game, this is a 16x16x16 area of blocks.
 * In WorldStream, we are converting the visible blocks into a "surface" since the solid blocks don't need to be rendered
 * in the game engine and doing so will cause massive slowdowns.
 * 
 * We can do this by looking at the relationships between blocks in the chunk and culling out those that have another
 * solid block adjacent on all six sides.
 */
public class WSChunk {
	
	/*
	 * Contains ALL blocks in the chunk, in no particular order.
	 * Use the cx, cy, and cz values of the blocks to set their position.
	 * The JSON writer will be responsible for culling non-visible blocks.
	 */
	private LinkedList<WSBlock> blocks;

}
