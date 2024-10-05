package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vig extends anfm implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final vho b;

    public vig(vho vhoVar) {
        this.b = vhoVar;
    }

    protected abstract void a(vho vhoVar);

    @Override // defpackage.anfm
    public final String b() {
        String str = this.b.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
        sb.append("query=[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            String valueOf = String.valueOf(this.b.b);
            amil l = amjw.l(valueOf.length() != 0 ? "Query: ".concat(valueOf) : new String("Query: "));
            try {
                a(this.b);
                l.close();
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            e(th2);
        }
    }
}
