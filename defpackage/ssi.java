package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssi implements aypl {
    public final syd a;
    public final sxc b;

    public ssi(syd sydVar) {
        this.a = sydVar;
        this.b = sxc.a;
    }

    public ssi(syd sydVar, sxc sxcVar) {
        this.a = sydVar;
        this.b = sxcVar;
    }

    @Override // defpackage.aypl
    public final aypk a(ayph ayphVar) {
        return ayphVar.q(new ayrs() { // from class: ssh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ssi ssiVar = ssi.this;
                ssiVar.a.a(31, "Command error", ssiVar.b, (Throwable) obj);
            }
        }).C();
    }
}
