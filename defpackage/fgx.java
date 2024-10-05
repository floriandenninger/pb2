package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fgx {
    private final int a;
    private final int b;
    final /* synthetic */ SpecificNetworkErrorViewLoadingFrameLayout c;
    private final int d;
    private View e;
    private TextView f;
    private CharSequence g;

    public fgx(SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout, int i, int i2, int i3) {
        this.c = specificNetworkErrorViewLoadingFrameLayout;
        this.a = i;
        this.b = i2;
        this.d = i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View a() {
        View inflate = LayoutInflater.from(this.c.a).inflate(this.b, (ViewGroup) this.c, false);
        int i = this.d;
        if (i > 0) {
            TextView textView = (TextView) inflate.findViewById(i);
            this.f = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            e(this.g);
        }
        return inflate;
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.f;
        if (textView != null) {
            if (charSequence == null) {
                textView.setText("");
            } else {
                textView.setText(charSequence);
            }
            this.g = null;
            return;
        }
        this.g = charSequence;
    }

    public final void f(int i) {
        if (this.a != i) {
            View view = this.e;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.e == null) {
            View a = a();
            this.e = a;
            this.c.addView(a);
        }
        this.e.setVisibility(0);
    }
}
