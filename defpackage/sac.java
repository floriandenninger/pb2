package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sac {
    public final PopupWindow a;
    public final saa b;
    public final View c;
    public final rwl d = new rwl();
    public final rwl e = new rwl();

    public sac(View view) {
        this.c = view;
        saa saaVar = new saa(view.getContext());
        this.b = saaVar;
        PopupWindow popupWindow = new PopupWindow(saaVar, -2, -2);
        this.a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void a(rzz rzzVar) {
        saa saaVar = this.b;
        saaVar.d = rzzVar.a;
        saaVar.e = rzzVar.b;
        saaVar.f = rzzVar.c;
        saaVar.b.setColor(rzzVar.d);
        saaVar.a.setColor(rzzVar.e);
        saaVar.b.clearShadowLayer();
        saaVar.setLayerType(0, null);
        int ceil = (int) Math.ceil(saaVar.f);
        saaVar.setPadding(Math.abs(Math.min(0, 0)) + ceil, Math.abs(Math.min(0, 0)) + ceil, Math.max(0, 0) + ceil, ceil + Math.max(0, 0));
        saaVar.c = new Paint();
        saaVar.c.set(saaVar.b);
        saaVar.c.setStyle(Paint.Style.STROKE);
        saaVar.c.clearShadowLayer();
        PopupWindow popupWindow = this.a;
        int i = rzzVar.f;
        popupWindow.setAnimationStyle(-1);
    }

    public final void b() {
        this.a.dismiss();
    }

    public final void c(int i) {
        this.b.g = i;
    }
}
