package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaka {
    public final amsx a;
    public final amsm b;
    public final vhj c;
    boolean d = false;
    private aalo e;

    public aaka(vhj vhjVar, Set set, aalo aaloVar) {
        this.c = vhjVar;
        this.a = amsx.p(set);
        this.e = aaloVar;
        amsj amsjVar = new amsj();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aajb aajbVar = (aajb) it.next();
            amsjVar.d(aajbVar.b, aajbVar);
        }
        this.b = amsjVar.c();
    }

    public static vim a(aajb aajbVar, aakt aaktVar, aaku aakuVar) {
        vin vinVar = new vin();
        vinVar.b("REPLACE INTO ");
        aajbVar.b(vinVar);
        vinVar.b(" VALUES(?");
        for (int i = 0; i < ((amvj) aajbVar.c).c; i++) {
            vinVar.b(", ?");
        }
        vinVar.b(")");
        vinVar.c(aaktVar.d());
        amru amruVar = aajbVar.c;
        int i2 = ((amvj) amruVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            aajc aajcVar = (aajc) amruVar.get(i3);
            aajcVar.c(vinVar, aajcVar.b(aaktVar, aakuVar));
        }
        return vinVar.a();
    }

    public final synchronized void b(viq viqVar) {
        aaku aakuVar;
        amsx amsxVar;
        amsx g;
        if (this.d) {
            return;
        }
        amsx amsxVar2 = this.a;
        amrw h = amrz.h();
        amxd listIterator = amsxVar2.listIterator();
        while (listIterator.hasNext()) {
            aajb aajbVar = (aajb) listIterator.next();
            h.g(aajbVar.a, aajbVar);
        }
        amrz c = h.c();
        amsx amsxVar3 = this.a;
        amrw h2 = amrz.h();
        amxd listIterator2 = amsxVar3.listIterator();
        while (listIterator2.hasNext()) {
            amru amruVar = ((aajb) listIterator2.next()).d;
            if (((amvj) amruVar).c > 0) {
                throw null;
            }
        }
        amrz c2 = h2.c();
        amsx amsxVar4 = this.a;
        amrw amrwVar = new amrw();
        amxd listIterator3 = amsxVar4.listIterator();
        while (listIterator3.hasNext()) {
            aajb aajbVar2 = (aajb) listIterator3.next();
            String str = aajbVar2.a;
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(aajbVar2.a);
            sb.append(" (entity_key TEXT PRIMARY KEY REFERENCES entity_table(key) ON DELETE CASCADE");
            amru amruVar2 = aajbVar2.c;
            int i = ((amvj) amruVar2).c;
            for (int i2 = 0; i2 < i; i2++) {
                aajc aajcVar = (aajc) amruVar2.get(i2);
                sb.append(", ");
                sb.append(aajcVar.a);
                sb.append(" ");
                int i3 = aajcVar.b;
                sb.append((Object) (i3 != 1 ? i3 != 2 ? "TEXT" : "REAL" : "INT"));
            }
            sb.append(")");
            String sb2 = sb.toString();
            if (aajbVar2.d.isEmpty()) {
                g = amvs.a;
            } else {
                amsv amsvVar = new amsv();
                amru amruVar3 = aajbVar2.d;
                if (((amvj) amruVar3).c <= 0) {
                    g = amsvVar.g();
                } else {
                    throw null;
                }
            }
            amrwVar.g(str, aajz.a(str, sb2, g));
        }
        amrz c3 = amrwVar.c();
        HashMap hashMap = new HashMap();
        amrp amrpVar = new amrp();
        int i4 = 0;
        Cursor b = viqVar.b("SELECT name, type, sql, tbl_name FROM sqlite_master WHERE sql NOT NULL", new String[0]);
        while (b.moveToNext()) {
            try {
                amrpVar.h(new aajy(b.getString(i4), b.getString(1), b.getString(2), b.getString(3)));
                i4 = 0;
            } catch (Throwable th) {
                if (b != null) {
                    try {
                        b.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        if (b != null) {
            b.close();
        }
        amru g2 = amrpVar.g();
        ampf u = ampf.u();
        int i5 = ((amvj) g2).c;
        for (int i6 = 0; i6 < i5; i6++) {
            aajy aajyVar = (aajy) g2.get(i6);
            if (aajyVar.b.equals("index") && aajyVar.a.startsWith("IDXQT_")) {
                u.p(aajyVar.d, new aajx(aajyVar.a, aajyVar.c));
            }
        }
        int i7 = ((amvj) g2).c;
        for (int i8 = 0; i8 < i7; i8++) {
            aajy aajyVar2 = (aajy) g2.get(i8);
            if (aajyVar2.b.equals("table") && aajyVar2.a.startsWith("QT_")) {
                Collection collection = (Collection) u.r().get(aajyVar2.a);
                String str2 = aajyVar2.a;
                String str3 = aajyVar2.c;
                if (collection == null) {
                    amsxVar = amvs.a;
                } else {
                    amsxVar = amsx.p(collection);
                }
                if (hashMap.put(str2, aajz.a(str2, str3, amsxVar)) != null) {
                    String str4 = aajyVar2.c;
                    throw new IllegalStateException(str4.length() != 0 ? "duplicate query table in db? ".concat(str4) : new String("duplicate query table in db? "));
                }
            }
        }
        amsv i9 = amsx.i();
        i9.j(c3.keySet());
        i9.j(hashMap.keySet());
        amsx g3 = i9.g();
        HashSet<String> hashSet = new HashSet();
        ArrayList<aajb> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        amxd listIterator4 = g3.listIterator();
        while (listIterator4.hasNext()) {
            String str5 = (String) listIterator4.next();
            aajz aajzVar = (aajz) c3.get(str5);
            aajz aajzVar2 = (aajz) hashMap.get(str5);
            if (aajzVar == null) {
                hashSet.add(str5);
            } else if (aajzVar2 == null) {
                aajb aajbVar3 = (aajb) c.get(str5);
                aajbVar3.getClass();
                arrayList.add(aajbVar3);
            } else if (aajzVar2.a.equals(aajzVar.a)) {
                amsx amsxVar5 = aajzVar2.b;
                amsx amsxVar6 = aajzVar.b;
                amrp amrpVar2 = new amrp();
                amxd it = amkq.al(amsxVar5, amsxVar6).iterator();
                while (it.hasNext()) {
                    amrpVar2.h(((aajx) it.next()).a);
                }
                arrayList2.addAll(amrpVar2.g());
                amsx amsxVar7 = aajzVar2.b;
                amsx amsxVar8 = aajzVar.b;
                amsv amsvVar2 = new amsv();
                amxd it2 = amkq.al(amsxVar8, amsxVar7).iterator();
                while (it2.hasNext()) {
                    whu whuVar = (whu) c2.get(((aajx) it2.next()).a);
                    whuVar.getClass();
                    amsvVar2.c(whuVar);
                }
                arrayList3.addAll(amsvVar2.g());
            } else {
                hashSet.add(str5);
                aajb aajbVar4 = (aajb) c.get(str5);
                aajbVar4.getClass();
                arrayList.add(aajbVar4);
            }
        }
        for (String str6 : hashSet) {
            vin vinVar = new vin();
            vinVar.b("DROP TABLE ");
            whu.af(vinVar, str6);
            viqVar.d(vinVar.a());
        }
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str7 = (String) arrayList2.get(i10);
            vin vinVar2 = new vin();
            vinVar2.b("DROP INDEX ");
            whu.af(vinVar2, str7);
            viqVar.d(vinVar2.a());
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            aajb aajbVar5 = (aajb) arrayList.get(i11);
            vin vinVar3 = new vin();
            vinVar3.b("CREATE TABLE ");
            aajbVar5.b(vinVar3);
            vinVar3.b(" (entity_key TEXT PRIMARY KEY REFERENCES entity_table(key) ON DELETE CASCADE");
            amru amruVar4 = aajbVar5.c;
            int i12 = ((amvj) amruVar4).c;
            for (int i13 = 0; i13 < i12; i13++) {
                aajc aajcVar2 = (aajc) amruVar4.get(i13);
                vinVar3.b(", ");
                aajcVar2.a(vinVar3);
                vinVar3.b(" ");
                int i14 = aajcVar2.b - 1;
                if (i14 == 0) {
                    vinVar3.b("INT");
                } else if (i14 != 1) {
                    vinVar3.b("TEXT");
                } else {
                    vinVar3.b("REAL");
                }
            }
            vinVar3.b(")");
            viqVar.d(vinVar3.a());
            arrayList3.addAll(aajbVar5.d);
        }
        amsj amsjVar = new amsj();
        for (aajb aajbVar6 : arrayList) {
            amsjVar.d(aajbVar6.b, aajbVar6);
        }
        amxd listIterator5 = ((amsm) amsjVar.c()).b.entrySet().listIterator();
        while (listIterator5.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator5.next();
            long b2 = ((aalu) this.e.a.get()).b((Class) entry.getKey());
            Collection collection2 = (Collection) entry.getValue();
            int i15 = 0;
            Cursor b3 = viqVar.b("SELECT key, entity, metadata FROM entity_table WHERE data_type=?", Long.toString(b2));
            while (b3.moveToNext()) {
                try {
                    aakt a = this.e.a(b3.getString(i15), b3.getBlob(1));
                    byte[] blob = b3.getBlob(2);
                    String d = a.d();
                    try {
                        aakuVar = aaku.a(blob);
                    } catch (aoob unused2) {
                        String valueOf = String.valueOf(d);
                        zga.b(valueOf.length() != 0 ? "QueryTableManager metadata read failure for ".concat(valueOf) : new String("QueryTableManager metadata read failure for "));
                        aakuVar = aaku.a;
                    }
                    Iterator it3 = collection2.iterator();
                    while (it3.hasNext()) {
                        viqVar.d(a((aajb) it3.next(), a, aakuVar));
                    }
                    i15 = 0;
                } catch (Throwable th2) {
                    if (b3 != null) {
                        try {
                            b3.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
            if (b3 != null) {
                b3.close();
            }
        }
        if (arrayList3.size() > 0) {
            new vin().b("CREATE INDEX ");
            throw null;
        }
        this.d = true;
    }
}
