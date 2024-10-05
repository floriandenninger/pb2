package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anih extends anfi implements Runnable {
    private final Runnable a;

    public anih(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            e(th);
            throw amnz.a(th);
        }
    }
}
