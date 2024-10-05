package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pnr extends IOException {
    public final boolean a;
    public final int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public pnr(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static pnr a(String str, Throwable th) {
        return new pnr(str, th, true, 1);
    }

    public static pnr b(String str, Throwable th) {
        return new pnr(str, th, true, 0);
    }

    public static pnr c(String str) {
        return new pnr(str, null, false, 1);
    }

    public static pnr d(Throwable th) {
        return new pnr(null, th, true, 4);
    }
}
