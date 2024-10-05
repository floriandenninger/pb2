package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxr implements nwy {
    public final azqw a;
    public Rect b;

    public nxr() {
        azqw av = azqv.ap().av();
        this.a = av;
        av.c(new Rect(0, 0, 0, 0));
        this.b = new Rect();
    }

    @Override // defpackage.nwy
    public final int a() {
        return 0;
    }

    @Override // defpackage.nwy
    public final Rect b() {
        return this.b;
    }

    @Override // defpackage.nwy
    public final aypn c() {
        return this.a;
    }

    @Override // defpackage.nwy
    public final aypn d() {
        return aypn.z(0).h(ntu.i);
    }

    @Override // defpackage.nwy
    public final void e() {
        this.a.X(new ayrs() { // from class: nxq
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                nxr.this.b = (Rect) obj;
            }
        });
    }
}
