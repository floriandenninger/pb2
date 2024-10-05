package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mqu {
    private final ftd a;
    private final akbu b;
    private final FrameLayout c;

    public mqu(ViewGroup viewGroup, ftd ftdVar, akbu akbuVar) {
        this.a = ftdVar;
        this.b = akbuVar;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.sub_menu_container);
        this.c = frameLayout;
        frameLayout.addView(ftdVar.c);
        frameLayout.setVisibility(8);
    }

    public final void a(ajok ajokVar, auwh auwhVar, atlu atluVar) {
        arej arejVar;
        if (auwhVar == null) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.a.oB(ajokVar, auwhVar);
        if (atluVar == null) {
            arejVar = null;
        } else if (atluVar.b == 102716411) {
            arejVar = (arej) atluVar.c;
        } else {
            arejVar = arej.a;
        }
        if (arejVar != null) {
            this.b.b(arejVar, this.c, atluVar, ajokVar.a);
        }
    }
}
