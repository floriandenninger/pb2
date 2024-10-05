package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aezo implements aezs {
    final /* synthetic */ aezt a;
    private final int b;
    private final aezk c;

    public aezo(aezt aeztVar, aezk aezkVar, int i) {
        this.a = aeztVar;
        this.c = aezkVar;
        this.b = i;
    }

    @Override // defpackage.aezs
    public final int a() {
        return this.c.a;
    }

    @Override // defpackage.aezs
    public final int b() {
        int a = a();
        if (a == 1) {
            return 100;
        }
        aone createBuilder = aqvp.a.createBuilder();
        int i = this.b;
        createBuilder.copyOnWrite();
        aqvp aqvpVar = (aqvp) createBuilder.instance;
        aqvpVar.b = 1 | aqvpVar.b;
        aqvpVar.c = i;
        long millis = TimeUnit.SECONDS.toMillis(20L);
        createBuilder.copyOnWrite();
        aqvp aqvpVar2 = (aqvp) createBuilder.instance;
        aqvpVar2.b |= 4;
        aqvpVar2.e = (int) millis;
        createBuilder.copyOnWrite();
        aqvp aqvpVar3 = (aqvp) createBuilder.instance;
        aqvpVar3.b |= 2;
        aqvpVar3.d = 1.3f;
        createBuilder.copyOnWrite();
        aqvp aqvpVar4 = (aqvp) createBuilder.instance;
        aqvpVar4.b |= 8;
        aqvpVar4.f = 0.1f;
        final aqvp aqvpVar5 = (aqvp) createBuilder.build();
        return new afjl(new amnv() { // from class: aezn
            @Override // defpackage.amnv
            public final Object get() {
                return aqvp.this;
            }
        }).a(a - 1);
    }

    @Override // defpackage.aezs
    public final /* synthetic */ long c() {
        return -9223372036854775807L;
    }

    @Override // defpackage.aezs
    public final void d() {
        this.c.a++;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[RETURN] */
    @Override // defpackage.aezs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r3 = this;
            int r0 = r3.a()
            aezt r1 = r3.a
            amnv r1 = r1.b
            java.lang.Object r1 = r1.get()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r1 = (com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel) r1
            atyi r1 = r1.c
            aquz r1 = r1.e
            if (r1 != 0) goto L16
            aquz r1 = defpackage.aquz.b
        L16:
            int r1 = r1.bt
            r2 = -1
            if (r1 > 0) goto L21
            if (r1 == r2) goto L20
            r1 = 10
            goto L26
        L20:
            r1 = -1
        L21:
            if (r1 != r2) goto L26
            r1 = 2147483647(0x7fffffff, float:NaN)
        L26:
            if (r0 >= r1) goto L2a
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezo.e():boolean");
    }
}
