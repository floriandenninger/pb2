package defpackage;

import android.view.View;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brw implements View.OnClickListener {
    final /* synthetic */ Preference a;

    public brw(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.qo(view);
    }
}
