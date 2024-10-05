package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwg implements hvx, hxg {
    public final Context a;
    public final hwf b;
    public Bitmap c;
    public hwd d;
    public hvw e;
    public View f;
    public TextView g;
    public RecyclerView h;
    public boolean i;
    public float j;

    public hwg(Context context, hwf hwfVar) {
        this.a = context;
        this.b = hwfVar;
    }

    @Override // defpackage.hxg
    public final float a() {
        if (this.i) {
            return this.j;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.i) {
            return 0.0f;
        }
        return this.j;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.f;
    }

    @Override // defpackage.hvx
    public final void d() {
        gfw.z(this);
        this.i = !this.i;
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }
}
