package models.entities;

import java.util.Set;

public class Round {
	
	private int id;
    private Set<User> players;
    
    public Round(int id, Set<User> players) {
       
        this.id = id;
        this.players = players;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Set<User> getPlayers() {
        return players;
    }
    
    public void setPlayers(Set<User> players) {
        this.players = players;
    }
       

}
