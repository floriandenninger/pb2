package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrv extends ahrq {
    public ahrv(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqte aqteVar) {
        super(context, creatorEndscreenOverlayPresenter, aqteVar);
    }

    @Override // defpackage.ahrq
    public final void f(View view) {
        aqyg aqygVar;
        super.f(view);
        view.findViewById(R.id.endscreen_element_duration).setVisibility(8);
        view.findViewById(R.id.endscreen_playlist_bar).setVisibility(0);
        Context context = this.a;
        Object[] objArr = new Object[1];
        aqte aqteVar = this.b;
        if ((aqteVar.b & 32) != 0) {
            aqygVar = aqteVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        objArr[0] = ajcq.b(aqygVar);
        ((TextView) view.findViewById(R.id.playlist_text)).setText(context.getString(R.string.endscreen_element_playlist_count, objArr));
    }
}
