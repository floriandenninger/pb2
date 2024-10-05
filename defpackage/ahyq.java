package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahyq implements ahyr {
    private final TextView a;

    public ahyq(TextView textView) {
        textView.getClass();
        this.a = textView;
    }

    @Override // defpackage.ahyr
    public final void a(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // defpackage.ahyr
    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // defpackage.ahyr
    public final void c(int i) {
        this.a.setVisibility(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append(this.a.getId());
        sb.append("]");
        return sb.toString();
    }
}
