package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ruu implements rvj {
    final /* synthetic */ ruv a;

    public ruu(ruv ruvVar) {
        this.a = ruvVar;
    }

    @Override // defpackage.rvj
    public final int a() {
        return 100;
    }

    @Override // defpackage.rvj
    public final String b() {
        ArrayList<rut> x = rwh.x();
        Iterator it = this.a.u.iterator();
        while (it.hasNext()) {
            x.add(new rut((rvg) it.next()));
        }
        dsm dsmVar = this.a.B;
        ArrayList arrayList = new ArrayList(x.size());
        int i = 0;
        for (rut rutVar : x) {
            sba sbaVar = rutVar.a.a;
            i += rutVar.a();
            arrayList.add(rutVar);
        }
        StringBuilder sb = new StringBuilder();
        int i2 = dsmVar.c;
        if (i > 6) {
            sb.append("Showing ");
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sba sbaVar2 = ((rut) arrayList.get(i3)).a.a;
                sb.append(String.format("%s with %d data points", (String) sbaVar2.e(sbb.c, sbaVar2.b), Integer.valueOf(((rut) arrayList.get(i3)).a())));
                if (i3 == arrayList.size() - 2) {
                    sb.append(" and ");
                } else if (i3 < arrayList.size() - 2) {
                    sb.append(", ");
                }
            }
            sb.append(".");
        } else {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                rut rutVar2 = (rut) arrayList.get(i4);
                sba sbaVar3 = rutVar2.a.a;
                sb.append((String) sbaVar3.e(sbb.c, sbaVar3.b));
                sb.append(": ");
                List list = sbaVar3.a;
                saw b = rutVar2.a.b();
                saw a = rutVar2.a.a();
                for (int i5 = 0; i5 < list.size(); i5++) {
                    sb.append(String.format("%s at %s", (String) b.a(list.get(i5), i5, sbaVar3), (String) a.a(list.get(i5), i5, sbaVar3)));
                    if (i5 < list.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(". ");
            }
        }
        return sb.toString();
    }
}
