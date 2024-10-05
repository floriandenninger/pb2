package defpackage;

import com.google.android.youtube.R;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqb implements sxy {
    private final syk a;
    private final spz b;
    private final int c;
    private final sqa d;
    private final boolean e;

    private sqb(syk sykVar, spz spzVar, int i, sqa sqaVar, boolean z) {
        this.a = sykVar;
        this.b = spzVar;
        this.c = i;
        this.d = sqaVar;
        this.e = z;
    }

    public static sxy b(syk sykVar, spz spzVar, int i, sqa sqaVar) {
        return c(sykVar, spzVar, i, sqaVar, false);
    }

    public static sxy c(syk sykVar, spz spzVar, int i, sqa sqaVar, boolean z) {
        return new sqb(sykVar, spzVar, i, sqaVar, z);
    }

    @Override // defpackage.sxy
    public final int a() {
        return this.c;
    }

    @Override // defpackage.sxy
    public final aoam d(ByteBuffer byteBuffer) {
        return this.d.a(byteBuffer);
    }

    @Override // defpackage.sxy
    public final boolean e() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sxy
    public final dha f(dhe dheVar, sxc sxcVar, aoam aoamVar, String str, aoam aoamVar2, List list, sxk sxkVar, boolean z) {
        sod sodVar;
        sxc sxcVar2;
        spn spnVar;
        syp sypVar;
        if (szz.i(aoamVar2, 168774585) != null) {
            amru amruVar = sxcVar.q;
            if (amruVar == null) {
                amruVar = amru.q();
            }
            sodVar = new sod(amruVar);
        } else {
            sodVar = null;
        }
        boolean z2 = this.c == 168777401;
        awpj c = sxcVar.c();
        syg b = sxcVar.b();
        syb sybVar = sxcVar.u;
        spn spnVar2 = new spn(c, b, z2, (sybVar == null || (sypVar = sybVar.g) == null) ? sxcVar.l : sypVar.e);
        if (sxkVar != null) {
            sxj a = sxkVar.a(spnVar2);
            sxb e = sxcVar.e();
            e.m = a;
            sxcVar2 = e.a();
            spnVar = a;
        } else {
            sxcVar2 = sxcVar;
            spnVar = spnVar2;
        }
        spnVar2.a = this.b.a(dheVar, sxcVar2, aoamVar, str, aoamVar2, sodVar, list);
        if (z) {
            this.a.b(spnVar2);
        }
        if (!z2) {
            this.a.a(dheVar, sxcVar2, str, aoamVar2, spnVar, sodVar);
            String str2 = sxcVar2.t;
            if (str2 != null) {
                spnVar.q(R.id.elements_tree_debug_id, str2);
            }
        }
        axof axofVar = new axof();
        if (szz.m(aoamVar2, axofVar)) {
            ssb.d(axofVar, spnVar);
        }
        dha b2 = spnVar.b(dheVar);
        spnVar2.a = null;
        return b2;
    }
}
