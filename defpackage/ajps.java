package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajps {
    final /* synthetic */ ajpt a;
    private final wv b;
    private final wv c;
    private final ajqe d;
    private final ajpq e;
    private boolean f = false;
    private boolean g = false;

    public ajps(ajpt ajptVar, wv wvVar, wv wvVar2, ajqe ajqeVar, ajpq ajpqVar) {
        this.a = ajptVar;
        this.b = wvVar;
        this.c = wvVar2;
        this.d = ajqeVar;
        this.e = ajpqVar;
    }

    private final void b() {
        if (this.f && this.g) {
            this.e.a.remove(this.d);
            this.e.b.remove(this.d);
            this.a.a();
        }
    }

    public final void a(wv wvVar) {
        wv wvVar2 = this.b;
        if (wvVar == wvVar2) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.c.remove(wvVar2);
            this.a.l(this.b);
            b();
            return;
        }
        wv wvVar3 = this.c;
        if (wvVar != wvVar3 || this.g) {
            return;
        }
        this.g = true;
        this.e.c.remove(wvVar3);
        this.a.l(this.c);
        b();
    }
}
