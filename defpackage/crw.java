package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crw extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public crw(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
