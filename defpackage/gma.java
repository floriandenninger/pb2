package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gma implements ajop {
    public fyl a;
    public View b;
    private final Context c;
    private final nkl d;
    private final boolean e;
    private View.OnClickListener f;
    private boolean g;

    public gma(Context context, nkl nklVar) {
        this(context, nklVar, false);
    }

    private final fyl f(int i, int i2, int i3) {
        Drawable layerDrawable;
        nkl nklVar = this.d;
        if (nklVar == null || !nklVar.a()) {
            Drawable drawable = (Drawable) wbs.V(this.c, true != this.e ? R.attr.selectableItemBackground : R.attr.selectableItemBackgroundSolid).orElse(null);
            ColorDrawable colorDrawable = new ColorDrawable(i);
            layerDrawable = drawable == null ? colorDrawable : new LayerDrawable(new Drawable[]{colorDrawable, drawable});
        } else {
            ColorDrawable colorDrawable2 = new ColorDrawable(i);
            akba a = akba.a(this.c);
            a.b = colorDrawable2;
            layerDrawable = a.b();
        }
        if (i3 == 0) {
            i3 = wbs.W(this.c, R.attr.listItemChrome).orElse(0);
        }
        if (i2 <= 0) {
            i2 = this.c.getResources().getDimensionPixelSize(R.dimen.line_separator_height);
        }
        return new fyl(layerDrawable, i3, i2);
    }

    @Override // defpackage.ajop
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajop
    public final void b(boolean z) {
        this.g = z;
        View view = this.b;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.ajop
    public final void c(View view) {
        view.getClass();
        this.b = view;
        view.setOnClickListener(this.f);
        this.b.setClickable(this.g);
    }

    @Override // defpackage.ajop
    public final void d(View.OnClickListener onClickListener) {
        this.f = onClickListener;
        View view = this.b;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r5.j("showLineSeparator", false) != false) goto L12;
     */
    @Override // defpackage.ajop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ajok r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.b
            r0.getClass()
            java.lang.String r0 = "setBackgroundColor"
            r1 = 0
            int r0 = r5.b(r0, r1)
            fyl r2 = r4.a
            int r3 = r2.a
            float r3 = (float) r3
            int r3 = (int) r3
            int r2 = r2.a()
            fyl r0 = r4.f(r0, r3, r2)
            r4.a = r0
            ajnr r0 = defpackage.ajnr.a(r5)
            boolean r0 = r0.b()
            r2 = 1
            if (r0 == 0) goto L48
            java.lang.String r0 = "lineSeparatorOverride"
            int r0 = r5.b(r0, r1)
            if (r0 == 0) goto L3f
            if (r0 == r2) goto L3d
            r5 = 2
            if (r0 != r5) goto L35
            goto L48
        L35:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "LineSeparatorOverrideOps not supported"
            r5.<init>(r0)
            throw r5
        L3d:
            r1 = 1
            goto L48
        L3f:
            java.lang.String r0 = "showLineSeparator"
            boolean r5 = r5.j(r0, r1)
            if (r5 == 0) goto L48
            goto L3d
        L48:
            fyl r5 = r4.a
            r5.e(r1)
            android.view.View r5 = r4.b
            fyl r0 = r4.a
            defpackage.whu.r(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gma.e(ajok):void");
    }

    @Deprecated
    public gma(Context context, nkl nklVar, boolean z) {
        context.getClass();
        this.c = context;
        this.d = nklVar;
        this.e = z;
        this.a = f(0, 0, 0);
    }
}
