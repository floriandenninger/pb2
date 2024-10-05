package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajet implements slx {
    public final ayqw a = new ayqw();
    PopupWindow b;
    private final Context c;
    private final axpg d;

    public ajet(Context context, axpg axpgVar) {
        this.c = context;
        this.d = axpgVar;
    }

    private static int c(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    @Override // defpackage.slx
    public final void a() {
        PopupWindow popupWindow = this.b;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }

    @Override // defpackage.slx
    public final void b(awos awosVar, View view) {
        a();
        dkp dkpVar = new dkp(this.c);
        dhe dheVar = dkpVar.t;
        sqq sqqVar = (sqq) this.d.get();
        sxb a = sxc.a();
        a.a = dkpVar;
        dha a2 = sqqVar.a(dheVar, a.a(), awosVar.toByteArray(), null, this.a);
        ComponentTree componentTree = dkpVar.r;
        if (componentTree == null) {
            dkpVar.G(ComponentTree.c(dkpVar.t, a2).a());
        } else {
            if (a2 == null) {
                throw new IllegalArgumentException("Root component can't be null");
            }
            componentTree.x(a2, -1, -1, false, null, 0, null);
        }
        dkpVar.setBackgroundColor(wbs.Q(this.c, R.attr.ytBrandBackgroundSolid));
        PopupWindow popupWindow = new PopupWindow((View) dkpVar, -2, -2, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setElevation(TypedValue.applyDimension(1, 3.0f, this.c.getResources().getDisplayMetrics()));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ajes
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ajet ajetVar = ajet.this;
                if (ajetVar.b != null) {
                    ajetVar.b = null;
                    ajetVar.a.c();
                }
            }
        });
        popupWindow.setAnimationStyle(android.R.style.Animation.Dialog);
        dkpVar.measure(c(popupWindow.getWidth()), c(popupWindow.getHeight()));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        popupWindow.showAtLocation(view, 0, rect.right - dkpVar.getMeasuredWidth(), rect.top - 15);
        this.b = popupWindow;
    }
}
