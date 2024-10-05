package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txr extends Exception {
    public txr(String str, Throwable th) {
        super(str.length() != 0 ? "Column not found:".concat(str) : new String("Column not found:"), th);
    }
}
