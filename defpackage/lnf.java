package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lnf extends ArrayAdapter {
    private static final boolean a;
    private final LayoutInflater b;
    private final int c;
    private final CharSequence[] d;
    private final int e;
    private final Context f;
    private final int g;
    private final azrw h;

    static {
        a = Build.VERSION.SDK_INT >= 29;
    }

    public lnf(Context context, CharSequence[] charSequenceArr, int i, int i2, azrw azrwVar) {
        super(context, R.layout.custom_list_item, charSequenceArr);
        context.getClass();
        this.f = context;
        this.c = R.layout.custom_list_item;
        charSequenceArr.getClass();
        this.d = charSequenceArr;
        this.e = i;
        this.g = i2;
        azrwVar.getClass();
        this.h = azrwVar;
        this.b = LayoutInflater.from(context);
    }

    public final void a() {
        try {
            this.f.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
        } catch (ActivityNotFoundException e) {
            zga.d("Error launching accessibility settings", e);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(this.c, (ViewGroup) null);
        }
        if (i >= 0 && i < this.d.length) {
            TextView textView = (TextView) view.findViewById(R.id.title);
            YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.subtitle);
            textView.setText(this.d[i]);
            if (i != this.g || !a) {
                youTubeTextView.setVisibility(8);
            } else {
                Resources resources = view.getResources();
                String string = resources.getString(R.string.pref_hide_controls_accessibility_settings_link);
                String string2 = resources.getString(R.string.pref_hide_controls_manage_system_timeout, string);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                spannableStringBuilder.setSpan(new lne(this), string2.toString().indexOf(string), spannableStringBuilder.length(), 34);
                youTubeTextView.setText(spannableStringBuilder);
                youTubeTextView.setVisibility(0);
            }
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.radio);
            radioButton.setChecked(i == this.e);
            ansv ansvVar = (ansv) this.h.get();
            if (ansvVar.a) {
                yny.z(radioButton, yny.r(radioButton.getContext().getResources().getDimensionPixelOffset(R.dimen.radio_button_layout_margin_start)), ViewGroup.MarginLayoutParams.class);
                if (i != this.e) {
                    ansvVar.a(radioButton, R.attr.ytRadioButtonUncheckedDrawable);
                } else {
                    ansvVar.a(radioButton, R.attr.ytRadioButtonCheckedDrawable);
                }
            }
        }
        return view;
    }
}
