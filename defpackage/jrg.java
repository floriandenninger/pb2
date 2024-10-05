package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jrg implements AdapterView.OnItemSelectedListener {
    public int a = -1;
    final /* synthetic */ jrh b;

    public jrg(jrh jrhVar) {
        this.b = jrhVar;
    }

    private final aput a(int i) {
        return (aput) this.b.a.getItem(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ajok ajokVar;
        ajth b;
        aulm aulmVar;
        if (this.a == i) {
            return;
        }
        aput a = a(i);
        apuu apuuVar = a.g;
        if (apuuVar == null) {
            apuuVar = apuu.a;
        }
        if (apuuVar.b == 60487319 && (ajokVar = this.b.b) != null && (b = ajxd.b(ajokVar)) != null) {
            apuu apuuVar2 = a.g;
            if (apuuVar2 == null) {
                apuuVar2 = apuu.a;
            }
            if (apuuVar2.b == 60487319) {
                aulmVar = (aulm) apuuVar2.c;
            } else {
                aulmVar = aulm.a;
            }
            b.lz(aulmVar, null);
        }
        int i2 = 0;
        while (i2 < this.b.a.getCount()) {
            aone builder = a(i2).toBuilder();
            boolean z = i2 == i;
            builder.copyOnWrite();
            aput aputVar = (aput) builder.instance;
            aputVar.b |= 2;
            aputVar.d = z;
            this.b.a.b(i2, (aput) builder.build());
            i2++;
        }
        this.a = i;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
