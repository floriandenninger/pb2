package defpackage;

import java.io.File;
import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxy implements Comparator, phk {
    final long a;
    private final TreeSet b;
    private final amnv c;
    private final long d;
    private final float e;
    private final long f;
    private final long g;
    private final float h;
    private boolean i;
    private long j;

    public adxy(amnv amnvVar, aqut aqutVar, aqut aqutVar2) {
        boolean z = false;
        if (aqutVar != null && aqutVar2 != null && aqutVar.c > 0 && aqutVar2.c > 0) {
            z = true;
        }
        this.c = amnvVar;
        this.a = z ? aqutVar.b : 1073741824L;
        this.d = z ? aqutVar.c : 5368709120L;
        this.e = z ? aqutVar.d : 0.2f;
        this.f = z ? aqutVar2.b : 33554432L;
        this.g = z ? aqutVar2.c : 1073741824L;
        this.h = z ? aqutVar2.d : 0.15f;
        this.b = new TreeSet(this);
    }

    private final void i(phg phgVar) {
        long e = e();
        while (true) {
            long j = this.j;
            if (j <= 0 || j <= e) {
                return;
            } else {
                try {
                    phgVar.k((phl) this.b.first());
                } catch (phe unused) {
                }
            }
        }
    }

    @Override // defpackage.phf
    public final void a(phg phgVar, phl phlVar) {
        this.b.add(phlVar);
        this.j += phlVar.c;
        if (this.i) {
            i(phgVar);
        }
    }

    @Override // defpackage.phf
    public final void b(phg phgVar, phl phlVar, phl phlVar2) {
        c(phlVar);
        a(phgVar, phlVar2);
    }

    @Override // defpackage.phf
    public final void c(phl phlVar) {
        this.b.remove(phlVar);
        this.j -= phlVar.c;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        phl phlVar = (phl) obj;
        phl phlVar2 = (phl) obj2;
        long j = phlVar.f;
        long j2 = phlVar2.f;
        if (j - j2 == 0) {
            return phlVar.compareTo(phlVar2);
        }
        return j >= j2 ? 1 : -1;
    }

    @Override // defpackage.phk
    public final long d() {
        return this.j;
    }

    @Override // defpackage.phk
    public final long e() {
        amnv amnvVar;
        if (!this.i || (amnvVar = this.c) == null) {
            return 0L;
        }
        File file = (File) amnvVar.get();
        long usableSpace = file.getUsableSpace();
        long min = Math.min(this.g, Float.valueOf(this.h * ((float) Math.max(0L, (usableSpace - Math.max(this.a, Math.min(this.d, Float.valueOf(((float) (file.getTotalSpace() - (file.getFreeSpace() - usableSpace))) * this.e).longValue()))) + this.j))).longValue());
        if (min < this.f) {
            return 0L;
        }
        return min;
    }

    @Override // defpackage.phk
    public final void f() {
        this.i = true;
    }

    @Override // defpackage.phk
    public final boolean g() {
        return true;
    }

    @Override // defpackage.phk
    public final void h(phg phgVar, long j) {
        if (this.i) {
            i(phgVar);
        }
    }
}
