package defpackage;

import android.view.View;
import com.facebook.yoga.YogaEdge;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sst implements sym {
    public static final WeakHashMap a = new WeakHashMap();
    public final sww b;
    private final szz c;
    private final boolean d;

    public sst(sww swwVar, szz szzVar, ammv ammvVar) {
        this.b = swwVar;
        this.c = szzVar;
        this.d = ((Boolean) ammvVar.e(false)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final swu f(View view, View view2, szk szkVar, sxs sxsVar, swt swtVar, sxc sxcVar) {
        sws a2 = swu.a();
        if (view != null) {
            a2.a = view;
        }
        if (view2 != null) {
            a2.b = view2;
        }
        if (szkVar != null) {
            a2.c = szkVar;
        }
        a2.b(sxcVar);
        a2.h = sxcVar.u;
        if (swtVar != null) {
            a2 = swtVar.a(a2);
        }
        a2.f = sxsVar;
        return a2.a();
    }

    public static final swu g(View view, szk szkVar, sxs sxsVar, swt swtVar, sxc sxcVar) {
        return f(view, null, szkVar, sxsVar, swtVar, sxcVar);
    }

    @Override // defpackage.sym
    public final int a() {
        return 168774585;
    }

    @Override // defpackage.sym
    public final /* synthetic */ aoam b(ByteBuffer byteBuffer) {
        axon axonVar = new axon();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axonVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axonVar;
    }

    @Override // defpackage.syn
    public final /* synthetic */ void c(dhe dheVar, sxc sxcVar, String str, Object obj, final sxs sxsVar, swt swtVar) {
        axon axonVar = (axon) obj;
        szz szzVar = this.c;
        aoam aoamVar = new aoam();
        int b = axonVar.b(4);
        aoam aoamVar2 = null;
        if (b != 0) {
            aoamVar.f(axonVar.a(b + axonVar.a), axonVar.b);
        } else {
            aoamVar = null;
        }
        szx g = szzVar.g(aoamVar);
        if (g != null) {
            sxsVar.l(new ssk(this, g, sxsVar, swtVar, sxcVar));
            sxsVar.a().u(true);
        }
        szz szzVar2 = this.c;
        aoam aoamVar3 = new aoam();
        int b2 = axonVar.b(22);
        if (b2 != 0) {
            aoamVar3.f(axonVar.a(b2 + axonVar.a), axonVar.b);
        } else {
            aoamVar3 = null;
        }
        szx g2 = szzVar2.g(aoamVar3);
        if (g2 != null) {
            sxsVar.h(new ssl(this, g2, sxsVar, swtVar, sxcVar));
            sxsVar.a().u(true);
        }
        szz szzVar3 = this.c;
        aoam aoamVar4 = new aoam();
        int b3 = axonVar.b(10);
        if (b3 != 0) {
            aoamVar4.f(axonVar.a(b3 + axonVar.a), axonVar.b);
        } else {
            aoamVar4 = null;
        }
        szx g3 = szzVar3.g(aoamVar4);
        if (g3 != null) {
            sxsVar.k(new ssm(this, g3, sxsVar, swtVar, sxcVar));
            sxsVar.a().u(true);
        }
        szz szzVar4 = this.c;
        aoam aoamVar5 = new aoam();
        int b4 = axonVar.b(14);
        if (b4 != 0) {
            aoamVar5.f(axonVar.a(b4 + axonVar.a), axonVar.b);
        } else {
            aoamVar5 = null;
        }
        szx g4 = szzVar4.g(aoamVar5);
        if (g4 != null) {
            sxsVar.i(new ssn(this, axonVar, g4, sxsVar, swtVar, sxcVar));
        }
        szz szzVar5 = this.c;
        aoam aoamVar6 = new aoam();
        int b5 = axonVar.b(12);
        if (b5 != 0) {
            aoamVar6.f(axonVar.a(b5 + axonVar.a), axonVar.b);
        } else {
            aoamVar6 = null;
        }
        szx g5 = szzVar5.g(aoamVar6);
        if (g5 != null) {
            sxsVar.p(new sso(this, g5, sxsVar, swtVar, sxcVar));
        }
        szz szzVar6 = this.c;
        aoam aoamVar7 = new aoam();
        int b6 = axonVar.b(16);
        if (b6 != 0) {
            aoamVar7.f(axonVar.a(b6 + axonVar.a), axonVar.b);
        } else {
            aoamVar7 = null;
        }
        szx g6 = szzVar6.g(aoamVar7);
        if (g6 != null) {
            sxsVar.j(new ssp(this, g6, sxsVar, swtVar, sxcVar));
        }
        if (axonVar.aI() != null) {
            rwh.ah(axonVar.aI(), new szp() { // from class: ssj
                @Override // defpackage.szp
                public final void a(YogaEdge yogaEdge, aoak aoakVar) {
                    sxs sxsVar2 = sxs.this;
                    WeakHashMap weakHashMap = sst.a;
                    sxsVar2.a().P(yogaEdge, aoakVar.b());
                }
            });
        }
        szz szzVar7 = this.c;
        aoam aoamVar8 = new aoam();
        int b7 = axonVar.b(8);
        if (b7 != 0) {
            aoamVar8.f(axonVar.a(b7 + axonVar.a), axonVar.b);
        } else {
            aoamVar8 = null;
        }
        szx g7 = szzVar7.g(aoamVar8);
        if (g7 != null) {
            sxsVar.n(new ssq(this, g7, sxsVar, swtVar, sxcVar));
        }
        szz szzVar8 = this.c;
        aoam aoamVar9 = new aoam();
        int b8 = axonVar.b(6);
        if (b8 != 0) {
            aoamVar9.f(axonVar.a(b8 + axonVar.a), axonVar.b);
        } else {
            aoamVar9 = null;
        }
        szx g8 = szzVar8.g(aoamVar9);
        if (g8 != null) {
            sxsVar.o(new ssr(this, g8, sxsVar, swtVar, sxcVar));
        }
        szz szzVar9 = this.c;
        aoam aoamVar10 = new aoam();
        int b9 = axonVar.b(20);
        if (b9 != 0) {
            aoamVar10.f(axonVar.a(b9 + axonVar.a), axonVar.b);
            aoamVar2 = aoamVar10;
        }
        szx g9 = szzVar9.g(aoamVar2);
        if (g9 != null) {
            sxsVar.m(new sss(this, g9, sxsVar, swtVar, sxcVar));
        }
    }

    public final void d(ayqx ayqxVar, sxc sxcVar) {
        ayry ayryVar;
        if (!this.d || (ayryVar = sxcVar.f) == null) {
            return;
        }
        ayryVar.d(ayqxVar);
    }

    @Override // defpackage.syn
    public final /* synthetic */ void e(sxs sxsVar) {
    }
}
