package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajqv extends ArrayAdapter {
    private final LayoutInflater a;

    public ajqv(Context context, aqph aqphVar) {
        super(context, R.layout.legal_report_form_option_selected);
        aqpg aqpgVar;
        this.a = LayoutInflater.from(context);
        setDropDownViewResource(R.layout.legal_report_form_option);
        aone createBuilder = aqpg.a.createBuilder();
        aqyg h = ajcq.h((aqphVar.b & 1) != 0 ? aqphVar.d : null);
        createBuilder.copyOnWrite();
        aqpg aqpgVar2 = (aqpg) createBuilder.instance;
        h.getClass();
        aqpgVar2.e = h;
        aqpgVar2.b |= 1;
        insert((aqpg) createBuilder.build(), 0);
        for (aqpe aqpeVar : aqphVar.c) {
            if ((aqpeVar.b & 8) != 0) {
                aqpgVar = aqpeVar.c;
                if (aqpgVar == null) {
                    aqpgVar = aqpg.a;
                }
            } else {
                aqpgVar = null;
            }
            add(aqpgVar);
        }
    }

    private final TextView a(int i, View view, ViewGroup viewGroup, int i2) {
        aqyg aqygVar;
        aqyg aqygVar2;
        if (view == null) {
            view = this.a.inflate(i2, viewGroup, false);
        }
        aqpg aqpgVar = (aqpg) super.getItem(i);
        TextView textView = (TextView) view;
        if (!isEnabled(i)) {
            if ((aqpgVar.b & 1) != 0) {
                aqygVar = aqpgVar.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setHint(ajcq.b(aqygVar));
            textView.setText((CharSequence) null);
        } else {
            if ((aqpgVar.b & 1) != 0) {
                aqygVar2 = aqpgVar.e;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView.setText(ajcq.b(aqygVar2));
            textView.setHint((CharSequence) null);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        if (i != 0) {
            return (aqpg) super.getItem(i);
        }
        return null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option_selected);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return i != 0;
    }
}
