package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zzb extends zza {
    @Override // defpackage.zza
    protected final void aH() {
        o(0, R.style.ReelsBottomSheetDialog_Immersive);
    }

    @Override // defpackage.zza, defpackage.algk, defpackage.nh, defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        if (oq.getWindow() != null) {
            oq.getWindow().getDecorView().setSystemUiVisibility(4357);
            oq.getWindow().setFlags(8, 8);
        }
        return oq;
    }
}
