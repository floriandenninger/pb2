package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afzr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afzu b;

    public afzr(afzu afzuVar, String str) {
        this.b = afzuVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            ajce ajceVar = (ajce) this.b.b.get(this.a);
            if (ajceVar != null) {
                this.b.a.lt(ajceVar);
            }
        }
    }
}
