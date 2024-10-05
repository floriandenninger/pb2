package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajca {
    public final aiwx a;
    public final aemv b;
    private final aift c;

    public ajca(aiwx aiwxVar, aift aiftVar, aemv aemvVar) {
        this.a = aiwxVar;
        this.c = aiftVar;
        this.b = aemvVar;
    }

    public final void a() {
        this.c.a.n().X(new ayrs() { // from class: ajbz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ajca ajcaVar = ajca.this;
                afkl a = ((aiev) obj).a();
                if (a == null && ajcaVar.equals(ajcaVar.a.b)) {
                    ajcaVar.b.r();
                    return;
                }
                if (a == null) {
                    zga.b("Trying to detachMediaView when it wasn't the most recent MediaView Setter");
                    return;
                }
                ajcaVar.b.n(a);
                aiwx aiwxVar = ajcaVar.a;
                ajca ajcaVar2 = aiwxVar.b;
                aiwxVar.b = ajcaVar;
            }
        });
    }
}
