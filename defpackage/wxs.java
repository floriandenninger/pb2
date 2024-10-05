package defpackage;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxs implements wyi, woa {
    final ajun a = new ajun((short[]) null);
    private final azrw b;
    private final azrw c;
    private final wwm d;
    private final yfl e;

    public wxs(azrw azrwVar, azrw azrwVar2, yfl yflVar, wwm wwmVar, byte[] bArr) {
        this.b = azrwVar;
        this.c = azrwVar2;
        this.e = yflVar;
        this.d = wwmVar;
    }

    private final void f(List list) {
        if (wbs.l((aaea) this.c.get())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xgv xgvVar = (xgv) it.next();
                xev xevVar = xgvVar.d;
                if (xevVar == null || !xevVar.g.containsKey(xgvVar.b)) {
                    xgh xghVar = xgvVar.c;
                    xev xevVar2 = xgvVar.d;
                    String valueOf = String.valueOf(xgvVar.b.b().name());
                    whu.m(xghVar, xevVar2, valueOf.length() != 0 ? "Ping migration no associated ping bindings for activated trigger: ".concat(valueOf) : new String("Ping migration no associated ping bindings for activated trigger: "));
                } else {
                    Iterator it2 = ((List) xgvVar.d.g.get(xgvVar.b)).iterator();
                    while (it2.hasNext()) {
                        try {
                            this.e.a(this.d.a(xgvVar.c, xgvVar.d, xgvVar.e, (aoye) it2.next()));
                        } catch (MalformedURLException | wnw | wxe e) {
                            xgh xghVar2 = xgvVar.c;
                            xev xevVar3 = xgvVar.d;
                            String valueOf2 = String.valueOf(e.getMessage());
                            whu.m(xghVar2, xevVar3, valueOf2.length() != 0 ? "Ping migration failed to send ping".concat(valueOf2) : new String("Ping migration failed to send ping"));
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.woa
    public final void b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if (xgxVar instanceof xby) {
                xby xbyVar = (xby) xgxVar;
                if (xgvVar.c.c() != apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (TextUtils.equals(xbyVar.a, str)) {
                        arrayList.add(xgvVar);
                    }
                } else {
                    arrayList2.add(xgvVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wyh) this.b.get()).r(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        f(arrayList2);
    }

    @Override // defpackage.woa
    public final void d(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if (xgxVar instanceof xbz) {
                xbz xbzVar = (xbz) xgxVar;
                if (xgvVar.c.c() != apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (TextUtils.equals(xbzVar.a, str)) {
                        arrayList.add(xgvVar);
                    }
                } else {
                    arrayList2.add(xgvVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wyh) this.b.get()).r(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        f(arrayList2);
    }

    @Override // defpackage.woa
    public final void e(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if (xgxVar instanceof xcd) {
                xcd xcdVar = (xcd) xgxVar;
                if (xgvVar.c.c() != apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) {
                    if (TextUtils.equals(xcdVar.a, str)) {
                        arrayList.add(xgvVar);
                    }
                } else {
                    arrayList2.add(xgvVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wyh) this.b.get()).r(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        f(arrayList2);
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.a.v(xgxVar.c());
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.a.y(xgxVar.c())) {
            String str = xghVar.a;
            throw new wxf(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        }
        if ((xgxVar instanceof xcd) || (xgxVar instanceof xbz) || (xgxVar instanceof xby)) {
            this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
            return;
        }
        String str2 = xghVar.a;
        String name = xgxVar.b().name();
        StringBuilder sb = new StringBuilder(str2.length() + 101 + String.valueOf(name).length());
        sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
        sb.append(str2);
        sb.append(" of type ");
        sb.append(name);
        sb.append(" in ActiveViewEventTriggerAdapter");
        throw new wxf(sb.toString());
    }
}
