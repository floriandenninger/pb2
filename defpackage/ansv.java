package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import android.widget.RadioButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansv {
    public final boolean a;

    public ansv(uvz uvzVar) {
        uvzVar.getClass();
        uvzVar.a();
        this.a = false;
    }

    public ansv(boolean z) {
        this.a = z;
    }

    public ansv(byte[] bArr) {
        this.a = true;
    }

    public ansv(char[] cArr) {
        this.a = false;
    }

    public static final boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final void a(RadioButton radioButton, int i) {
        if (this.a) {
            radioButton.getClass();
            radioButton.setButtonDrawable(wbs.T(radioButton.getContext(), i));
        }
    }

    public final void b(RadioButton radioButton) {
        a(radioButton, R.attr.ytRadioButton);
    }

    public final void c(RadioButton radioButton, int i, int i2) {
        if (this.a) {
            Resources resources = radioButton.getContext().getResources();
            radioButton.setPaddingRelative(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2), radioButton.getPaddingEnd(), resources.getDimensionPixelSize(i2));
        }
    }

    public ansv() {
        this(true);
    }

    public ansv(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        this.a = (asvuVar == null ? asvu.a : asvuVar).bP;
    }
}
