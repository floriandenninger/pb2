package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeqv implements Runnable {
    public final /* synthetic */ aerf a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ aeqv(aerf aerfVar, long j, int i) {
        this.c = i;
        this.a = aerfVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.o(this.b);
            return;
        }
        if (i == 1) {
            this.a.g(new afih("unavailable.events", this.b, "PlayerEvents not available inside onEmbeddedMetadata"));
            return;
        }
        if (i == 2) {
            this.a.s(this.b);
            return;
        }
        if (i == 3) {
            this.a.t(this.b);
        } else if (i != 4) {
            this.a.y(this.b);
        } else {
            this.a.u(this.b);
        }
    }
}
