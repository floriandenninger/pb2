package defpackage;

import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgy implements ypd {
    final /* synthetic */ OfflineModeChangedMealbarController a;

    public jgy(OfflineModeChangedMealbarController offlineModeChangedMealbarController) {
        this.a = offlineModeChangedMealbarController;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcu.class};
        }
        if (i == 0) {
            if (((ahcu) obj).a()) {
                return null;
            }
            this.a.g = false;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
