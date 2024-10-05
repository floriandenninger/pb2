package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsp extends adsd {
    public adsj a;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        String str;
        super.S(bundle);
        TvSignInActivity tvSignInActivity = (TvSignInActivity) C();
        Bundle bundle2 = this.m;
        if (bundle2 != null && bundle2.getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail") != null) {
            str = this.m.getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail");
        } else {
            str = tvSignInActivity.d;
            if (str == null) {
                str = null;
            }
        }
        this.a.b(str, tvSignInActivity.b, tvSignInActivity.c);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a(layoutInflater, viewGroup);
    }
}
