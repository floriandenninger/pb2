package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eyk implements aftl {
    final /* synthetic */ apxf a;
    final /* synthetic */ Object b;
    final /* synthetic */ eym c;

    public eyk(eym eymVar, apxf apxfVar, Object obj) {
        this.c = eymVar;
        this.a = apxfVar;
        this.b = obj;
    }

    @Override // defpackage.aftl
    public final void a() {
    }

    @Override // defpackage.aftl
    public final void b() {
        try {
            this.c.b(this.a, this.b);
        } catch (aahm e) {
            this.c.b.e(e);
        }
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        this.c.b.e(exc);
    }
}
