package defpackage;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyv {
    private final wod a;
    private final xhk b;
    private final xgh c;
    private final xev d;
    private final Set e = new HashSet();
    private final wqd f;
    private final ywt g;

    public wyv(wqd wqdVar, wod wodVar, xhk xhkVar, ywt ywtVar, xgh xghVar, xev xevVar, byte[] bArr) {
        this.f = wqdVar;
        this.a = wodVar;
        this.b = xhkVar;
        this.g = ywtVar;
        this.c = xghVar;
        this.d = xevVar;
    }

    private final void d(int i, int i2, boolean z, afxe... afxeVarArr) {
        ArrayList<aoye> arrayList;
        List<aoye> list = (List) this.g.a.get(Integer.valueOf(i));
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (aoye aoyeVar : list) {
                if (i2 >= aoyeVar.d && (!z || !this.e.contains(aoyeVar))) {
                    arrayList2.add(aoyeVar);
                }
            }
            arrayList = arrayList2;
        }
        for (aoye aoyeVar2 : arrayList) {
            this.e.add(aoyeVar2);
            try {
                try {
                    try {
                        this.f.b(this.b, aoyeVar2, this.a.a(wbs.ai(aoyeVar2.c), afxeVarArr));
                    } catch (wxe e) {
                        xgh xghVar = this.c;
                        xev xevVar = this.d;
                        String valueOf = String.valueOf(e.getMessage());
                        whu.m(xghVar, xevVar, valueOf.length() != 0 ? "Failed to log the ping: ".concat(valueOf) : new String("Failed to log the ping: "));
                    }
                } catch (wnw e2) {
                    xgh xghVar2 = this.c;
                    xev xevVar2 = this.d;
                    String valueOf2 = String.valueOf(e2.getMessage());
                    whu.m(xghVar2, xevVar2, valueOf2.length() != 0 ? "Failed to apply macro: ".concat(valueOf2) : new String("Failed to apply macro: "));
                }
            } catch (MalformedURLException unused) {
                whu.m(this.c, this.d, String.format("Badly formed uri in ABR path: %s", aoyeVar2.c));
            }
        }
    }

    public final void a(int i, afxe... afxeVarArr) {
        d(i, Integer.MAX_VALUE, false, afxeVarArr);
    }

    public final void b(int i, afxe... afxeVarArr) {
        d(i, Integer.MAX_VALUE, true, afxeVarArr);
    }

    public final void c(int i, afxe... afxeVarArr) {
        d(14, i, true, afxeVarArr);
    }
}
