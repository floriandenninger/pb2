package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hjk implements hkj {
    private final hkg a;

    public hjk(hkg hkgVar) {
        this.a = hkgVar;
    }

    @Override // defpackage.hkj
    public final /* bridge */ /* synthetic */ hke a(axdk axdkVar) {
        axdy axdyVar;
        axem axemVar;
        axdi i = axdkVar.i();
        if (i.c == 1) {
            axdyVar = (axdy) i.d;
        } else {
            axdyVar = axdy.a;
        }
        int i2 = axdyVar.i;
        axch axchVar = axch.FONT_FAMILY_UNSPECIFIED;
        axep n = axdkVar.n();
        if (n.b == 1) {
            axemVar = (axem) n.c;
        } else {
            axemVar = axem.a;
        }
        Iterator it = Collections.unmodifiableMap(axemVar.b).keySet().iterator();
        long j = -1;
        long j2 = -1;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (longValue >= 0) {
                if (j >= 0) {
                    if (longValue < j) {
                        j2 = j;
                    } else {
                        j2 = longValue;
                    }
                }
                j = longValue;
            }
        }
        Pair pair = new Pair(Long.valueOf(j), Long.valueOf(j2));
        hkg hkgVar = this.a;
        String str = axdyVar.c;
        long e = axdkVar.e();
        aoro aoroVar = axdyVar.e;
        if (aoroVar == null) {
            aoroVar = aoro.a;
        }
        int R = etx.R(aoroVar);
        aoro aoroVar2 = axdyVar.f;
        if (aoroVar2 == null) {
            aoroVar2 = aoro.a;
        }
        return new hjx(hkgVar, str, e, R, etx.R(aoroVar2), TimeUnit.MICROSECONDS.toMillis(((Long) pair.first).longValue()), TimeUnit.MICROSECONDS.toMillis(((Long) pair.second).longValue()));
    }

    @Override // defpackage.hkj
    public final boolean b(axdk axdkVar) {
        return axdkVar.i().c == 1;
    }
}
