package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajru extends ArrayAdapter implements ListAdapter {
    private LayoutInflater a;
    private atsu b;
    private final Map c;
    private final ansv d;

    public ajru(Context context, ansv ansvVar, byte[] bArr) {
        super(context, R.layout.report_form_item);
        this.c = new HashMap();
        this.d = ansvVar;
    }

    public final atsu a() {
        ajrr ajrrVar;
        atsu atsuVar = this.b;
        return (atsuVar == null || (ajrrVar = (ajrr) this.c.get(atsuVar)) == null) ? this.b : ajrrVar.b(ajrrVar.a);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final void b(atsu atsuVar) {
        if ((atsuVar != null || this.b == null) && (atsuVar == null || atsuVar.equals(this.b))) {
            return;
        }
        this.b = atsuVar;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        super.clear();
        this.b = null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ajrt ajrtVar;
        TextView textView;
        if (view == null) {
            if (this.a == null) {
                this.a = LayoutInflater.from(getContext());
            }
            view = this.a.inflate(R.layout.report_form_item, viewGroup, false);
        }
        atss atssVar = (atss) getItem(i);
        if (view.getTag() instanceof ajrt) {
            ajrtVar = (ajrt) view.getTag();
        } else {
            ajrtVar = new ajrt(this, view);
            view.setTag(ajrtVar);
            view.setOnClickListener(ajrtVar);
        }
        if (atssVar != null) {
            atsu atsuVar = atssVar.e;
            if (atsuVar == null) {
                atsuVar = atsu.a;
            }
            ajrr ajrrVar = (ajrr) this.c.get(atsuVar);
            aqyg aqygVar = null;
            if (ajrrVar == null && !this.c.containsKey(atsuVar)) {
                if (atsuVar.d.size() > 0) {
                    Spinner spinner = ajrtVar.b;
                    ajrrVar = new ajrr(spinner == null ? null : spinner.getContext(), atsuVar.d);
                }
                this.c.put(atsuVar, ajrrVar);
            }
            boolean equals = atsuVar.equals(this.b);
            if (atsuVar != null && (textView = ajrtVar.a) != null && ajrtVar.c != null && ajrtVar.b != null) {
                if ((atsuVar.b & 1) != 0 && (aqygVar = atsuVar.c) == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
                ajrtVar.c.setTag(atsuVar);
                ajrtVar.c.setChecked(equals);
                boolean z = equals && ajrrVar != null;
                ajrtVar.b.setAdapter((SpinnerAdapter) ajrrVar);
                Spinner spinner2 = ajrtVar.b;
                int i2 = true != z ? 8 : 0;
                spinner2.setVisibility(i2);
                ajrtVar.d.setVisibility(i2);
                if (z) {
                    ajrtVar.b.setSelection(ajrrVar.a);
                    ajrtVar.b.setOnItemSelectedListener(new ajrs(ajrtVar, ajrrVar));
                }
            }
        }
        if (this.d.a) {
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.report_form_top_level_radio);
            YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.report_form_top_level_text);
            ansv ansvVar = this.d;
            ansvVar.b(radioButton);
            if (ansvVar.a) {
                youTubeTextView.getClass();
                youTubeTextView.setTextColor(wbs.Q(youTubeTextView.getContext(), R.attr.ytTextPrimary));
            }
            int dimension = (int) getContext().getResources().getDimension(R.dimen.report_form_item_spacing_vertical);
            yny.z(radioButton, yny.h(yny.v(dimension), yny.k(dimension)), ViewGroup.MarginLayoutParams.class);
        }
        return view;
    }
}
