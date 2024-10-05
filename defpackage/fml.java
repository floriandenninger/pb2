package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fml {
    public final View a;
    final /* synthetic */ fmt b;
    private Rect c;

    public fml(fmt fmtVar, View view) {
        this.b = fmtVar;
        view.getClass();
        this.a = view;
    }

    public final boolean a(int i, int i2) {
        if (!this.a.isShown()) {
            return false;
        }
        if (this.c == null) {
            this.c = new Rect();
        }
        this.b.getGlobalVisibleRect(this.c);
        int i3 = this.c.left;
        int i4 = this.c.top;
        this.a.getGlobalVisibleRect(this.c);
        return this.c.contains(i + i3, i2 + i4);
    }
}
