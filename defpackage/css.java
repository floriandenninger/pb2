package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class css implements Runnable {
    final /* synthetic */ csv a;
    private final dby b;
    private final /* synthetic */ int c;

    public css(csv csvVar, dby dbyVar, int i) {
        this.c = i;
        this.a = csvVar;
        this.b = dbyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        crw crwVar;
        if (this.c == 0) {
            synchronized (this.b.a()) {
                synchronized (this.a) {
                    if (this.a.a.d(this.b)) {
                        this.a.h.d();
                        csv csvVar = this.a;
                        try {
                            this.b.e(csvVar.h, csvVar.j);
                            this.a.g(this.b);
                        } finally {
                        }
                    }
                    this.a.c();
                }
            }
            return;
        }
        synchronized (this.b.a()) {
            synchronized (this.a) {
                if (this.a.a.d(this.b)) {
                    csv csvVar2 = this.a;
                    try {
                        this.b.d(csvVar2.f);
                    } finally {
                    }
                }
                this.a.c();
            }
        }
    }
}
