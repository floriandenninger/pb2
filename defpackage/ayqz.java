package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayqz extends ayqy {
    private static final long serialVersionUID = -8219729196779211169L;

    public ayqz(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.ayqy
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        boolean e = e();
        String valueOf = String.valueOf(get());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("RunnableDisposable(disposed=");
        sb.append(e);
        sb.append(", ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
