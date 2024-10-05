package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baai extends baaj {
    public static final baai b;
    public static final azwj d;

    static {
        baai baaiVar = new baai();
        b = baaiVar;
        d = new baak(baaiVar, ayep.w("kotlinx.coroutines.io.parallelism", azuj.c(64, baad.a), 0, 0, 12));
    }

    private baai() {
        super(baap.b, baap.c, baap.d);
    }

    @Override // defpackage.baaj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.baaj, defpackage.azwj
    public final String toString() {
        return "Dispatchers.Default";
    }
}
