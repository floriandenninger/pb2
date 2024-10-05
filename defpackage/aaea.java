package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaea {
    public final aypy a;
    public volatile arfd b;
    public final aady c;

    public aaea(aypy aypyVar, aady aadyVar) {
        this.a = aypyVar;
        this.c = aadyVar;
        aypyVar.ax(new ayrs() { // from class: aadz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aaea.this.b = (arfd) obj;
            }
        });
    }

    public final arfd a() {
        return this.b == null ? (arfd) this.a.as(arfd.a).X() : this.b;
    }
}
