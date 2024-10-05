package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kww extends kwt {
    public zim ae;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, this.ae.a);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.playlist_info_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.r(new View.OnClickListener() { // from class: kwv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kww.this.dismiss();
            }
        });
        toolbar.x(qX().getString(R.string.playlist_info_header_title));
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            apxf b = aahg.b(bundle2.getByteArray("navigation_endpoint"));
            if (b.pY(aubk.a)) {
                aubj aubjVar = (aubj) b.pX(aubk.a);
                TextView textView = (TextView) inflate.findViewById(R.id.playlist_title);
                aqyg aqygVar = aubjVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                whu.G(textView, ajcq.b(aqygVar));
                TextView textView2 = (TextView) inflate.findViewById(R.id.description);
                aqyg aqygVar2 = aubjVar.b;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                whu.G(textView2, ajcq.r(aqygVar2));
            }
        }
        return inflate;
    }
}
