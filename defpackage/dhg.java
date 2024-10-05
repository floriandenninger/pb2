package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhg {
    public Canvas a;
    public int b;
    public int c;
    public final /* synthetic */ ComponentHost d;

    public dhg(ComponentHost componentHost) {
        this.d = componentHost;
    }

    public final boolean b() {
        return this.a != null && this.b < this.c;
    }

    public final void a() {
        int i;
        if (this.a == null) {
            return;
        }
        int i2 = this.b;
        aeh aehVar = this.d.a;
        int c = aehVar == null ? 0 : aehVar.c();
        while (true) {
            if (i2 >= c) {
                i = this.c;
                break;
            }
            dum dumVar = (dum) this.d.a.g(i2);
            Object obj = dumVar.a;
            if (obj instanceof View) {
                i = i2 + 1;
                break;
            } else {
                if (dumVar.c) {
                    ((Drawable) obj).draw(this.a);
                }
                i2++;
            }
        }
        this.b = i;
    }
}
