package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abwa {
    public final /* synthetic */ abwy a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ abwa(abwy abwyVar, boolean z) {
        this.a = abwyVar;
        this.b = z;
    }

    public final void a(int i) {
        final abwy abwyVar = this.a;
        final boolean z = this.b;
        if (i != 0 && i != 2) {
            zga.b("Error stopping capture: 1");
        }
        abwyVar.j.f(new abso() { // from class: abvz
            @Override // defpackage.abso
            public final void a(int i2) {
                abwy abwyVar2 = abwy.this;
                if (z) {
                    abxc abxcVar = abwyVar2.i;
                    amkq.N(abxcVar.a == 12);
                    abxcVar.f(12);
                }
            }
        });
    }
}
