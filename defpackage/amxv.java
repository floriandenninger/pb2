package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amxv extends Exception {
    public amxv(Throwable th, amye amyeVar, StackTraceElement[] stackTraceElementArr) {
        super(amyeVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
