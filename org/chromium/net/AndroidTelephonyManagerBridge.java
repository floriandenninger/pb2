package org.chromium.net;

import android.telephony.TelephonyManager;
import defpackage.ayeq;
import defpackage.baer;
import org.chromium.base.ThreadUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AndroidTelephonyManagerBridge {
    private static volatile AndroidTelephonyManagerBridge sInstance;
    private baer mListener;
    private volatile String mNetworkCountryIso;
    private volatile String mNetworkOperator;
    private volatile String mSimOperator;

    private AndroidTelephonyManagerBridge() {
    }

    private static AndroidTelephonyManagerBridge create() {
        final AndroidTelephonyManagerBridge androidTelephonyManagerBridge = new AndroidTelephonyManagerBridge();
        ThreadUtils.c(new Runnable() { // from class: org.chromium.net.AndroidTelephonyManagerBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidTelephonyManagerBridge.lambda$create$0(AndroidTelephonyManagerBridge.this);
            }
        });
        return androidTelephonyManagerBridge;
    }

    public static AndroidTelephonyManagerBridge getInstance() {
        AndroidTelephonyManagerBridge androidTelephonyManagerBridge = sInstance;
        if (androidTelephonyManagerBridge == null) {
            synchronized (AndroidTelephonyManagerBridge.class) {
                androidTelephonyManagerBridge = sInstance;
                if (androidTelephonyManagerBridge == null) {
                    androidTelephonyManagerBridge = create();
                    sInstance = androidTelephonyManagerBridge;
                }
            }
        }
        return androidTelephonyManagerBridge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TelephonyManager getTelephonyManager() {
        return (TelephonyManager) ayeq.a.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$create$0(AndroidTelephonyManagerBridge androidTelephonyManagerBridge) {
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            androidTelephonyManagerBridge.listenTelephonyServiceState(telephonyManager);
        }
    }

    private void listenTelephonyServiceState(TelephonyManager telephonyManager) {
        baer baerVar = new baer(this);
        this.mListener = baerVar;
        telephonyManager.listen(baerVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void update(TelephonyManager telephonyManager) {
        if (telephonyManager == null) {
            return;
        }
        this.mNetworkCountryIso = telephonyManager.getNetworkCountryIso();
        this.mNetworkOperator = telephonyManager.getNetworkOperator();
        this.mSimOperator = telephonyManager.getSimOperator();
    }

    public String getNetworkCountryIso() {
        if (this.mNetworkCountryIso == null) {
            TelephonyManager telephonyManager = getTelephonyManager();
            if (telephonyManager == null) {
                return "";
            }
            this.mNetworkCountryIso = telephonyManager.getNetworkCountryIso();
        }
        return this.mNetworkCountryIso;
    }

    public String getNetworkOperator() {
        if (this.mNetworkOperator == null) {
            TelephonyManager telephonyManager = getTelephonyManager();
            if (telephonyManager == null) {
                return "";
            }
            this.mNetworkOperator = telephonyManager.getNetworkOperator();
        }
        return this.mNetworkOperator;
    }

    public String getSimOperator() {
        if (this.mSimOperator == null) {
            TelephonyManager telephonyManager = getTelephonyManager();
            if (telephonyManager == null) {
                return "";
            }
            this.mSimOperator = telephonyManager.getSimOperator();
        }
        return this.mSimOperator;
    }
}
