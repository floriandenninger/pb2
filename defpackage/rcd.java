package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcd extends ecp implements rcf {
    public rcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.rcf
    public final void beginAdUnitExposure(String str, long j) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeLong(j);
        pp(23, pn);
    }

    @Override // defpackage.rcf
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.g(pn, bundle);
        pp(9, pn);
    }

    @Override // defpackage.rcf
    public final void clearMeasurementEnabled(long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void endAdUnitExposure(String str, long j) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeLong(j);
        pp(24, pn);
    }

    @Override // defpackage.rcf
    public final void generateEventId(rci rciVar) {
        Parcel pn = pn();
        ecr.i(pn, rciVar);
        pp(22, pn);
    }

    @Override // defpackage.rcf
    public final void getAppInstanceId(rci rciVar) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void getCachedAppInstanceId(rci rciVar) {
        Parcel pn = pn();
        ecr.i(pn, rciVar);
        pp(19, pn);
    }

    @Override // defpackage.rcf
    public final void getConditionalUserProperties(String str, String str2, rci rciVar) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.i(pn, rciVar);
        pp(10, pn);
    }

    @Override // defpackage.rcf
    public final void getCurrentScreenClass(rci rciVar) {
        Parcel pn = pn();
        ecr.i(pn, rciVar);
        pp(17, pn);
    }

    @Override // defpackage.rcf
    public final void getCurrentScreenName(rci rciVar) {
        Parcel pn = pn();
        ecr.i(pn, rciVar);
        pp(16, pn);
    }

    @Override // defpackage.rcf
    public final void getGmpAppId(rci rciVar) {
        Parcel pn = pn();
        ecr.i(pn, rciVar);
        pp(21, pn);
    }

    @Override // defpackage.rcf
    public final void getMaxUserProperties(String str, rci rciVar) {
        Parcel pn = pn();
        pn.writeString(str);
        ecr.i(pn, rciVar);
        pp(6, pn);
    }

    @Override // defpackage.rcf
    public final void getTestFlag(rci rciVar, int i) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void getUserProperties(String str, String str2, boolean z, rci rciVar) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.e(pn, z);
        ecr.i(pn, rciVar);
        pp(5, pn);
    }

    @Override // defpackage.rcf
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void initialize(qvf qvfVar, InitializationParams initializationParams, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        ecr.g(pn, initializationParams);
        pn.writeLong(j);
        pp(1, pn);
    }

    @Override // defpackage.rcf
    public final void isDataCollectionEnabled(rci rciVar) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.g(pn, bundle);
        ecr.e(pn, z);
        ecr.e(pn, true);
        pn.writeLong(j);
        pp(2, pn);
    }

    @Override // defpackage.rcf
    public final void logEventAndBundle(String str, String str2, Bundle bundle, rci rciVar, long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void logHealthData(int i, String str, qvf qvfVar, qvf qvfVar2, qvf qvfVar3) {
        Parcel pn = pn();
        pn.writeInt(5);
        pn.writeString("Error with data collection. Data lost.");
        ecr.i(pn, qvfVar);
        ecr.i(pn, qvfVar2);
        ecr.i(pn, qvfVar3);
        pp(33, pn);
    }

    @Override // defpackage.rcf
    public final void onActivityCreated(qvf qvfVar, Bundle bundle, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        ecr.g(pn, bundle);
        pn.writeLong(j);
        pp(27, pn);
    }

    @Override // defpackage.rcf
    public final void onActivityDestroyed(qvf qvfVar, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeLong(j);
        pp(28, pn);
    }

    @Override // defpackage.rcf
    public final void onActivityPaused(qvf qvfVar, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeLong(j);
        pp(29, pn);
    }

    @Override // defpackage.rcf
    public final void onActivityResumed(qvf qvfVar, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeLong(j);
        pp(30, pn);
    }

    @Override // defpackage.rcf
    public final void onActivitySaveInstanceState(qvf qvfVar, rci rciVar, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        ecr.i(pn, rciVar);
        pn.writeLong(j);
        pp(31, pn);
    }

    @Override // defpackage.rcf
    public final void onActivityStarted(qvf qvfVar, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeLong(j);
        pp(25, pn);
    }

    @Override // defpackage.rcf
    public final void onActivityStopped(qvf qvfVar, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeLong(j);
        pp(26, pn);
    }

    @Override // defpackage.rcf
    public final void performAction(Bundle bundle, rci rciVar, long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void registerOnMeasurementEventListener(rck rckVar) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void resetAnalyticsData(long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel pn = pn();
        ecr.g(pn, bundle);
        pn.writeLong(j);
        pp(8, pn);
    }

    @Override // defpackage.rcf
    public final void setConsent(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setConsentThirdParty(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setCurrentScreen(qvf qvfVar, String str, String str2, long j) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeString(str);
        pn.writeString(str2);
        pn.writeLong(j);
        pp(15, pn);
    }

    @Override // defpackage.rcf
    public final void setDataCollectionEnabled(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, false);
        pp(39, pn);
    }

    @Override // defpackage.rcf
    public final void setDefaultEventParameters(Bundle bundle) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setEventInterceptor(rck rckVar) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setInstanceIdProvider(rcm rcmVar) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pn.writeLong(j);
        pp(11, pn);
    }

    @Override // defpackage.rcf
    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setSessionTimeoutDuration(long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setUserId(String str, long j) {
        throw null;
    }

    @Override // defpackage.rcf
    public final void setUserProperty(String str, String str2, qvf qvfVar, boolean z, long j) {
        Parcel pn = pn();
        pn.writeString("fcm");
        pn.writeString("_ln");
        ecr.i(pn, qvfVar);
        ecr.e(pn, true);
        pn.writeLong(j);
        pp(4, pn);
    }

    @Override // defpackage.rcf
    public final void unregisterOnMeasurementEventListener(rck rckVar) {
        throw null;
    }
}
