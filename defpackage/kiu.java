package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kiu extends ic {
    final /* synthetic */ kiw b;

    public kiu(kiw kiwVar) {
        this.b = kiwVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        if (view.isClickable()) {
            ksVar.A(this.b.b.getString(R.string.accessibility_chapters_list_button_hint));
        }
    }
}
