package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yeb implements afwx {
    private final acpl a;
    private final zaw b;
    private final yfi c;
    private final azrw d;
    private final acra e;
    private final Activity f;
    private final ycs g;
    private final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint h;
    private final arpp i;
    private final aoae j;

    public yeb(acpl acplVar, zaw zawVar, aoae aoaeVar, azrw azrwVar, acra acraVar, Activity activity, ycs ycsVar, YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, yfi yfiVar, byte[] bArr, byte[] bArr2) {
        arpp arppVar;
        this.a = acplVar;
        this.b = zawVar;
        this.j = aoaeVar;
        this.d = azrwVar;
        this.e = acraVar;
        this.f = activity;
        this.g = ycsVar;
        this.h = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
        this.c = yfiVar;
        if (ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.c.H()) {
            arppVar = null;
        } else {
            ydr ydrVar = new ydr();
            ydrVar.a = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.c;
            ydrVar.c = 3;
            arppVar = ydrVar.b();
        }
        this.i = arppVar;
    }

    private final void d() {
        arpp arppVar = this.i;
        if (arppVar != null) {
            this.a.c(arppVar);
        }
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.g.a();
        d();
        zaw zawVar = this.b;
        zawVar.d(zawVar.b(cnqVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    @Override // defpackage.cnl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void kZ(java.lang.Object r5) {
        /*
            r4 = this;
            asfw r5 = (defpackage.asfw) r5
            ycs r0 = r4.g
            r0.a()
            awhq r0 = defpackage.wcy.i(r5)
            if (r0 == 0) goto L3b
            java.lang.CharSequence r5 = defpackage.yjj.j(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L21
            android.app.Activity r5 = r4.f
            r0 = 2132018939(0x7f1406fb, float:1.9676199E38)
            java.lang.String r5 = r5.getString(r0)
            goto L25
        L21:
            java.lang.String r5 = r5.toString()
        L25:
            zaw r0 = r4.b
            r0.d(r5)
            yfi r5 = r4.c
            if (r5 == 0) goto L32
            r5.g()
            goto L37
        L32:
            aoae r5 = r4.j
            r5.l()
        L37:
            r4.d()
            return
        L3b:
            r0 = 0
            if (r5 == 0) goto L5d
            asfo r1 = r5.d
            if (r1 != 0) goto L44
            asfo r1 = defpackage.asfo.a
        L44:
            int r1 = r1.b
            r2 = 64099105(0x3d21321, float:1.23470825E-36)
            if (r1 != r2) goto L5d
            asfo r1 = r5.d
            if (r1 != 0) goto L51
            asfo r1 = defpackage.asfo.a
        L51:
            int r3 = r1.b
            if (r3 != r2) goto L5a
            java.lang.Object r1 = r1.c
            aqdt r1 = (defpackage.aqdt) r1
            goto L5e
        L5a:
            aqdt r1 = defpackage.aqdt.a
            goto L5e
        L5d:
            r1 = r0
        L5e:
            if (r1 == 0) goto L73
            android.app.Activity r5 = r4.f
            azrw r2 = r4.d
            java.lang.Object r2 = r2.get()
            aahd r2 = (defpackage.aahd) r2
            acra r3 = r4.e
            defpackage.ajdf.n(r5, r1, r2, r3, r0)
            r4.d()
            return
        L73:
            azrw r1 = r4.d
            java.lang.Object r1 = r1.get()
            aahd r1 = (defpackage.aahd) r1
            aony r2 = r5.f
            r1.d(r2, r0)
            yfi r0 = r4.c
            if (r0 == 0) goto L88
            r0.mJ(r5)
            goto L8d
        L88:
            aoae r0 = r4.j
            r0.n(r5)
        L8d:
            int r0 = r5.b
            r0 = r0 & 64
            if (r0 == 0) goto La3
            int r5 = r5.h
            int r5 = defpackage.awxr.I(r5)
            if (r5 != 0) goto L9c
            goto La3
        L9c:
            r0 = 2
            if (r5 != r0) goto La3
            r4.d()
            return
        La3:
            com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint r5 = r4.h
            aomf r5 = r5.c
            boolean r5 = r5.H()
            if (r5 != 0) goto Lc1
            acpl r5 = r4.a
            ydr r0 = new ydr
            r0.<init>()
            com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint r1 = r4.h
            aomf r1 = r1.c
            r0.a = r1
            arpp r0 = r0.f()
            r5.c(r0)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeb.kZ(java.lang.Object):void");
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
