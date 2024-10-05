package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hef implements zng {
    final /* synthetic */ hel a;

    public hef(hel helVar) {
        this.a = helVar;
    }

    @Override // defpackage.zng
    public final void a() {
    }

    @Override // defpackage.zng
    public final void b() {
        if (this.a.ay.R() != null) {
            float f = r0.a / r0.b;
            hel helVar = this.a;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ci C = helVar.C();
            if (C != null) {
                C.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            int i = displayMetrics.widthPixels;
            int max = Math.max(1, displayMetrics.heightPixels);
            float f2 = i;
            float f3 = max;
            if (f >= f2 / f3) {
                i = (int) (f3 * f);
            } else {
                max = (int) (f2 / f);
            }
            helVar.ay.t(i, max);
            yny.z(helVar.aP, yny.y(i, max), ViewGroup.LayoutParams.class);
            yny.z(helVar.aR, yny.y(i, max), ViewGroup.LayoutParams.class);
        }
    }

    @Override // defpackage.zng
    public final void d() {
    }

    @Override // defpackage.zng
    public final void mn() {
        this.a.aJ();
        hel helVar = this.a;
        int i = helVar.aT;
        if (i != -1) {
            helVar.ay.C(i);
            this.a.aT = -1;
        }
    }

    @Override // defpackage.zng
    public final void mr() {
        ci C = this.a.C();
        if (C == null) {
            return;
        }
        WindowManager.LayoutParams attributes = C.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        C.getWindow().setAttributes(attributes);
    }

    @Override // defpackage.zng
    public final void ms() {
        ci C = this.a.C();
        if (C == null) {
            return;
        }
        WindowManager.LayoutParams attributes = C.getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        C.getWindow().setAttributes(attributes);
    }
}
