package defpackage;

import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xke {
    public boolean a;
    private final TextView b;

    public xke(TextView textView) {
        this.b = textView;
        a();
    }

    public final void a() {
        b(false, true);
        this.b.setText("");
    }

    public final void b(boolean z, boolean z2) {
        if (z2 || this.a != z) {
            this.a = z;
            this.b.setClickable(z);
            this.b.setEnabled(z);
            TextView textView = this.b;
            textView.setCompoundDrawablePadding(z ? (int) (textView.getResources().getDisplayMetrics().density * 6.0f) : 0);
            this.b.setCompoundDrawablesWithIntrinsicBounds(0, 0, true != z ? 0 : R.drawable.ad_choices_instream_icon, 0);
        }
    }
}
