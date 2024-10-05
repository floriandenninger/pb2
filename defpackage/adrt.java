package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrt extends adsc {
    public adrq a;
    public adsq b;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        Bundle bundle2 = this.m;
        boolean z = bundle2 != null && bundle2.getBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", false);
        TvSignInActivity tvSignInActivity = (TvSignInActivity) C();
        this.a.b(z, tvSignInActivity.c, tvSignInActivity.e == 2);
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            this.a.c(intent);
        }
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        if (this.a.d()) {
            this.b.a(((TvSignInActivity) C()).c, "canceled");
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a(layoutInflater, viewGroup);
    }
}
