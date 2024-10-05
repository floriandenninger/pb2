package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Checkable;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agyh extends agzh implements AdapterView.OnItemClickListener {
    public int a;
    private final NonScrollableListView c;

    public agyh(Context context, NonScrollableListView nonScrollableListView) {
        super(context, null);
        this.a = -1;
        nonScrollableListView.getClass();
        this.c = nonScrollableListView;
    }

    public final void a(int i) {
        this.a = i;
        int i2 = 0;
        while (i2 < this.c.getChildCount()) {
            KeyEvent.Callback childAt = this.c.getChildAt(i2);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(i2 == i);
            }
            i2++;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.a == i) {
            return;
        }
        a(i);
    }
}
