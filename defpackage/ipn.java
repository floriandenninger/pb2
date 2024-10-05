package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipn implements ajms {
    public final Object a;
    public final Uri b;
    public final int c;
    private final long d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ipn(defpackage.apql r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L19
            int r1 = r3.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L19
            apqk r1 = r3.j
            if (r1 != 0) goto Lf
            apqk r1 = defpackage.apqk.a
        Lf:
            int r1 = r1.b
            int r1 = defpackage.anaf.aB(r1)
            if (r1 != 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipn.<init>(apql):void");
    }

    public static Uri a(apql apqlVar) {
        if (apqlVar == null) {
            return null;
        }
        String str = apqlVar.e;
        boolean z = true;
        if (apqlVar.l.size() != 0 || (apqlVar.m.size() <= 0 && apqlVar.n.size() <= 0)) {
            z = false;
        }
        return b(str, z);
    }

    public static Uri b(String str, boolean z) {
        return ajmu.g(4, true != z ? "channel/list/view" : "channel/list/edit", str);
    }

    public static void c(aone aoneVar) {
        long j = ((apql) aoneVar.instance).o;
        aoneVar.copyOnWrite();
        apql apqlVar = (apql) aoneVar.instance;
        apqlVar.b |= 1024;
        apqlVar.o = j + 1;
    }

    @Override // defpackage.ajms
    public final ajms e(ajms ajmsVar) {
        if (!(ajmsVar instanceof ipn)) {
            return this;
        }
        ipn ipnVar = (ipn) ajmsVar;
        return this.d > ipnVar.d ? this : ipnVar;
    }

    public ipn(apql apqlVar, int i) {
        long j = apqlVar.o;
        this.a = apqlVar;
        this.d = j;
        this.c = i;
        this.b = a(apqlVar);
    }
}
