package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hzc extends ce {
    public hvb a;

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.draw_fragment, viewGroup, false);
        frameLayout.findViewById(R.id.draw_done_button).setOnClickListener(new View.OnClickListener() { // from class: hzb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hzc hzcVar = hzc.this;
                hvb hvbVar = hzcVar.a;
                if (hvbVar != null) {
                    hvbVar.a.bf();
                    dn k = hzcVar.z.k();
                    k.m(hzcVar);
                    k.a();
                }
            }
        });
        return frameLayout;
    }
}
