package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgq extends ache {
    public acgp a;
    private TextView ae;
    private ProgressBar af;
    private Button b;
    private ImageView c;
    private acgo d;
    private ImageView e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ache, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        if (!(activity instanceof acgp)) {
            String obj = activity.toString();
            String simpleName = acgp.class.getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 16 + String.valueOf(simpleName).length());
            sb.append(obj);
            sb.append(" must implement ");
            sb.append(simpleName);
            throw new ClassCastException(sb.toString());
        }
        this.a = (acgp) activity;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = C().getLayoutInflater().inflate(R.layout.lc_error_state_fragment, viewGroup, false);
        this.d = (acgo) this.m.getSerializable("state");
        this.b = (Button) inflate.findViewById(R.id.action_button);
        this.c = (ImageView) inflate.findViewById(R.id.bitmap_view);
        this.e = (ImageView) inflate.findViewById(R.id.error_icon);
        this.ae = (TextView) inflate.findViewById(R.id.error_message_text);
        this.af = (ProgressBar) inflate.findViewById(R.id.spinner);
        this.c.setBackground(qX().getDrawable(R.color.lc_black_20));
        this.b.setOnClickListener(new acgn(this));
        acgo acgoVar = acgo.NO_INTERNET;
        int ordinal = this.d.ordinal();
        if (ordinal == 0) {
            this.b.setVisibility(8);
            this.af.setVisibility(8);
            this.e.setVisibility(0);
            this.e.setImageResource(R.drawable.quantum_ic_cloud_off_white_48);
            this.ae.setVisibility(0);
            this.ae.setText(R.string.lc_error_state_no_internet);
        } else if (ordinal == 1) {
            this.b.setVisibility(8);
            this.af.setVisibility(0);
            this.e.setVisibility(8);
            this.ae.setVisibility(0);
            this.ae.setText(R.string.lc_error_state_reconnecting);
        } else if (ordinal == 2) {
            this.af.setVisibility(8);
            this.b.setVisibility(0);
            this.b.setText(android.R.string.ok);
            this.e.setVisibility(0);
            this.e.setImageResource(R.drawable.quantum_ic_cloud_off_white_48);
            this.ae.setVisibility(0);
            this.ae.setText(R.string.lc_error_state_connection_failed);
        } else if (ordinal == 3) {
            this.b.setVisibility(0);
            this.b.setText(android.R.string.ok);
            this.e.setVisibility(0);
            this.e.setImageResource(R.drawable.ic_sad_face);
            this.af.setVisibility(8);
            this.ae.setVisibility(0);
            this.ae.setText(this.m.getString("message"));
        } else {
            throw new IllegalStateException("Unknown error state");
        }
        return inflate;
    }
}
