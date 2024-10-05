package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeks {
    public static final aelu a = new aelu(new byte[0], "", 0, 0, -1, false, false, "", 0, aelu.a);
    public final aeko i;
    public final aeko j;
    public final anhy k;
    public final anhy l;
    public final ExecutorService m;
    public final shf n;
    public final aekg p;
    public final afjf q;
    public volatile int t;
    public int u;
    private final aaea z;
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map c = new ConcurrentHashMap();
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map v = new ConcurrentHashMap();
    public final Map e = new ConcurrentHashMap();
    private aekq w = null;
    private final aekp x = new aekp(this);
    public final aekr f = new aekr(this);
    public final Map g = new ConcurrentHashMap();
    public final Set h = Collections.synchronizedSet(new HashSet());
    public final AtomicBoolean r = new AtomicBoolean();
    public boolean s = false;
    public final aekf o = new aekf();
    private final aekl y = new aekl(this);

    public aeks(ExecutorService executorService, shf shfVar, aaea aaeaVar, afjf afjfVar) {
        final int i = 0;
        this.m = executorService;
        this.n = shfVar;
        this.p = new aekg(aaeaVar);
        this.z = aaeaVar;
        this.q = afjfVar;
        final aeko aekoVar = new aeko();
        this.i = aekoVar;
        final aeko aekoVar2 = new aeko();
        this.j = aekoVar2;
        final int i2 = 1;
        this.k = aci.c(new aeu() { // from class: aeki
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                if (i2 == 0) {
                    aeko aekoVar3 = aekoVar;
                    aelu aeluVar = aeks.a;
                    return aekoVar3.c(aesVar);
                }
                aeko aekoVar4 = aekoVar;
                aelu aeluVar2 = aeks.a;
                return aekoVar4.c(aesVar);
            }
        });
        this.l = aci.c(new aeu() { // from class: aeki
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                if (i == 0) {
                    aeko aekoVar3 = aekoVar2;
                    aelu aeluVar = aeks.a;
                    return aekoVar3.c(aesVar);
                }
                aeko aekoVar4 = aekoVar2;
                aelu aeluVar2 = aeks.a;
                return aekoVar4.c(aesVar);
            }
        });
        this.u = 1;
    }

    private final synchronized aekk s(aelu aeluVar) {
        boolean z;
        z = this.s;
        return new aekk(aeluVar.c, aeluVar.d, z ? -1L : aeluVar.e, z ? aeluVar.f : -1L, aeluVar.j);
    }

    private final synchronized void t(aelu aeluVar, byte[] bArr, int i, int i2) {
        String str = aeluVar.c;
        int i3 = aeluVar.d;
        String.valueOf(str).length();
        this.o.a(aeluVar.c, aeluVar.d, aeluVar.b.length, aeluVar.i, aeke.DECRYPTED, this.q);
        aekk s = s(aeluVar);
        aeku aekuVar = (aeku) this.c.get(s);
        if (aekuVar == null) {
            aekuVar = new aejz(aeluVar.i);
            this.c.put(s, aekuVar);
            u(aeluVar.c, Integer.valueOf(aeluVar.d));
        }
        aekuVar.d(bArr, i, i2, aeluVar.k);
        if (aeluVar.h) {
            aekuVar.c();
        }
        notifyAll();
    }

    private final synchronized void u(String str, Integer num) {
        atsf atsfVar;
        Set hashSet;
        arfd a2 = this.z.a();
        if (a2 != null) {
            atcl atclVar = a2.i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            atsh atshVar = atclVar.d;
            if (atshVar == null) {
                atshVar = atsh.a;
            }
            atsfVar = atshVar.g;
            if (atsfVar == null) {
                atsfVar = atsf.b;
            }
        } else {
            atsfVar = atsf.b;
        }
        if (atsfVar.r) {
            if (this.v.containsKey(str)) {
                hashSet = (Set) this.v.get(str);
            } else {
                hashSet = new HashSet();
            }
            hashSet.add(num);
            this.v.put(str, hashSet);
        }
    }

    private final boolean v() {
        int i = this.u;
        boolean z = i == 1;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final ovu a(String str) {
        if (this.r.get()) {
            return null;
        }
        if (this.w == null && this.p.d) {
            this.x.c(str);
        }
        aekq aekqVar = this.w;
        if (aekqVar == null || aekqVar.c.n.d() - aekqVar.b > 8000 || !aekqVar.a.c.equals(str)) {
            return null;
        }
        return aekqVar.a;
    }

    public final synchronized Set b(String str) {
        Set hashSet;
        if (this.v.containsKey(str)) {
            hashSet = (Set) this.v.get(str);
        } else {
            hashSet = new HashSet();
        }
        return hashSet;
    }

    public final synchronized void c(aelu aeluVar) {
        afki.a(aeluVar.b);
        if (v()) {
            this.h.add(aeluVar.c);
            this.o.a(aeluVar.c, aeluVar.d, aeluVar.b.length, aeluVar.i, aeke.RECEIVED, this.q);
            aekk s = s(aeluVar);
            boolean contains = this.b.contains(s);
            if (!aeluVar.g && !contains) {
                byte[] bArr = aeluVar.b;
                t(aeluVar, bArr, 0, bArr.length);
                return;
            }
            this.y.a(aeluVar);
            if (contains) {
                return;
            }
            this.b.add(s);
        }
    }

    public final synchronized void d(ovj ovjVar) {
        if (v() && this.p.a) {
            int i = ovjVar.b;
            if ((i & 2) == 0 || (i & 1) == 0) {
                afsi.b(1, 8, "hostname_change_hint_missing_information");
            } else {
                this.g.put(ovjVar.d, new afff(new HashSet(ovjVar.e), ovjVar.c));
            }
        }
    }

    public final synchronized void e(ovu ovuVar) {
        if (v()) {
            int i = ovuVar.b;
            if ((i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0) {
                afsi.b(1, 8, "live_metadata_missing_information");
                return;
            }
            this.s = true;
            this.w = new aekq(this, ovuVar);
            this.x.b();
        }
    }

    public final synchronized void f(ovt ovtVar) {
        if (v()) {
            this.x.a(ovtVar);
        }
    }

    public final synchronized void g(ajcc ajccVar) {
        if (v()) {
            this.f.c(ajccVar);
        }
    }

    public final synchronized void h(aelq aelqVar) {
        aekn a2 = aekn.a(aelqVar.a, aelqVar.b, aelqVar.d);
        aelq aelqVar2 = (aelq) this.e.get(a2);
        if (aelqVar2 == null || aelqVar2.c != aelqVar.c) {
            this.e.put(a2, aelqVar);
        } else {
            afsi.b(1, 8, "duplicate_stream_metadata");
        }
    }

    public final synchronized void i(String str, int i, long j, long j2, String str2) {
        boolean z = this.s;
        this.d.add(new aekk(str, i, true != z ? j : -1L, true != z ? -1L : j2, str2));
        u(str, Integer.valueOf(i));
    }

    public final synchronized void j(ajcc ajccVar) {
        ajcc b = this.f.b();
        if (b != null && b.b.equals(ajccVar.b)) {
            this.f.d();
        }
    }

    public final synchronized void k() {
        this.r.set(true);
        this.c.clear();
        this.d.clear();
        int i = this.u;
        if (i == 0) {
            throw null;
        }
        if (i != 4) {
            Future future = this.y.a;
            if (future != null) {
                future.cancel(true);
            }
            this.b.clear();
            this.h.clear();
            this.v.clear();
            this.e.clear();
            this.w = null;
            this.x.b();
            this.f.d();
            this.u = 4;
            this.o.b();
            this.i.d();
            this.j.d();
            this.t = 0;
            notifyAll();
        }
    }

    public final synchronized void m(aelu aeluVar, byte[] bArr, int i, int i2) {
        t(aeluVar, bArr, i, i2);
    }

    public final synchronized void n() {
        this.u = 3;
        notifyAll();
    }

    public final boolean o(String str, int i, String str2) {
        if (this.c.size() + this.b.size() > 20) {
            return false;
        }
        for (aekk aekkVar : this.d) {
            if (aekkVar.a.equals(str) && aekkVar.b == i && TextUtils.equals(str2, aekkVar.c)) {
                return true;
            }
        }
        for (aekk aekkVar2 : this.c.keySet()) {
            if (aekkVar2.a.equals(str) && aekkVar2.b == i && TextUtils.equals(str2, aekkVar2.c)) {
                return true;
            }
        }
        for (aekk aekkVar3 : this.b) {
            if (aekkVar3.a.equals(str) && aekkVar3.b == i && TextUtils.equals(str2, aekkVar3.c)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean p() {
        int i;
        i = this.u;
        if (i == 0) {
            throw null;
        }
        return i != 4;
    }

    public final synchronized void q(byte[] bArr) {
        if (v()) {
            aekl aeklVar = this.y;
            if (aeklVar.c == null && aeklVar.a == null) {
                aeks aeksVar = aeklVar.b;
                aeklVar.c = new aeky(bArr);
                aeklVar.a = aeklVar.b.m.submit(aeklVar);
            }
        }
    }

    public final synchronized void r() {
        this.x.b();
    }

    public final synchronized void l() {
        int i = this.u;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            return;
        }
        this.x.b();
        this.f.d();
        aekl aeklVar = this.y;
        if (aeklVar.a == null) {
            this.u = 3;
            notifyAll();
        } else {
            aeklVar.a(a);
            this.u = 2;
        }
    }
}
