package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxp {
    public static final baac a = new baac("COMPLETING_ALREADY");
    public static final baac b = new baac("COMPLETING_WAITING_CHILDREN");
    public static final baac c = new baac("COMPLETING_RETRY");
    public static final baac d = new baac("TOO_LATE_TO_CANCEL");
    public static final baac e = new baac("SEALED");
    public static final azwx f;

    static {
        new azwx(false);
        f = new azwx(true);
    }

    public static final Object a(Object obj) {
        return obj instanceof azxe ? new azuj((azxe) obj) : obj;
    }
}
