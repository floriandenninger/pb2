package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jti {
    private final amsj a;

    public jti(amsj amsjVar, byte[] bArr) {
        this.a = amsjVar;
    }

    public final apib a(fjs fjsVar, aqnf aqnfVar) {
        return (apib) g(fjs.class, apib.class, fjsVar, amrz.k("downloads_page_filter_type", Integer.valueOf(aqnfVar.e)));
    }

    public final aqrf b(awig awigVar) {
        return (aqrf) g(awig.class, aqrf.class, awigVar, null);
    }

    public final aqrf c(awil awilVar) {
        return (aqrf) g(awil.class, aqrf.class, awilVar, null);
    }

    public final atde d(agnp agnpVar, String str) {
        amrz k;
        agnpVar.getClass();
        if (ammx.e(str)) {
            k = null;
        } else {
            zhq.m(str);
            k = amrz.k("downloaded_video_playlist_id", str);
        }
        return (atde) g(agnp.class, atde.class, agnpVar, k);
    }

    public final atde e(agnv agnvVar, String str) {
        amrz k;
        agnvVar.getClass();
        if (ammx.e(str)) {
            k = null;
        } else {
            zhq.m(str);
            k = amrz.k("downloaded_video_playlist_id", str);
        }
        return (atde) g(agnv.class, atde.class, agnvVar, k);
    }

    public final Optional f(jht jhtVar, String str, int i, String str2, aomf aomfVar) {
        jhtVar.getClass();
        return Optional.ofNullable((asfc) g(jht.class, asfc.class, jhtVar, amrz.n("downloaded_video_playlist_id", str, "downloaded_video_list_index", Integer.valueOf(i), "watch_command_params", str2, "watch_command_click_tracking_params", aomfVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Class r8, java.lang.Class r9, java.lang.Object r10, defpackage.amrz r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r10 != 0) goto Lb
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r8 != r2) goto L9
            goto Lb
        L9:
            r2 = 0
            goto Lc
        Lb:
            r2 = 1
        Lc:
            java.lang.String r3 = "Passed in a null model."
            defpackage.amkq.F(r2, r3)
            amsj r2 = r7.a
            jsq r3 = new jsq
            r3.<init>(r8, r9)
            java.util.Map r4 = r2.a
            boolean r4 = r4.containsKey(r3)
            r5 = 0
            if (r4 != 0) goto L23
        L21:
            r2 = r5
            goto L62
        L23:
            java.util.Map r2 = r2.a
            java.lang.Object r2 = r2.get(r3)
            jtc r2 = (defpackage.jtc) r2
            java.lang.Class r3 = r2.c()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L3f
            java.lang.Class r3 = r2.d()
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L62
        L3f:
            java.lang.Class r3 = r2.c()
            java.lang.Class r2 = r2.d()
            java.util.Locale r4 = java.util.Locale.ROOT
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r8 = defpackage.amsj.i(r8, r9)
            r6[r0] = r8
            java.lang.String r8 = defpackage.amsj.i(r3, r2)
            r6[r1] = r8
            java.lang.String r8 = "Type mismatch for OfflineModelToRendererGenerator object. Expected=%s, Actual=%s"
            java.lang.String r8 = java.lang.String.format(r4, r8, r6)
            defpackage.zga.b(r8)
            goto L21
        L62:
            if (r2 == 0) goto L69
            java.lang.Object r8 = r2.b(r10, r11)
            return r8
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jti.g(java.lang.Class, java.lang.Class, java.lang.Object, amrz):java.lang.Object");
    }
}
