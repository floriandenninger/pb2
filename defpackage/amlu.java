package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amlu extends amlz {
    public static final amlu a = new amlu();

    public amlu() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.ammd
    public final boolean b(char c) {
        return c <= 127;
    }
}
