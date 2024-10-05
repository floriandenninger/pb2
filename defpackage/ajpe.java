package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpe implements ajop {
    public View a;
    private View.OnClickListener b;
    private boolean c;

    public ajpe() {
    }

    public ajpe(View view) {
        view.getClass();
        this.a = view;
    }

    @Override // defpackage.ajop
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajop
    public final void b(boolean z) {
        this.c = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.ajop
    public final void c(View view) {
        view.getClass();
        this.a = view;
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        this.a.setClickable(this.c);
    }

    @Override // defpackage.ajop
    public final void d(View.OnClickListener onClickListener) {
        this.b = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.ajop
    public final void e(ajok ajokVar) {
        this.a.getClass();
    }
}
