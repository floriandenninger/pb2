package defpackage;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phy implements phg {
    private static final HashSet e = new HashSet();
    public final File a;
    public final phk b;
    public final php c;
    public phe d;
    private final HashMap f;
    private final Random g;
    private final boolean h;
    private long i;
    private boolean j;

    public phy(File file, phk phkVar, byte[] bArr, boolean z) {
        php phpVar = new php(file, bArr, z);
        if (v(file)) {
            this.a = file;
            this.b = phkVar;
            this.c = phpVar;
            this.f = new HashMap();
            this.g = new Random();
            this.h = phkVar.g();
            ConditionVariable conditionVariable = new ConditionVariable();
            new phx(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final void r(phz phzVar) {
        this.c.b(phzVar.a).c.add(phzVar);
        this.i += phzVar.c;
        ArrayList arrayList = (ArrayList) this.f.get(phzVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((phf) arrayList.get(size)).a(this, phzVar);
                }
            }
        }
        this.b.a(this, phzVar);
    }

    private final void s(phl phlVar) {
        phm a = this.c.a(phlVar.a);
        if (a == null || !a.c.remove(phlVar)) {
            return;
        }
        phlVar.e.delete();
        this.i -= phlVar.c;
        this.c.c(a.b);
        ArrayList arrayList = (ArrayList) this.f.get(phlVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((phf) arrayList.get(size)).c(phlVar);
                }
            }
        }
        this.b.c(phlVar);
    }

    private final void t() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((phm) it.next()).c.iterator();
            while (it2.hasNext()) {
                phl phlVar = (phl) it2.next();
                if (phlVar.e.length() != phlVar.c) {
                    arrayList.add(phlVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            s((phl) arrayList.get(i));
        }
    }

    private static synchronized void u(File file) {
        synchronized (phy.class) {
            e.remove(file.getAbsoluteFile());
        }
    }

    private static synchronized boolean v(File file) {
        boolean add;
        synchronized (phy.class) {
            add = e.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // defpackage.phg
    public final synchronized long a() {
        if (this.j) {
            return 0L;
        }
        return this.i;
    }

    @Override // defpackage.phg
    public final synchronized phq d(String str) {
        if (this.j) {
            return phr.a;
        }
        phm a = this.c.a(str);
        return a != null ? a.d : phr.a;
    }

    @Override // defpackage.phg
    public final synchronized File e(String str, long j, long j2) {
        if (this.j) {
            return null;
        }
        p();
        phm a = this.c.a(str);
        pse.c(a);
        pse.g(a.e);
        if (!this.a.exists()) {
            this.a.mkdirs();
            t();
        }
        this.b.h(this, j2);
        File file = new File(this.a, Integer.toString(this.g.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return phz.e(file, a.a, j, System.currentTimeMillis());
    }

    @Override // defpackage.phg
    public final synchronized NavigableSet f(String str) {
        TreeSet treeSet;
        if (this.j) {
            return new TreeSet();
        }
        phm a = this.c.a(str);
        if (a != null && !a.b()) {
            treeSet = new TreeSet((Collection) a.c);
            return treeSet;
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    @Override // defpackage.phg
    public final synchronized Set g() {
        if (this.j) {
            return new HashSet();
        }
        return new HashSet(this.c.a.keySet());
    }

    @Override // defpackage.phg
    public final synchronized void h(File file, long j) {
        if (this.j) {
            return;
        }
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            phz f = phz.f(file, j, this.c);
            pse.c(f);
            phm a = this.c.a(f.a);
            pse.c(a);
            pse.g(a.e);
            long K = muf.K(a.d);
            if (K != -1) {
                pse.g(f.b + f.c <= K);
            }
            r(f);
            try {
                this.c.d();
                notifyAll();
            } catch (IOException e2) {
                throw new phe(e2);
            }
        }
    }

    @Override // defpackage.phg
    public final synchronized void i() {
        if (this.j) {
            return;
        }
        this.f.clear();
        t();
        try {
            try {
                this.c.d();
            } catch (IOException e2) {
                prh.j("SimpleCache", "Storing index file failed", e2);
            }
        } finally {
            u(this.a);
            this.j = true;
        }
    }

    @Override // defpackage.phg
    public final synchronized void j(phl phlVar) {
        if (this.j) {
            return;
        }
        phm a = this.c.a(phlVar.a);
        pse.c(a);
        pse.g(a.e);
        a.e = false;
        this.c.c(a.b);
        notifyAll();
    }

    @Override // defpackage.phg
    public final synchronized void k(phl phlVar) {
        if (this.j) {
            return;
        }
        s(phlVar);
    }

    @Override // defpackage.phg
    public final synchronized boolean l(String str, long j, long j2) {
        long min;
        if (this.j) {
            return false;
        }
        phm a = this.c.a(str);
        if (a != null) {
            phz a2 = a.a(j);
            if (a2.b()) {
                min = -Math.min(a2.c() ? Long.MAX_VALUE : a2.c, j2);
            } else {
                long j3 = j + j2;
                long j4 = a2.b + a2.c;
                if (j4 < j3) {
                    for (phz phzVar : a.c.tailSet(a2, false)) {
                        long j5 = phzVar.b;
                        if (j5 > j4) {
                            break;
                        }
                        j4 = Math.max(j4, j5 + phzVar.c);
                        if (j4 >= j3) {
                            break;
                        }
                    }
                }
                min = Math.min(j4 - j, j2);
            }
            if (min >= j2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.phg
    public final synchronized void m(String str, rzb rzbVar) {
        if (this.j) {
            return;
        }
        p();
        php phpVar = this.c;
        phm b = phpVar.b(str);
        phr phrVar = b.d;
        b.d = phrVar.a(rzbVar);
        if (!b.d.equals(phrVar)) {
            phpVar.c.c();
        }
        try {
            this.c.d();
        } catch (IOException e2) {
            throw new phe(e2);
        }
    }

    @Override // defpackage.phg
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final synchronized phz b(String str, long j) {
        if (this.j) {
            return null;
        }
        p();
        while (true) {
            phz c = c(str, j);
            if (c != null) {
                return c;
            }
            wait();
        }
    }

    @Override // defpackage.phg
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final synchronized phz c(String str, long j) {
        phz d;
        File file;
        if (this.j) {
            return null;
        }
        p();
        phm a = this.c.a(str);
        if (a != null) {
            while (true) {
                d = a.a(j);
                if (!d.d || d.e.length() == d.c) {
                    break;
                }
                t();
            }
        } else {
            d = phz.d(str, j);
        }
        if (!d.d) {
            phm b = this.c.b(str);
            if (b.e) {
                return null;
            }
            b.e = true;
            return d;
        }
        if (this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            phm a2 = this.c.a(str);
            pse.g(a2.c.remove(d));
            File file2 = d.e;
            File e2 = phz.e(file2.getParentFile(), a2.a, d.b, currentTimeMillis);
            if (file2.renameTo(e2)) {
                file = e2;
            } else {
                String valueOf = String.valueOf(file2);
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
                sb.append("Failed to rename ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
                Log.w("CachedContent", sb.toString());
                file = file2;
            }
            pse.g(d.d);
            phz phzVar = new phz(d.a, d.b, d.c, currentTimeMillis, file);
            a2.c.add(phzVar);
            ArrayList arrayList = (ArrayList) this.f.get(d.a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((phf) arrayList.get(size)).b(this, d, phzVar);
                }
            }
            this.b.b(this, d, phzVar);
            d = phzVar;
        }
        return d;
    }

    public final synchronized void p() {
        phe pheVar = this.d;
        if (pheVar != null) {
            throw pheVar;
        }
    }

    public final void q(File file, boolean z, File[] fileArr) {
        if (fileArr == null || (fileArr.length) == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z) {
                if (name.indexOf(46) != -1) {
                    if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                } else {
                    q(file2, false, file2.listFiles());
                }
            }
            phz f = phz.f(file2, -1L, this.c);
            if (f != null) {
                r(f);
            } else {
                file2.delete();
            }
        }
    }
}
