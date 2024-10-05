package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oep extends ic {
    final /* synthetic */ View b;
    final /* synthetic */ oeq c;

    public oep(oeq oeqVar, View view) {
        this.c = oeqVar;
        this.b = view;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.v(this.b.getResources().getString(R.string.accessibility_player_content_description));
        ksVar.A(this.b.getResources().getString(R.string.accessibility_player_hint_text));
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 16) {
            this.c.e.get().m();
            return true;
        }
        return super.j(view, i, bundle);
    }
}
