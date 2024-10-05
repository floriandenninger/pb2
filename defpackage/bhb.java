package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhb implements DisplayManager.DisplayListener, bgz {
    public static final /* synthetic */ int a = 0;
    private final DisplayManager b;
    private bgx c;

    public bhb(DisplayManager displayManager) {
        this.b = displayManager;
    }

    private final Display c() {
        return this.b.getDisplay(0);
    }

    @Override // defpackage.bgz
    public final void a() {
        this.b.unregisterDisplayListener(this);
        this.c = null;
    }

    @Override // defpackage.bgz
    public final void b(bgx bgxVar) {
        this.c = bgxVar;
        this.b.registerDisplayListener(this, pts.x());
        bgxVar.a(c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        bgx bgxVar = this.c;
        if (bgxVar == null || i != 0) {
            return;
        }
        bgxVar.a(c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
