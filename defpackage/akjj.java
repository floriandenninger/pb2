package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjj implements aaha {
    public final zaw a;
    private final aavj b;
    private final aahd c;
    private final acqz d;

    public akjj(aavj aavjVar, zaw zawVar, aahd aahdVar, acqz acqzVar) {
        aavjVar.getClass();
        this.b = aavjVar;
        zawVar.getClass();
        this.a = zawVar;
        aahdVar.getClass();
        this.c = aahdVar;
        acqzVar.getClass();
        this.d = acqzVar;
    }

    public final void b(Map map, arle arleVar) {
        if (arleVar.e.size() != 0) {
            this.c.e(arleVar.e, null);
        }
        if ((arleVar.b & 2) != 0) {
            asht ashtVar = (asht) yjj.u(map, "client_data_override", asht.class);
            HashMap hashMap = new HashMap();
            hashMap.put(acrc.c, ashtVar);
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.d.mM());
            aahd aahdVar = this.c;
            aahd aahdVar2 = (aahd) yjj.u(map, "endpoint_resolver_override", aahd.class);
            if (aahdVar2 != null) {
                aahdVar = aahdVar2;
            }
            apxf apxfVar = arleVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
        }
        akji akjiVar = (akji) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", akji.class);
        if (akjiVar != null) {
            akjiVar.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // defpackage.aaha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kE(defpackage.apxf r10, java.util.Map r11) {
        /*
            r9 = this;
            aonk r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint
            java.lang.Object r0 = r10.pX(r0)
            com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint r0 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint) r0
            arlf r1 = r0.d
            if (r1 != 0) goto Le
            arlf r1 = defpackage.arlf.a
        Le:
            boolean r1 = r1.d
            r2 = 0
            if (r1 == 0) goto L15
        L13:
            r0 = r2
            goto L27
        L15:
            arle r1 = r0.e
            if (r1 != 0) goto L1b
            arle r1 = defpackage.arle.a
        L1b:
            int r1 = r1.b
            r1 = r1 & 2
            if (r1 == 0) goto L13
            arle r0 = r0.e
            if (r0 != 0) goto L27
            arle r0 = defpackage.arle.a
        L27:
            acqz r1 = r9.d
            java.lang.Class<acra> r3 = defpackage.acra.class
            java.lang.String r4 = "interaction_logger_override"
            java.lang.Object r3 = defpackage.yjj.u(r11, r4, r3)
            acra r3 = (defpackage.acra) r3
            if (r3 == 0) goto L36
            goto L3a
        L36:
            acra r3 = r1.mM()
        L3a:
            if (r0 != 0) goto L91
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "click_tracking_params"
            java.lang.Object r0 = defpackage.yjj.u(r11, r1, r0)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L51
            acqx r1 = new acqx
            r1.<init>(r0)
            r0 = 3
            r3.I(r0, r1, r2)
        L51:
            aonk r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint
            java.lang.Object r10 = r10.pX(r0)
            com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint r10 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint) r10
            aavj r0 = r9.b
            arlh r1 = r10.c
            if (r1 != 0) goto L61
            arlh r1 = defpackage.arlh.a
        L61:
            arlf r10 = r10.d
            if (r10 != 0) goto L67
            arlf r10 = defpackage.arlf.a
        L67:
            akjh r2 = new akjh
            r2.<init>(r9, r11)
            aavs r11 = new aavs
            ajoy r4 = r0.f
            afsy r3 = r0.a
            afsx r5 = r3.c()
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r11.a = r1
            r11.b = r10
            arle r10 = defpackage.arle.a
            aarm r1 = r0.b
            aatt r3 = defpackage.aatt.u
            aavd r4 = defpackage.aavd.e
            aasp r10 = r0.c(r10, r1, r3, r4)
            r10.e(r11, r2)
            return
        L91:
            r9.b(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjj.kE(apxf, java.util.Map):void");
    }
}
