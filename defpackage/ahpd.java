package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpd implements Runnable {
    public final /* synthetic */ ahpe a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahpd(ahpe ahpeVar, int i) {
        this.b = i;
        this.a = ahpeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.q(ahqo.LOGGED_ATTACH_PLAYER);
        } else {
            this.a.q(ahqo.LOGGED_ATTACH_WATCH_NEXT);
        }
    }
}
