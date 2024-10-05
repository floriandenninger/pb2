package defpackage;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhe {
    private static final qkw a = new qkw("ApplicationAnalyticsUtils");
    private static final String b = "20.1.0";
    private final String c;
    private final Map d;
    private final Map e;

    public qhe(Bundle bundle, String str) {
        this.c = str;
        this.d = qip.k(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.e = qip.k(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    public static void d(andk andkVar, boolean z) {
        aone createBuilder = andj.a.createBuilder(((andl) andkVar.instance).a());
        createBuilder.copyOnWrite();
        andj andjVar = (andj) createBuilder.instance;
        andjVar.b |= 2;
        andjVar.d = z;
        andkVar.copyOnWrite();
        ((andl) andkVar.instance).p((andj) createBuilder.build());
    }

    private static int e(int i) {
        return i + 10000;
    }

    public final andk a(qhd qhdVar) {
        long j;
        andk b2 = andl.b();
        long j2 = qhdVar.d;
        b2.copyOnWrite();
        ((andl) b2.instance).u(j2);
        int i = qhdVar.e;
        qhdVar.e = i + 1;
        b2.copyOnWrite();
        ((andl) b2.instance).r(i);
        String str = qhdVar.c;
        if (str != null) {
            b2.copyOnWrite();
            ((andl) b2.instance).s(str);
        }
        String str2 = qhdVar.h;
        if (str2 != null) {
            b2.copyOnWrite();
            ((andl) b2.instance).q(str2);
        }
        aone createBuilder = andi.a.createBuilder();
        String str3 = b;
        createBuilder.copyOnWrite();
        andi andiVar = (andi) createBuilder.instance;
        str3.getClass();
        andiVar.b |= 2;
        andiVar.d = str3;
        String str4 = this.c;
        createBuilder.copyOnWrite();
        andi andiVar2 = (andi) createBuilder.instance;
        str4.getClass();
        andiVar2.b |= 1;
        andiVar2.c = str4;
        andi andiVar3 = (andi) createBuilder.build();
        b2.copyOnWrite();
        ((andl) b2.instance).m(andiVar3);
        aone createBuilder2 = andj.a.createBuilder();
        if (qhdVar.b != null) {
            aone createBuilder3 = andm.a.createBuilder();
            String str5 = qhdVar.b;
            createBuilder3.copyOnWrite();
            andm andmVar = (andm) createBuilder3.instance;
            str5.getClass();
            andmVar.b |= 1;
            andmVar.c = str5;
            andm andmVar2 = (andm) createBuilder3.build();
            createBuilder2.copyOnWrite();
            andj andjVar = (andj) createBuilder2.instance;
            andmVar2.getClass();
            andjVar.c = andmVar2;
            andjVar.b |= 1;
        }
        createBuilder2.copyOnWrite();
        andj andjVar2 = (andj) createBuilder2.instance;
        andjVar2.b |= 2;
        andjVar2.d = false;
        String str6 = qhdVar.f;
        if (str6 != null) {
            try {
                String replace = str6.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                a.e(e, "receiverSessionId %s is not valid for hash", str6);
                j = 0;
            }
            createBuilder2.copyOnWrite();
            andj andjVar3 = (andj) createBuilder2.instance;
            andjVar3.b |= 4;
            andjVar3.e = j;
        }
        int i2 = qhdVar.g;
        createBuilder2.copyOnWrite();
        andj andjVar4 = (andj) createBuilder2.instance;
        andjVar4.b |= 1024;
        andjVar4.h = i2;
        b2.copyOnWrite();
        ((andl) b2.instance).p((andj) createBuilder2.build());
        return b2;
    }

    public final andl b(qhd qhdVar) {
        return (andl) a(qhdVar).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.andl c(defpackage.qhd r5, int r6) {
        /*
            r4 = this;
            andk r5 = r4.a(r5)
            aonm r0 = r5.instance
            andl r0 = (defpackage.andl) r0
            andj r0 = r0.a()
            andj r1 = defpackage.andj.a
            aone r0 = r1.createBuilder(r0)
            java.util.Map r1 = r4.e
            if (r1 == 0) goto L31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L21
            goto L31
        L21:
            java.util.Map r1 = r4.e
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            defpackage.qip.an(r1)
            int r1 = r1.intValue()
            goto L35
        L31:
            int r1 = e(r6)
        L35:
            r0.copyOnWrite()
            aonm r2 = r0.instance
            andj r2 = (defpackage.andj) r2
            int r3 = r2.b
            r3 = r3 | 64
            r2.b = r3
            r2.f = r1
            java.util.Map r1 = r4.d
            if (r1 == 0) goto L63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L53
            goto L63
        L53:
            java.util.Map r6 = r4.d
            java.lang.Object r6 = r6.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            defpackage.qip.an(r6)
            int r6 = r6.intValue()
            goto L67
        L63:
            int r6 = e(r6)
        L67:
            r0.copyOnWrite()
            aonm r1 = r0.instance
            andj r1 = (defpackage.andj) r1
            int r2 = r1.b
            r2 = r2 | 128(0x80, float:1.8E-43)
            r1.b = r2
            r1.g = r6
            aonm r6 = r0.build()
            andj r6 = (defpackage.andj) r6
            r5.copyOnWrite()
            aonm r0 = r5.instance
            andl r0 = (defpackage.andl) r0
            defpackage.andl.f(r0, r6)
            aonm r5 = r5.build()
            andl r5 = (defpackage.andl) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhe.c(qhd, int):andl");
    }
}
