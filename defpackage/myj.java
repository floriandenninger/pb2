package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myj extends ArrayAdapter {
    private final int a;
    private int b;
    private final boolean c;

    public myj(Context context, boolean z) {
        super(context, R.layout.simple_spinner_item);
        this.b = R.layout.simple_spinner_item;
        this.a = R.layout.simple_spinner_item;
        this.c = z;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        aqyn aqynVar = (aqyn) getItem(i);
        return muf.f(view, viewGroup, aqynVar.c, aqynVar.b, i == 0, getContext(), this.b);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        aqyn aqynVar = (aqyn) getItem(i);
        return muf.g(view, viewGroup, aqynVar.c, aqynVar.b, i == 0, this.c, getContext(), this.a);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return muf.e(((aqyn) getItem(i)).d);
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.b = i;
    }
}
