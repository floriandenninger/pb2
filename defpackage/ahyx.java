package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahyx implements Runnable {
    public final /* synthetic */ ahyz a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahyx(ahyz ahyzVar, int i) {
        this.b = i;
        this.a = ahyzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a(true);
        } else if (i != 1) {
            this.a.b = false;
        } else {
            this.a.setVisibility(8);
        }
    }
}
