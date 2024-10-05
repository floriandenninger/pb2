package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afua extends afvw {
    private final owe a;
    private final shf b;
    private final afwx c;
    private final afsy k;
    private final Set l;
    private final afve m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public afua(defpackage.owe r5, defpackage.afwx r6, defpackage.shf r7, defpackage.afql r8, defpackage.afsy r9, java.util.Set r10) {
        /*
            r4 = this;
            int r0 = r5.d
            switch(r0) {
                case -1: goto L1c;
                case 0: goto L1c;
                case 1: goto L1a;
                case 2: goto L18;
                case 3: goto L16;
                case 4: goto L14;
                case 5: goto L12;
                case 6: goto L10;
                case 7: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Given method number is not defined"
            r5.<init>(r6)
            throw r5
        Ld:
            r0 = 8
            goto L1d
        L10:
            r0 = 7
            goto L1d
        L12:
            r0 = 6
            goto L1d
        L14:
            r0 = 5
            goto L1d
        L16:
            r0 = 4
            goto L1d
        L18:
            r0 = 3
            goto L1d
        L1a:
            r0 = 2
            goto L1d
        L1c:
            r0 = 1
        L1d:
            r5.getClass()
            java.lang.String r1 = r5.e
            r4.<init>(r0, r1, r6)
            cne r0 = new cne
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            int r8 = r8.d()
            long r2 = (long) r8
            long r1 = r1.toMillis(r2)
            int r8 = (int) r1
            r1 = 0
            r2 = 0
            r0.<init>(r8, r2, r1)
            r4.f = r0
            r4.h = r2
            r4.a = r5
            r4.c = r6
            r4.b = r7
            r4.k = r9
            r4.l = r10
            afux r6 = new afux
            r6.<init>(r5)
            r4.m = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afua.<init>(owe, afwx, shf, afql, afsy, java.util.Set):void");
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final afsx e() {
        String str = this.a.q;
        if (TextUtils.isEmpty(str)) {
            return afsw.a;
        }
        afsx d = this.k.d(str);
        if (d != null) {
            return d;
        }
        zga.b("DelayedPingVolleyRequest: AuthFailureError, identity id not found");
        return afsw.a;
    }

    @Override // defpackage.yvo
    public final Map f() {
        HashMap hashMap = new HashMap();
        for (owa owaVar : this.a.f) {
            int i = owaVar.b;
            if ((i & 1) != 0 && (i & 2) != 0) {
                hashMap.put(owaVar.c, owaVar.d);
            }
        }
        for (afvb afvbVar : this.l) {
            if (this.m.a(afvbVar.a()) && !afvbVar.e()) {
                try {
                    afvbVar.b(hashMap, this);
                } catch (cnb e) {
                    String valueOf = String.valueOf(e.toString());
                    zga.b(valueOf.length() != 0 ? "DelayedPingVolleyRequest: AuthFailureError".concat(valueOf) : new String("DelayedPingVolleyRequest: AuthFailureError"));
                }
            }
        }
        hashMap.put("X-Goog-Request-Time", String.valueOf(this.b.c()));
        hashMap.put("X-Goog-Event-Time", String.valueOf(this.a.i));
        return hashMap;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        return cnm.b(null, null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        this.c.kZ(null);
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        owe oweVar = this.a;
        if ((oweVar.b & 16) != 0) {
            return oweVar.h.I();
        }
        return null;
    }
}
