package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrt extends ahrs implements ahrn {
    public ahrt(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqte aqteVar) {
        super(context, creatorEndscreenOverlayPresenter, aqteVar);
    }

    @Override // defpackage.ahrs, defpackage.ahrq
    public final void g(ahsb ahsbVar) {
        auzj auzjVar;
        super.g(ahsbVar);
        kgl kglVar = this.c.v;
        if (kglVar != null) {
            aqtd aqtdVar = this.b.u;
            if (aqtdVar == null) {
                aqtdVar = aqtd.a;
            }
            if (aqtdVar.b == 55419609) {
                ahsbVar.m.setVisibility(0);
                aqte aqteVar = this.b;
                FrameLayout frameLayout = ahsbVar.m;
                if (kglVar.e == null) {
                    kglVar.e = (TextView) kglVar.a.getLayoutInflater().inflate(R.layout.subscribe_button, (ViewGroup) frameLayout, true).findViewById(R.id.subscribe_button);
                }
                if (kglVar.d == null) {
                    kglVar.d = kglVar.c.a(kglVar.e, null);
                    kglVar.d.c(kglVar);
                }
                aqtd aqtdVar2 = aqteVar.u;
                if (aqtdVar2 == null) {
                    aqtdVar2 = aqtd.a;
                }
                if (aqtdVar2.b == 55419609) {
                    auzjVar = (auzj) aqtdVar2.c;
                } else {
                    auzjVar = auzj.a;
                }
                kglVar.f = this;
                kglVar.d.i(auzjVar, kglVar.b);
                return;
            }
        }
        ahsbVar.h.setVisibility(0);
    }
}
