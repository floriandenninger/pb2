package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsh implements ajsg {
    public View a;

    public ajsh() {
        this.a = null;
    }

    public ajsh(View view) {
        this.a = view;
    }

    @Override // defpackage.ajsg
    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        View view = this.a;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(i);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setText(spannableStringBuilder);
        }
    }
}
