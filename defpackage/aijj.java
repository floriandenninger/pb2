package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijj implements yst {
    private final ypa a;
    private final WeakReference b;
    private final aaev c = new aaev();
    private final aaeu d = new aaeu();

    public aijj(ypa ypaVar, acsx acsxVar) {
        this.a = ypaVar;
        this.b = new WeakReference(acsxVar);
    }

    @Override // defpackage.yst
    public final void a() {
    }

    @Override // defpackage.yst
    public final void b() {
    }

    @Override // defpackage.yst
    public final void c() {
        this.a.d(this.d);
        acsx acsxVar = (acsx) this.b.get();
        if (acsxVar != null) {
            acsxVar.c(this.d.f());
        }
    }

    @Override // defpackage.yst
    public final void d() {
        this.a.d(this.c);
        acsx acsxVar = (acsx) this.b.get();
        if (acsxVar != null) {
            acsxVar.c(this.c.f());
        }
    }
}
