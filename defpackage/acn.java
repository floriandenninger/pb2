package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acn extends bv {
    final Handler ae = new Handler(Looper.getMainLooper());
    final Runnable af = new acj(this);
    acd ag;
    public int ah;
    public int ai;
    public ImageView aj;
    TextView ak;

    private final int aF(int i) {
        Context qR = qR();
        Context a = aca.a(this);
        if (qR == null || a == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        qR.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = a.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.ae.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        acd acdVar = this.ag;
        acdVar.s = 0;
        acdVar.n(1);
        this.ag.m(O(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Context a = aca.a(this);
        if (a != null) {
            acd b = aca.b(a);
            this.ag = b;
            if (b.t == null) {
                b.t = new aow();
            }
            b.t.f(this, new acl(this, 1));
            acd acdVar = this.ag;
            if (acdVar.u == null) {
                acdVar.u = new aow();
            }
            acdVar.u.f(this, new acl(this, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.ah = aF(R.attr.colorError);
        } else {
            Context qR = qR();
            this.ah = qR != null ? aih.d(qR, R.color.biometric_error_color) : 0;
        }
        this.ai = aF(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ag.l(true);
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        CharSequence e;
        mh mhVar = new mh(qW());
        mhVar.o(this.ag.g());
        View inflate = LayoutInflater.from(mhVar.a()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence f = this.ag.f();
            if (TextUtils.isEmpty(f)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(f);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.ag.q();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.aj = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.ak = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (abd.d(this.ag.a())) {
            e = O(R.string.confirm_device_credential_password);
        } else {
            e = this.ag.e();
        }
        mhVar.i(e, new ack(this));
        mhVar.p(inflate);
        mi b = mhVar.b();
        b.setCanceledOnTouchOutside(false);
        return b;
    }
}
