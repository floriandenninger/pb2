package defpackage;

import com.google.android.youtube.R;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvi implements rvj {
    private final ruv a;

    public rvi(ruv ruvVar) {
        this.a = ruvVar;
    }

    @Override // defpackage.rvj
    public final int a() {
        return 10;
    }

    @Override // defpackage.rvj
    public final String b() {
        HashSet o = rwh.o();
        Iterator it = this.a.l().iterator();
        while (it.hasNext()) {
            CharSequence a = this.a.i(((rvg) it.next()).b).a();
            if (a != null) {
                o.add(a);
            }
        }
        if (o.size() > 1) {
            return this.a.getContext().getString(R.string.aplosA11yChartTypeCombo);
        }
        if (o.size() == 1) {
            return MessageFormat.format(this.a.getContext().getString(R.string.aplosA11yChartTypeTemplate), o.iterator().next());
        }
        return this.a.getContext().getString(R.string.aplosA11yUnknownChartType);
    }
}
