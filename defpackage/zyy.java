package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zyy implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ zza b;

    public zyy(zza zzaVar, View view) {
        this.b = zzaVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int measuredHeight = this.a.getMeasuredHeight();
        zza zzaVar = this.b;
        float f = zzaVar.au;
        int i = (int) (zzaVar.ar * f);
        int i2 = (int) (f * zzaVar.as);
        BottomSheetBehavior a = ((algj) zzaVar.d).a();
        zza zzaVar2 = this.b;
        float f2 = zzaVar2.as;
        if (f2 > 0.0f && f2 < 1.0f && measuredHeight > i2) {
            a.D(f2);
            a.G(6);
            a.F(i2);
        } else {
            float f3 = zzaVar2.ar;
            if (f3 > 0.0f && f3 < 1.0f && measuredHeight < i) {
                a.D(f3);
                a.G(6);
                a.F(i);
            }
        }
        this.a.setVisibility(0);
    }
}
