package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoqb extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public aoqb() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final aoob a() {
        return new aoob(getMessage());
    }
}
