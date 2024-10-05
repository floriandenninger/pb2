package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hpw {
    public final EditText a;
    public final Context b;
    public hpl c;

    public hpw(Context context, ViewGroup viewGroup) {
        this.b = context;
        EditText editText = (EditText) viewGroup.findViewById(R.id.search_input_text);
        this.a = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hpu
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                hpw hpwVar = hpw.this;
                if (i != 3) {
                    return false;
                }
                String obj = hpwVar.a.getText().toString();
                if (hpwVar.c == null || ammx.e(obj)) {
                    return true;
                }
                whu.C(hpwVar.a);
                hpwVar.a.clearFocus();
                hpm hpmVar = hpwVar.c.a;
                akei akeiVar = hpmVar.af;
                akeiVar.o = 4;
                akeiVar.e = obj;
                hpmVar.q(obj);
                return true;
            }
        });
        View findViewById = viewGroup.findViewById(R.id.cancel_icon);
        editText.addTextChangedListener(new hpv(this, findViewById));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hpt
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                hpl hplVar;
                hpw hpwVar = hpw.this;
                if (!z || (hplVar = hpwVar.c) == null) {
                    return;
                }
                hplVar.a(hpwVar.a.getText().toString());
            }
        });
        final int i = 1;
        viewGroup.findViewById(R.id.search_cancel).setOnClickListener(new View.OnClickListener(this) { // from class: hps
            public final /* synthetic */ hpw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    hpw hpwVar = this.a;
                    if (!hpwVar.a.getText().toString().isEmpty()) {
                        hpwVar.a.setText("");
                        return;
                    }
                    hpl hplVar = hpwVar.c;
                    if (hplVar != null) {
                        hplVar.a.p(false);
                        return;
                    }
                    return;
                }
                hpw hpwVar2 = this.a;
                if (!hpwVar2.a.getText().toString().isEmpty()) {
                    hpwVar2.a.setText("");
                    return;
                }
                hpl hplVar2 = hpwVar2.c;
                if (hplVar2 != null) {
                    hplVar2.a.af.c();
                }
            }
        });
        final int i2 = 0;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: hps
            public final /* synthetic */ hpw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    hpw hpwVar = this.a;
                    if (!hpwVar.a.getText().toString().isEmpty()) {
                        hpwVar.a.setText("");
                        return;
                    }
                    hpl hplVar = hpwVar.c;
                    if (hplVar != null) {
                        hplVar.a.p(false);
                        return;
                    }
                    return;
                }
                hpw hpwVar2 = this.a;
                if (!hpwVar2.a.getText().toString().isEmpty()) {
                    hpwVar2.a.setText("");
                    return;
                }
                hpl hplVar2 = hpwVar2.c;
                if (hplVar2 != null) {
                    hplVar2.a.af.c();
                }
            }
        });
    }
}
