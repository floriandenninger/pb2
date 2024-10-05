package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmv {
    public final aahv a;
    public final ayqi b;
    public final isn c;
    public final isl d;
    public final Context e;
    public final TextView f;
    public ayqx g;

    public mmv(aahv aahvVar, ayqi ayqiVar, isn isnVar, isl islVar, View view) {
        this.a = aahvVar;
        this.b = ayqiVar;
        this.c = isnVar;
        this.d = islVar;
        this.e = view.getContext();
        this.f = (TextView) view.findViewById(R.id.subtitle);
    }

    public static aypy a(aypy aypyVar, String str) {
        return aypyVar.Y(new fjx(str, 9)).aj(mmt.a);
    }
}
