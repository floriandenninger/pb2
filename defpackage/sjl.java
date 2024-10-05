package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sjl extends RuntimeException {
    public sjl(String str, StackTraceElement[] stackTraceElementArr) {
        super(str);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
