package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.vr.LaunchYouTubeVrActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmu implements aab {
    final /* synthetic */ nmv a;

    public nmu(nmv nmvVar) {
        this.a = nmvVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        nmv nmvVar = this.a;
        if (nmvVar.a) {
            return;
        }
        nmvVar.a = true;
        ((LaunchYouTubeVrActivity) nmvVar).b = (ainy) ((eed) nmvVar.lM()).a.fX.get();
    }
}
