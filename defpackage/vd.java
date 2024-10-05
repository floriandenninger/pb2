package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vd implements Runnable {
    final /* synthetic */ vh a;
    private final /* synthetic */ int b;

    public vd(vh vhVar, int i) {
        this.b = i;
        this.a = vhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.q();
            return;
        }
        if (i == 1) {
            View view = this.a.l;
            if (view == null || view.getWindowToken() == null) {
                return;
            }
            this.a.s();
            return;
        }
        ug ugVar = this.a.e;
        if (ugVar == null || !jw.aj(ugVar) || this.a.e.getCount() <= this.a.e.getChildCount()) {
            return;
        }
        int childCount = this.a.e.getChildCount();
        vh vhVar = this.a;
        if (childCount <= vhVar.k) {
            vhVar.p.setInputMethodMode(2);
            this.a.s();
        }
    }
}
