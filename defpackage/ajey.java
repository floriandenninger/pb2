package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajey extends akm {
    final /* synthetic */ ajez a;

    public ajey(ajez ajezVar) {
        this.a = ajezVar;
    }

    @Override // defpackage.akm
    public final int b(View view) {
        return view.getHeight();
    }

    @Override // defpackage.akm
    public final void c(View view, int i) {
        this.a.c = view.getTop();
    }

    @Override // defpackage.akm
    public final void e(final View view, float f, float f2) {
        int K = yjk.K(view.getResources().getDisplayMetrics(), 10);
        int top = view.getTop();
        final ajez ajezVar = this.a;
        if (top > ajezVar.c + K && f2 >= 0.0f) {
            if (view == null || view == ajezVar.b) {
                return;
            }
            alh alhVar = ajezVar.a;
            if (alhVar != null) {
                alhVar.j();
            }
            alh x = ajezVar.x(view, f2);
            final int i = 0;
            x.f(new alc() { // from class: ajev
                @Override // defpackage.alc
                public final void a(boolean z) {
                    ajez ajezVar2;
                    if (i != 0) {
                        ajezVar2 = ajezVar;
                    } else {
                        ajezVar2 = ajezVar;
                        ajezVar2.b = null;
                    }
                    ajezVar2.a = null;
                }
            });
            ajezVar.a = x;
            ajezVar.b = view;
            ajezVar.a.i(ajezVar.c + view.getHeight());
            ajezVar.a.f(new alc() { // from class: ajew
                @Override // defpackage.alc
                public final void a(boolean z) {
                    ajez ajezVar2 = ajez.this;
                    View view2 = view;
                    ajezVar2.b = null;
                    ajezVar2.a = null;
                    allg allgVar = ajezVar2.d;
                    if (allgVar != null) {
                        allgVar.a(view2);
                    }
                }
            });
            return;
        }
        int top2 = view.getTop();
        final ajez ajezVar2 = this.a;
        if (top2 <= ajezVar2.c || view == null || view == ajezVar2.b) {
            return;
        }
        alh alhVar2 = ajezVar2.a;
        if (alhVar2 != null) {
            alhVar2.j();
        }
        alh x2 = ajezVar2.x(view, f2);
        final int i2 = 1;
        x2.f(new alc() { // from class: ajev
            @Override // defpackage.alc
            public final void a(boolean z) {
                ajez ajezVar22;
                if (i2 != 0) {
                    ajezVar22 = ajezVar2;
                } else {
                    ajezVar22 = ajezVar2;
                    ajezVar22.b = null;
                }
                ajezVar22.a = null;
            }
        });
        ajezVar2.a = x2;
        ajezVar2.a.i(ajezVar2.c);
    }

    @Override // defpackage.akm
    public final boolean f(View view, int i) {
        return view != this.a.b;
    }

    @Override // defpackage.akm
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.akm
    public final int h(View view, int i) {
        int height = view.getHeight();
        int i2 = this.a.c;
        return aii.c(i, i2, height + i2);
    }

    @Override // defpackage.akm
    public final void i(View view, int i, int i2, int i3) {
        view.setAlpha(this.a.w(view, i2));
    }
}
