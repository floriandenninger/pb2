package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aequ implements Runnable {
    public final /* synthetic */ aerf a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ aequ(aerf aerfVar, int i, int i2) {
        this.c = i2;
        this.a = aerfVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.x(this.b);
        } else if (i != 1) {
            this.a.b(this.b);
        } else {
            this.a.c(this.b);
        }
    }
}
