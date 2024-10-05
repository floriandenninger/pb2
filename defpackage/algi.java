package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
final class algi extends algb {
    private final boolean a;
    private final boolean b;
    private final ko c;

    public algi(View view, ko koVar) {
        ColorStateList k;
        this.c = koVar;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0) {
            z = true;
        }
        this.b = z;
        alkg alkgVar = BottomSheetBehavior.x(view).c;
        if (alkgVar != null) {
            k = alkgVar.a.d;
        } else {
            k = jw.k(view);
        }
        if (k != null) {
            this.a = akwg.t(k.getDefaultColor());
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.a = akwg.t(((ColorDrawable) view.getBackground()).getColor());
        } else {
            this.a = z;
        }
    }

    private final void c(View view) {
        if (view.getTop() < this.c.f()) {
            algj.b(view, this.a);
            view.setPadding(view.getPaddingLeft(), this.c.f() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            algj.b(view, this.b);
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.algb
    public final void b(View view, int i) {
        c(view);
    }

    @Override // defpackage.algb
    public final void mx(View view, float f) {
        c(view);
    }
}
