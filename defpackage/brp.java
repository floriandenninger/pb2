package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brp extends bsd {
    private EditText ae;
    private CharSequence af;
    private final Runnable ag = new bro(this);
    private long ah = -1;

    private final EditTextPreference aM() {
        return (EditTextPreference) aK();
    }

    private final void aN(boolean z) {
        this.ah = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bsd
    public final void aF(View view) {
        super.aF(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ae = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ae.setText(this.af);
        EditText editText2 = this.ae;
        editText2.setSelection(editText2.getText().length());
        aM();
    }

    @Override // defpackage.bsd
    public final void aG(boolean z) {
        if (z) {
            String obj = this.ae.getText().toString();
            EditTextPreference aM = aM();
            if (aM.Q(obj)) {
                aM.i(obj);
            }
        }
    }

    @Override // defpackage.bsd
    protected final void aH() {
        aN(true);
        aI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI() {
        long j = this.ah;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.ae;
        if (editText == null || !editText.isFocused()) {
            aN(false);
        } else if (((InputMethodManager) this.ae.getContext().getSystemService("input_method")).showSoftInput(this.ae, 0)) {
            aN(false);
        } else {
            this.ae.removeCallbacks(this.ag);
            this.ae.postDelayed(this.ag, 50L);
        }
    }

    @Override // defpackage.bsd
    protected final boolean aJ() {
        return true;
    }

    @Override // defpackage.bsd, defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.af);
    }

    @Override // defpackage.bsd, defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            this.af = aM().g;
        } else {
            this.af = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }
}
