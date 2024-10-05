package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alnw extends ic {
    private final TextInputLayout b;

    public alnw(TextInputLayout textInputLayout) {
        this.b = textInputLayout;
    }

    @Override // defpackage.ic
    public void d(View view, ks ksVar) {
        TextView textView;
        super.d(view, ksVar);
        EditText editText = this.b.a;
        CharSequence charSequence = null;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence c = this.b.c();
        CharSequence b = this.b.b();
        CharSequence d = this.b.d();
        TextInputLayout textInputLayout = this.b;
        int i = textInputLayout.c;
        if (textInputLayout.b && textInputLayout.d && (textView = textInputLayout.e) != null) {
            charSequence = textView.getContentDescription();
        }
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(c);
        boolean z3 = !this.b.m;
        boolean isEmpty = TextUtils.isEmpty(b);
        boolean z4 = (isEmpty ^ true) || !TextUtils.isEmpty(charSequence);
        String charSequence2 = z2 ? c.toString() : "";
        if (z) {
            ksVar.D(text);
        } else if (!TextUtils.isEmpty(charSequence2)) {
            ksVar.D(charSequence2);
            if (z3 && d != null) {
                String valueOf = String.valueOf(d);
                StringBuilder sb = new StringBuilder(String.valueOf(charSequence2).length() + 2 + String.valueOf(valueOf).length());
                sb.append(charSequence2);
                sb.append(", ");
                sb.append(valueOf);
                ksVar.D(sb.toString());
            }
        } else if (d != null) {
            ksVar.D(d);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            if (Build.VERSION.SDK_INT >= 26) {
                ksVar.A(charSequence2);
            } else {
                if (z) {
                    String valueOf2 = String.valueOf(text);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 2 + String.valueOf(charSequence2).length());
                    sb2.append(valueOf2);
                    sb2.append(", ");
                    sb2.append(charSequence2);
                    charSequence2 = sb2.toString();
                }
                ksVar.D(charSequence2);
            }
            boolean z5 = !z;
            if (Build.VERSION.SDK_INT >= 26) {
                ksVar.b.setShowingHintText(z5);
            } else {
                ksVar.m(4, z5);
            }
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        ksVar.b.setMaxTextLength(i);
        if (z4) {
            if (true == isEmpty) {
                b = charSequence;
            }
            ksVar.b.setError(b);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.textinput_helper_text);
        }
    }
}
