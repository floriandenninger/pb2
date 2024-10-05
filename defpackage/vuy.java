package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vuy extends Exception {
    public vuy(Exception exc) {
        super(exc);
    }

    public vuy(String str) {
        super(str);
    }

    public vuy(Exception exc, byte[] bArr) {
        super("Failed to build metadata from Movie", exc);
    }
}
