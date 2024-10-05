package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lwj extends ajsu implements ypd {
    public final Context a;
    public final Executor b;
    public final ypa c;
    public final alaj d;
    public final alah e;
    public final ajoc f;
    public final ajpd g;
    public final ajpd h;
    public final Map i;
    public final Map j;
    public final Map k;
    public boolean l;
    public final axze m;
    private final afsy n;
    private final ajpd o;
    private final Executor p;
    private final aaea q;
    private final List r;
    private final akvq s;
    private final lwd t;
    private final anhy u;
    private final akxw v;
    private final akxu w;
    private final aqyg x;
    private final aqyg y;
    private final boolean z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lwj(android.content.Context r1, java.util.concurrent.Executor r2, defpackage.ypa r3, defpackage.afsy r4, defpackage.alaj r5, defpackage.alah r6, defpackage.akxw r7, java.util.concurrent.Executor r8, defpackage.aaea r9, defpackage.akvq r10, defpackage.axze r11, defpackage.atts r12, byte[] r13, byte[] r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwj.<init>(android.content.Context, java.util.concurrent.Executor, ypa, afsy, alaj, alah, akxw, java.util.concurrent.Executor, aaea, akvq, axze, atts, byte[], byte[], byte[]):void");
    }

    public static /* synthetic */ void h(Throwable th) {
        zga.d("Error occurred getting resumable uploads", th);
    }

    public static final void k(Map map, goc gocVar) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == gocVar) {
                map.remove(entry.getKey());
                return;
            }
        }
    }

    public static final int l(akzv akzvVar) {
        akzv akzvVar2 = akzv.PRIVATE;
        int ordinal = akzvVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        int i = akzvVar.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Unhandled Privacy enum: ");
        sb.append(i);
        throw new AssertionError(sb.toString());
    }

    public final goc b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            goc gocVar = (goc) this.i.get(str);
            return gocVar != null ? gocVar : (goc) this.j.get(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return (goc) this.k.get(str2);
    }

    public final void c() {
        for (anhy anhyVar : this.r) {
            if (anhyVar != null && !anhyVar.isDone()) {
                anhyVar.cancel(true);
            }
        }
        this.r.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d3, code lost:
    
        if (defpackage.alep.i(r1, defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MAX_STORAGE_USAGE_TIME_EXCEEDED) != false) goto L220;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final defpackage.akzs r19) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwj.d(akzs):void");
    }

    public final void i(goc gocVar) {
        if (this.h.contains(gocVar)) {
            this.h.o(gocVar, gocVar);
            return;
        }
        int size = this.h.size();
        while (size > 0) {
            int i = size - 1;
            if (gocVar.a < ((goc) this.h.get(i)).a) {
                this.h.add(size, gocVar);
                return;
            }
            size = i;
        }
        this.h.add(0, gocVar);
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public final void j() {
        c();
        this.v.c();
        this.v.f(this.w);
        this.l = false;
        anhy anhyVar = this.u;
        if (anhyVar != null && !anhyVar.isDone()) {
            this.u.cancel(true);
        }
        this.s.d(this.t);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aaxa.class};
        }
        if (i == 0) {
            aaxa aaxaVar = (aaxa) obj;
            if (aaxaVar.b() == null) {
                return null;
            }
            this.g.remove(aaxaVar.b());
            this.h.remove(aaxaVar.b());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.f;
    }
}
