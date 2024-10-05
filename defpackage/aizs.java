package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aizs implements ajai {
    private final qtv c;
    public int b = 1;
    public ammv a = amlr.a;
    private final ajaf d = new aizr(this);

    public aizs(qtv qtvVar) {
        this.c = qtvVar;
    }

    public static final apgf k(String str, String str2) {
        aone createBuilder = apgf.a.createBuilder();
        createBuilder.copyOnWrite();
        apgf apgfVar = (apgf) createBuilder.instance;
        str.getClass();
        apgfVar.b |= 1;
        apgfVar.e = str;
        if (!ammx.e(str2)) {
            createBuilder.copyOnWrite();
            apgf apgfVar2 = (apgf) createBuilder.instance;
            str2.getClass();
            apgfVar2.c = 3;
            apgfVar2.d = str2;
        }
        return (apgf) createBuilder.build();
    }

    private final synchronized void l(final atxz atxzVar) {
        if (atxzVar == null) {
            afsi.b(2, 10, "HeartbeatAttestationConfig requires attestation, but PlayerAttestationRenderer is null.");
            return;
        }
        String str = atxzVar.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append('?');
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        String queryParameter = parse.getQueryParameter("c5a");
        this.b = 2;
        if (queryParameter == null) {
            this.a = ammv.j(k(atxzVar.c, ""));
            this.b = 3;
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", atxzVar.c);
        qtx qtxVar = new qtx() { // from class: aizq
            @Override // defpackage.qtx
            public final void a(String str2) {
                aizs aizsVar = aizs.this;
                atxz atxzVar2 = atxzVar;
                synchronized (aizsVar) {
                    if (aizsVar.b == 2) {
                        aizsVar.a = ammv.j(aizs.k(atxzVar2.c, str2));
                        aizsVar.b = 3;
                    }
                }
            }
        };
        String queryParameter2 = parse.getQueryParameter("c5b");
        qtv qtvVar = this.c;
        if (true == ammx.e(queryParameter2)) {
            queryParameter2 = "yt_player";
        }
        qtvVar.a(queryParameter2, hashMap, qtxVar);
    }

    @Override // defpackage.ajai
    public final int a(ajah ajahVar) {
        atxz atxzVar = ajahVar.d;
        arya aryaVar = ajahVar.c;
        if (aryaVar == null || (aryaVar.b & 1) == 0 || !aryaVar.c) {
            return 5;
        }
        l(atxzVar);
        return 5;
    }

    @Override // defpackage.ajai
    public final aigr c(aryi aryiVar) {
        return null;
    }

    @Override // defpackage.ajai
    public final synchronized aigr d(aasx aasxVar) {
        if (this.b == 4) {
            this.b = 3;
        }
        return null;
    }

    @Override // defpackage.ajai
    public final ajaf e() {
        return this.d;
    }

    @Override // defpackage.ajai
    public final void f(ahef ahefVar) {
    }

    @Override // defpackage.ajai
    public final void g(aheg ahegVar) {
    }

    @Override // defpackage.ajai
    public final void h(ahej ahejVar) {
    }

    @Override // defpackage.ajai
    public final void i() {
    }

    @Override // defpackage.ajai
    public final boolean j(ajad ajadVar, ajah ajahVar) {
        if (ajahVar == null) {
            return (ajadVar == null || ajadVar.g == null) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001a, code lost:
    
        if (r3 != 3) goto L15;
     */
    @Override // defpackage.ajai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int b(defpackage.ajah r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            arya r0 = r5.c     // Catch: java.lang.Throwable -> L34
            r1 = 5
            r2 = 1
            if (r0 == 0) goto L11
            int r3 = r0.b     // Catch: java.lang.Throwable -> L34
            r3 = r3 & r2
            if (r3 == 0) goto L11
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L2a
            goto L1c
        L11:
            int r0 = r4.b     // Catch: java.lang.Throwable -> L34
            int r3 = r0 + (-1)
            if (r0 == 0) goto L32
            if (r3 == 0) goto L2a
            r0 = 3
            if (r3 == r0) goto L2a
        L1c:
            int r0 = r4.b     // Catch: java.lang.Throwable -> L34
            if (r0 == r2) goto L23
            r2 = 4
            if (r0 != r2) goto L28
        L23:
            atxz r5 = r5.d     // Catch: java.lang.Throwable -> L34
            r4.l(r5)     // Catch: java.lang.Throwable -> L34
        L28:
            monitor-exit(r4)
            return r1
        L2a:
            r4.b = r2     // Catch: java.lang.Throwable -> L34
            amlr r5 = defpackage.amlr.a     // Catch: java.lang.Throwable -> L34
            r4.a = r5     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)
            return r1
        L32:
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizs.b(ajah):int");
    }
}
