package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class almq extends alng {
    public final TextWatcher a;
    public final View.OnFocusChangeListener b;
    private final alnx c;
    private final alny d;
    private AnimatorSet e;
    private ValueAnimator f;

    public almq(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.a = new almh(this);
        this.b = new almi(this);
        this.c = new almj(this);
        this.d = new alml(this);
    }

    private final ValueAnimator e(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(aleq.a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new almp(this, 1));
        return ofFloat;
    }

    public final void a(boolean z) {
        boolean T = this.k.T();
        if (!z) {
            this.e.cancel();
            this.f.start();
            if (T) {
                return;
            }
            this.f.end();
            return;
        }
        if (this.e.isRunning()) {
            return;
        }
        this.f.cancel();
        this.e.start();
        if (T) {
            this.e.end();
        }
    }

    @Override // defpackage.alng
    public final void b() {
        TextInputLayout textInputLayout = this.k;
        int i = this.n;
        if (i == 0) {
            i = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.o(i);
        TextInputLayout textInputLayout2 = this.k;
        textInputLayout2.n(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.k.r(new almm(this));
        this.k.e(this.c);
        this.k.f(this.d);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(aleq.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new almp(this, 0));
        ValueAnimator e = e(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.e = animatorSet;
        animatorSet.playTogether(ofFloat, e);
        this.e.addListener(new almn(this));
        ValueAnimator e2 = e(1.0f, 0.0f);
        this.f = e2;
        e2.addListener(new almo(this));
    }

    @Override // defpackage.alng
    public final void c(boolean z) {
        if (this.k.g == null) {
            return;
        }
        a(z);
    }

    public final boolean d() {
        EditText editText = this.k.a;
        if (editText != null) {
            return (editText.hasFocus() || this.m.hasFocus()) && editText.getText().length() > 0;
        }
        return false;
    }
}
