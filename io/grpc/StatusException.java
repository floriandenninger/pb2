package io.grpc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final Status a;
    private final boolean b;

    public StatusException(Status status) {
        super(Status.e(status), status.r);
        this.a = status;
        this.b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (!this.b) {
            return this;
        }
        return super.fillInStackTrace();
    }
}
