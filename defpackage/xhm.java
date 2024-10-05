package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhm implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ List b;
    final /* synthetic */ boolean c;
    final /* synthetic */ xhn d;

    public xhm(xhn xhnVar, Uri uri, List list, boolean z) {
        this.d = xhnVar;
        this.a = uri;
        this.b = list;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String.valueOf(String.valueOf(this.a)).length();
        afug h = this.d.h(this.a, this.b, this.c);
        aamp aampVar = this.d.e;
        if (aampVar != null) {
            h.d = aampVar.b();
            h.e = this.d.e.a();
        }
        xhk xhkVar = this.d.d;
        cnk cnkVar = afxi.a;
        if (xhkVar.a.matcher(h.b.toString()).find()) {
            xhkVar.b.a(h, cnkVar);
        } else {
            xhkVar.b(h, cnkVar);
        }
    }
}
