package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fps implements fpx {
    public WeakReference a;
    private final fpy b;
    private final AtomicBoolean c;

    public fps(fpy fpyVar, WeakReference weakReference, AtomicBoolean atomicBoolean) {
        this.b = fpyVar;
        this.a = weakReference;
        this.c = atomicBoolean;
    }

    @Override // defpackage.fpx
    public final void b(mhn mhnVar) {
        fpx fpxVar = this.b.a;
        if (fpxVar != null) {
            fpxVar.b(mhnVar);
        }
    }

    @Override // defpackage.fpx
    public final void a(boolean z) {
        WeakReference weakReference = this.a;
        dhe dheVar = weakReference == null ? null : (dhe) weakReference.get();
        if (dheVar != null && this.c.compareAndSet(!z, z)) {
            if (z) {
                this.b.a(true);
                AtomicBoolean atomicBoolean = this.c;
                int i = fpo.w;
                if (dheVar.f == null) {
                    return;
                }
                dheVar.g(new dlp(0, atomicBoolean), "updateState:InlinePlayback.updatePlayerTrackingViewVisibilityState");
                return;
            }
            AtomicBoolean atomicBoolean2 = this.c;
            int i2 = fpo.w;
            if (dheVar.f != null) {
                dheVar.h(new dlp(0, atomicBoolean2), "updateState:InlinePlayback.updatePlayerTrackingViewVisibilityState");
            }
        }
    }
}
