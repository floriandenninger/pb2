package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class luf extends ajur implements ypd {
    public final ausu a;
    public final goo b;
    private final ypa o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public luf(android.content.Context r16, defpackage.ajvb r17, defpackage.ypa r18, defpackage.ajfh r19, defpackage.ammv r20, defpackage.ajfh r21, defpackage.ausu r22, defpackage.arfa r23, defpackage.ajuo r24, defpackage.ajxe r25) {
        /*
            r15 = this;
            r11 = r15
            r12 = r18
            r13 = r22
            r14 = r25
            ajxe r7 = defpackage.ajxe.a(r25)
            lya r10 = new lya
            int r0 = r13.s
            int r0 = defpackage.aobq.bu(r0)
            if (r0 != 0) goto L16
            r0 = 1
        L16:
            r1 = 0
            r2 = r16
            r10.<init>(r2, r0, r1)
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.o = r12
            r11.a = r13
            boolean r0 = r14 instanceof defpackage.lue
            if (r0 == 0) goto L45
            r0 = r14
            lue r0 = (defpackage.lue) r0
            goo r1 = new goo
            ajxe r0 = r0.a
            r1.<init>(r0)
            r11.b = r1
            goto L4c
        L45:
            goo r0 = new goo
            r0.<init>()
            r11.b = r0
        L4c:
            java.lang.Class<luf> r0 = defpackage.luf.class
            r12.h(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luf.<init>(android.content.Context, ajvb, ypa, ajfh, ammv, ajfh, ausu, arfa, ajuo, ajxe):void");
    }

    @Override // defpackage.ajtc, defpackage.ajsu, defpackage.zfk
    public final void j() {
        super.j();
        this.o.m(this);
    }

    @Override // defpackage.ajtc, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        ammv ammvVar;
        if (cls != luf.class) {
            return ahbw.l(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{izi.class, aaxb.class, ajvf.class};
        }
        if (i == 0) {
            izi iziVar = (izi) obj;
            if (iziVar.f().h()) {
                this.b.b(iziVar.f().c(), iziVar.h());
                r(iziVar.h(), iziVar.f().c());
                return null;
            }
            if (!iziVar.e().h()) {
                return null;
            }
            this.b.b(iziVar.e().c(), iziVar.h());
            r(iziVar.h(), iziVar.e().c());
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                p(((ajvf) obj).a());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        aaxb aaxbVar = (aaxb) obj;
        if (this.a.equals(aaxbVar.c())) {
            t(true);
            return null;
        }
        ammv i2 = ammv.i(aaxbVar.b());
        if (i2.h()) {
            ammvVar = this.b.a(i2.c());
        } else {
            ammvVar = amlr.a;
        }
        if (!i2.h() || !ammvVar.h()) {
            return null;
        }
        r(i2.c(), ammvVar.c());
        return null;
    }

    @Override // defpackage.ajtc, defpackage.ajsu, defpackage.ajvz
    public final ajxe ph() {
        return new lue(super.ph(), this.b.ph());
    }
}
