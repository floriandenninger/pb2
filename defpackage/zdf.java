package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zdf implements View.OnTouchListener {
    private final List a = new ArrayList();
    private View b;
    private zdg c;

    public final void a(zdg zdgVar) {
        this.a.add(zdgVar);
    }

    public final void b(zdg zdgVar) {
        this.a.add(0, zdgVar);
    }

    public final void c(View view) {
        View view2 = this.b;
        if (view2 != null) {
            view2.setOnTouchListener(null);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zdg) it.next()).c();
        }
        this.b = view;
        if (view != null) {
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        zdg zdgVar = this.c;
        zdg zdgVar2 = null;
        if (zdgVar != null) {
            z = zdgVar.nq() && this.c.d(view, motionEvent);
            if (!z) {
                zdg zdgVar3 = this.c;
                this.c = null;
                zdgVar2 = zdgVar3;
            }
        } else {
            z = false;
        }
        Iterator it = this.a.iterator();
        while (!z) {
            if (!it.hasNext()) {
                return this.a.size() > 0 && motionEvent.getActionMasked() == 0;
            }
            zdg zdgVar4 = (zdg) it.next();
            if (zdgVar4 != zdgVar2) {
                z = zdgVar4.nq() && zdgVar4.d(view, motionEvent);
                if (z) {
                    this.c = zdgVar4;
                    for (zdg zdgVar5 : this.a) {
                        if (zdgVar5 != zdgVar4) {
                            zdgVar5.c();
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }
}
