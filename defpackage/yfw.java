package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfw implements ajop {
    public View a;
    private final yge b;
    private View.OnClickListener c;
    private boolean d;

    public yfw(Context context) {
        TypedValue typedValue = new TypedValue();
        this.b = new yge(context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? aii.a(context, typedValue.resourceId) : null, wbs.W(context, R.attr.cmtDivider).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.separator_height));
    }

    @Override // defpackage.ajop
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajop
    public final void b(boolean z) {
        this.d = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.ajop
    public final void c(View view) {
        view.getClass();
        this.a = view;
        view.setOnClickListener(this.c);
        this.a.setClickable(this.d);
    }

    @Override // defpackage.ajop
    public final void d(View.OnClickListener onClickListener) {
        this.c = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.ajop
    public final void e(ajok ajokVar) {
        this.a.getClass();
        ajnr a = ajnr.a(ajokVar);
        boolean z = false;
        boolean j = ajokVar.j("showLineSeparator", false);
        yge ygeVar = this.b;
        if (a.b() && j) {
            z = true;
        }
        if (ygeVar.a != z) {
            ygeVar.a = z;
            ygeVar.invalidateSelf();
        }
        whu.r(this.a, this.b);
    }
}
