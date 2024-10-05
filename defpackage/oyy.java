package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oyy implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    final /* synthetic */ oza b;

    public oyy(oza ozaVar, DisplayManager displayManager) {
        this.b = ozaVar;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.a();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
