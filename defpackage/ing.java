package defpackage;

import android.util.LruCache;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ing implements imm, ypd {
    public final imn a;
    final LruCache b;
    public final axze c;
    private final ion d;
    private final amnv e;
    private final aapf f;
    private final Executor g;
    private final ayqi h;
    private final shf i;

    public ing(ion ionVar, imn imnVar, abig abigVar, amnv amnvVar, axze axzeVar, aapf aapfVar, Executor executor, ayqi ayqiVar, shf shfVar, ypa ypaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = ionVar;
        this.a = imnVar;
        this.e = amnvVar;
        this.c = axzeVar;
        this.f = aapfVar;
        this.g = executor;
        this.h = ayqiVar;
        this.i = shfVar;
        abigVar.getClass();
        abigVar.c(this);
        this.b = new LruCache(64);
        ypaVar.g(this);
    }

    public static final iol a(apxf apxfVar, ion ionVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        aone createBuilder = aryo.a.createBuilder();
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 32) != 0) {
            String str = reelWatchEndpointOuterClass$ReelWatchEndpoint.g;
            createBuilder.copyOnWrite();
            aryo aryoVar = (aryo) createBuilder.instance;
            str.getClass();
            aryoVar.b |= 2048;
            aryoVar.k = str;
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 2) != 0) {
            String str2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.d;
            createBuilder.copyOnWrite();
            aryo aryoVar2 = (aryo) createBuilder.instance;
            str2.getClass();
            aryoVar2.b |= 2;
            aryoVar2.d = str2;
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0) {
            String str3 = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
            createBuilder.copyOnWrite();
            aryo aryoVar3 = (aryo) createBuilder.instance;
            str3.getClass();
            aryoVar3.b |= 256;
            aryoVar3.i = str3;
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 16) != 0) {
            int i = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
            createBuilder.copyOnWrite();
            aryo aryoVar4 = (aryo) createBuilder.instance;
            aryoVar4.b |= 512;
            aryoVar4.j = i;
        }
        iol iolVar = new iol(ionVar.f, ionVar.a.c(), null, null, null);
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 1) != 0) {
            int bd = anaf.bd(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
            iolVar.c = bd != 0 ? bd : 1;
        }
        iolVar.d = createBuilder;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 16384) != 0) {
            iolVar.a = reelWatchEndpointOuterClass$ReelWatchEndpoint.o;
        }
        iolVar.l(apxfVar.c);
        return iolVar;
    }

    public static void c(LruCache lruCache) {
        synchronized (lruCache) {
            Iterator it = lruCache.snapshot().values().iterator();
            while (it.hasNext()) {
                ind indVar = ((inf) it.next()).a;
                if (indVar != null) {
                    indVar.i = true;
                }
            }
            lruCache.evictAll();
        }
    }

    @Override // defpackage.imm
    public final void aT(aros arosVar, arot arotVar) {
        b();
    }

    public final void b() {
        c(this.b);
    }

    public final void d(apxf apxfVar, String str, boolean z, boolean z2, boolean z3, afwx afwxVar) {
        e(apxfVar, str, z, z2, z3, afwxVar, afxb.a);
    }

    public final void e(apxf apxfVar, String str, boolean z, boolean z2, boolean z3, afwx afwxVar, afwx afwxVar2) {
        g(apxfVar, str, z, z2, z3, false, afwxVar, afwxVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(final defpackage.apxf r27, final java.lang.String r28, boolean r29, boolean r30, boolean r31, boolean r32, defpackage.afwx r33, defpackage.afwx r34) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ing.g(apxf, java.lang.String, boolean, boolean, boolean, boolean, afwx, afwx):void");
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            if (!((Boolean) this.c.a.a.Y(axzb.b).B().aB()).booleanValue()) {
                return null;
            }
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
