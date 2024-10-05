package defpackage;

import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface axie extends IInterface {
    axih getRootView();

    boolean isEnabled();

    void setCloseButtonListener(axih axihVar);

    void setEnabled(boolean z);

    void setSettingsButtonEnabled(boolean z);

    void setSettingsButtonListener(axih axihVar);

    void setTransitionViewEnabled(boolean z);

    void setTransitionViewListener(axih axihVar);

    void setViewerName(String str);
}
