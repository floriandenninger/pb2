package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kiv extends ic {
    final /* synthetic */ kiw b;

    public kiv(kiw kiwVar) {
        this.b = kiwVar;
    }

    private final String k(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return null;
        }
        Resources resources = this.b.b;
        kiw kiwVar = this.b;
        return resources.getString(i, wbs.ay(resources, charSequence), wbs.ay(kiwVar.b, kiwVar.i));
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        String k;
        super.d(view, ksVar);
        kiw kiwVar = this.b;
        if (kiwVar.i == null) {
            k = null;
        } else if (kiwVar.f) {
            k = k(kiwVar.h, R.string.accessibility_player_remaining_time);
        } else {
            k = k(kiwVar.g, R.string.accessibility_player_elapsed_time);
        }
        ksVar.v(k);
        kiw kiwVar2 = this.b;
        ksVar.A(kiwVar2.b.getString(true != kiwVar2.f ? R.string.accessibility_player_remaining_time_hint : R.string.accessibility_player_elapsed_time_hint));
    }
}
