package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajro extends LinearLayout {
    public final TextView a;
    public final ListView b;
    public final TextView c;
    public final View d;
    public final CompoundButton e;
    public final TextView f;

    public ajro(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.report_form, this);
        this.a = (TextView) findViewById(R.id.title);
        ListView listView = (ListView) findViewById(R.id.content);
        this.b = listView;
        View inflate = from.inflate(R.layout.report_form_legal_section, (ViewGroup) listView, false);
        this.c = (TextView) inflate.findViewById(R.id.footer);
        this.d = inflate.findViewById(R.id.legal_checkbox_separator);
        this.e = (CompoundButton) inflate.findViewById(R.id.legal_checkbox);
        TextView textView = (TextView) inflate.findViewById(R.id.legal_description);
        this.f = textView;
        listView.addFooterView(inflate, null, false);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
