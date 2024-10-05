package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jed extends jec implements View.OnClickListener {
    public adsw ae;
    public acra af;
    adsq ag;
    boolean ah = true;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.af.d(acsb.b(62397), apxf.a, null);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        this.d.getWindow().setLayout(qX().getDimensionPixelSize(R.dimen.mdx_assisted_tv_sign_in_dialog_width), -2);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_assisted_tv_sign_in_dialog, viewGroup, false);
        inflate.findViewById(R.id.sign_in_button).setOnClickListener(this);
        inflate.findViewById(R.id.floaty_close_button).setOnClickListener(this);
        this.af.n(new acqx(acsb.c(57568)));
        this.af.n(new acqx(acsb.c(57570)));
        this.af.n(new acqx(acsb.c(57569)));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.sign_in_button) {
            if (id == R.id.floaty_close_button) {
                this.af.I(3, new acqx(acsb.c(57569)), null);
                this.ah = true;
                kv();
                return;
            }
            return;
        }
        this.af.I(3, new acqx(acsb.c(57570)), null);
        if (this.ae.g() != null) {
            ScreenId screenId = this.ae.g().b;
            this.ah = false;
            this.ae.k();
        }
        kv();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ah) {
            if (this.ae.g() != null) {
                ScreenId screenId = this.ae.g().b;
                this.ag.a(this.ae.g().b, "canceled");
            }
            this.ae.i();
        }
        this.ah = true;
    }
}
