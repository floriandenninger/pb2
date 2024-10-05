package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afet extends Exception {
    public final amru a;
    public final int b;

    public afet(int i, String str, Throwable th) {
        this(i, str, th, amru.q());
    }

    public afet(int i, String str, Throwable th, List list) {
        super(str, th);
        this.b = i;
        this.a = amru.o(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afih a() {
        /*
            r11 = this;
            int r0 = r11.b
            int r1 = r0 + (-1)
            r2 = 0
            if (r0 == 0) goto L52
            if (r1 == 0) goto L26
            r0 = 1
            if (r1 == r0) goto L26
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L20
            r0 = 4
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r5 = r2
            goto L29
        L1a:
            java.lang.String r0 = "js.init"
            goto L28
        L1d:
            java.lang.String r0 = "js.exception"
            goto L28
        L20:
            java.lang.String r0 = "player.fatalexception"
            goto L28
        L23:
            java.lang.String r0 = "fmt.unparseable"
            goto L28
        L26:
            java.lang.String r0 = "fmt.unplayable"
        L28:
            r5 = r0
        L29:
            afih r0 = new afih
            afif r4 = defpackage.afif.SCRIPTED_PLAYER
            defpackage.afki.a(r5)
            amru r1 = r11.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L39
            goto L45
        L39:
            java.lang.String r1 = ";"
            ammr r1 = defpackage.ammr.b(r1)
            amru r2 = r11.a
            java.lang.String r2 = r1.d(r2)
        L45:
            r8 = r2
            r6 = 0
            r10 = 0
            r3 = r0
            r9 = r11
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r0.f()
            return r0
        L52:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afet.a():afih");
    }
}
