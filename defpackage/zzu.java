package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zzu implements ykl {
    final /* synthetic */ Activity a;
    final /* synthetic */ ThirdPartyAccountPreference b;

    public zzu(ThirdPartyAccountPreference thirdPartyAccountPreference, Activity activity) {
        this.b = thirdPartyAccountPreference;
        this.a = activity;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final ga a = gl.a(this.a.getResources(), (Bitmap) obj2);
        a.c();
        this.a.runOnUiThread(new Runnable() { // from class: zzt
            @Override // java.lang.Runnable
            public final void run() {
                zzu zzuVar = zzu.this;
                zzuVar.b.H(a);
            }
        });
    }
}
