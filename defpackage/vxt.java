package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxt extends Exception {
    public vxt(String str, Object... objArr) {
        super(String.format(str, objArr));
    }

    public vxt(Throwable th) {
        super(th);
    }
}
