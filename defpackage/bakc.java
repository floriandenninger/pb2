package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bakc extends bakk {
    public static final bakc a = new bakc(0);
    public static final bakc b = new bakc(1);
    public static final bakc c = new bakc(2);
    public static final bakc d = new bakc(3);
    public static final bakc e = new bakc(Integer.MAX_VALUE);
    public static final bakc f = new bakc(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    private static final long serialVersionUID = 87525275727380862L;

    static {
        bamz v = aynu.v();
        bajy c2 = bajy.c();
        if (c2 == v.c) {
            return;
        }
        new bamz(v.a, v.b, c2);
    }

    private bakc(int i) {
        super(i);
    }

    public static bakc g(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new bakc(i) : d : c : b : a : e : f;
    }

    public static bakc h(baka bakaVar, baka bakaVar2) {
        return g(bajr.k.a(bajk.e(bakaVar)).a(((baju) bakaVar2).a, ((baju) bakaVar).a));
    }

    private Object readResolve() {
        return g(this.g);
    }

    @Override // defpackage.bakk, defpackage.bakb
    public final bajy e() {
        return bajy.c();
    }

    @Override // defpackage.bakk
    public final bajr f() {
        return bajr.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3);
        sb.append("PT");
        sb.append(valueOf);
        sb.append("S");
        return sb.toString();
    }
}
