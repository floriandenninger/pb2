package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwg implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final bwd a;
    final ViewGroup b;

    public bwg(bwd bwdVar, ViewGroup viewGroup) {
        this.a = bwdVar;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d6 A[EDGE_INSN: B:120:0x01d6->B:121:0x01d6 BREAK  A[LOOP:1: B:16:0x0089->B:27:0x01cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        bwh.a.remove(this.b);
        ArrayList arrayList = (ArrayList) bwh.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bwd) arrayList.get(i)).s(this.b);
            }
        }
        this.a.n(true);
    }
}
