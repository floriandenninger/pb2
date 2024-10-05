package defpackage;

import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface axib extends IInterface {
    boolean enableAsyncReprojection(int i);

    boolean enableCardboardTriggerEmulation(axih axihVar);

    long getNativeGvrContext();

    axih getRootView();

    axie getUiLayout();

    void onBackPressed();

    void onPause();

    void onResume();

    boolean setOnDonNotNeededListener(axih axihVar);

    void setPresentationView(axih axihVar);

    void setReentryIntent(axih axihVar);

    void setStereoModeEnabled(boolean z);

    void shutdown();
}
