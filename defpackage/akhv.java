package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhv implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ arej b;
    final /* synthetic */ Object c;
    final /* synthetic */ akia d;

    public akhv(akia akiaVar, View view, arej arejVar, Object obj) {
        this.d = akiaVar;
        this.a = view;
        this.b = arejVar;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.d.a(this.a)) {
            this.d.b(this.b, this.a, this.c);
            this.a.removeOnLayoutChangeListener(this);
        }
    }
}
