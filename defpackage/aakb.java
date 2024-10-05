package defpackage;

import android.database.Cursor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aakb extends aajj {
    private final aakl a;
    private final String b;
    private final aoqa c;

    public aakb(aakl aaklVar, String str, aoqa aoqaVar) {
        this.a = aaklVar;
        this.b = str;
        this.c = aoqaVar;
    }

    @Override // defpackage.aajj
    public final void b(aaka aakaVar, viq viqVar, amrp amrpVar) {
        amrz c;
        if (aalj.d(this.a.c(viqVar, this.b).d, this.c)) {
            try {
                String str = this.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(str);
                amsv amsvVar = new amsv();
                while (!arrayDeque.isEmpty()) {
                    String str2 = (String) arrayDeque.remove();
                    vin vinVar = new vin();
                    vinVar.b("SELECT child_entity_key FROM entity_associations WHERE child_entity_key IN (SELECT DISTINCT child_entity_key FROM entity_associations WHERE parent_entity_key=?) GROUP BY child_entity_key HAVING COUNT(1) = 1");
                    vinVar.c(str2);
                    amsv amsvVar2 = new amsv();
                    Cursor a = viqVar.a(vinVar.a());
                    while (a.moveToNext()) {
                        try {
                            amsvVar2.c(a.getString(0));
                        } catch (Throwable th) {
                            if (a != null) {
                                try {
                                    a.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (a != null) {
                        a.close();
                    }
                    arrayDeque.addAll(amsvVar2.g());
                    viqVar.e("DELETE FROM entity_associations WHERE parent_entity_key=?", str2);
                    amsvVar.c(str2);
                }
                amsx g = amsvVar.g();
                if (amrpVar != null) {
                    aakl aaklVar = this.a;
                    if (g.isEmpty()) {
                        c = amvo.b;
                    } else {
                        amrw amrwVar = new amrw();
                        try {
                            Iterator<E> it = g.iterator();
                            vin a2 = aakl.a();
                            a2.b(" IN (?");
                            a2.c((String) it.next());
                            while (it.hasNext()) {
                                a2.b(",?");
                                a2.c((String) it.next());
                            }
                            a2.b(")");
                            Cursor a3 = viqVar.a(a2.a());
                            while (a3.moveToNext()) {
                                try {
                                    aaln d = aaklVar.d(a3);
                                    aakt aaktVar = d.b;
                                    aaktVar.getClass();
                                    amrwVar.g(aaktVar.d(), d);
                                } catch (Throwable th2) {
                                    if (a3 != null) {
                                        try {
                                            a3.close();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            c = amrwVar.c();
                            if (a3 != null) {
                                a3.close();
                            }
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw aaiq.a(e, 3);
                        }
                    }
                    for (aaln aalnVar : c.values()) {
                        aakt aaktVar2 = aalnVar.b;
                        if (aaktVar2 != null) {
                            aakx a4 = aakz.a();
                            a4.c(aaktVar2.d());
                            a4.a = aaktVar2;
                            a4.d(aalnVar.c);
                            a4.b(aaku.a);
                            amrpVar.h(a4.a());
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = g.iterator();
                sb.append("key IN(?");
                arrayList.add((String) it2.next());
                while (it2.hasNext()) {
                    sb.append(", ?");
                    arrayList.add((String) it2.next());
                }
                sb.append(")");
                String sb2 = sb.toString();
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                viq.c();
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 31);
                sb3.append("DELETE FROM ");
                sb3.append("entity_table");
                sb3.append(" WHERE ");
                sb3.append(sb2);
                amil l = amjw.l(sb3.toString());
                try {
                    viqVar.b.delete("entity_table", sb2, strArr);
                    l.close();
                } catch (Throwable th3) {
                    try {
                        l.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw aaiq.c(e2, -1);
            }
        }
    }
}
