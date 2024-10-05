package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agng {
    public final String a;
    public final String b;
    public final agnb c;
    public final Uri d;
    public final aami e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Date j;
    public final aqyg k;
    public final atqa l;
    public final String m;
    public final arfs n;

    public agng(agng agngVar, int i) {
        this(agngVar.a, agngVar.b, agngVar.c, agngVar.d, agngVar.e, i, agngVar.h, agngVar.i, agngVar.j, agngVar.l, agngVar.m, agngVar.n);
    }

    public static agng b(int i, String str, String str2, arfs arfsVar) {
        return new agng("PPSV", str, null, null, new aami(avgg.a), i, false, false, new Date(Long.MAX_VALUE), null, str2, arfsVar);
    }

    public static agng c(atqa atqaVar, boolean z, int i, aami aamiVar, agnb agnbVar) {
        aqyg aqygVar;
        String str = atqaVar.c;
        String str2 = atqaVar.g;
        Uri parse = atqaVar.h.isEmpty() ? null : Uri.parse(atqaVar.h);
        int i2 = (int) atqaVar.m;
        boolean z2 = atqaVar.k;
        Date date = new Date(TimeUnit.SECONDS.toMillis(atqaVar.i));
        if ((atqaVar.b & 256) != 0) {
            aqyg aqygVar2 = atqaVar.l;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            aqygVar = aqygVar2;
        } else {
            aqygVar = null;
        }
        return new agng(str, str2, agnbVar, parse, aamiVar, i, i2, z, z2, date, aqygVar, atqaVar, null, null);
    }

    public final Uri a() {
        if (this.e.a.isEmpty()) {
            return null;
        }
        return this.e.c(480).a();
    }

    public agng(String str, String str2, agnb agnbVar, Uri uri, aami aamiVar, int i, int i2, boolean z, boolean z2, Date date, aqyg aqygVar, atqa atqaVar, String str3, arfs arfsVar) {
        aqyg aqygVar2;
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = agnbVar;
        this.d = uri;
        this.e = aamiVar;
        this.f = i;
        this.h = z;
        this.i = z2;
        this.j = date;
        this.l = atqaVar;
        this.m = str3;
        this.n = arfsVar;
        if (aqygVar != null) {
            this.k = aqygVar;
        } else {
            if (atqaVar == null || (atqaVar.b & 256) == 0) {
                aqygVar2 = null;
            } else {
                aqygVar2 = atqaVar.l;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            }
            this.k = aqygVar2;
        }
        this.g = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public agng(java.lang.String r16, java.lang.String r17, defpackage.agnb r18, android.net.Uri r19, defpackage.aami r20, int r21, boolean r22, boolean r23, java.util.Date r24, defpackage.atqa r25, java.lang.String r26, defpackage.arfs r27) {
        /*
            r15 = this;
            r12 = r25
            if (r12 == 0) goto Lf
            int r0 = r12.b
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto Lf
            long r0 = r12.m
            int r1 = (int) r0
            r7 = r1
            goto L11
        Lf:
            r7 = r21
        L11:
            r0 = 0
            if (r12 == 0) goto L20
            int r1 = r12.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L20
            aqyg r0 = r12.l
            if (r0 != 0) goto L20
            aqyg r0 = defpackage.aqyg.a
        L20:
            r11 = r0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agng.<init>(java.lang.String, java.lang.String, agnb, android.net.Uri, aami, int, boolean, boolean, java.util.Date, atqa, java.lang.String, arfs):void");
    }
}
