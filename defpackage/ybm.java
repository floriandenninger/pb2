package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ybm implements ajom {
    public final ybl a;
    public final View b;
    public final EditText c;
    public boolean d;
    private final TextInputLayout e;
    private final int f;

    public ybm(Context context, ybl yblVar, ViewGroup viewGroup) {
        this.a = yblVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.coupon_layout, viewGroup, false);
        this.b = inflate;
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.coupon_edit_wrapper);
        this.e = textInputLayout;
        this.c = (EditText) inflate.findViewById(R.id.coupon_edit);
        this.f = yjk.K(textInputLayout.getResources().getDisplayMetrics(), 8);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d() {
        this.e.w(false);
        this.e.v(null);
    }

    public final void e() {
        if (this.c.hasFocus() || this.c.getText().length() > 0) {
            this.e.setPadding(0, this.f, 0, 0);
        } else {
            this.e.setPadding(0, 0, 0, 0);
        }
    }

    public final void f(avkr avkrVar) {
        aqyg aqygVar;
        this.c.addTextChangedListener(new ybk(this));
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: ybi
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Drawable drawable;
                ybm ybmVar = ybm.this;
                if (motionEvent.getAction() != 1 || (drawable = ybmVar.c.getCompoundDrawables()[2]) == null || !ybmVar.d || motionEvent.getX() < ybmVar.c.getRight() - drawable.getBounds().width()) {
                    whu.J(ybmVar.c);
                    return false;
                }
                ybmVar.c.setText("");
                return true;
            }
        });
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ybj
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                ybm ybmVar = ybm.this;
                if (i != 6) {
                    return false;
                }
                ((ixu) ybmVar.a).aL(ybmVar.c.getText().toString());
                ybmVar.c.clearFocus();
                return true;
            }
        });
        this.c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ybh
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ybm.this.e();
                if (z) {
                    return;
                }
                whu.C(view);
            }
        });
        this.e.o = !((avkrVar.b & 2) != 0);
        this.c.setText(avkrVar.d);
        TextInputLayout textInputLayout = this.e;
        if ((avkrVar.b & 1) != 0) {
            aqygVar = avkrVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textInputLayout.B(ajcq.b(aqygVar));
        if ((avkrVar.b & 4) == 0) {
            if (!avkrVar.d.isEmpty()) {
                this.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_check_googgreen_18, 0);
                this.d = false;
            }
            d();
            this.c.clearFocus();
            return;
        }
        TextInputLayout textInputLayout2 = this.e;
        aqyg aqygVar2 = avkrVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textInputLayout2.v(ajcq.b(aqygVar2));
        EditText editText = this.c;
        editText.setSelection(editText.getText().length());
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        f((avkr) obj);
    }
}
