package edu.utc.bkf926.WorldStream;

import java.util.HashMap;

public class WSBlock {

	private int cx, cy, cz, hx, hy, hz;
	//CX CY and CZ are the positions of the block within the chunk, 0-15
	//HX HY and HZ ane the size of the block's hitbox, with 1.0x1.0x1.0 being a full block
	//NOTE smaller-than-full hitboxes will always be centered on the X and Z, and start at the bottom Y
	
	private String blockType;
	private boolean isSolid; //True if the block will make up a part of the solid surface
	private HashMap<String, Integer> metadata;
	
	public void addMetadata(String name, Integer value){
		metadata.put(name, value);
	}
	
	
}
