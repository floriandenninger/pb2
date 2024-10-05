package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mwr implements ajom {
    private final View a;
    private final TextView b;
    private final TextView c;

    public mwr(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.topic_picker_header, viewGroup, false);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        mwq mwqVar = (mwq) obj;
        whu.G(this.b, mwqVar.a);
        whu.G(this.c, mwqVar.b);
    }
}
