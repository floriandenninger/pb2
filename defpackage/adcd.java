package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcd extends bv {
    public String ae = "";

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, R.style.MdxMusicFullscreenDialogTheme);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.mdx_mat_avod_handoff_fragment, viewGroup, false);
        final int i2 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: adcc
            public final /* synthetic */ adcd a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    this.a.kv();
                } else {
                    this.a.dismiss();
                }
            }
        };
        ((ImageView) inflate.findViewById(R.id.mat_avod_handoff_dialog_close_button)).setOnClickListener(onClickListener);
        ((TextView) inflate.findViewById(R.id.mat_avod_handoff_stop_casting_button)).setOnClickListener(onClickListener);
        ((Button) inflate.findViewById(R.id.mat_avod_handoff_continue_button)).setOnClickListener(new View.OnClickListener(this) { // from class: adcc
            public final /* synthetic */ adcd a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    this.a.kv();
                } else {
                    this.a.dismiss();
                }
            }
        });
        ((TextView) inflate.findViewById(R.id.mat_avod_dialog_title_device_name)).setText(this.ae);
        return inflate;
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.setCancelable(false);
        return oq;
    }
}
