package defpackage;

import android.view.accessibility.CaptioningManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lsm extends CaptioningManager.CaptioningChangeListener {
    final /* synthetic */ lsn a;

    public lsm(lsn lsnVar) {
        this.a = lsnVar;
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        super.onEnabledChanged(z);
        this.a.d();
    }
}
