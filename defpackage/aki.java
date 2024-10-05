package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aki extends akf {
    private final int a;
    public final int h;
    public final LayoutInflater i;

    @Deprecated
    public aki(Context context, int i) {
        this.a = i;
        this.h = i;
        this.i = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // defpackage.akf
    public View f(ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.akf
    public final View h(ViewGroup viewGroup) {
        return this.i.inflate(this.a, viewGroup, false);
    }
}
