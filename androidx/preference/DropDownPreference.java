package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.youtube.R;
import defpackage.brn;
import defpackage.bsx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context G;
    private final ArrayAdapter H;
    private Spinner I;

    /* renamed from: J, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f76J;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.f76J = new brn(this);
        this.G = context;
        this.H = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        ab();
    }

    private final void ab() {
        this.H.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.H.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.I.performClick();
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.H;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.ListPreference
    public final void e(CharSequence[] charSequenceArr) {
        ((ListPreference) this).g = charSequenceArr;
        ab();
    }

    @Override // androidx.preference.ListPreference
    public final void f(int i) {
        o(((ListPreference) this).h[i].toString());
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        Spinner spinner = (Spinner) bsxVar.a.findViewById(R.id.spinner);
        this.I = spinner;
        spinner.setAdapter((SpinnerAdapter) this.H);
        this.I.setOnItemSelectedListener(this.f76J);
        Spinner spinner2 = this.I;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                        i = length;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.qn(bsxVar);
    }
}
