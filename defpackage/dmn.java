package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dmn implements dnj {
    final /* synthetic */ dmq a;

    public dmn(dmq dmqVar) {
        this.a = dmqVar;
    }

    @Override // defpackage.dnj
    public final void a(dni dniVar) {
        this.a.e.remove(dniVar);
    }

    @Override // defpackage.dnj
    public final void b(dni dniVar) {
        this.a.e.remove(dniVar);
    }

    @Override // defpackage.dnj
    public final void c(dni dniVar) {
        this.a.e.add(dniVar);
    }

    @Override // defpackage.dnj
    public final boolean d(dni dniVar) {
        return true;
    }
}
