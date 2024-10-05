package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vql extends vnl {
    private final vmu a;

    public vql(vmu vmuVar) {
        this.a = vmuVar;
    }

    @Override // defpackage.vnl
    public final aot a() {
        return this.a.d;
    }

    @Override // defpackage.vnl
    public final void b(int i) {
        vmu vmuVar = this.a;
        synchronized (vmuVar) {
            vmuVar.e = Math.max(i, vmuVar.e);
        }
        vmuVar.a();
    }

    @Override // defpackage.vnl
    public final void c() {
        vmu vmuVar = this.a;
        vmuVar.f = false;
        vmuVar.a();
    }
}
