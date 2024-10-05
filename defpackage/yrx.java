package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yrx {
    public static final yrx a = new yrx();
    public final Uri[] b;

    private yrx() {
        this.b = null;
    }

    public yrx(Uri[] uriArr) {
        uriArr.getClass();
        this.b = uriArr;
        amkq.F(uriArr.length > 0, "No prewarming urls provided");
        for (Uri uri : uriArr) {
            uri.getClass();
        }
    }

    public final boolean a() {
        Uri[] uriArr = this.b;
        return uriArr != null && uriArr.length > 0;
    }
}
