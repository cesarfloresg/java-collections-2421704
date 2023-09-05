package com.linkedin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RoomService {

	// 1. Declare a Collection to store Room Inventory
	private final Collection<Room> inventory;

	public RoomService() {
		// 2. Initialize Collection and assign it to the Room Inventory
		inventory = new HashSet<>();
	}

	public Collection<Room> getInventory(){
		// 3. Return the Room Inventory
		return new HashSet<>(inventory);
	}
	
	public void createRoom(String name, String type, int capacity, double rate) {
		// 4. Add a new Room to the Room Inventory using the provided parameters
		inventory.add(new Room(name, type, capacity, rate));
	}

	public void createRooms(Room[] rooms) {
		// 5. Add the Rooms provided in the Array to the Room Inventory
		inventory.addAll(Arrays.asList(rooms));
	}
	
	public void removeRoom(Room room) {
		// 6. Remove the provided Room from the Room Inventory
		inventory.remove(room);
	}

}
