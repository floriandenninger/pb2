package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeni implements att {
    final /* synthetic */ aenj a;

    public aeni(aenj aenjVar) {
        this.a = aenjVar;
    }

    @Override // defpackage.att
    public final void a(ate ateVar, ath athVar, boolean z, int i) {
        synchronized (this.a) {
            if (!this.a.b.contains(ateVar)) {
                this.a.a(ateVar, athVar, z, i);
            }
        }
    }

    @Override // defpackage.att
    public final void b(ate ateVar, ath athVar, boolean z) {
        synchronized (this.a) {
            if (!this.a.b.contains(ateVar)) {
                this.a.b(ateVar, athVar, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[Catch: all -> 0x0098, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:8:0x0025, B:10:0x002d, B:13:0x0036, B:15:0x0042, B:16:0x0089, B:18:0x008f, B:19:0x004b, B:20:0x0056, B:22:0x005d, B:26:0x0069, B:27:0x0076, B:29:0x007c, B:30:0x0080, B:24:0x0072, B:33:0x0085, B:34:0x0096), top: B:3:0x0003 }] */
    @Override // defpackage.att
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ate r6, defpackage.ath r7, boolean r8) {
        /*
            r5 = this;
            aenj r8 = r5.a
            monitor-enter(r8)
            aenj r0 = r5.a     // Catch: java.lang.Throwable -> L98
            java.util.Set r0 = r0.b     // Catch: java.lang.Throwable -> L98
            r0.remove(r6)     // Catch: java.lang.Throwable -> L98
            aenj r0 = r5.a     // Catch: java.lang.Throwable -> L98
            aaoz r0 = r0.a     // Catch: java.lang.Throwable -> L98
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r0.get()     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.aJ()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L96
            android.net.Uri r7 = r7.a     // Catch: java.lang.Throwable -> L98
            java.util.Set r0 = defpackage.aaoq.c()     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r7.getPath()     // Catch: java.lang.Throwable -> L98
            r2 = -1
            if (r1 == 0) goto L85
            java.lang.String r3 = "/videoplayback"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L36
            java.lang.String r3 = "/initsegment"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L36
            goto L85
        L36:
            java.lang.String r3 = "itag"
            java.lang.String r7 = r7.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L98
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L4b
            int r7 = defpackage.ozv.a(r7)     // Catch: java.lang.Throwable -> L98
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L98
            goto L89
        L4b:
            r7 = 47
            amnm r7 = defpackage.amnm.b(r7)     // Catch: java.lang.Throwable -> L98
            java.util.List r7 = r7.h(r1)     // Catch: java.lang.Throwable -> L98
            r1 = 0
        L56:
            int r3 = r7.size()     // Catch: java.lang.Throwable -> L98
            int r3 = r3 + r2
            if (r1 >= r3) goto L75
            java.lang.String r3 = "itag"
            java.lang.Object r4 = r7.get(r1)     // Catch: java.lang.Throwable -> L98
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L72
            int r1 = r1 + 1
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L98
            goto L76
        L72:
            int r1 = r1 + 1
            goto L56
        L75:
            r7 = 0
        L76:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L98
            if (r1 != 0) goto L80
            int r2 = defpackage.ozv.a(r7)     // Catch: java.lang.Throwable -> L98
        L80:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L98
            goto L89
        L85:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L98
        L89:
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L98
            if (r7 != 0) goto L96
            aenj r7 = r5.a     // Catch: java.lang.Throwable -> L98
            java.util.Set r7 = r7.b     // Catch: java.lang.Throwable -> L98
            r7.add(r6)     // Catch: java.lang.Throwable -> L98
        L96:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L98
            return
        L98:
            r6 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L98
            goto L9c
        L9b:
            throw r6
        L9c:
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeni.c(ate, ath, boolean):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:11|(1:13)|14|(7:16|(1:18)|19|(1:21)|22|23|(7:25|(3:27|(1:29)|30)(1:38)|31|(1:33)(1:37)|34|35|36))|39|(1:41)|42|43|44|(1:62)|49|50|(3:52|23|(0))|22|23|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:9:0x000f, B:11:0x0013, B:13:0x0021, B:14:0x0023, B:16:0x0029, B:18:0x002f, B:19:0x0031, B:25:0x0080, B:27:0x008a, B:29:0x008e, B:30:0x0090, B:34:0x009c, B:35:0x00ac, B:39:0x0038, B:41:0x0041, B:42:0x0043, B:44:0x0045, B:49:0x006e, B:54:0x004d, B:57:0x0054, B:59:0x005c, B:62:0x0063, B:64:0x00ae, B:65:0x00b3), top: B:3:0x0003 }] */
    @Override // defpackage.att
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ate r10, defpackage.ath r11, boolean r12) {
        /*
            r9 = this;
            aenj r0 = r9.a
            monitor-enter(r0)
            aenj r1 = r9.a     // Catch: java.lang.Throwable -> Lb5
            java.util.Set r1 = r1.b     // Catch: java.lang.Throwable -> Lb5
            boolean r1 = r1.contains(r10)     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb5
            return
        Lf:
            boolean r1 = r10 instanceof defpackage.pow     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto Lae
            aenj r1 = r9.a     // Catch: java.lang.Throwable -> Lb5
            aaoz r1 = r1.a     // Catch: java.lang.Throwable -> Lb5
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r1 = r1.get()     // Catch: java.lang.Throwable -> Lb5
            atyi r2 = r1.c     // Catch: java.lang.Throwable -> Lb5
            astb r2 = r2.G     // Catch: java.lang.Throwable -> Lb5
            if (r2 != 0) goto L23
            astb r2 = defpackage.astb.a     // Catch: java.lang.Throwable -> Lb5
        L23:
            boolean r2 = r2.c     // Catch: java.lang.Throwable -> Lb5
            r3 = -1
            if (r2 != 0) goto L38
            atyi r2 = r1.c     // Catch: java.lang.Throwable -> Lb5
            astb r2 = r2.G     // Catch: java.lang.Throwable -> Lb5
            if (r2 != 0) goto L31
            astb r2 = defpackage.astb.a     // Catch: java.lang.Throwable -> Lb5
        L31:
            boolean r2 = r2.d     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto L36
            goto L38
        L36:
            r5 = r3
            goto L7c
        L38:
            r2 = r10
            pow r2 = (defpackage.pow) r2     // Catch: java.lang.Throwable -> Lb5
            atyi r5 = r1.c     // Catch: java.lang.Throwable -> Lb5
            aquz r5 = r5.e     // Catch: java.lang.Throwable -> Lb5
            if (r5 != 0) goto L43
            aquz r5 = defpackage.aquz.b     // Catch: java.lang.Throwable -> Lb5
        L43:
            java.lang.String r5 = r5.ag     // Catch: java.lang.Throwable -> Lb5
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
            r7 = 0
            if (r6 == 0) goto L4d
            goto L6b
        L4d:
            java.util.Map r2 = r2.a()     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
            if (r2 != 0) goto L54
            goto L6b
        L54:
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
            if (r2 == 0) goto L6b
            boolean r5 = r2.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
            if (r5 == 0) goto L63
            goto L6b
        L63:
            r5 = 0
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
        L6b:
            if (r7 != 0) goto L6e
            goto L36
        L6e:
            long r5 = java.lang.Long.parseLong(r7)     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.Throwable -> Lb5
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L36
            r7 = 8
            long r5 = r5 * r7
        L7c:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto Lae
            atyi r11 = r1.c     // Catch: java.lang.Throwable -> Lb5
            int r12 = r11.b     // Catch: java.lang.Throwable -> Lb5
            r12 = r12 & 2
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L93
            aquz r11 = r11.e     // Catch: java.lang.Throwable -> Lb5
            if (r11 != 0) goto L90
            aquz r11 = defpackage.aquz.b     // Catch: java.lang.Throwable -> Lb5
        L90:
            float r11 = r11.ax     // Catch: java.lang.Throwable -> Lb5
            goto L95
        L93:
            r11 = 1065353216(0x3f800000, float:1.0)
        L95:
            r12 = 0
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 > 0) goto L9b
            goto L9c
        L9b:
            r1 = r11
        L9c:
            aenj r11 = r9.a     // Catch: java.lang.Throwable -> Lb5
            float r12 = (float) r5     // Catch: java.lang.Throwable -> Lb5
            float r12 = r12 * r1
            long r1 = (long) r12     // Catch: java.lang.Throwable -> Lb5
            r11.m(r1)     // Catch: java.lang.Throwable -> Lb5
            aenj r11 = r9.a     // Catch: java.lang.Throwable -> Lb5
            java.util.Set r11 = r11.b     // Catch: java.lang.Throwable -> Lb5
            r11.add(r10)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb5
            return
        Lae:
            aenj r1 = r9.a     // Catch: java.lang.Throwable -> Lb5
            r1.d(r10, r11, r12)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb5
            return
        Lb5:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb5
            goto Lb9
        Lb8:
            throw r10
        Lb9:
            goto Lb8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeni.d(ate, ath, boolean):void");
    }
}
