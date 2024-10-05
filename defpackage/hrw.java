package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrw implements aab {
    final /* synthetic */ hrx a;

    public hrw(hrx hrxVar) {
        this.a = hrxVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        hrx hrxVar = this.a;
        if (hrxVar.a) {
            return;
        }
        hrxVar.a = true;
        ((ReelCameraActivity) hrxVar).c = ((eed) hrxVar.lM()).iA();
    }
}
