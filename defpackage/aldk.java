package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aldk implements akyp {
    public final String a;
    public final akyq b;
    final /* synthetic */ aldn c;

    public aldk(aldn aldnVar, String str, akyq akyqVar) {
        this.c = aldnVar;
        this.a = str;
        this.b = akyqVar;
    }

    @Override // defpackage.akyp
    public final void rW(akyq akyqVar) {
        if (akyqVar.g().b) {
            akyqVar.d(this);
            this.c.b(this.a, true);
            this.c.a.execute(new Runnable() { // from class: aldj
                @Override // java.lang.Runnable
                public final void run() {
                    aldk aldkVar = aldk.this;
                    aldkVar.c.e(aldkVar.a);
                }
            });
        }
    }
}
