package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.RelatedChipCloudRendererOuterClass;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajtc extends ajsu implements ypd {
    private final ypa a;
    private final ajpd b;
    public final ausu c;
    public final ajoc d;
    protected final ajpd e;
    public final ajpd f;
    public final ajnb g;
    protected final ajpd h;
    protected final ajum i;
    public boolean j;
    public int k;
    protected final ammv l;
    public final List m;
    public final ajwt n;
    private final ajul o;
    private final boolean p;
    private boolean q;
    private final ajuo r;
    private final int s;
    private final CharSequence t;
    private final CharSequence u;
    private final apxf v;
    private final ajta w;
    private final ajfh x;
    private final ajsy y;

    public ajtc(ajvb ajvbVar, ypa ypaVar, ausu ausuVar, List list, int i, ajuo ajuoVar, ammv ammvVar, CharSequence charSequence, CharSequence charSequence2, apxf apxfVar, int i2, boolean z, ajwv ajwvVar, ajfh ajfhVar, ajxe ajxeVar) {
        this(ajvbVar, ypaVar, ausuVar, list, i, ajuoVar, ammvVar, charSequence, charSequence2, apxfVar, i2, z, ajwvVar, ajfhVar, ajxeVar, ajsx.a);
    }

    private final boolean pj() {
        int bu = aobq.bu(this.c.s);
        if (bu == 0) {
            bu = 1;
        }
        return bu == 3 || bu == 4 || bu == 2;
    }

    protected abstract Class c();

    protected void d() {
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public void j() {
        this.a.m(this);
        this.r.f(this.y);
    }

    @Override // defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i) {
        return ahbw.l(this, obj, i);
    }

    public final int l(int i) {
        ausu ausuVar = this.c;
        int i2 = ausuVar.d;
        if (i2 != 45) {
            return i2 == 46 ? Math.max(((Integer) ausuVar.e).intValue(), i) : i;
        }
        return ((Integer) ausuVar.e).intValue();
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(ajwv ajwvVar) {
        this.n.b(ajwvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r10 = this;
            ajpd r0 = r10.f
            r0.clear()
            java.util.List r0 = r10.m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L55
            java.util.List r0 = r10.m
            int r0 = r0.size()
            int r1 = r10.k
            r2 = 1
            if (r1 == r2) goto L1b
            if (r0 != r2) goto L21
            r0 = 1
        L1b:
            boolean r1 = r10.pi()
            if (r1 == 0) goto L4e
        L21:
            int r1 = r10.k
            if (r1 <= 0) goto L55
            int r2 = r0 + r1
            int r2 = r2 + (-1)
            int r2 = r2 / r1
            r1 = 0
        L2b:
            if (r1 >= r2) goto L55
            int r3 = r10.k
            int r4 = r1 + 1
            int r5 = r4 * r3
            int r5 = java.lang.Math.min(r5, r0)
            ajpd r6 = r10.f
            ajta r7 = r10.w
            int r8 = r10.k
            java.util.List r9 = r10.m
            int r3 = r3 * r1
            java.util.List r3 = r9.subList(r3, r5)
            ajni r1 = r7.a(r8, r3, r1, r2)
            r6.add(r1)
            r1 = r4
            goto L2b
        L4e:
            ajpd r0 = r10.f
            java.util.List r1 = r10.m
            r0.addAll(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtc.n():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r6 = this;
            ajnb r0 = r6.g
            int r0 = r0.a()
            ajpd r1 = r6.f
            int r1 = r1.size()
            ausu r2 = r6.c
            aqrh r2 = r2.v
            if (r2 != 0) goto L14
            aqrh r2 = defpackage.aqrh.a
        L14:
            int r2 = r2.b
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 == 0) goto L2a
            ausu r2 = r6.c
            aqrh r2 = r2.v
            if (r2 != 0) goto L23
            aqrh r2 = defpackage.aqrh.a
        L23:
            boolean r2 = r2.c
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            boolean r5 = r6.pj()
            r5 = r5 ^ r3
            r2 = r2 & r5
            r5 = 0
            if (r0 >= r1) goto L4c
            ajum r0 = r6.i
            java.lang.CharSequence r1 = r6.t
            r0.b = r1
            r1 = 2
            r0.e = r1
            ajsw r1 = new ajsw
            r1.<init>(r6)
            r0.c = r1
            ajum r0 = r6.i
            r0.d = r5
            r6.s(r0)
            return
        L4c:
            apxf r0 = r6.v
            if (r0 == 0) goto L6b
            java.lang.CharSequence r0 = r6.u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L59
            goto L6b
        L59:
            ajum r0 = r6.i
            java.lang.CharSequence r1 = r6.u
            r0.a = r1
            r0.e = r3
            r0.c = r5
            apxf r1 = r6.v
            r0.d = r1
            r6.s(r0)
            return
        L6b:
            boolean r0 = r6.p
            if (r0 == 0) goto L92
            int r0 = r6.s
            java.util.List r1 = r6.m
            int r1 = r1.size()
            if (r0 < r1) goto L7a
            goto L92
        L7a:
            ajum r0 = r6.i
            java.lang.CharSequence r1 = r6.u
            r0.a = r1
            r1 = 3
            r0.e = r1
            r0.d = r5
            ajsw r1 = new ajsw
            r1.<init>(r6)
            r0.c = r1
            ajum r0 = r6.i
            r6.s(r0)
            return
        L92:
            if (r2 == 0) goto L9a
            ajul r0 = r6.o
            r6.s(r0)
            return
        L9a:
            ajpd r0 = r6.b
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtc.o():void");
    }

    public final void p(Object obj) {
        if (obj == this.c) {
            t(false);
            return;
        }
        if (this.m.remove(obj)) {
            if (this.m.isEmpty()) {
                t(false);
                return;
            }
            if (this.k > 1) {
                n();
            } else {
                this.f.remove(obj);
            }
            o();
        }
    }

    @Override // defpackage.ajsu, defpackage.ajvz
    public ajxe ph() {
        return new ajtb(this.j, this.m, this.q);
    }

    protected boolean pi() {
        return pj();
    }

    public final void r(Object obj, Object obj2) {
        int indexOf = this.m.indexOf(obj);
        if (indexOf != -1) {
            this.m.set(indexOf, obj2);
            if (this.k > 1) {
                int size = this.m.size();
                int i = this.k;
                int i2 = indexOf / i;
                this.f.set(i2, this.w.a(this.k, this.m.subList(i * i2, Math.min((i2 + 1) * i, size)), i2, ((size + i) - 1) / i));
                return;
            }
            this.f.set(indexOf, obj2);
        }
    }

    protected final void s(Object obj) {
        if (this.b.isEmpty()) {
            this.b.add(obj);
        } else {
            this.b.n(0, obj);
        }
    }

    public final void t(boolean z) {
        if (this.q == z) {
            return;
        }
        this.q = z;
        if (!z || this.m.isEmpty()) {
            this.d.t();
            return;
        }
        this.d.m(this.e);
        this.d.m(this.g);
        this.d.m(this.b);
        this.d.m(this.h);
    }

    public final void u() {
        if (this.j) {
            this.g.h(Integer.MAX_VALUE);
            return;
        }
        int min = Math.min(this.s, this.m.size());
        int i = this.k;
        if (i > 1) {
            min = ((min + i) - 1) / i;
        }
        this.g.h(min);
    }

    public ajtc(ajvb ajvbVar, ypa ypaVar, ausu ausuVar, List list, int i, ajuo ajuoVar, ammv ammvVar, CharSequence charSequence, CharSequence charSequence2, apxf apxfVar, int i2, boolean z, ajwv ajwvVar, ajfh ajfhVar, ajxe ajxeVar, ajta ajtaVar) {
        list.getClass();
        this.a = ypaVar;
        this.c = ausuVar;
        this.s = i;
        this.l = ammvVar;
        this.x = ajfhVar;
        ajoc ajocVar = new ajoc();
        this.d = ajocVar;
        final ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        ajpd ajpdVar2 = new ajpd();
        this.f = ajpdVar2;
        ajnb ajnbVar = new ajnb(ajpdVar2);
        this.g = ajnbVar;
        ajpd ajpdVar3 = new ajpd();
        this.b = ajpdVar3;
        ajpd ajpdVar4 = new ajpd();
        this.h = ajpdVar4;
        ajum ajumVar = new ajum();
        this.i = ajumVar;
        ajumVar.f = i2;
        this.o = new ajul();
        ajtaVar.getClass();
        this.w = ajtaVar;
        ajvbVar.a(c());
        ypaVar.h(this, ajtc.class);
        ajuo ajuoVar2 = ajuoVar != null ? ajuoVar : ajxb.a;
        this.r = ajuoVar2;
        ajsy ajsyVar = new ajsy(this);
        this.y = ajsyVar;
        ajuoVar2.e(ajsyVar);
        this.k = l(ajuoVar2.a());
        this.t = charSequence;
        this.u = charSequence2;
        this.v = apxfVar;
        this.p = z;
        ajocVar.mK(new ajup(ajuoVar2.b()));
        ajwt ajwtVar = new ajwt();
        this.n = ajwtVar;
        d();
        m(ajwvVar);
        boolean z2 = true;
        if (ajxeVar instanceof ajtb) {
            ajtb ajtbVar = (ajtb) ajxeVar;
            this.m = ajtbVar.b;
            this.j = ajtbVar.a;
            this.q = ajtbVar.c;
        } else {
            this.m = ajwtVar.a(list);
            this.q = true;
        }
        if (this.m.isEmpty()) {
            return;
        }
        if (this.q) {
            ajocVar.m(ajpdVar);
            ajocVar.m(ajnbVar);
            ajocVar.m(ajpdVar3);
            ajocVar.m(ajpdVar4);
        }
        if (!ausuVar.m) {
            if ((ausuVar.b & 8) == 0) {
                ajpdVar.add(ausuVar);
            } else {
                aulq aulqVar = ausuVar.i;
                if ((aulqVar == null ? aulq.a : aulqVar).pY(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer)) {
                    aulq aulqVar2 = ausuVar.i;
                    ajpdVar.add((aulqVar2 == null ? aulq.a : aulqVar2).pX(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer));
                } else {
                    aulq aulqVar3 = ausuVar.i;
                    if ((aulqVar3 == null ? aulq.a : aulqVar3).pY(ElementRendererOuterClass.elementRenderer) && ajfhVar != null) {
                        aulq aulqVar4 = ausuVar.i;
                        ajfhVar.b(aulqVar4 == null ? aulq.a : aulqVar4, new ajwu() { // from class: ajsz
                            @Override // defpackage.ajwu
                            public final void a(Object obj) {
                                ajpd.this.add(obj);
                            }
                        });
                    }
                }
            }
        }
        if (!this.j && this.m.size() > i) {
            z2 = false;
        }
        this.j = z2;
        u();
        n();
        o();
    }
}
