package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rur extends rwh {
    final /* synthetic */ ruv a;
    private final sao c = new sao();

    public rur(ruv ruvVar) {
        this.a = ruvVar;
    }

    @Override // defpackage.rwh
    public final boolean a(MotionEvent motionEvent) {
        ruv ruvVar = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = this.a.y;
        sao saoVar = this.c;
        int paddingLeft = ((int) x) - ruvVar.getPaddingLeft();
        int paddingTop = ((int) y) - ruvVar.getPaddingTop();
        ArrayList x2 = rwh.x();
        int childCount = ruvVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            if (ruvVar.getChildAt(childCount) instanceof rwo) {
                x2.addAll(((rwo) ruvVar.getChildAt(childCount)).b(paddingLeft, paddingTop, z));
            }
        }
        saoVar.a = !x2.isEmpty();
        saoVar.b = ruvVar.x.g(x2);
        if (this.c.b) {
            ruv ruvVar2 = this.a;
            ruvVar2.f = false;
            List A = rwh.A(ruvVar2.u, new rvv(1));
            sav.a(ruvVar2);
            ruvVar2.g(A);
        }
        return this.c.a;
    }
}
