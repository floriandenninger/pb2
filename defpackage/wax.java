package defpackage;

import android.content.Context;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wax {
    public final waw a;
    public final EditText b;
    public final Spinner c;
    public String d;

    public wax(Context context, EditText editText, Spinner spinner) {
        editText.getClass();
        this.b = editText;
        spinner.getClass();
        this.c = spinner;
        editText.setOnFocusChangeListener(new wat(spinner));
        editText.setOnClickListener(new wau(spinner));
        spinner.setOnItemSelectedListener(new wav(this, editText));
        waw wawVar = new waw(context);
        this.a = wawVar;
        spinner.setAdapter((SpinnerAdapter) wawVar);
    }
}
