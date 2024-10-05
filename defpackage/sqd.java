package defpackage;

import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqd implements sxx {
    private final syk a;
    private final sqc b;
    private final aomu c;

    private sqd(syk sykVar, sqc sqcVar, aomu aomuVar) {
        this.a = sykVar;
        this.b = sqcVar;
        this.c = aomuVar;
    }

    public static sxx a(syk sykVar, sqc sqcVar, aomu aomuVar) {
        return new sqd(sykVar, sqcVar, aomuVar);
    }

    @Override // defpackage.sxx
    public final aomu b() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sxx
    public final dha c(dhe dheVar, sxc sxcVar, aooy aooyVar, String str, aoam aoamVar, List list, sxk sxkVar, boolean z) {
        sxc sxcVar2;
        sod sodVar;
        sxc sxcVar3;
        spn spnVar;
        if (szz.i(aoamVar, 168774585) != null) {
            sxcVar2 = sxcVar;
            amru amruVar = sxcVar2.q;
            if (amruVar == null) {
                amruVar = amru.q();
            }
            sodVar = new sod(amruVar);
        } else {
            sxcVar2 = sxcVar;
            sodVar = null;
        }
        spn spnVar2 = new spn(sxcVar.c(), sxcVar.b(), false, false);
        if (sxkVar != null) {
            sxj a = sxkVar.a(spnVar2);
            sxb e = sxcVar.e();
            e.m = a;
            spnVar = a;
            sxcVar3 = e.a();
        } else {
            sxcVar3 = sxcVar2;
            spnVar = spnVar2;
        }
        spnVar2.a = this.b.a(dheVar, sxcVar3, aooyVar, aoamVar, list);
        if (z) {
            this.a.b(spnVar2);
        }
        this.a.a(dheVar, sxcVar3, str, aoamVar, spnVar, sodVar);
        String str2 = sxcVar3.t;
        if (str2 != null) {
            spnVar.q(R.id.elements_tree_debug_id, str2);
        }
        axof axofVar = new axof();
        if (szz.m(aoamVar, axofVar)) {
            ssb.d(axofVar, spnVar);
        }
        dha b = spnVar.b(dheVar);
        spnVar2.a = null;
        return b;
    }
}
