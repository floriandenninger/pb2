package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftb implements AdapterView.OnItemSelectedListener {
    public int a = -1;
    final /* synthetic */ ftd b;
    private Map c;

    public ftb(ftd ftdVar) {
        this.b = ftdVar;
    }

    private final auwg a(int i) {
        return (auwg) this.b.b.getItem(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        auwi auwiVar;
        ajth b;
        auwi auwiVar2;
        if (i == this.a) {
            return;
        }
        auwg a = a(i);
        ajok ajokVar = this.b.e;
        if (ajokVar != null) {
            fav.L(ajokVar, a);
        }
        if (a.c == 3) {
            auwiVar = (auwi) a.d;
        } else {
            auwiVar = auwi.a;
        }
        if ((auwiVar.b & 1) != 0) {
            ajok ajokVar2 = this.b.e;
            if (ajokVar2 != null && (b = ajxd.b(ajokVar2)) != null) {
                if (a.c == 3) {
                    auwiVar2 = (auwi) a.d;
                } else {
                    auwiVar2 = auwi.a;
                }
                aulm aulmVar = auwiVar2.c;
                if (aulmVar == null) {
                    aulmVar = aulm.a;
                }
                b.lz(aulmVar, null);
            }
        } else if (a.c == 5) {
            aahd aahdVar = this.b.a;
            apxf apxfVar = (apxf) a.d;
            if (this.c == null) {
                this.c = new HashMap(1);
            }
            ajok ajokVar3 = this.b.e;
            if (ajokVar3 != null) {
                this.c.put("sectionListController", ajokVar3.c("sectionListController"));
            }
            aahdVar.c(apxfVar, this.c);
        }
        int i2 = 0;
        while (i2 < this.b.b.getCount()) {
            aone builder = a(i2).toBuilder();
            boolean z = i2 == i;
            builder.copyOnWrite();
            auwg auwgVar = (auwg) builder.instance;
            auwgVar.b |= 4;
            auwgVar.g = z;
            this.b.b.b(i2, (auwg) builder.build());
            i2++;
        }
        this.a = i;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
