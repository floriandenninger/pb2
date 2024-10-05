package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class djb implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ djc b;

    public djb(djc djcVar, Runnable runnable) {
        this.b = djcVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.b.a) {
            Integer num = (Integer) this.b.a.get(this.a);
            if (num != null) {
                z = num.intValue() > 0;
                Integer valueOf = Integer.valueOf(num.intValue() - 1);
                if (valueOf.intValue() > 0) {
                    this.b.a.put(this.a, valueOf);
                } else {
                    this.b.a.remove(this.a);
                }
            }
        }
        if (z) {
            this.a.run();
        }
    }
}
