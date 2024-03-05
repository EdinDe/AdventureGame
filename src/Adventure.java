public class Adventure {

    private Room currentRoom;


    public Adventure() {
        Room room1 = new Room("Room 1", "");
        Room room2 = new Room("Room 2","");
        Room room3 = new Room("Room 3","");
        Room room4 = new Room("Room 4","");
        Room room5 = new Room("Room 5","");
        Room room6 = new Room("Room 6","");
        Room room7 = new Room("Room 7","");
        Room room8 = new Room("Room 8","");
        Room room9 = new Room("Room 9","");
        currentRoom = room1;
        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setNorth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        room9.setWest(room8);
        room9.setNorth(room6);
    }

    public boolean goNorth(){
        if (currentRoom.getNorth().equals(null)) {
            return false;
        }else{
            currentRoom = currentRoom.getNorth();
            return true;

        }
    }
    public boolean goWest() {
        if (currentRoom.getWest().equals(null)) {
            return false;
        } else {
            currentRoom = currentRoom.getWest();
            return true;

        }

    }

    public boolean goEast() {
        if (currentRoom.getEast().equals(null)) {
            return false;
        } else {
            currentRoom = currentRoom.getEast();
            return true;

        }
    }
    public boolean goSouth() {
        if (currentRoom.getSouth().equals(null)) {
            return false;
        } else {
            currentRoom = currentRoom.getSouth();
            return true;

        }
    }
}
