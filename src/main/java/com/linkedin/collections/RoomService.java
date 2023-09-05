package com.linkedin.collections;

import java.util.*;

public class RoomService {

	private final Collection<Room> inventory;

	public RoomService() {
		// this.inventory = new ArrayList<>();
		this.inventory = new LinkedHashSet<>();
	}
	
	public boolean hasRoom(Room room) {
		// 1. Returns a boolean that indicates if the Room Inventory contains a Room.
		return inventory.contains(room);
	}
	
	public Room[] asArray() {
		// 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.
		return inventory.toArray(new Room[0]);
	}
	
	public Collection<Room> getByType(String type){
		/*
		   3. Return a new Collection of Rooms where Room#type matches the provided String.
			  The original Room Inventory collection MUST NOT BE MODIFIED.
		*/
		// return inventory.stream().filter(e -> type.equals(e.getType())).collect(Collectors.toList());
		Collection<Room> copy = new HashSet<>(inventory);
		copy.removeIf(e -> !type.equals(e.getType()));
		return copy;
	}

	public Collection<Room> getInventory() {
		return new HashSet<>(this.inventory); 
	}

	public void createRoom(String name, String type, int capacity, double price) {
		this.inventory.add(new Room(name, type, capacity, price));
	}

	public void createRooms(Room[] rooms) {
		this.inventory.addAll(Arrays.asList(rooms));
	}

	public void removeRoom(Room room) {
		this.inventory.remove(room);
	}

}
