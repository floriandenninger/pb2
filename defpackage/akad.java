package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akad extends bv {
    public static akad aF(int i) {
        akad akadVar = new akad();
        Bundle bundle = new Bundle();
        bundle.putInt("messageId", i);
        akadVar.af(bundle);
        return akadVar;
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Bundle bundle2 = this.m;
        bundle2.getClass();
        int i = bundle2.getInt("messageId");
        amkq.N(i != 0);
        mh mhVar = new mh(C());
        mhVar.f(i);
        mhVar.k(R.string.permission_open_settings_button, new akac(this));
        mhVar.h(R.string.permissions_not_now, null);
        return mhVar.b();
    }
}
