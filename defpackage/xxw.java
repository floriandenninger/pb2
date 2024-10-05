package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xxw implements TextWatcher {
    final /* synthetic */ YouTubeButton a;
    final /* synthetic */ TextView b;
    final /* synthetic */ xxz c;

    public xxw(xxz xxzVar, YouTubeButton youTubeButton, TextView textView) {
        this.c = xxzVar;
        this.a = youTubeButton;
        this.b = textView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() <= 0 || editable.length() > this.c.ak.i) {
            this.a.setEnabled(false);
            this.a.setTextColor(wbs.W(this.c.qR(), R.attr.ytIconDisabled).orElse(0));
        } else {
            this.a.setEnabled(true);
            this.a.setTextColor(wbs.W(this.c.qR(), R.attr.ytCallToAction).orElse(0));
        }
        int length = editable.length();
        int i = this.c.ak.i;
        StringBuilder sb = new StringBuilder(23);
        sb.append(length);
        sb.append("/");
        sb.append(i);
        whu.G(this.b, sb.toString());
        if (editable.length() <= this.c.ak.i) {
            this.b.setVisibility(4);
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
