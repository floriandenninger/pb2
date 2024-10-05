package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class luc implements ajvz {
    static final String a = String.valueOf(luc.class.getName()).concat(".PRESENT_CONTEXT_KEY");
    public final boolean b;
    public ajol c;
    public Object d;
    public boolean e;
    private lua f;
    private final aoae g;

    public luc(aoae aoaeVar, ajxe ajxeVar, byte[] bArr, byte[] bArr2) {
        amkq.E(ajxeVar instanceof lub);
        this.g = aoaeVar;
        lub lubVar = (lub) ajxeVar;
        this.d = lubVar.a;
        this.b = lubVar.b;
    }

    public luc(aoae aoaeVar, boolean z, byte[] bArr, byte[] bArr2) {
        this.g = aoaeVar;
        this.b = z;
    }

    public static ammv a(ajok ajokVar) {
        ajokVar.getClass();
        Object c = ajokVar.c(a);
        return c instanceof luc ? ammv.j((luc) c) : amlr.a;
    }

    public final void b(lua luaVar, Object obj) {
        obj.getClass();
        lua luaVar2 = this.f;
        if (luaVar2 != null) {
            luaVar2.c(false);
        }
        if (this.e) {
            luaVar.c(true);
        }
        this.f = luaVar;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        if (r0.pY(com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass.downloadsPageEndpoint) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bd, code lost:
    
        if ("FEhistory".equals(((defpackage.aplt) r0.pX(com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint)).c) != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.lua r7, java.lang.Object r8) {
        /*
            r6 = this;
            r7.getClass()
            r8.getClass()
            java.lang.Object r0 = r6.d
            r1 = 4
            if (r0 == 0) goto L67
            java.lang.Class r2 = r8.getClass()
            java.lang.Class r3 = r0.getClass()
            if (r2 == r3) goto L16
            goto L66
        L16:
            boolean r2 = r8 instanceof defpackage.aqbs
            if (r2 == 0) goto L3c
            aoae r2 = r6.g
            r3 = r8
            aqbs r3 = (defpackage.aqbs) r3
            int r4 = r3.e
            if (r4 != r1) goto L28
            java.lang.Object r3 = r3.f
            apxf r3 = (defpackage.apxf) r3
            goto L2a
        L28:
            apxf r3 = defpackage.apxf.a
        L2a:
            aqbs r0 = (defpackage.aqbs) r0
            int r4 = r0.e
            if (r4 != r1) goto L35
            java.lang.Object r0 = r0.f
            apxf r0 = (defpackage.apxf) r0
            goto L37
        L35:
            apxf r0 = defpackage.apxf.a
        L37:
            boolean r0 = r2.g(r3, r0)
            goto L61
        L3c:
            boolean r2 = r8 instanceof defpackage.aqbw
            if (r2 == 0) goto L66
            aoae r2 = r6.g
            r3 = r8
            aqbw r3 = (defpackage.aqbw) r3
            int r4 = r3.c
            if (r4 != r1) goto L4e
            java.lang.Object r3 = r3.d
            apxf r3 = (defpackage.apxf) r3
            goto L50
        L4e:
            apxf r3 = defpackage.apxf.a
        L50:
            aqbw r0 = (defpackage.aqbw) r0
            int r4 = r0.c
            if (r4 != r1) goto L5b
            java.lang.Object r0 = r0.d
            apxf r0 = (defpackage.apxf) r0
            goto L5d
        L5b:
            apxf r0 = defpackage.apxf.a
        L5d:
            boolean r0 = r2.g(r3, r0)
        L61:
            if (r0 == 0) goto L66
            r6.b(r7, r8)
        L66:
            return
        L67:
            boolean r0 = r6.b
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L88
            boolean r0 = r8 instanceof defpackage.aqbw
            if (r0 == 0) goto Lc0
            r0 = r8
            aqbw r0 = (defpackage.aqbw) r0
            int r4 = r0.c
            if (r4 != r1) goto L7d
            java.lang.Object r0 = r0.d
            apxf r0 = (defpackage.apxf) r0
            goto L7f
        L7d:
            apxf r0 = defpackage.apxf.a
        L7f:
            aonk r1 = com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass.downloadsPageEndpoint
            boolean r0 = r0.pY(r1)
            if (r0 == 0) goto Lc0
            goto Lc1
        L88:
            boolean r0 = r8 instanceof defpackage.aqbs
            if (r0 == 0) goto Lc0
            r0 = r8
            aqbs r0 = (defpackage.aqbs) r0
            int r4 = r0.e
            if (r4 != r1) goto L98
            java.lang.Object r4 = r0.f
            apxf r4 = (defpackage.apxf) r4
            goto L9a
        L98:
            apxf r4 = defpackage.apxf.a
        L9a:
            aonk r5 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint
            boolean r4 = r4.pY(r5)
            if (r4 == 0) goto Lc0
            int r4 = r0.e
            if (r4 != r1) goto Lab
            java.lang.Object r0 = r0.f
            apxf r0 = (defpackage.apxf) r0
            goto Lad
        Lab:
            apxf r0 = defpackage.apxf.a
        Lad:
            aonk r1 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint
            java.lang.Object r0 = r0.pX(r1)
            aplt r0 = (defpackage.aplt) r0
            java.lang.String r0 = r0.c
            java.lang.String r1 = "FEhistory"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc0
            goto Lc1
        Lc0:
            r2 = 0
        Lc1:
            if (r2 == 0) goto Lc6
            r6.b(r7, r8)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luc.c(lua, java.lang.Object):void");
    }

    public final void d(lua luaVar) {
        luaVar.getClass();
        if (luaVar.equals(this.f)) {
            this.f = null;
        }
    }

    @Override // defpackage.ajvz
    public final ajxe ph() {
        throw null;
    }
}
