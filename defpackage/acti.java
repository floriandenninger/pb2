package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class acti implements ecy {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final afsy f;
    private volatile aqht g;

    public acti(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, afsy afsyVar, azrw azrwVar5) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        this.e = azrwVar4;
        afsyVar.getClass();
        this.f = afsyVar;
        azrwVar5.getClass();
        this.d = azrwVar5;
    }

    private static aqht b(aaea aaeaVar) {
        arfd a = aaeaVar.a();
        if (a != null && (a.b & 524288) != 0) {
            asuj asujVar = a.m;
            if (asujVar == null) {
                asujVar = asuj.a;
            }
            if ((asujVar.b & 4) != 0) {
                asuj asujVar2 = a.m;
                if (asujVar2 == null) {
                    asujVar2 = asuj.a;
                }
                aqht aqhtVar = asujVar2.d;
                return aqhtVar == null ? aqht.a : aqhtVar;
            }
        }
        return aqht.a;
    }

    @Override // defpackage.ecy
    public final void a(String str, Map map) {
        if (this.g == null) {
            this.g = b((aaea) this.d.get());
        }
        if (this.g.c && map != null && "process".equals(map.get("action"))) {
            return;
        }
        zhy b = zhy.b(Uri.parse(esv.f(str, map)));
        ((afqj) this.c.get()).d(b);
        b.h("proc", String.valueOf(yjk.o()));
        String uri = b.a().toString();
        if (this.g == null) {
            this.g = b((aaea) this.d.get());
        }
        acth acthVar = new acth(uri, this.g.d ? yvn.LOW : yvn.NORMAL, (Set) this.e.get(), this.f.c(), afxi.a);
        if (((ysy) this.b.get()).o()) {
            String valueOf = String.valueOf(acthVar.d);
            if (valueOf.length() != 0) {
                "Pinging ".concat(valueOf);
            }
            ((ysl) this.a.get()).a(acthVar);
        }
    }
}
