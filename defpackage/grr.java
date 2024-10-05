package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class grr extends ybe {
    private final ainy e;
    private final YpcOffersListDialogFragmentController f;

    public grr(Activity activity, aaxn aaxnVar, acqz acqzVar, zaw zawVar, aahd aahdVar, ainy ainyVar, YpcOffersListDialogFragmentController ypcOffersListDialogFragmentController, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(activity, aaxnVar, acqzVar, zawVar, aahdVar, null, null, null);
        this.e = ainyVar;
        this.f = ypcOffersListDialogFragmentController;
    }

    @Override // defpackage.ybe
    public final void b(apxf apxfVar) {
        this.f.g(apxfVar);
        this.f.n();
    }

    @Override // defpackage.ybe, defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.e.d()) {
            this.e.a();
        }
        super.kE(apxfVar, map);
    }
}
