package defpackage;

import com.facebook.yoga.YogaAlign;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssz implements sym {
    public static final /* synthetic */ int a = 0;
    private static final amrz b;
    private final boolean c;

    static {
        amrw h = amrz.h();
        h.g(1, YogaAlign.AUTO);
        h.g(2, YogaAlign.FLEX_START);
        h.g(3, YogaAlign.FLEX_END);
        h.g(4, YogaAlign.CENTER);
        h.g(5, YogaAlign.STRETCH);
        h.g(6, YogaAlign.BASELINE);
        h.g(7, YogaAlign.BASELINE);
        b = h.c();
    }

    public ssz(ammv ammvVar) {
        this.c = ((Boolean) ammvVar.e(true)).booleanValue();
    }

    private static void d(axoy axoyVar, aoam aoamVar, dgy dgyVar) {
        aoam aoamVar2;
        int b2 = axoyVar.b(20);
        if (b2 != 0) {
            aoamVar.f(axoyVar.a(b2 + axoyVar.a), axoyVar.b);
            aoamVar2 = aoamVar;
        } else {
            aoamVar2 = null;
        }
        if (aoamVar2 != null) {
            rwh.ah(aoamVar, new ssy(dgyVar, 2));
        }
    }

    @Override // defpackage.sym
    public final int a() {
        return 168772996;
    }

    @Override // defpackage.sym
    public final /* synthetic */ aoam b(ByteBuffer byteBuffer) {
        return axoy.aL(byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x03a4, code lost:
    
        if (r9 != 4) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0372  */
    @Override // defpackage.syn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(defpackage.dhe r9, defpackage.sxc r10, java.lang.String r11, java.lang.Object r12, defpackage.sxs r13, defpackage.swt r14) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssz.c(dhe, sxc, java.lang.String, java.lang.Object, sxs, swt):void");
    }

    @Override // defpackage.syn
    public final void e(sxs sxsVar) {
        sxsVar.a().H(1.0f);
    }
}
