package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aniz extends RuntimeException {
    public aniz(String str) {
        super(str);
    }

    public aniz(Throwable th) {
        super("Failed to read input", th);
    }
}
