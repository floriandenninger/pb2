package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akde {
    private final int a;
    public View b;
    final /* synthetic */ LoadingFrameLayout c;
    private final int d;
    private final int e;
    private TextView f;
    private CharSequence g;

    public akde(LoadingFrameLayout loadingFrameLayout, int i, int i2, int i3) {
        this.c = loadingFrameLayout;
        this.a = i;
        this.d = i2;
        this.e = i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View a() {
        View inflate = LayoutInflater.from(this.c.c).inflate(this.d, (ViewGroup) this.c, false);
        int i = this.e;
        if (i > 0) {
            TextView textView = (TextView) inflate.findViewById(i);
            this.f = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            d(this.g);
        }
        return inflate;
    }

    public final void d(CharSequence charSequence) {
        TextView textView = this.f;
        if (textView == null) {
            this.g = charSequence;
        } else {
            textView.setText(charSequence);
            this.g = null;
        }
    }

    public final void e(int i) {
        if (this.a == i) {
            if (this.b == null) {
                View a = a();
                this.b = a;
                this.c.addView(a);
            }
            this.b.setVisibility(0);
            return;
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
            this.b.clearFocus();
        }
    }
}
