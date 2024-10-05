package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abgt implements Runnable {
    final /* synthetic */ abgv a;

    public abgt(abgv abgvVar) {
        this.a = abgvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d.isEmpty()) {
            return;
        }
        abgu abguVar = (abgu) this.a.d.remove();
        int i = 1;
        while (true) {
            abgv abgvVar = this.a;
            if (i >= abgvVar.f || abgvVar.d.isEmpty()) {
                break;
            }
            abguVar.a.addAll(((abgu) this.a.d.remove()).a);
            i++;
        }
        this.a.h(abguVar);
        this.a.d.size();
        abgv abgvVar2 = this.a;
        abgvVar2.c.postDelayed(this, abgvVar2.e);
    }
}
