package defpackage;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class myp extends ArrayAdapter {
    private final int a;
    private int b;

    public myp(Context context) {
        super(context, R.layout.simple_spinner_item);
        this.b = R.layout.simple_spinner_item;
        this.a = R.layout.simple_spinner_item;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (view == null) {
            textView = (TextView) from.inflate(this.b, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = -2;
        textView.setLayoutParams(layoutParams);
        textView.setSingleLine(false);
        aqyr aqyrVar = (aqyr) getItem(i);
        if (!aqyrVar.c.isEmpty()) {
            textView.setText(aqyrVar.c);
        } else {
            textView.setText(aqyrVar.b);
        }
        if (aqyrVar.e) {
            textView.setTextColor(wbs.Q(getContext(), com.google.android.youtube.R.attr.adText2));
        } else {
            textView.setTextColor(wbs.Q(getContext(), com.google.android.youtube.R.attr.adText1));
        }
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (view == null) {
            textView = (TextView) from.inflate(this.a, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        textView.setSingleLine(false);
        aqyr aqyrVar = (aqyr) getItem(i);
        if (!aqyrVar.c.isEmpty()) {
            textView.setText(aqyrVar.c);
        } else {
            textView.setText(aqyrVar.b);
        }
        if (aqyrVar.e) {
            textView.setTextColor(wbs.Q(getContext(), com.google.android.youtube.R.attr.adText2));
        } else {
            textView.setTextColor(wbs.Q(getContext(), com.google.android.youtube.R.attr.adText1));
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !((aqyr) getItem(i)).e;
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.b = i;
    }
}
