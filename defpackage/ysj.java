package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysj {
    public String a;
    public ysi b;
    public int c;
    private abgu d;

    private final abgu d() {
        if (this.d == null) {
            this.d = yse.c();
        }
        return this.d;
    }

    public final ysk a() {
        abgu abguVar;
        ysi ysiVar = this.b;
        if (ysiVar != null) {
            String str = ysiVar.c;
            if (!TextUtils.isEmpty(str) && ((abguVar = this.d) == null || !abguVar.b("Content-Type"))) {
                b("Content-Type", str);
            }
            if (this.b.f()) {
                abgu abguVar2 = this.d;
                if (abguVar2 == null || !abguVar2.b("Transfer-Encoding")) {
                    b("Transfer-Encoding", "chunked");
                }
            } else {
                abgu abguVar3 = this.d;
                if (abguVar3 == null || !abguVar3.b("Content-Length")) {
                    b("Content-Length", Long.toString(this.b.b));
                }
            }
        }
        abgu abguVar4 = this.d;
        return new ysk(this.c, this.a, abguVar4 != null ? abguVar4.a() : yse.a, this.b);
    }

    public final void b(String str, String str2) {
        d().d(str, str2);
    }

    public final void c(String str, String str2) {
        abgu d = d();
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) ((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
        d.d(str, str2);
    }
}
