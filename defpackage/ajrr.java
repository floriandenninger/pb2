package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrr extends ArrayAdapter implements SpinnerAdapter {
    public int a;
    private LayoutInflater b;

    public ajrr(Context context, List list) {
        super(context, R.layout.report_form_suboption, list);
        for (int i = 0; i < list.size(); i++) {
            atsu atsuVar = ((atss) list.get(i)).e;
            if ((atsuVar == null ? atsu.a : atsuVar).f) {
                this.a = i;
                return;
            }
        }
    }

    public final View a(int i, View view, ViewGroup viewGroup, int i2, int i3) {
        ajrq ajrqVar;
        TextView textView;
        aqyg aqygVar;
        if (view == null) {
            if (this.b == null) {
                this.b = LayoutInflater.from(getContext());
            }
            view = this.b.inflate(i2, viewGroup, false);
        }
        atss atssVar = (atss) getItem(i);
        if (view.getTag() instanceof ajrq) {
            ajrqVar = (ajrq) view.getTag();
        } else {
            ajrqVar = new ajrq(view, i3);
            view.setTag(ajrqVar);
        }
        if (atssVar != null) {
            atsu atsuVar = atssVar.e;
            if (atsuVar == null) {
                atsuVar = atsu.a;
            }
            boolean isEnabled = isEnabled(i);
            if (atsuVar != null && (textView = ajrqVar.a) != null) {
                if ((atsuVar.b & 1) != 0) {
                    aqygVar = atsuVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView.setText(ajcq.b(aqygVar));
                ajrqVar.a.setEnabled(isEnabled);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final atsu b(int i) {
        atsu atsuVar;
        atss atssVar = (atss) getItem(i);
        if (atssVar == null) {
            atsuVar = null;
        } else {
            atsuVar = atssVar.e;
            if (atsuVar == null) {
                atsuVar = atsu.a;
            }
        }
        if (atsuVar == null || atsuVar.f) {
            return null;
        }
        return atsuVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption, R.id.report_form_sub_option_text);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption_selected, R.id.report_form_sub_option_selected_text);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return b(i) != null;
    }
}
