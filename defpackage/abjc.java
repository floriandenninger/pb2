package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abjc extends ahvv implements ahvz {
    private final Context e;
    private final boolean f;
    private boolean g;
    private int h;
    private int i;

    public abjc(Context context, axzg axzgVar) {
        super(context);
        this.e = context;
        this.f = ((Boolean) axzgVar.a.a.Y(axzd.q).B().aB()).booleanValue();
    }

    private final void p() {
        int i;
        if (this.a == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12, -1);
        layoutParams.addRule(11, -1);
        int dimensionPixelOffset = this.e.getResources().getDimensionPixelOffset(R.dimen.live_chat_lean_back_entrypoint_margin);
        ko s = jw.s(this.a);
        if (s != null) {
            il k = s.k();
            if (k != null) {
                int i2 = k.a() != 0 ? 0 : dimensionPixelOffset;
                if (k.b() != 0) {
                    dimensionPixelOffset = i2;
                    i = 0;
                } else {
                    int i3 = i2;
                    i = dimensionPixelOffset;
                    dimensionPixelOffset = i3;
                }
            } else {
                int i4 = s.a() != 0 ? 0 : dimensionPixelOffset;
                if (s.b() != 0) {
                    dimensionPixelOffset = i4;
                    i = 0;
                } else {
                    i = dimensionPixelOffset;
                    dimensionPixelOffset = i4;
                }
            }
        } else {
            i = dimensionPixelOffset;
        }
        if (this.h == 1 && this.e.getResources().getConfiguration().orientation == 1 && !this.f) {
            dimensionPixelOffset += this.i;
        }
        layoutParams.setMargins(0, 0, i, dimensionPixelOffset);
        this.b.setLayoutParams(layoutParams);
    }

    @Override // defpackage.ahvv, defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        View view2 = this.c;
        if (view2 != null && view2.getParent() == null) {
            ((ahvv) this).b.removeAllViews();
            ((ahvv) this).b.addView(this.c);
        }
        p();
        if (this.d) {
            o(0);
            m(this.g);
        }
    }

    @Override // defpackage.ahvz
    public final void k(int i, int i2) {
        this.h = i;
        this.i = i2;
        p();
    }

    @Override // defpackage.ahus, defpackage.aivf
    public final /* synthetic */ View ld() {
        return this.a;
    }

    public final void m(boolean z) {
        this.g = z;
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(true != z ? 1.0f : 0.3f);
        }
    }
}
