package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xmg implements View.OnClickListener {
    public final /* synthetic */ xmi a;
    private final /* synthetic */ int b;

    public /* synthetic */ xmg(xmi xmiVar, int i) {
        this.b = i;
        this.a = xmiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            xmi xmiVar = this.a;
            ncj ncjVar = xmiVar.h;
            if (ncjVar != null) {
                nck nckVar = ncjVar.a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                if (!nckVar.u(nckVar.g, arrayList)) {
                    nckVar.l(nckVar.g, null, arrayList, true);
                }
            }
            xmiVar.c();
            return;
        }
        xmi xmiVar2 = this.a;
        MotionEvent motionEvent = xmiVar2.e;
        if (motionEvent != null) {
            ncj ncjVar2 = xmiVar2.j;
            amru o = amru.o(xmiVar2.d);
            nck nckVar2 = ncjVar2.a;
            if (!nckVar2.u(nckVar2.g, o)) {
                List j = nckVar2.j(o);
                if (nckVar2.t(o)) {
                    nckVar2.l(nckVar2.g, motionEvent, j, false);
                } else {
                    nckVar2.m(nckVar2.g, motionEvent, j);
                }
            }
        }
        xmiVar2.c();
    }
}
