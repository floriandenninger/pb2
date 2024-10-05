package defpackage;

import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajrt implements View.OnClickListener {
    public final TextView a;
    public final Spinner b;
    public final RadioButton c;
    public final View d;
    final /* synthetic */ ajru e;

    public ajrt(ajru ajruVar, View view) {
        this.e = ajruVar;
        this.c = (RadioButton) view.findViewById(R.id.report_form_top_level_radio);
        this.a = (TextView) view.findViewById(R.id.report_form_top_level_text);
        this.b = (Spinner) view.findViewById(R.id.report_form_top_level_spinner);
        this.d = view.findViewById(R.id.report_form_top_level_separator);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.setChecked(!r2.isChecked());
        if (this.c.isChecked()) {
            this.e.b((atsu) this.c.getTag());
        } else {
            this.e.b(null);
        }
    }
}
