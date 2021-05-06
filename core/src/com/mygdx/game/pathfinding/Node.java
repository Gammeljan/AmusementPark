package com.mygdx.game.pathfinding;

public class Node {
    // has x and y pos on map
    private int x;
    private int y;
    // position in array (optional)
    private int i;
    // saving, which building the node is representing
    private int buildingId;
    
    public Node(int x, int y, int i, int buildingId){
        this.x = x;
        this.y = y;
        this.i = i;
        this.buildingId = buildingId;
    }
    
    /**
     * GETTERS + SETTERS
     */

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the buildingId
     */
    public int getBuildingId() {
        return buildingId;
    }

    /**
     * @param buildingId the buildingId to set
     */
    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }
    
    
}
