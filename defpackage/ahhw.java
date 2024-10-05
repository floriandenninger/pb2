package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhw extends ahiy {
    public final ViewGroup i;
    public final Handler j;
    public ahhv k;

    public ahhw(final Context context, final ViewGroup viewGroup, final float f, final float f2, ahkv ahkvVar, azrw azrwVar) {
        super(f, f2, ahku.a(1.0f, 1.0f, ahiy.m), ahkvVar, azrwVar);
        this.i = viewGroup;
        rJ(f, f2, 0.0f);
        Handler handler = new Handler(Looper.getMainLooper());
        this.j = handler;
        handler.post(new Runnable() { // from class: ahht
            @Override // java.lang.Runnable
            public final void run() {
                ahhw ahhwVar = ahhw.this;
                Context context2 = context;
                float f3 = f;
                float f4 = f2;
                ViewGroup viewGroup2 = viewGroup;
                ahhwVar.k = new ahhv(context2, ahhwVar);
                ahhwVar.k.setOrientation(0);
                ahhwVar.k.setLayoutParams(new FrameLayout.LayoutParams(ahhw.s(f3), ahhw.s(f4)));
                viewGroup2.addView(ahhwVar.k);
            }
        });
    }

    @Override // defpackage.ahiy, defpackage.ahfr, defpackage.ahim
    public final void i() {
        if (this.k != null) {
            this.j.post(new Runnable() { // from class: ahhs
                @Override // java.lang.Runnable
                public final void run() {
                    ahhw ahhwVar = ahhw.this;
                    ahhwVar.i.removeView(ahhwVar.k);
                }
            });
        }
        super.i();
    }

    @Override // defpackage.ahio, defpackage.ahim
    public final void qE(final boolean z) {
        this.l = z;
        if (this.k != null) {
            this.j.post(new Runnable() { // from class: ahhu
                @Override // java.lang.Runnable
                public final void run() {
                    ahhw.this.k.setVisibility(true != z ? 0 : 8);
                }
            });
        }
    }
}
