package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lez {
    private final int a;
    private View b = null;
    private final View c;

    public lez(int i, View view) {
        this.a = i;
        this.c = view;
    }

    public final TextView a(CharSequence charSequence, int i) {
        if (this.b == null) {
            this.b = ((ViewStub) this.c.findViewById(this.a)).inflate();
        }
        TextView textView = (TextView) this.b.findViewById(i);
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.b.setVisibility(0);
        return textView;
    }

    public final void b() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
