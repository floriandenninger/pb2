package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axfx implements axgd {
    public final /* synthetic */ ExternalSurfaceManager a;
    private final /* synthetic */ int b;

    public /* synthetic */ axfx(ExternalSurfaceManager externalSurfaceManager, int i) {
        this.b = i;
        this.a = externalSurfaceManager;
    }

    @Override // defpackage.axgd
    public final void a(axgb axgbVar) {
        if (this.b != 0) {
            axfy axfyVar = this.a.a;
            if (axgbVar.i && axgbVar.d.getAndSet(0) > 0) {
                axgbVar.g.updateTexImage();
                axgbVar.g.getTransformMatrix(axgbVar.c);
                axfyVar.a(axgbVar.a, axgbVar.f[0], axgbVar.g.getTimestamp(), axgbVar.c);
                return;
            }
            return;
        }
        axfy axfyVar2 = this.a.a;
        if (axgbVar.i && axgbVar.d.get() > 0) {
            axgbVar.d.decrementAndGet();
            axgbVar.g.updateTexImage();
            axgbVar.g.getTransformMatrix(axgbVar.c);
            axfyVar2.a(axgbVar.a, axgbVar.f[0], axgbVar.g.getTimestamp(), axgbVar.c);
        }
    }
}
