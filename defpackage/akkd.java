package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akkd extends akka {
    public zim ae;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, this.ae.a);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.scan_code, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.r(new View.OnClickListener() { // from class: akkc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akkd.this.dismiss();
            }
        });
        toolbar.o(R.string.accessibility_back);
        return inflate;
    }
}
