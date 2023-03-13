package com.example.player.model;
import javax.persistence.*;
@Entity
@Table(name="player")
public class Player{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
@Column(name="playerId")
    private int playerId;
    @Column(name="playerName")
    private String playerName;
    @Column(name="jerseyNumber")
    private int jerseyNumber;
    @Column(name="role")
    private String role;
    public Player(int playerId, String playerName, int jerseyNumber, String role){
        this.playerId=playerId;
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
        this.role=role;
    }
    public void setPlayerId(int playerId){
        this.playerId=playerId;
    }
    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber=jerseyNumber;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
}