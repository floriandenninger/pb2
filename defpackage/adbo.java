package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adbo implements TextWatcher, View.OnKeyListener, View.OnTouchListener {
    private static final amsx a = amsx.p(new HashSet(Arrays.asList(7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
    private final adbp b;
    private final TvCodeEditText c;
    private final int d;
    private final int e;

    public adbo(adbp adbpVar, TvCodeEditText tvCodeEditText, int i, int i2) {
        this.b = adbpVar;
        this.c = tvCodeEditText;
        this.d = i;
        this.e = i2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        Editable text = this.c.getText();
        if (text == null) {
            return false;
        }
        String obj = text.toString();
        int length = obj.length();
        int length2 = adbp.a(obj).length();
        if (i == 67) {
            if (keyEvent.getAction() == 0) {
                int i2 = this.d;
                if (length2 % i2 == 0 && length > i2 && length < this.e) {
                    int i3 = length - 2;
                    this.c.setText(text.subSequence(0, i3));
                    this.c.setSelection(i3);
                    return true;
                }
            }
            i = 67;
        }
        if (!a.contains(Integer.valueOf(i)) || keyEvent.getAction() != 1 || length2 % this.d != 0 || length >= this.e) {
            return false;
        }
        String concat = String.valueOf(obj).concat(" ");
        this.c.setText(concat);
        this.c.setSelection(concat.length());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (adbp.a(charSequence.toString()).length() == this.e) {
            adbp adbpVar = this.b;
            String a2 = adbp.a(String.valueOf(adbpVar.g.getText()));
            if (a2.length() == adbpVar.h) {
                TypedValue typedValue = new TypedValue();
                adbpVar.a.getTheme().resolveAttribute(R.attr.progressBarStyleSmall, typedValue, false);
                TypedArray obtainStyledAttributes = adbpVar.a.obtainStyledAttributes(typedValue.data, new int[]{R.attr.indeterminateDrawable});
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                if (drawable != 0) {
                    ((Animatable) drawable).start();
                    adbpVar.f.p(drawable);
                    adbpVar.f.s(wbs.S(adbpVar.a, com.google.android.youtube.R.attr.ytCallToAction));
                }
                adbpVar.d.h(new adgn(a2), yki.c(adbpVar.a, new adbn(adbpVar)));
                return;
            }
            return;
        }
        adbp adbpVar2 = this.b;
        int Q = wbs.Q(adbpVar2.a, com.google.android.youtube.R.attr.ytCallToAction);
        adbpVar2.f.j(Q);
        adbpVar2.f.D(ColorStateList.valueOf(Q));
        adbpVar2.f.p(null);
        adbpVar2.i.getBackground().setColorFilter(wbs.Q(adbpVar2.a, com.google.android.youtube.R.attr.ytIconDisabled), PorterDuff.Mode.MULTIPLY);
        adbpVar2.i.setTextColor(wbs.Q(adbpVar2.a, com.google.android.youtube.R.attr.ytTextDisabled));
        adbpVar2.i.setEnabled(false);
        adbpVar2.i.setTag(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.onTouchEvent(motionEvent);
        view.performClick();
        TvCodeEditText tvCodeEditText = this.c;
        tvCodeEditText.setSelection(tvCodeEditText.length());
        return true;
    }
}
