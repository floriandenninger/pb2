package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class bo {
    public final en a;
    public final aio b;

    public bo(en enVar, aio aioVar) {
        this.a = enVar;
        this.b = aioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        en enVar = this.a;
        if (enVar.b.remove(this.b) && enVar.b.isEmpty()) {
            enVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        int q = ej.q(this.a.a.O);
        int i = this.a.e;
        return q == i || !(q == 2 || i == 2);
    }
}
