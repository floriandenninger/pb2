package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface rcf extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(rci rciVar);

    void getAppInstanceId(rci rciVar);

    void getCachedAppInstanceId(rci rciVar);

    void getConditionalUserProperties(String str, String str2, rci rciVar);

    void getCurrentScreenClass(rci rciVar);

    void getCurrentScreenName(rci rciVar);

    void getGmpAppId(rci rciVar);

    void getMaxUserProperties(String str, rci rciVar);

    void getTestFlag(rci rciVar, int i);

    void getUserProperties(String str, String str2, boolean z, rci rciVar);

    void initForTests(Map map);

    void initialize(qvf qvfVar, InitializationParams initializationParams, long j);

    void isDataCollectionEnabled(rci rciVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, rci rciVar, long j);

    void logHealthData(int i, String str, qvf qvfVar, qvf qvfVar2, qvf qvfVar3);

    void onActivityCreated(qvf qvfVar, Bundle bundle, long j);

    void onActivityDestroyed(qvf qvfVar, long j);

    void onActivityPaused(qvf qvfVar, long j);

    void onActivityResumed(qvf qvfVar, long j);

    void onActivitySaveInstanceState(qvf qvfVar, rci rciVar, long j);

    void onActivityStarted(qvf qvfVar, long j);

    void onActivityStopped(qvf qvfVar, long j);

    void performAction(Bundle bundle, rci rciVar, long j);

    void registerOnMeasurementEventListener(rck rckVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(qvf qvfVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(rck rckVar);

    void setInstanceIdProvider(rcm rcmVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, qvf qvfVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(rck rckVar);
}
