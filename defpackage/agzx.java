package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agzx {
    private final afsy a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final aijo e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final aijo i;
    private final akny j;

    public agzx(shf shfVar, afsy afsyVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, aiik aiikVar, aijo aijoVar, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        afyf afyfVar;
        agzt agztVar;
        this.a = afsyVar;
        this.b = azrwVar;
        this.d = azrwVar3;
        this.e = aiikVar;
        this.c = azrwVar2;
        this.h = azrwVar4;
        this.f = azrwVar5;
        this.g = azrwVar6;
        this.i = aijoVar;
        aknr aknrVar = new aknr();
        aknrVar.c = afyf.o;
        aknrVar.a = new agzu(shfVar);
        aknrVar.b = agzt.a;
        agzu agzuVar = aknrVar.a;
        if (agzuVar == null || (afyfVar = aknrVar.c) == null || (agztVar = aknrVar.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (aknrVar.a == null) {
                sb.append(" expiryGenerator");
            }
            if (aknrVar.c == null) {
                sb.append(" keyConverter");
            }
            if (aknrVar.b == null) {
                sb.append(" costGenerator");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        this.j = new akny(new aknt(agzuVar, afyfVar, agztVar, null), angq.a, shfVar);
    }

    public static boolean e(int i) {
        return i == ahab.a(atrx.AUDIO_ONLY, -1);
    }

    public static final boolean f(PlayerResponseModel playerResponseModel) {
        aryi q = playerResponseModel.q();
        return q != null && ahbx.m(q);
    }

    public static final String g(PlayerResponseModel playerResponseModel) {
        aryi q = playerResponseModel.q();
        if (q == null || ammx.e(q.d)) {
            return null;
        }
        return q.d;
    }

    public static final boolean h(PlayerResponseModel playerResponseModel) {
        int bO;
        atqq r = playerResponseModel.r();
        return (r == null || (bO = anaf.bO(r.h)) == 0 || bO != 2) ? false : true;
    }

    public static final boolean i(PlayerResponseModel playerResponseModel) {
        aryi q = playerResponseModel.q();
        return q != null && ahbx.l(q);
    }

    public final FormatStreamModel a(FormatStreamModel formatStreamModel) {
        if (formatStreamModel.j() > 0 && formatStreamModel.e() != 22) {
            return formatStreamModel;
        }
        ykm c = ykm.c();
        ((afvq) this.f.get()).c(formatStreamModel.d, c);
        try {
            long longValue = ((Long) c.get()).longValue();
            aong aongVar = (aong) formatStreamModel.a.toBuilder();
            Uri.Builder buildUpon = formatStreamModel.d.buildUpon();
            String str = formatStreamModel.b;
            long j = formatStreamModel.c;
            aongVar.copyOnWrite();
            aqxz aqxzVar = (aqxz) aongVar.instance;
            aqxzVar.c |= 2048;
            aqxzVar.p = longValue;
            return whu.W(buildUpon, str, j, aongVar);
        } catch (ExecutionException e) {
            throw new IOException("fetchContentLengthIfNecessary failed", e);
        }
    }

    public final void b(final String str) {
        final akny aknyVar = this.j;
        final ammy ammyVar = new ammy() { // from class: agzv
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                agzx.this.j(str, (agzw) obj);
                return false;
            }
        };
        ynm.j(anaf.T(new anfy() { // from class: aknu
            @Override // defpackage.anfy
            public final anhy a() {
                akny aknyVar2 = akny.this;
                ammy ammyVar2 = ammyVar;
                Iterator it = aknyVar2.d.e().keySet().iterator();
                while (it.hasNext()) {
                    ammyVar2.a(it.next());
                }
                return anaf.O(null);
            }
        }, aknyVar.b), angq.a, afka.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void j(String str, agzw agzwVar) {
        ArrayList arrayList = new ArrayList();
        if (agzwVar.a.equals(str)) {
            this.j.d.i(agzwVar);
            arrayList.add(anaf.O(null));
        }
        try {
            anaf.H(arrayList).a(anaf.aa(), angq.a).get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            afsi.c(2, 28, "Some error occurred when evicting player response", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r9.o == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel k(int r9, int r10, int r11, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r12, boolean r13, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r14) {
        /*
            r8 = this;
            boolean r0 = e(r9)
            r1 = 0
            if (r0 == 0) goto Lb
            if (r13 == 0) goto La
            goto Lb
        La:
            return r1
        Lb:
            boolean r0 = r12.v
            if (r0 == 0) goto L25
            azrw r0 = r8.g
            java.lang.Object r0 = r0.get()
            aepm r0 = (defpackage.aepm) r0
            java.lang.String r2 = r12.c
            boolean r0 = r0.d(r2)
            if (r0 != 0) goto L25
            r0 = 480(0x1e0, float:6.73E-43)
            int r10 = java.lang.Math.min(r10, r0)
        L25:
            r7 = r10
            azrw r10 = r8.h
            java.lang.Object r10 = r10.get()
            ajoy r10 = (defpackage.ajoy) r10
            aees r6 = new aees
            aeex r0 = new aeex
            r0.<init>(r9, r9)
            aeex r9 = defpackage.ajoy.g(r11)
            r11 = 1
            r6.<init>(r0, r9, r11, r1)
            azrw r9 = r10.a     // Catch: defpackage.aeew -> L83
            java.lang.Object r9 = r9.get()     // Catch: defpackage.aeew -> L83
            r2 = r9
            aeeq r2 = (defpackage.aeeq) r2     // Catch: defpackage.aeew -> L83
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3 = r12.m()     // Catch: defpackage.aeew -> L83
            r4 = r14
            r5 = r13
            aeeu r9 = r2.d(r3, r4, r5, r6, r7)     // Catch: defpackage.aeew -> L83
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r10 = r9.g()     // Catch: defpackage.aeew -> L83
            if (r13 == 0) goto L59
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r9 = r9.b     // Catch: defpackage.aeew -> L83
            goto L5a
        L59:
            r9 = r10
        L5a:
            int r11 = r9.length     // Catch: defpackage.aeew -> L83
            r12 = 0
            if (r11 <= 0) goto L61
            r9 = r9[r12]     // Catch: defpackage.aeew -> L83
            goto L84
        L61:
            atyi r9 = r14.c     // Catch: defpackage.aeew -> L83
            int r11 = r9.b     // Catch: defpackage.aeew -> L83
            r11 = r11 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto L73
            apdl r9 = r9.j     // Catch: defpackage.aeew -> L83
            if (r9 != 0) goto L6f
            apdl r9 = defpackage.apdl.a     // Catch: defpackage.aeew -> L83
        L6f:
            boolean r9 = r9.o     // Catch: defpackage.aeew -> L83
            if (r9 != 0) goto L83
        L73:
            if (r13 == 0) goto L83
            int r9 = r10.length     // Catch: defpackage.aeew -> L83
            if (r9 <= 0) goto L83
            r9 = r10[r12]     // Catch: defpackage.aeew -> L83
            boolean r9 = r9.M()     // Catch: defpackage.aeew -> L83
            if (r9 == 0) goto L83
            r9 = r10[r12]     // Catch: defpackage.aeew -> L83
            goto L84
        L83:
            r9 = r1
        L84:
            if (r9 == 0) goto L8b
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r9 = r8.a(r9)     // Catch: java.io.IOException -> L8b
            return r9
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzx.k(int, int, int, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel):com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel");
    }

    public final PlayerResponseModel l(String str, int i, byte[] bArr) {
        anhy T;
        akns a;
        anhy O;
        yjk.e();
        final agzw agzwVar = new agzw(this.a.c().d(), str, i, bArr != null ? bArr : new byte[0]);
        Object obj = null;
        try {
            akny aknyVar = this.j;
            aknx aknxVar = (aknx) aknyVar.d.c(agzwVar);
            if (aknxVar == null) {
                a = null;
            } else {
                long j = aknxVar.b;
                if (j != 0) {
                    a = akns.a(aknxVar.a, j > aknyVar.c.d() ? 2 : 4);
                } else {
                    a = akns.a(aknxVar.a, 2);
                }
            }
            if (a == null) {
                O = anaf.O(amlr.a);
            } else {
                O = anaf.O(ammv.j(a));
            }
            ammv ammvVar = (ammv) ((anhv) O).b;
            if (ammvVar.h() && ((akns) ammvVar.c()).b != 4) {
                obj = ((akns) ammvVar.c()).a;
            }
        } catch (InterruptedException | ExecutionException e) {
            afsi.c(2, 28, "Some error occurred when reading from the cache player response", e);
        }
        if (obj != null) {
            return (PlayerResponseModel) obj;
        }
        aiij aiijVar = (aiij) this.b.get();
        aijr d = ((aijp) this.c.get()).d();
        d.v = true;
        d.b = str;
        if (bArr != null) {
            d.m(bArr);
        } else {
            d.k();
        }
        int i2 = i - 1;
        int i3 = i2 != 1 ? i2 != 2 ? 1 : 3 : 2;
        if (i3 != 1) {
            d.Y = i3;
        }
        ((aild) this.d.get()).qZ(d);
        this.e.qZ(d);
        aijo aijoVar = this.i;
        if (aijoVar != null) {
            aijoVar.qZ(d);
        }
        final PlayerResponseModel a2 = aiijVar.a(d);
        final akny aknyVar2 = this.j;
        if (a2 == null) {
            T = anaf.N(new IllegalArgumentException("value cannot be null."));
        } else {
            T = anaf.T(new anfy() { // from class: aknv
                @Override // defpackage.anfy
                public final anhy a() {
                    akny aknyVar3 = akny.this;
                    Object obj2 = agzwVar;
                    Object obj3 = a2;
                    aknx aknxVar2 = new aknx();
                    aknxVar2.a = obj3;
                    aknxVar2.c = 1;
                    long c = aknyVar3.a.a.a.c() + 3600000;
                    if (c > 0) {
                        long d2 = aknyVar3.c.d() + (c - aknyVar3.c.c());
                        if (d2 <= 0) {
                            d2 = -1;
                        }
                        aknxVar2.b = d2;
                    } else {
                        aknxVar2.b = c;
                    }
                    aknyVar3.d.d(obj2, aknxVar2);
                    aknyVar3.e.addAndGet(aknxVar2.c);
                    if (aknyVar3.e.get() > 50) {
                        Iterator it = aknyVar3.d.e().keySet().iterator();
                        while (aknyVar3.e.get() > 50) {
                            if (it.hasNext()) {
                                aknyVar3.d.i(it.next());
                            }
                        }
                    }
                    return anaf.O(null);
                }
            }, aknyVar2.b);
        }
        ynm.j(T, angq.a, afka.r);
        return a2;
    }
}
