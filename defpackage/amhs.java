package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amhs extends Exception {
    public amhs() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public amhs(byte[] bArr) {
    }
}
