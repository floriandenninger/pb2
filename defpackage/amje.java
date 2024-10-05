package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amje implements Runnable {
    final /* synthetic */ amir a;
    final /* synthetic */ Runnable b;

    public amje(amir amirVar, Runnable runnable) {
        this.a = amirVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amir e = amjw.e(this.a);
        try {
            this.b.run();
        } finally {
            amjw.e(e);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
