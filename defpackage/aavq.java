package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavq {
    public final arlc a;
    public aavt b;

    public aavq(arlc arlcVar) {
        arlcVar.getClass();
        this.a = arlcVar;
    }

    public final byte[] a() {
        return this.a.f.I();
    }

    public aavq(String str) {
        amkq.E(!TextUtils.isEmpty(str));
        this.a = (arlc) adyu.dv(str, arlc.a.getParserForType());
    }
}
