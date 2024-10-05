package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahru extends ahrz {
    public ahru(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqte aqteVar) {
        super(context, creatorEndscreenOverlayPresenter, aqteVar);
    }

    @Override // defpackage.ahrz, defpackage.ahrq
    public final void g(ahsb ahsbVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        super.g(ahsbVar);
        ahsbVar.g.setVisibility(8);
        ahsbVar.h.setVisibility(0);
        Drawable a = aii.a(this.a, R.drawable.quantum_ic_launch_googblue_18);
        if (a != null) {
            a.mutate().setTint(wbs.W(this.a, R.attr.ytThemedBlue).orElse(0));
        }
        aqyg aqygVar3 = null;
        ahsbVar.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
        ahsbVar.h.setCompoundDrawablePadding(8);
        TextView textView = ahsbVar.j;
        aqte aqteVar = this.b;
        if ((aqteVar.b & 16384) != 0) {
            aqygVar = aqteVar.p;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = ahsbVar.k;
        aqte aqteVar2 = this.b;
        if ((aqteVar2.b & 32768) != 0) {
            aqygVar2 = aqteVar2.q;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = ahsbVar.l;
        aqte aqteVar3 = this.b;
        if ((aqteVar3.b & 8192) != 0 && (aqygVar3 = aqteVar3.o) == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
    }

    @Override // defpackage.ahrz
    public final void j() {
        aqyg aqygVar;
        super.j();
        TextView textView = ((ahrz) this).k;
        aqte aqteVar = this.b;
        if ((aqteVar.b & 131072) != 0) {
            aqygVar = aqteVar.r;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        this.j.setVisibility(8);
    }
}
