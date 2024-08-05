package entities;

public class Room {
    private String name, email;
    private int nRoom;

    public Room(String name, String email, int nRoom) {
        this.name = name;
        this.email = email;
        this.nRoom = nRoom;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return nRoom;
    }
    public void setRoom(int nRoom) {
        this.nRoom = nRoom;
    }

    @Override
    public String toString() {
        return nRoom + ": " + name + ", " + email;
    }
}
