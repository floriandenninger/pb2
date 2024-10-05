package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajgq {
    private final Object a = new Object();
    private volatile ajhe b = null;
    private final azrw c;

    public ajgq(azrw azrwVar) {
        this.c = azrwVar;
    }

    public final ajhe a() {
        ajhe ajheVar = this.b;
        if (ajheVar == null) {
            synchronized (this.a) {
                ajheVar = ((ajgp) this.c).get();
                this.b = ajheVar;
            }
        }
        return ajheVar;
    }
}
