package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agdx implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ agdy b;
    private final /* synthetic */ int c;

    public agdx(agdy agdyVar, String str, int i) {
        this.c = i;
        this.b = agdyVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            agof agofVar = (agof) this.b.c.get();
            if (this.a.equals(agofVar.d())) {
                ((agrn) this.b.d.get()).a(this.a, agofVar.a());
                return;
            }
            return;
        }
        agof agofVar2 = (agof) this.b.c.get();
        if (this.a.equals(agofVar2.d())) {
            ((agrn) this.b.d.get()).d(this.a, agofVar2.a());
        }
    }
}
