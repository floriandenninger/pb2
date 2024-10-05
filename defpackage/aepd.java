package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aepd implements aepe, pbi {
    public static final /* synthetic */ int f = 0;
    private static final pbg g = new pbf(new pbe("video/x-unknown", new byte[0]));
    public final aepv a;
    public final Handler b;
    public final List c = new ArrayList();
    public pbg d;
    public Runnable e;
    private final Looper h;
    private final aeqj i;
    private final HashMap j;
    private final aepq k;
    private final pbn l;
    private final afjf m;
    private final PlayerConfigModel n;
    private final Random o;

    public aepd(Looper looper, aeqj aeqjVar, HashMap hashMap, Handler handler, aepq aepqVar, pbn pbnVar, afjf afjfVar, PlayerConfigModel playerConfigModel) {
        this.h = looper;
        this.i = aeqjVar;
        this.j = hashMap;
        this.b = handler;
        this.k = aepqVar;
        this.l = pbnVar;
        this.m = afjfVar;
        afki.a(playerConfigModel);
        this.n = playerConfigModel;
        this.o = new Random();
        try {
            pbnVar.b("sessionSharing", "enable");
            aepb aepbVar = new aepb(looper, aeqjVar, hashMap, handler, aepqVar, advx.i, pbnVar, afjfVar);
            this.a = aepbVar;
            aepbVar.d(g);
            pbnVar.a(this);
        } catch (IllegalStateException e) {
            String valueOf = String.valueOf(e.getLocalizedMessage());
            afsi.b(1, 6, valueOf.length() != 0 ? "Cannot set mediaDrm property sessionSharing to enable: ".concat(valueOf) : new String("Cannot set mediaDrm property sessionSharing to enable: "));
            afic aficVar = afic.DRM;
            Object[] objArr = new Object[1];
            objArr[0] = pgz.a < 28 ? null : pbnVar.a.getMetrics();
            afid.e(aficVar, "MediaDrm metrics while trying to enable sessionSharing: %s", objArr);
            throw new pbp();
        }
    }

    static boolean m(pbg pbgVar, pbg pbgVar2) {
        if (pgz.p(pbgVar, pbgVar2)) {
            return true;
        }
        if (pbgVar == null || pbgVar2 == null) {
            return false;
        }
        return pgz.p(pbgVar.a(aeow.a), pbgVar2.a(aeow.a));
    }

    public static final String n(pbg pbgVar) {
        return Base64.encodeToString(pbgVar.a(aeow.a).b, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[RETURN, SYNTHETIC] */
    @Override // defpackage.pbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r11 = this;
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r11.n
            int r0 = r0.k()
            r1 = 4
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L3f
            aepv r0 = r11.a
            int r0 = r0.h
            if (r0 != r4) goto L13
            goto L45
        L13:
            java.util.List r0 = r11.c
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r6 = 0
        L1b:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L38
            java.lang.Object r7 = r0.next()
            aepc r7 = (defpackage.aepc) r7
            aepv r7 = r7.a
            int r7 = r7.h
            if (r7 != 0) goto L30
        L2d:
            r1 = 0
            goto L90
        L30:
            if (r7 != r1) goto L34
            r6 = 1
            goto L1b
        L34:
            if (r7 != r2) goto L1b
            r5 = 1
            goto L1b
        L38:
            if (r5 == 0) goto L3c
        L3a:
            r1 = 3
            goto L90
        L3c:
            if (r6 == 0) goto L3a
            goto L90
        L3f:
            aepv r0 = r11.a
            int r0 = r0.h
            if (r0 != r4) goto L47
        L45:
            r1 = 1
            goto L90
        L47:
            pbg r0 = r11.d
            java.util.UUID r5 = defpackage.aeow.a
            pbe r0 = r0.a(r5)
            byte[] r0 = r0.b
            pia r0 = defpackage.aear.i(r0)
            pbg r5 = r11.d
            r6 = -2
            if (r5 == 0) goto L5e
            if (r0 == 0) goto L5e
            int r6 = r0.b
        L5e:
            java.util.List r0 = r11.c
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r7 = 0
        L66:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r0.next()
            aepc r8 = (defpackage.aepc) r8
            aepv r9 = r8.a
            int r9 = r9.h
            if (r9 != 0) goto L7a
            r10 = 0
            goto L7b
        L7a:
            r10 = 1
        L7b:
            r10 = r10 ^ r4
            r5 = r5 | r10
            if (r9 != r1) goto L66
            int r8 = r8.c
            int r9 = r6 + (-1)
            if (r8 < r9) goto L66
            int r9 = r6 + 1
            if (r8 > r9) goto L66
            r7 = 1
            goto L66
        L8b:
            if (r5 == 0) goto L8e
            goto L2d
        L8e:
            if (r7 == 0) goto L3a
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepd.a():int");
    }

    @Override // defpackage.pbh
    public final Exception b() {
        for (aepc aepcVar : this.c) {
            if (aepcVar.a.b() != null) {
                return aepcVar.a.b();
            }
        }
        return null;
    }

    @Override // defpackage.pbh
    public final void c() {
    }

    @Override // defpackage.pbh
    public final void d(final pbg pbgVar) {
        if (m(pbgVar, this.d)) {
            return;
        }
        afic aficVar = afic.ABR;
        afid.g(new amxk() { // from class: aeoy
            @Override // defpackage.amxk
            public final Object a() {
                return aepd.n(pbg.this);
            }
        });
        this.d = pbgVar;
        for (aepc aepcVar : this.c) {
            if (m(aepcVar.b, pbgVar)) {
                aepcVar.d = SystemClock.elapsedRealtime();
                return;
            }
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
            this.e = null;
        }
        pia i = aear.i(pbgVar.a(aeow.a).b);
        if (i != null) {
            int i2 = i.b;
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aepc aepcVar2 = (aepc) it.next();
                int i3 = aepcVar2.c;
                if (i3 == i2 - 1 || i3 == i2 + 1) {
                    if (aepcVar2.a.h == 4) {
                        if (this.n.k() != 0) {
                            final pia i4 = aear.i(pbgVar.a(aeow.a).b);
                            if (i4 == null) {
                                afid.d(afic.DRM, "openInternalDelayed: No crypto period info available!");
                            }
                            int i5 = i4.c;
                            int i6 = i4.b;
                            this.e = new Runnable() { // from class: aepa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aepd aepdVar = aepd.this;
                                    pia piaVar = i4;
                                    pbg pbgVar2 = pbgVar;
                                    afic aficVar2 = afic.ABR;
                                    int i7 = piaVar.b;
                                    aepdVar.k(pbgVar2);
                                    aepdVar.e = null;
                                }
                            };
                            this.b.postDelayed(this.e, this.o.nextInt(Math.min(this.n.k(), i5 * 1000)));
                            return;
                        }
                    }
                }
            }
        }
        k(pbgVar);
    }

    @Override // defpackage.pbh
    public final boolean e(String str) {
        return f().a(str);
    }

    @Override // defpackage.pbi
    public final void g(byte[] bArr, int i) {
        for (aepc aepcVar : this.c) {
            if (Arrays.equals(bArr, aepcVar.a.i)) {
                aepcVar.a.c.sendEmptyMessage(i);
                return;
            }
        }
        afid.e(afic.DRM, "No corresponding session found for event %d", Integer.valueOf(i));
    }

    @Override // defpackage.aepe
    public final int h() {
        return this.a.h();
    }

    @Override // defpackage.pbh
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final pbj f() {
        aquz aquzVar = this.n.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        if (aquzVar.aQ || this.c.isEmpty()) {
            return this.a.f();
        }
        return ((aepc) this.c.get(0)).a.f();
    }

    @Override // defpackage.aepe
    public final pbn j() {
        return this.l;
    }

    public final void k(pbg pbgVar) {
        while (this.c.size() >= 4) {
            aepc aepcVar = (aepc) this.c.get(0);
            long j = aepcVar.d;
            for (aepc aepcVar2 : this.c) {
                long j2 = aepcVar2.d;
                long j3 = j < j2 ? j2 : j;
                if (j < j2) {
                    aepcVar = aepcVar2;
                }
                j = j3;
            }
            afic aficVar = afic.ABR;
            n(aepcVar.b);
            aepcVar.a.f = null;
            this.c.remove(aepcVar);
        }
        aepv aepvVar = new aepv(this.h, this.i, this.j, this.b, this.k, advx.j, this.l, this.m);
        this.l.a(this);
        pia i = aear.i(pbgVar.a(aeow.a).b);
        if (i == null) {
            afid.d(afic.DRM, "openInternal: No crypto period info available!");
        }
        this.i.d = Integer.valueOf(i.b);
        aepvVar.d(pbgVar);
        aepc aepcVar3 = new aepc(aepvVar, pbgVar, i.b);
        aepcVar3.d = SystemClock.elapsedRealtime();
        this.c.add(aepcVar3);
        afic aficVar2 = afic.ABR;
        this.c.size();
    }

    @Override // defpackage.aepe
    public final void l() {
        this.b.postDelayed(new Runnable() { // from class: aeoz
            @Override // java.lang.Runnable
            public final void run() {
                aepd aepdVar = aepd.this;
                if (aepdVar.a.h == 1) {
                    return;
                }
                Runnable runnable = aepdVar.e;
                if (runnable != null) {
                    afic aficVar = afic.ABR;
                    aepdVar.b.removeCallbacks(runnable);
                    aepdVar.e = null;
                }
                Iterator it = aepdVar.c.iterator();
                while (it.hasNext()) {
                    ((aepc) it.next()).a.l();
                }
                aepdVar.a.l();
                aepdVar.d = null;
                aepdVar.c.clear();
            }
        }, 100L);
    }
}
