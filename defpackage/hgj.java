package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hgj implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ hgk a;
    private final View b;
    private final View c;

    public hgj(hgk hgkVar, View view, View view2) {
        this.a = hgkVar;
        this.b = view;
        this.c = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Rect rect = new Rect();
        this.c.getGlobalVisibleRect(rect);
        akcv akcvVar = this.a.d;
        if (akcvVar != null) {
            akcvVar.b.set(rect);
        }
        Rect rect2 = new Rect();
        this.b.getGlobalVisibleRect(rect2);
        float rotation = this.b.getRotation();
        double sin = Math.sin(Math.toRadians(rotation));
        akcv akcvVar2 = this.a.d;
        if (akcvVar2 != null) {
            akcvVar2.c(rect2, 2, 2);
        }
        akcv akcvVar3 = this.a.d;
        boolean z = akcvVar3 != null && akcvVar3.h(2, rect2);
        akcv akcvVar4 = this.a.d;
        boolean z2 = akcvVar4 != null && akcvVar4.h(1, rect2);
        if (z || z2) {
            double width = this.b.getWidth();
            Double.isNaN(width);
            double abs = Math.abs((width / 2.0d) * sin);
            double height = this.b.getHeight();
            Double.isNaN(height);
            double d = (height / 2.0d) * sin;
            if (rotation > 90.0f || rotation < -90.0f) {
                rect2.offset(z ? (int) d : (int) (-d), z ? (int) (-abs) : (int) abs);
            } else {
                rect2.offset(z ? (int) (-d) : (int) d, z ? (int) (-abs) : (int) abs);
            }
        } else {
            rect2.offset(0, rect2.height() / 2);
        }
        this.a.a.e();
        akcv akcvVar5 = this.a.d;
        if (akcvVar5 != null) {
            akcvVar5.g(rect2);
        }
        this.a.c.c(true);
    }
}
