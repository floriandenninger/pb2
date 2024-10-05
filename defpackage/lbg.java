package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lbg extends ArrayAdapter {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbg(Context context, Context context2) {
        super(context, R.layout.simple_spinner_item);
        this.a = context2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTextColor(wbs.W(this.a, com.google.android.youtube.R.attr.ytTextPrimary).orElse(0));
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return true;
    }
}
