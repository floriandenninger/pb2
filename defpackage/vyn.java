package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyn implements vym, vyl {
    private final vyf a;
    private final List b = new CopyOnWriteArrayList();
    private final List c = new ArrayList();

    public vyn(vyf vyfVar) {
        vyfVar.getClass();
        this.a = vyfVar;
    }

    private final long c(long j) {
        VideoMetaData videoMetaData = ((vyg) this.a).a;
        int c = videoMetaData.c(j);
        return c != -1 ? videoMetaData.l(c) : videoMetaData.g;
    }

    private final long d(long j) {
        VideoMetaData videoMetaData = ((vyg) this.a).a;
        int e = videoMetaData.e(j);
        if (e != -1) {
            return videoMetaData.l(e);
        }
        return 0L;
    }

    private final void e(long j, long j2, long j3, Map map) {
        long j4 = j;
        while (j4 < j2) {
            long c = c(1 + j4);
            vxw vxwVar = (vxw) map.remove(Long.valueOf(j4));
            if (vxwVar == null) {
                String format = String.format("Subsequence: %d - %d", Long.valueOf(j4 / 1000), Long.valueOf(c / 1000));
                vyf vyfVar = this.a;
                long j5 = (-1) + c;
                amkq.E(j4 <= j5);
                vyg vygVar = (vyg) vyfVar;
                int g = vygVar.a.g(j4);
                if (g != -1) {
                    int g2 = vygVar.a.g(j5);
                    if (g2 != -1) {
                        int g3 = vygVar.a.g(j3);
                        if (g3 == -1 || g3 <= 0) {
                            g3 = 1;
                        }
                        int i = ((g2 - g) / g3) + 1;
                        int[] iArr = new int[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            iArr[i2] = (i2 * g3) + g;
                        }
                        vxw vxwVar2 = new vxw(iArr, vygVar.c(), format, 10);
                        vygVar.d(vxwVar2);
                        vxwVar2.k(this);
                        vxwVar = vxwVar2;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.c.add(vxwVar);
            j4 = c;
        }
    }

    private final void f(long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        for (vxw vxwVar : this.c) {
            hashMap.put(Long.valueOf(vxwVar.h().a()), vxwVar);
        }
        this.c.clear();
        long d = d(j);
        long c = c(j2);
        e(d, c, j3, hashMap);
        long j4 = j - 1000000;
        if (j4 < d) {
            e(d(j4), d, j3, hashMap);
        }
        long j5 = 1000000 + j2;
        if (j5 > c) {
            e(c, c(j5), j3, hashMap);
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((vxw) it.next()).j();
        }
    }

    @Override // defpackage.vyl
    public final void G(Exception exc) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((vyl) it.next()).G(exc);
        }
    }

    @Override // defpackage.vyl
    public final void I(vya vyaVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((vyl) it.next()).I(vyaVar);
        }
    }

    public final void a(long j, long j2) {
        f(j, j2, 0L);
    }

    public final void b(long j, long j2) {
        f(j, j2, 1000000L);
    }

    @Override // defpackage.vym
    public final vya g(long j, boolean z) {
        Iterator it = this.c.iterator();
        vya vyaVar = null;
        while (it.hasNext()) {
            vya g = ((vxw) it.next()).g(j, z);
            if (g != null) {
                if (vyaVar != null) {
                    if (Math.abs(g.a() - j) < Math.abs(vyaVar.a() - j)) {
                        vyaVar.d();
                    }
                }
                vyaVar = g;
            }
        }
        return vyaVar;
    }

    @Override // defpackage.vym
    public final vya i(long j) {
        vya c;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            vxw vxwVar = (vxw) it.next();
            if (vxwVar.h().a() <= j) {
                synchronized (vxwVar.c) {
                    Map.Entry lastEntry = vxwVar.c.a.lastEntry();
                    c = (lastEntry != null ? (vya) lastEntry.getValue() : null).c();
                }
                if (c.a() >= j) {
                    return vxwVar.i(j);
                }
            }
        }
    }

    @Override // defpackage.vym
    public final void j() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((vxw) it.next()).j();
        }
        this.b.clear();
    }

    @Override // defpackage.vym
    public final void k(vyl vylVar) {
        this.b.add(vylVar);
        if (m()) {
            vylVar.q(this);
        }
    }

    @Override // defpackage.vym
    public final void l(vyl vylVar) {
        this.b.remove(vylVar);
    }

    @Override // defpackage.vym
    public final boolean m() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (!((vxw) it.next()).m()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vyl
    public final void q(vym vymVar) {
        if (m()) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((vyl) it.next()).q(this);
            }
        }
    }
}
