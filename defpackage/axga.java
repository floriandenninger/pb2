package defpackage;

import android.graphics.SurfaceTexture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axga implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ axgb a;

    public axga(axgb axgbVar) {
        this.a = axgbVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        axgc axgcVar;
        this.a.d.getAndIncrement();
        synchronized (this.a.k) {
            if (!this.a.j && (axgcVar = this.a.b) != null) {
                axgcVar.b();
            }
        }
    }
}
