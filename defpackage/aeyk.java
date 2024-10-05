package defpackage;

import android.os.Handler;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyk implements aeza {
    public final aeyh a;
    public final aeye b;
    public final aezf c;
    public final Object d = new Object();
    public final aeyj e;
    public final Handler f;
    public final EnumSet g;
    public aeya h;
    public final aezc i;
    private final afkn j;

    public aeyk(aezf aezfVar, aeyj aeyjVar, plr plrVar, ayr ayrVar, afkn afknVar, Handler handler, Handler handler2) {
        this.c = aezfVar;
        this.e = aeyjVar;
        this.j = afknVar;
        this.f = handler;
        bfg bfgVar = new bfg(false, aezfVar.a().h() * 1024);
        long j = aezfVar.f * 1000;
        aeyh aeyhVar = new aeyh(bfgVar, plrVar.b(), ayrVar, new bbx(null), j, null);
        this.a = aeyhVar;
        aezc aezcVar = new aezc(this, aeyhVar, handler2, j);
        this.i = aezcVar;
        aezcVar.w(pts.r(aezfVar.b().d), aezfVar);
        this.b = new aeye(aeyhVar);
        this.g = EnumSet.noneOf(ovw.class);
        b();
        e(d());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[Catch: all -> 0x00db, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0016, B:9:0x001e, B:11:0x0035, B:13:0x003d, B:14:0x006a, B:16:0x0074, B:19:0x007b, B:21:0x0090, B:23:0x0098, B:25:0x00d4, B:26:0x00d9), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.aeya d() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.d
            monitor-enter(r0)
            aezf r1 = r12.c     // Catch: java.lang.Throwable -> Ldb
            aeeu r1 = r1.c()     // Catch: java.lang.Throwable -> Ldb
            java.util.EnumSet r2 = r12.g     // Catch: java.lang.Throwable -> Ldb
            ovw r3 = defpackage.ovw.TRACK_TYPE_AUDIO     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> Ldb
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L69
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r2 = r1.b     // Catch: java.lang.Throwable -> Ldb
            int r2 = r2.length     // Catch: java.lang.Throwable -> Ldb
            if (r2 <= 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            defpackage.afki.d(r2)     // Catch: java.lang.Throwable -> Ldb
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r2 = r1.b     // Catch: java.lang.Throwable -> Ldb
            r2 = r2[r4]     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r2.t()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = r1.c()     // Catch: java.lang.Throwable -> Ldb
            aezf r7 = r12.c     // Catch: java.lang.Throwable -> Ldb
            afjc r7 = r7.o     // Catch: java.lang.Throwable -> Ldb
            int r8 = r7.b     // Catch: java.lang.Throwable -> Ldb
            if (r8 == 0) goto L69
            java.util.Set r8 = r7.a     // Catch: java.lang.Throwable -> Ldb
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Ldb
            if (r8 != 0) goto L69
            java.lang.String r8 = defpackage.aaov.b(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = defpackage.aaov.a(r2)     // Catch: java.lang.Throwable -> Ldb
            int r7 = r7.b     // Catch: java.lang.Throwable -> Ldb
            int r9 = defpackage.aeyc.e(r7)     // Catch: java.lang.Throwable -> Ldb
            pmr r10 = new pmr     // Catch: java.lang.Throwable -> Ldb
            r10.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r11 = "audio"
            r10.a = r11     // Catch: java.lang.Throwable -> Ldb
            r10.b = r6     // Catch: java.lang.Throwable -> Ldb
            r10.j = r8     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r8 = defpackage.psz.d(r2)     // Catch: java.lang.Throwable -> Ldb
            r10.k = r8     // Catch: java.lang.Throwable -> Ldb
            r10.h = r2     // Catch: java.lang.Throwable -> Ldb
            pms r2 = r10.a()     // Catch: java.lang.Throwable -> Ldb
            aexz r2 = defpackage.aexz.h(r7, r9, r2, r6)     // Catch: java.lang.Throwable -> Ldb
            goto L6a
        L69:
            r2 = r5
        L6a:
            java.util.EnumSet r6 = r12.g     // Catch: java.lang.Throwable -> Ldb
            ovw r7 = defpackage.ovw.TRACK_TYPE_VIDEO     // Catch: java.lang.Throwable -> Ldb
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> Ldb
            if (r6 == 0) goto Ld4
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r6 = r1.a     // Catch: java.lang.Throwable -> Ldb
            int r6 = r6.length     // Catch: java.lang.Throwable -> Ldb
            if (r6 <= 0) goto L7a
            goto L7b
        L7a:
            r3 = 0
        L7b:
            defpackage.afki.d(r3)     // Catch: java.lang.Throwable -> Ldb
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r1 = r1.a     // Catch: java.lang.Throwable -> Ldb
            r1 = r1[r4]     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = r1.t()     // Catch: java.lang.Throwable -> Ldb
            aezf r3 = r12.c     // Catch: java.lang.Throwable -> Ldb
            afjd r3 = r3.h()     // Catch: java.lang.Throwable -> Ldb
            int r4 = r3.c     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto Ld4
            java.util.Set r4 = r3.a     // Catch: java.lang.Throwable -> Ldb
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> Ldb
            if (r4 != 0) goto Ld4
            afkn r4 = r12.j     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = defpackage.aaov.b(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = defpackage.aaov.a(r1)     // Catch: java.lang.Throwable -> Ldb
            int r3 = r3.c     // Catch: java.lang.Throwable -> Ldb
            int r7 = defpackage.aeyc.f(r3)     // Catch: java.lang.Throwable -> Ldb
            pmr r8 = new pmr     // Catch: java.lang.Throwable -> Ldb
            r8.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r9 = "video"
            r8.a = r9     // Catch: java.lang.Throwable -> Ldb
            r8.j = r6     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = defpackage.psz.g(r1)     // Catch: java.lang.Throwable -> Ldb
            r8.k = r6     // Catch: java.lang.Throwable -> Ldb
            r8.h = r1     // Catch: java.lang.Throwable -> Ldb
            r1 = r4
            afkm r1 = (defpackage.afkm) r1     // Catch: java.lang.Throwable -> Ldb
            int r1 = r1.c     // Catch: java.lang.Throwable -> Ldb
            r8.p = r1     // Catch: java.lang.Throwable -> Ldb
            afkm r4 = (defpackage.afkm) r4     // Catch: java.lang.Throwable -> Ldb
            int r1 = r4.d     // Catch: java.lang.Throwable -> Ldb
            r8.q = r1     // Catch: java.lang.Throwable -> Ldb
            pms r1 = r8.a()     // Catch: java.lang.Throwable -> Ldb
            aexz r5 = defpackage.aexz.h(r3, r7, r1, r5)     // Catch: java.lang.Throwable -> Ldb
        Ld4:
            aeya r1 = new aeya     // Catch: java.lang.Throwable -> Ldb
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            return r1
        Ldb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyk.d():aeya");
    }

    private final void e(aeya aeyaVar) {
        this.h = aeyaVar;
        this.c.n(aeyaVar);
        this.i.t(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.c.c().a.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        boolean z;
        synchronized (this.d) {
            EnumSet clone = this.g.clone();
            this.g.clear();
            if (this.c.c().b.length > 0) {
                this.g.add(ovw.TRACK_TYPE_AUDIO);
            }
            if (((aeyr) this.e).k && a()) {
                this.g.add(ovw.TRACK_TYPE_VIDEO);
            }
            z = !this.g.equals(clone);
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        boolean z2;
        synchronized (this.d) {
            aeya d = d();
            aeya aeyaVar = this.h;
            aexz aexzVar = aeyaVar.b;
            z = true;
            if (aexz.g(d.b, aexzVar)) {
                z2 = false;
            } else {
                aexzVar = d.b;
                z2 = true;
            }
            aexz aexzVar2 = aeyaVar.c;
            if (aexz.g(d.c, aexzVar2)) {
                z = z2;
            } else {
                aexzVar2 = d.c;
            }
            if (z) {
                e(new aeya(aexzVar, aexzVar2));
            }
        }
        return z;
    }
}
