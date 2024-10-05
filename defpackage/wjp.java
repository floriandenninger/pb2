package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wjp implements aftl {
    final /* synthetic */ wjq a;

    public wjp(wjq wjqVar) {
        this.a = wjqVar;
    }

    @Override // defpackage.aftl
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.aftl
    public final void b() {
        wjq wjqVar = this.a;
        if (wjqVar.e) {
            wjqVar.e = false;
        }
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        this.a.c();
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage != null) {
            this.a.a.l(localizedMessage);
        }
    }
}
