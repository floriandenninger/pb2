package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrw extends ahrq {
    public ahrw(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqte aqteVar) {
        super(context, creatorEndscreenOverlayPresenter, aqteVar);
    }

    @Override // defpackage.ahrq
    public final void f(View view) {
        aqyg aqygVar;
        super.f(view);
        TextView textView = (TextView) view.findViewById(R.id.endscreen_element_duration);
        aqte aqteVar = this.b;
        if ((aqteVar.b & 16) != 0) {
            aqygVar = aqteVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
    }
}
