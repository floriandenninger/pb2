package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aire {
    public final Executor a;
    public final ate b;
    public final ptk c;
    public ath d;
    public final int e;
    public volatile boolean f = false;
    public Thread g;

    public aire(Executor executor, afhf afhfVar, ptk ptkVar, Uri uri, int i, String str) {
        this.a = executor;
        this.b = new bga(afhfVar.a(), ptkVar, -10);
        this.c = ptkVar;
        if (uri != null && ("https".equals(uri.getScheme()) || "http".equals(uri.getScheme()))) {
            if (!TextUtils.isEmpty(str)) {
                zhy b = zhy.b(uri);
                b.h("cpn", str);
                uri = b.a();
            }
            this.d = new ath(uri);
        }
        this.e = i;
    }
}
