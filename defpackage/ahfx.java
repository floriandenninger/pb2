package defpackage;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfx extends ahiy {
    public final ViewGroup i;
    public final Handler j;
    public ahfw k;

    public ahfx(final ViewGroup viewGroup, final Context context, Handler handler, ahkv ahkvVar, azrw azrwVar, final float f, final boolean z) {
        super(f, f, ahku.a(f, f, ahiy.m), ahkvVar, azrwVar);
        this.i = viewGroup;
        this.j = handler;
        handler.post(new Runnable() { // from class: ahfv
            @Override // java.lang.Runnable
            public final void run() {
                ahfx ahfxVar = ahfx.this;
                boolean z2 = z;
                Context context2 = context;
                float f2 = f;
                ViewGroup viewGroup2 = viewGroup;
                ahfxVar.k = new ahfw(context2, ahfxVar, ahkt.b(f2), z2, true != z2 ? R.attr.progressBarStyleHorizontal : R.attr.progressBarStyle);
                viewGroup2.addView(ahfxVar.k);
                ahfxVar.k.invalidate();
            }
        });
    }

    @Override // defpackage.ahiy, defpackage.ahfr, defpackage.ahim
    public final void i() {
        this.j.post(new Runnable() { // from class: ahfs
            @Override // java.lang.Runnable
            public final void run() {
                ahfx ahfxVar = ahfx.this;
                ahfxVar.i.removeView(ahfxVar.k);
            }
        });
        super.i();
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public final void p(ahjq ahjqVar) {
    }

    @Override // defpackage.ahio, defpackage.ahim
    public final void qE(final boolean z) {
        this.l = z;
        this.j.post(new Runnable() { // from class: ahfu
            @Override // java.lang.Runnable
            public final void run() {
                ahfx ahfxVar = ahfx.this;
                boolean z2 = z;
                ahfw ahfwVar = ahfxVar.k;
                if (ahfwVar != null) {
                    if (!z2) {
                        ahfwVar.setProgress(0);
                    }
                    ahfxVar.k.setVisibility(true == z2 ? 8 : 0);
                }
            }
        });
    }
}
