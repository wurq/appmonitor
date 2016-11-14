package com.wurq.dex.monitorapp.mpmetrics;

/**
 * This interface is only used with deprecated APIs, and should not be used in new code.
 * Use {@link com.wurq.dex.monitorapp.mpmetrics.MixpanelAPI.People#getSurveyIfAvailable()} instead.
 *
 * @deprecated since 4.0.1
 */
@Deprecated
public interface SurveyCallbacks {
    /**
     * @deprecated since v4.0.1
     */
    @Deprecated
    public void foundSurvey(Survey s);
}
