package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jnw implements aaha {
    public final axpg a;
    public final zaw b;
    public final ProgressBarDialogFragmentController c;
    public final agyp d;
    public final aahd e;
    public final c f;
    private final aaxn g;

    public jnw(aaxn aaxnVar, axpg axpgVar, zaw zawVar, ProgressBarDialogFragmentController progressBarDialogFragmentController, agyp agypVar, aahd aahdVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.g = aaxnVar;
        this.a = axpgVar;
        this.b = zawVar;
        this.c = progressBarDialogFragmentController;
        this.d = agypVar;
        this.e = aahdVar;
        this.f = cVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String str = ((YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint) apxfVar.pX(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)).c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ProgressBarDialogFragmentController progressBarDialogFragmentController = this.c;
        if (progressBarDialogFragmentController.i() == null) {
            fav favVar = progressBarDialogFragmentController.a;
            ffc ffcVar = new ffc();
            Bundle bundle = new Bundle();
            bundle.putDouble("progressbar_height", 0.5d);
            bundle.putDouble("progressbar_width", 0.5d);
            ffcVar.af(bundle);
            amkq.N(true);
            progressBarDialogFragmentController.j(ffcVar);
        }
        this.c.n();
        aaxn aaxnVar = this.g;
        abeb abebVar = new abeb(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abebVar.a = abeb.i(str);
        abebVar.l(apxfVar.c);
        aaxn aaxnVar2 = this.g;
        aaxnVar2.b.e(abebVar, new jnv(this, apxfVar, map));
    }
}
