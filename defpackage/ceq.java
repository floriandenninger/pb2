package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ceq extends Throwable {
    public ceq() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
