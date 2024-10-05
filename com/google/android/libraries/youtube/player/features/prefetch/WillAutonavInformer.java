package com.google.android.libraries.youtube.player.features.prefetch;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import defpackage.afly;
import defpackage.afsy;
import defpackage.aftm;
import defpackage.ammv;
import defpackage.any;
import defpackage.aok;
import defpackage.aoot;
import defpackage.aqvj;
import defpackage.aqvk;
import defpackage.awwk;
import defpackage.axzg;
import defpackage.aypy;
import defpackage.ayqr;
import defpackage.ayrs;
import defpackage.ayrv;
import defpackage.aysu;
import defpackage.azre;
import defpackage.azrl;
import defpackage.wcf;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.ywr;
import defpackage.yxx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WillAutonavInformer implements any, ypd {
    public final ywr a;
    public final afsy b;
    public final aypy c;
    public final azrl d;
    public final boolean e;
    public final boolean f;
    public boolean g = true;
    public boolean h;
    public final wcf i;
    private final ypa j;

    /* JADX WARN: Multi-variable type inference failed */
    public WillAutonavInformer(ywr ywrVar, ypa ypaVar, wcf wcfVar, afsy afsyVar, ammv ammvVar, axzg axzgVar, yxx yxxVar, byte[] bArr, byte[] bArr2) {
        Boolean bool;
        final int i = 1;
        final int i2 = 0;
        Boolean bool2 = false;
        this.h = false;
        this.a = ywrVar;
        this.j = ypaVar;
        this.i = wcfVar;
        this.b = afsyVar;
        azrl e = azrl.e();
        this.d = e;
        this.h = ((Boolean) ammvVar.e(bool2)).booleanValue();
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45355556L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45355556L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45355556L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = bool2;
        }
        boolean booleanValue = bool.booleanValue();
        this.e = booleanValue;
        aqvj aqvjVar2 = axzgVar.b.b().C;
        aqvjVar2 = aqvjVar2 == null ? aqvj.a : aqvjVar2;
        if (aqvjVar2.a(45355557L)) {
            aoot aootVar2 = aqvjVar2.b;
            if (!aootVar2.containsKey(45355557L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar2 = (aqvk) aootVar2.get(45355557L);
            bool2 = Boolean.valueOf(aqvkVar2.b == 1 ? ((Boolean) aqvkVar2.c).booleanValue() : false);
        }
        boolean booleanValue2 = bool2.booleanValue();
        this.f = booleanValue2;
        if ((yxxVar.b(yxx.K) & 32) == 0) {
            final int i3 = 2;
            this.c = e.ab(azre.a()).Y(new ayrv(this) { // from class: aias
                public final /* synthetic */ WillAutonavInformer a;

                {
                    this.a = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
                
                    if (r7 == false) goto L36;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
                @Override // defpackage.ayrv
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(java.lang.Object r7) {
                    /*
                        r6 = this;
                        int r0 = r2
                        r1 = 0
                        r2 = 1
                        if (r0 == 0) goto L5e
                        com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer r0 = r6.a
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        afsy r7 = r0.b     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        afsx r7 = r7.c()     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r3 = r0.h     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r3 == 0) goto L26
                        wcf r3 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r3 = r3.f(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r3 != 0) goto L24
                        wcf r3 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r3 = r3.e(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r3 == 0) goto L26
                    L24:
                        r3 = 1
                        goto L27
                    L26:
                        r3 = 0
                    L27:
                        boolean r4 = r0.e     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r4 == 0) goto L35
                        wcf r4 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r4 = r4.d(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r4 == 0) goto L35
                        r4 = 1
                        goto L36
                    L35:
                        r4 = 0
                    L36:
                        boolean r5 = r0.f     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r5 == 0) goto L44
                        wcf r0 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r7 = r0.c(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r7 == 0) goto L44
                        r7 = 1
                        goto L45
                    L44:
                        r7 = 0
                    L45:
                        if (r3 != 0) goto L56
                        if (r4 != 0) goto L56
                        if (r7 == 0) goto L57
                        goto L56
                    L4c:
                        r7 = move-exception
                        goto L51
                    L4e:
                        r7 = move-exception
                        goto L51
                    L50:
                        r7 = move-exception
                    L51:
                        java.lang.String r0 = "WillAutonavInformer"
                        defpackage.zga.d(r0, r7)
                    L56:
                        r1 = 1
                    L57:
                        r7 = r1 ^ 1
                        java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                        return r7
                    L5e:
                        com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer r0 = r6.a
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        afsy r7 = r0.b
                        afsx r7 = r7.c()
                        boolean r3 = r0.h
                        if (r3 == 0) goto L7e
                        wcf r3 = r0.i
                        boolean r3 = r3.f(r7)
                        if (r3 != 0) goto L7c
                        wcf r3 = r0.i
                        boolean r3 = r3.e(r7)
                        if (r3 == 0) goto L7e
                    L7c:
                        r1 = 1
                        goto L98
                    L7e:
                        boolean r3 = r0.e
                        if (r3 == 0) goto L8b
                        wcf r3 = r0.i
                        boolean r3 = r3.d(r7)
                        if (r3 == 0) goto L8b
                        goto L7c
                    L8b:
                        boolean r3 = r0.f
                        if (r3 == 0) goto L98
                        wcf r0 = r0.i
                        boolean r7 = r0.c(r7)
                        if (r7 == 0) goto L98
                        goto L7c
                    L98:
                        r7 = r1 ^ 1
                        java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.aias.a(java.lang.Object):java.lang.Object");
                }
            }).aL(aysu.d, new ayrs(this) { // from class: aiar
                public final /* synthetic */ WillAutonavInformer a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i4 = i3;
                    if (i4 == 0) {
                        this.a.g = ((Boolean) obj).booleanValue();
                    } else if (i4 == 1) {
                        this.a.g = ((Boolean) obj).booleanValue();
                    } else {
                        WillAutonavInformer willAutonavInformer = this.a;
                        zga.c("WillAutonavInformer", "Error with retrieving isAutoNavDisabled value.");
                        willAutonavInformer.g = false;
                    }
                }
            }, aysu.c).ab(ayqr.a()).G(new ayrs(this) { // from class: aiar
                public final /* synthetic */ WillAutonavInformer a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i4 = i;
                    if (i4 == 0) {
                        this.a.g = ((Boolean) obj).booleanValue();
                    } else if (i4 == 1) {
                        this.a.g = ((Boolean) obj).booleanValue();
                    } else {
                        WillAutonavInformer willAutonavInformer = this.a;
                        zga.c("WillAutonavInformer", "Error with retrieving isAutoNavDisabled value.");
                        willAutonavInformer.g = false;
                    }
                }
            }).ae();
        } else {
            this.c = e.ab(azre.c()).Y(new ayrv(this) { // from class: aias
                public final /* synthetic */ WillAutonavInformer a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*
                        this = this;
                        int r0 = r2
                        r1 = 0
                        r2 = 1
                        if (r0 == 0) goto L5e
                        com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer r0 = r6.a
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        afsy r7 = r0.b     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        afsx r7 = r7.c()     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r3 = r0.h     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r3 == 0) goto L26
                        wcf r3 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r3 = r3.f(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r3 != 0) goto L24
                        wcf r3 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r3 = r3.e(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r3 == 0) goto L26
                    L24:
                        r3 = 1
                        goto L27
                    L26:
                        r3 = 0
                    L27:
                        boolean r4 = r0.e     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r4 == 0) goto L35
                        wcf r4 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r4 = r4.d(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r4 == 0) goto L35
                        r4 = 1
                        goto L36
                    L35:
                        r4 = 0
                    L36:
                        boolean r5 = r0.f     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r5 == 0) goto L44
                        wcf r0 = r0.i     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        boolean r7 = r0.c(r7)     // Catch: java.lang.SecurityException -> L4c defpackage.qcw -> L4e java.io.IOException -> L50
                        if (r7 == 0) goto L44
                        r7 = 1
                        goto L45
                    L44:
                        r7 = 0
                    L45:
                        if (r3 != 0) goto L56
                        if (r4 != 0) goto L56
                        if (r7 == 0) goto L57
                        goto L56
                    L4c:
                        r7 = move-exception
                        goto L51
                    L4e:
                        r7 = move-exception
                        goto L51
                    L50:
                        r7 = move-exception
                    L51:
                        java.lang.String r0 = "WillAutonavInformer"
                        defpackage.zga.d(r0, r7)
                    L56:
                        r1 = 1
                    L57:
                        r7 = r1 ^ 1
                        java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                        return r7
                    L5e:
                        com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer r0 = r6.a
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        afsy r7 = r0.b
                        afsx r7 = r7.c()
                        boolean r3 = r0.h
                        if (r3 == 0) goto L7e
                        wcf r3 = r0.i
                        boolean r3 = r3.f(r7)
                        if (r3 != 0) goto L7c
                        wcf r3 = r0.i
                        boolean r3 = r3.e(r7)
                        if (r3 == 0) goto L7e
                    L7c:
                        r1 = 1
                        goto L98
                    L7e:
                        boolean r3 = r0.e
                        if (r3 == 0) goto L8b
                        wcf r3 = r0.i
                        boolean r3 = r3.d(r7)
                        if (r3 == 0) goto L8b
                        goto L7c
                    L8b:
                        boolean r3 = r0.f
                        if (r3 == 0) goto L98
                        wcf r0 = r0.i
                        boolean r7 = r0.c(r7)
                        if (r7 == 0) goto L98
                        goto L7c
                    L98:
                        r7 = r1 ^ 1
                        java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.aias.a(java.lang.Object):java.lang.Object");
                }
            }).ac(afly.o).G(new ayrs(this) { // from class: aiar
                public final /* synthetic */ WillAutonavInformer a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i4 = i2;
                    if (i4 == 0) {
                        this.a.g = ((Boolean) obj).booleanValue();
                    } else if (i4 == 1) {
                        this.a.g = ((Boolean) obj).booleanValue();
                    } else {
                        WillAutonavInformer willAutonavInformer = this.a;
                        zga.c("WillAutonavInformer", "Error with retrieving isAutoNavDisabled value.");
                        willAutonavInformer.g = false;
                    }
                }
            }).ae();
        }
        this.c.aw();
        if (this.h || booleanValue || booleanValue2) {
            e.c(true);
        }
    }

    public final boolean g(awwk awwkVar) {
        return (awwkVar.b & 4) != 0 ? awwkVar.e : this.g;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            if (!this.h && !this.e && !this.f) {
                return null;
            }
            this.d.c(true);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.j.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.j.g(this);
    }
}
