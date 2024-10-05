package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzy implements ajwe {
    public final boolean a;
    public int b;
    public boolean c;
    private final dsx d;
    private final ajzv e;
    private final ajox f;
    private final ViewTreeObserver.OnPreDrawListener g;
    private final View.OnLayoutChangeListener h;
    private int i = 0;
    private int j = 0;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ajzy(android.support.v7.widget.RecyclerView r21, defpackage.ajox r22, defpackage.sqq r23, defpackage.acra r24, defpackage.ajgq r25, defpackage.ajhd r26, defpackage.ajhj r27, defpackage.sxw r28, defpackage.azrw r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzy.<init>(android.support.v7.widget.RecyclerView, ajox, sqq, acra, ajgq, ajhd, ajhj, sxw, azrw, java.lang.Object):void");
    }

    @Override // defpackage.ajwe
    public final void a(RecyclerView recyclerView) {
        recyclerView.getContext();
        ajzv ajzvVar = this.e;
        ayqw ayqwVar = ajzvVar.h;
        if (ayqwVar != null) {
            ayqwVar.qc();
        }
        ajzvVar.h = new ayqw();
        this.f.u(this.e);
        this.e.c();
        c(recyclerView);
        recyclerView.getViewTreeObserver().addOnPreDrawListener(this.g);
        recyclerView.addOnLayoutChangeListener(this.h);
    }

    @Override // defpackage.ajwe
    public final void b(RecyclerView recyclerView) {
        recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.g);
        recyclerView.removeOnLayoutChangeListener(this.h);
        this.f.v(this.e);
        wd wdVar = recyclerView.n;
        this.d.e(recyclerView);
        ayqw ayqwVar = this.e.h;
        if (ayqwVar != null) {
            ayqwVar.qc();
        }
        recyclerView.af(wdVar);
        this.j = 0;
        this.i = 0;
    }

    public final void c(RecyclerView recyclerView) {
        int width = recyclerView.getWidth();
        int height = recyclerView.getHeight();
        if (this.i != width || this.j != height) {
            this.i = width;
            this.j = height;
            if (this.c) {
                this.d.e(recyclerView);
            }
            this.d.d(width, height);
            this.d.c(recyclerView);
            if (this.c) {
                recyclerView.getClass();
                recyclerView.post(new vv(recyclerView, 2, null));
            }
            this.c = false;
            return;
        }
        this.d.c(recyclerView);
    }
}
