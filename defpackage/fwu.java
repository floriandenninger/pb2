package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwu extends ahus implements aivf {
    public boolean a;
    public CharSequence b;
    private final Rect c;
    private TextView d;

    public fwu(Context context) {
        super(context);
        this.c = new Rect();
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.trailer_overlay, (ViewGroup) null);
        this.d = (TextView) inflate.findViewById(R.id.message);
        return inflate;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
        if (ab(1)) {
            this.d.setText(this.b, TextView.BufferType.SPANNABLE);
        }
        if (ab(2)) {
            view.setPadding(this.c.left, this.c.top, this.c.right, this.c.bottom);
        }
    }

    public final void e() {
        this.b = "";
        g();
    }

    public final void f(boolean z) {
        this.a = z;
        g();
    }

    public final void g() {
        if (nt()) {
            aa();
        } else {
            X();
        }
    }

    public final void i(int i, int i2) {
        this.c.set(i, 0, 0, i2);
        Z(2);
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.a && !TextUtils.isEmpty(this.b);
    }
}
