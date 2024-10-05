package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sob implements swt {
    private final float a;
    private final boolean b;
    private final int c;
    private final dsz d;

    public sob(axol axolVar, Context context, dsz dszVar) {
        this.a = context.getResources().getDisplayMetrics().density;
        this.b = rwh.aa(context);
        this.c = axolVar.aL();
        this.d = dszVar;
    }

    @Override // defpackage.swt
    public final sws a(sws swsVar) {
        aong aongVar;
        RecyclerView a = this.d.a();
        if (a == null) {
            return swsVar;
        }
        aone createBuilder = awnq.a.createBuilder();
        aone createBuilder2 = awpq.a.createBuilder();
        int computeHorizontalScrollOffset = a.computeHorizontalScrollOffset();
        float f = this.a;
        createBuilder2.copyOnWrite();
        awpq awpqVar = (awpq) createBuilder2.instance;
        awpqVar.b |= 1;
        awpqVar.c = computeHorizontalScrollOffset / f;
        int computeVerticalScrollOffset = a.computeVerticalScrollOffset();
        float f2 = this.a;
        createBuilder2.copyOnWrite();
        awpq awpqVar2 = (awpq) createBuilder2.instance;
        awpqVar2.b |= 2;
        awpqVar2.d = computeVerticalScrollOffset / f2;
        createBuilder.copyOnWrite();
        awnq awnqVar = (awnq) createBuilder.instance;
        awpq awpqVar3 = (awpq) createBuilder2.build();
        awpqVar3.getClass();
        awnqVar.d = awpqVar3;
        awnqVar.c |= 1;
        int i = this.c;
        boolean z = this.b;
        int i2 = soc.a;
        int i3 = -1;
        if (i != 1) {
            wd wdVar = a.n;
            if (wdVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) wdVar;
                if (z) {
                    i3 = linearLayoutManager.L();
                } else {
                    i3 = linearLayoutManager.J();
                }
            }
        } else {
            View n = a.n(a.getWidth() / 2, a.getHeight() / 2);
            if (n != null) {
                i3 = a.c(n);
            }
        }
        createBuilder.copyOnWrite();
        awnq awnqVar2 = (awnq) createBuilder.instance;
        awnqVar2.c |= 2;
        awnqVar2.e = i3;
        awnq awnqVar3 = (awnq) createBuilder.build();
        awpu awpuVar = swsVar.e;
        if (awpuVar != null) {
            aongVar = (aong) awpuVar.toBuilder();
        } else {
            aongVar = (aong) awpu.a.createBuilder();
        }
        aongVar.e(awnq.b, awnqVar3);
        swsVar.e = (awpu) aongVar.build();
        return swsVar;
    }
}
