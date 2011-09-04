package org.dynmap.markers;

import org.bukkit.Location;

/**
 * This defines the public interface to a marker object, for use with the MarkerAPI
 */
public interface Marker {
    /**
     * Get ID of the marker (unique string within the MarkerSet)
     * @return id of marker
     */
    public String getMarkerID();
    /**
     * Get the marker set for the marker
     * @return marker set
     */
    public MarkerSet getMarkerSet();
    /**
     * Delete the marker
     */
    public void deleteMarker();
    /**
     * Get marker's world ID
     * @return world id
     */
    public String getWorld();
    /**
     * Get marker's X coordinate
     * @return x coordinate
     */
    public int getX();
    /**
     * Get marker's Y coordinate
     * @return y coordinate
     */
    public int getY();
    /**
     * Get marker's Z coordinate
     * @return z coordinate
     */
    public int getZ();
    /**
     * Update the marker's location
     * @param worldid - world ID
     * @param x - x coord
     * @param y - y coord
     * @param z - z coord
     */
    public void setLocation(String worldid, int x, int y, int z);
    /**
     * Get the marker's icon
     * @return marker icon
     */
    public MarkerIcon getMarkerIcon();
    /**
     * Set the marker's icon
     * @param icon - new marker icon
     * @return true if new marker icon set, false if not allowed
     */
    public boolean setMarkerIcon(MarkerIcon icon);
    /**
     * Test if marker is persistent
     */
    public boolean isPersistentMarker();
    /**
     * Get the marker's label
     */
    public String getLabel();
    /**
     * Update the marker's label
     */
    public void setLabel(String lbl);
}
