package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class fan {
    final fao b;
    owf c;
    Object d;
    final /* synthetic */ fap e;

    public fan(fap fapVar, fao faoVar) {
        this.e = fapVar;
        this.b = faoVar;
    }

    protected abstract Object a(byte[] bArr);

    protected abstract byte[] b(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Object c() {
        /*
            r4 = this;
            monitor-enter(r4)
            owf r0 = r4.c     // Catch: java.lang.Throwable -> L79
            r1 = 0
            if (r0 == 0) goto La
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L3f
        La:
            fao r0 = r4.b     // Catch: java.lang.Throwable -> L79
            java.io.File r2 = r0.a     // Catch: java.lang.Throwable -> L79
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> L79
            if (r2 != 0) goto L16
            r0 = r1
            goto L1c
        L16:
            java.io.File r0 = r0.a     // Catch: java.lang.Throwable -> L79
            byte[] r0 = defpackage.anaf.v(r0)     // Catch: java.lang.Throwable -> L79
        L1c:
            if (r0 == 0) goto L2e
            aomw r2 = defpackage.aomw.b()     // Catch: defpackage.aoob -> L2b java.lang.Throwable -> L79
            owf r3 = defpackage.owf.a     // Catch: defpackage.aoob -> L2b java.lang.Throwable -> L79
            aonm r0 = defpackage.aonm.parseFrom(r3, r0, r2)     // Catch: defpackage.aoob -> L2b java.lang.Throwable -> L79
            owf r0 = (defpackage.owf) r0     // Catch: defpackage.aoob -> L2b java.lang.Throwable -> L79
            goto L2f
        L2b:
            r4.d()     // Catch: java.lang.Throwable -> L79
        L2e:
            r0 = r1
        L2f:
            r4.c = r0     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L77
            aomf r0 = r0.e     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L79
            byte[] r0 = r0.I()     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L79
            java.lang.Object r0 = r4.a(r0)     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L79
            r4.d = r0     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L79
        L3f:
            owf r0 = r4.c     // Catch: java.lang.Throwable -> L79
            r0.getClass()     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> L79
            fap r2 = r4.e     // Catch: java.lang.Throwable -> L79
            afsy r2 = r2.b     // Catch: java.lang.Throwable -> L79
            boolean r2 = r2.t()     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L66
            fap r2 = r4.e     // Catch: java.lang.Throwable -> L79
            afsy r2 = r2.b     // Catch: java.lang.Throwable -> L79
            afsx r2 = r2.c()     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.d()     // Catch: java.lang.Throwable -> L79
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L70
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L79
            monitor-exit(r4)
            return r0
        L66:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L70
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L79
            monitor-exit(r4)
            return r0
        L70:
            monitor-exit(r4)
            return r1
        L72:
            r4.d()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r4)
            return r1
        L77:
            monitor-exit(r4)
            return r1
        L79:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fan.c():java.lang.Object");
    }

    public final synchronized void d() {
        this.b.a();
        this.c = null;
        this.d = null;
    }

    public final synchronized void e(Object obj) {
        aone createBuilder = owf.a.createBuilder();
        if (this.e.b.t()) {
            String d = this.e.b.c().d();
            createBuilder.copyOnWrite();
            owf owfVar = (owf) createBuilder.instance;
            owfVar.b |= 1;
            owfVar.c = d;
        }
        long c = this.e.c.c();
        createBuilder.copyOnWrite();
        owf owfVar2 = (owf) createBuilder.instance;
        owfVar2.b |= 2;
        owfVar2.d = c;
        aomf x = aomf.x(b(obj));
        createBuilder.copyOnWrite();
        owf owfVar3 = (owf) createBuilder.instance;
        owfVar3.b |= 4;
        owfVar3.e = x;
        this.c = (owf) createBuilder.build();
        this.d = obj;
        this.e.d.execute(new fam(this));
    }
}
