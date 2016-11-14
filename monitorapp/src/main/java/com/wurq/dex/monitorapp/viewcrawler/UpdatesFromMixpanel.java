package com.wurq.dex.monitorapp.viewcrawler;

import com.wurq.dex.monitorapp.mpmetrics.Tweaks;
import com.wurq.dex.monitorapp.mpmetrics.OnMixpanelTweaksUpdatedListener;

import org.json.JSONArray;

/* This interface is for internal use in the Mixpanel library, and should not be
   implemented in client code. */
public interface UpdatesFromMixpanel {
    public void startUpdates();
    public void setEventBindings(JSONArray bindings);
    public void setVariants(JSONArray variants);
    public Tweaks getTweaks();
    public void addOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener listener);
    public void removeOnMixpanelTweaksUpdatedListener(OnMixpanelTweaksUpdatedListener listener);
}
