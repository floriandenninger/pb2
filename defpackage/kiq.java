package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kiq {
    private final View a;
    private final azrw b;
    private final Rect c = new Rect();

    public kiq(View view, azrw azrwVar) {
        this.a = view;
        this.b = azrwVar;
    }

    public final Rect a() {
        View view = (View) this.b.get();
        if (view.getWindowToken() != this.a.getWindowToken()) {
            this.c.setEmpty();
            return this.c;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr);
        this.a.getLocationInWindow(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        this.c.set(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return this.c;
    }
}
