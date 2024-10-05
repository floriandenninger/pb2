package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.google.android.libraries.user.profile.photopicker.picker.intentonly.PhotoPickerIntentActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vrr implements aab {
    final /* synthetic */ vrs a;

    public vrr(vrs vrsVar) {
        this.a = vrsVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        vrs vrsVar = this.a;
        ComponentCallbacks2 m = axfq.m(vrsVar.getApplicationContext());
        if (m instanceof axqk) {
            if ((!(m instanceof axqh) || ((axqh) m).h()) && !vrsVar.a) {
                vrsVar.a = true;
                Object lM = vrsVar.lM();
                PhotoPickerIntentActivity photoPickerIntentActivity = (PhotoPickerIntentActivity) vrsVar;
                eed eedVar = (eed) lM;
                photoPickerIntentActivity.b = (vrn) eedVar.kY.get();
                photoPickerIntentActivity.c = eedVar.lv;
                photoPickerIntentActivity.d = (tgn) eedVar.a.a.aX.get();
                photoPickerIntentActivity.f = eedVar.mc();
                photoPickerIntentActivity.e = eedVar.fN();
                photoPickerIntentActivity.g = eed.mw();
            }
        }
    }
}
