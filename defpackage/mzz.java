package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzz extends ArrayAdapter {
    private final int a;
    private int b;

    public mzz(Context context) {
        super(context, R.layout.simple_spinner_item);
        this.b = R.layout.simple_spinner_item;
        this.a = R.layout.simple_spinner_item;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        aqyr aqyrVar = (aqyr) getItem(i);
        return muf.f(view, viewGroup, aqyrVar.c, aqyrVar.b, aqyrVar.e, getContext(), this.b);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aqyr aqyrVar = (aqyr) getItem(i);
        return muf.g(view, viewGroup, aqyrVar.c, aqyrVar.b, aqyrVar.e, false, getContext(), this.a);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return muf.e(((aqyr) getItem(i)).e);
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.b = i;
    }
}
