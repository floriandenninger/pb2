package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rsj extends Exception {
    public final int a;

    public rsj(int i, String str) {
        this(i, str, null);
    }

    public rsj(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
