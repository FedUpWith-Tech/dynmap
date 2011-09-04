package org.dynmap.markers.impl;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.util.config.ConfigurationNode;
import org.dynmap.markers.MarkerIcon;

class MarkerIconImpl implements MarkerIcon {
    private String iconid;
    private String label;
    private boolean is_builtin;
    
    MarkerIconImpl(String id) {
        iconid = id;
        label = id;
        is_builtin = false;
    }

    MarkerIconImpl(String id, String lbl, boolean is_builtin) {
        iconid = id;
        if(lbl != null)
            label = lbl;
        else
            label = id;
        this.is_builtin = is_builtin;
    }

    void cleanup() {
        
    }
    
    @Override
    public String getMarkerIconID() {
        return iconid;
    }

    @Override
    public String getMarkerIconLabel() {
        return label;
    }
    
    @Override
    public boolean isBuiltIn() {
        return is_builtin;
    }

    /**
     * Get configuration node to be saved
     * @return node
     */
    Map<String, Object> getPersistentData() {
        if(is_builtin)
            return null;
        
        HashMap<String, Object> node = new HashMap<String, Object>();
        node.put("label", label);

        return node;
    }

    boolean loadPersistentData(ConfigurationNode node) {
        if(is_builtin)
            return false;
        
        label = node.getString("label", iconid);

        return true;
    }

}
