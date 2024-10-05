package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahoi implements aab {
    final /* synthetic */ ahoj a;

    public ahoi(ahoj ahojVar) {
        this.a = ahojVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        ahoj ahojVar = this.a;
        if (ahojVar.a) {
            return;
        }
        ahojVar.a = true;
        ((VrWelcomeActivity) ahojVar).b = (ywr) ((eed) ahojVar.lM()).a.wF.get();
    }
}
