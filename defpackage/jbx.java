package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jbx implements akbl {
    final /* synthetic */ Runnable a;
    final /* synthetic */ jby b;

    public jbx(jby jbyVar, Runnable runnable) {
        this.b = jbyVar;
        this.a = runnable;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.a.run();
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        jby jbyVar = this.b;
        jbyVar.b.b(jbyVar.c.h);
    }
}
