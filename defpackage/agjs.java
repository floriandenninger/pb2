package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjs {
    public final Executor a;
    public final agej b;
    public final agiv c;
    public final agjl d;
    public final agjv e;
    public final ConditionVariable f = new ConditionVariable();
    public final List g;
    public final aypy h;
    public volatile agka i;
    private final agik j;
    private final agjf k;
    private volatile boolean l;
    private final akpq m;

    public agjs(Executor executor, agej agejVar, agik agikVar, agjv agjvVar, agjf agjfVar, agiv agivVar, agjl agjlVar, agka agkaVar, akpq akpqVar, Set set, aypy aypyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = executor;
        this.b = agejVar;
        this.j = agikVar;
        this.e = agjvVar;
        this.k = agjfVar;
        this.c = agivVar;
        this.d = agjlVar;
        this.i = agkaVar;
        this.m = akpqVar;
        this.h = aypyVar;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.addAll(set);
        this.l = false;
        agjfVar.b(new agjq(this));
        agivVar.j(new agjp(this));
        agjlVar.g(new agjr(this));
    }

    private final void v() {
        this.f.block();
    }

    public final SQLiteDatabase a() {
        v();
        return this.j.a();
    }

    public final agjm b(String str) {
        return c().a(str);
    }

    public final agka c() {
        v();
        return this.i;
    }

    public final Collection d() {
        Collection values;
        agka c = c();
        synchronized (c.k) {
            values = c.c.values();
        }
        return values;
    }

    public final List e() {
        LinkedList linkedList;
        agka c = c();
        synchronized (c.k) {
            linkedList = new LinkedList();
            Iterator it = c.d.values().iterator();
            while (it.hasNext()) {
                linkedList.add(((agjz) it.next()).a());
            }
        }
        return linkedList;
    }

    public final List f() {
        LinkedList linkedList;
        agka c = c();
        synchronized (c.k) {
            linkedList = new LinkedList();
            Iterator it = c.b.values().iterator();
            while (it.hasNext()) {
                linkedList.add(((agjy) it.next()).e());
            }
        }
        return linkedList;
    }

    public final Set g(String str) {
        Set v;
        agka c = c();
        synchronized (c.k) {
            v = yjj.v(c.h, str);
        }
        return v;
    }

    public final void h(String str) {
        c().d(str);
    }

    public final void i(String str, String str2) {
        c().f(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x033c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d1 A[Catch: all -> 0x054d, TryCatch #11 {all -> 0x054d, blocks: (B:46:0x0103, B:47:0x0176, B:49:0x017e, B:51:0x0182, B:54:0x018c, B:57:0x0192, B:60:0x01a6, B:64:0x01b2, B:67:0x01b6, B:68:0x01c4, B:71:0x01d0, B:75:0x01d8, B:77:0x01db, B:79:0x01df, B:82:0x01e8, B:83:0x01f0, B:86:0x0215, B:91:0x021e, B:94:0x022a, B:97:0x0237, B:100:0x024b, B:103:0x0254, B:106:0x025d, B:109:0x0266, B:111:0x0270, B:112:0x0276, B:119:0x02e1, B:121:0x02f3, B:124:0x031c, B:126:0x0322, B:127:0x032f, B:130:0x02c5, B:132:0x02d1, B:133:0x02db, B:134:0x02d6, B:88:0x021a, B:181:0x0358, B:182:0x0367, B:184:0x036d, B:186:0x0377, B:188:0x037f, B:189:0x038d, B:191:0x0391, B:193:0x0399, B:194:0x039f, B:198:0x03a8, B:203:0x0386), top: B:45:0x0103, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d6 A[Catch: all -> 0x054d, TryCatch #11 {all -> 0x054d, blocks: (B:46:0x0103, B:47:0x0176, B:49:0x017e, B:51:0x0182, B:54:0x018c, B:57:0x0192, B:60:0x01a6, B:64:0x01b2, B:67:0x01b6, B:68:0x01c4, B:71:0x01d0, B:75:0x01d8, B:77:0x01db, B:79:0x01df, B:82:0x01e8, B:83:0x01f0, B:86:0x0215, B:91:0x021e, B:94:0x022a, B:97:0x0237, B:100:0x024b, B:103:0x0254, B:106:0x025d, B:109:0x0266, B:111:0x0270, B:112:0x0276, B:119:0x02e1, B:121:0x02f3, B:124:0x031c, B:126:0x0322, B:127:0x032f, B:130:0x02c5, B:132:0x02d1, B:133:0x02db, B:134:0x02d6, B:88:0x021a, B:181:0x0358, B:182:0x0367, B:184:0x036d, B:186:0x0377, B:188:0x037f, B:189:0x038d, B:191:0x0391, B:193:0x0399, B:194:0x039f, B:198:0x03a8, B:203:0x0386), top: B:45:0x0103, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0391 A[Catch: all -> 0x054d, TryCatch #11 {all -> 0x054d, blocks: (B:46:0x0103, B:47:0x0176, B:49:0x017e, B:51:0x0182, B:54:0x018c, B:57:0x0192, B:60:0x01a6, B:64:0x01b2, B:67:0x01b6, B:68:0x01c4, B:71:0x01d0, B:75:0x01d8, B:77:0x01db, B:79:0x01df, B:82:0x01e8, B:83:0x01f0, B:86:0x0215, B:91:0x021e, B:94:0x022a, B:97:0x0237, B:100:0x024b, B:103:0x0254, B:106:0x025d, B:109:0x0266, B:111:0x0270, B:112:0x0276, B:119:0x02e1, B:121:0x02f3, B:124:0x031c, B:126:0x0322, B:127:0x032f, B:130:0x02c5, B:132:0x02d1, B:133:0x02db, B:134:0x02d6, B:88:0x021a, B:181:0x0358, B:182:0x0367, B:184:0x036d, B:186:0x0377, B:188:0x037f, B:189:0x038d, B:191:0x0391, B:193:0x0399, B:194:0x039f, B:198:0x03a8, B:203:0x0386), top: B:45:0x0103, outer: #22 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j() {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjs.j():void");
    }

    public final void k(agnm agnmVar) {
        for (agfo agfoVar : this.g) {
        }
        agka c = c();
        synchronized (c.k) {
            if (c.a.get(agnmVar.g()) != null) {
                c.g(agnmVar);
            } else {
                boolean z = agnmVar.c;
                c.a.put(agnmVar.g(), new agjx(c, true != z ? agnmVar : null, true != z ? null : agnmVar));
            }
        }
    }

    public final void l(String str) {
        agka c = c();
        synchronized (c.k) {
            zhq.m(str);
            c.c.remove(str);
            Set set = (Set) c.g.remove(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    yjj.x(c.f, (String) it.next(), str);
                }
            }
        }
    }

    public final void m(String str) {
        agka c = c();
        synchronized (c.k) {
            zhq.m(str);
            c.a.remove(str);
        }
        for (agfo agfoVar : this.g) {
        }
    }

    public final void n(String str) {
        agka c = c();
        synchronized (c.k) {
            zhq.m(str);
            agjy agjyVar = (agjy) c.b.remove(str);
            c.e.remove(str);
            if (agjyVar != null) {
                c.l.b(agjyVar);
            }
        }
        for (agfo agfoVar : this.g) {
        }
    }

    public final boolean o(agnm agnmVar, List list) {
        agjm a;
        if (agnmVar != null) {
            agna c = agnmVar.c(list);
            if (c == null) {
                return false;
            }
            String str = c.a;
            if (agnmVar.l == null && str != null && (a = this.i.a(agnmVar.g())) != null) {
                String str2 = c.a;
                agnl d = agnmVar.d();
                d.e = str2;
                a.g(d.a());
                agjf agjfVar = this.k;
                String g = agnmVar.g();
                int a2 = agnmVar.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("storage_id", str);
                long update = agjfVar.c.a().update("streams", contentValues, "video_id = ? AND itag = ?", new String[]{g, Integer.toString(a2)});
                if (update != 1) {
                    StringBuilder sb = new StringBuilder(75);
                    sb.append("Update stream transfer_started_timestamp affected ");
                    sb.append(update);
                    sb.append(" rows");
                    throw new SQLException(sb.toString());
                }
            }
        }
        return true;
    }

    public final agjw p(String str) {
        return c().i(str);
    }

    public final agjy q(String str) {
        return c().j(str);
    }

    public final agjz r(String str) {
        agjz agjzVar;
        agka c = c();
        synchronized (c.k) {
            zhq.m(str);
            agjzVar = (agjz) c.d.get(str);
        }
        return agjzVar;
    }

    public final void s(agng agngVar, List list, atrx atrxVar, int i, long j, long j2, int i2) {
        c().l(agngVar, list, atrxVar, j, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(agnp agnpVar, atrx atrxVar, int i, byte[] bArr, agnf agnfVar, agno agnoVar, long j) {
        c().k(agnpVar, atrxVar, i, bArr, agnfVar, agnoVar, j);
        for (agfo agfoVar : this.g) {
            agnpVar.f();
            ((agms) agfoVar.a.m.get()).a();
        }
    }

    public final void u(bagd bagdVar, List list, List list2, int i) {
        c().m(bagdVar, list, list2, i);
    }
}
