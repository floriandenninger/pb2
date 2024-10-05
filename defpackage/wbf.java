package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.DateFormat;
import java.util.GregorianCalendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbf implements wbg {
    private static final CharSequence o = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
    public final wan a;
    public final GregorianCalendar b;
    public final View c;
    public final TextView d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public DateFormat h;
    public final wax i;
    public boolean j;
    public boolean k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    private final aahd p;
    private final TextView q;

    public wbf(Context context, aahd aahdVar, wan wanVar, View view, TextView textView, TextView textView2) {
        this.a = wanVar;
        this.p = aahdVar;
        view.getClass();
        textView.getClass();
        this.q = textView;
        textView2.getClass();
        this.d = textView2;
        View findViewById = view.findViewById(R.id.no_gplus_content);
        findViewById.getClass();
        this.c = findViewById;
        EditText editText = (EditText) view.findViewById(R.id.given_name);
        editText.getClass();
        this.e = editText;
        EditText editText2 = (EditText) view.findViewById(R.id.family_name);
        editText2.getClass();
        this.f = editText2;
        EditText editText3 = (EditText) view.findViewById(R.id.birthday);
        editText3.getClass();
        this.g = editText3;
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wbb
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                wbf wbfVar = wbf.this;
                if (z) {
                    wbfVar.g.performClick();
                }
            }
        });
        wbd wbdVar = new wbd(this);
        editText.addTextChangedListener(wbdVar);
        editText2.addTextChangedListener(wbdVar);
        editText3.addTextChangedListener(wbdVar);
        this.i = new wax(context, (EditText) view.findViewById(R.id.gender_text), (Spinner) view.findViewById(R.id.gender_spinner));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.b = gregorianCalendar;
        gregorianCalendar.setTimeInMillis(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aauk aaukVar, Bundle bundle) {
        aaukVar.getClass();
        this.k = true;
        this.e.setHint(aaukVar.b());
        this.f.setHint(aaukVar.a());
        if (bundle == null) {
            this.e.setText(aaukVar.d());
            this.f.setText(aaukVar.c());
        }
        CharSequence charSequence = null;
        for (CharSequence charSequence2 : aaukVar.e(this.p)) {
            charSequence = charSequence == null ? charSequence2 : TextUtils.concat(charSequence, o, charSequence2);
        }
        if (!aaukVar.g()) {
            this.e.setInputType(0);
        }
        if (!aaukVar.f()) {
            this.f.setInputType(0);
        }
        this.q.setText(charSequence);
        this.l = aaukVar.h(3);
        this.m = aaukVar.h(1);
        this.n = aaukVar.h(2);
    }

    @Override // defpackage.wbg
    public final void aI(int i, int i2, int i3) {
        this.b.set(i, i2, i3);
        b();
    }

    public final void b() {
        this.g.setText(this.h.format(Long.valueOf(this.b.getTimeInMillis())));
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.g.getText());
    }

    public final boolean d() {
        return (TextUtils.isEmpty(this.e.getText()) || TextUtils.isEmpty(this.f.getText())) ? false : true;
    }
}
