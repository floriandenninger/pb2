package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class laa implements ajom {
    public final aahd a;
    private final View b;
    private final TextView c;

    public laa(Context context, aahd aahdVar, ViewGroup viewGroup) {
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.see_all_button, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.text_view);
    }

    public static ammv d(aupa aupaVar) {
        acrb acrbVar = null;
        aomf aomfVar = (aupaVar.b & 8) != 0 ? aupaVar.f : null;
        if (aomfVar == null || aomfVar.H()) {
            if ((aupaVar.b & 4) != 0) {
                aota aotaVar = aupaVar.e;
                if (aotaVar == null) {
                    aotaVar = aota.a;
                }
                int i = aotaVar.c;
                int i2 = 0;
                for (acrb acrbVar2 : acrb.values()) {
                    if (acrbVar2.Jk == i) {
                        aota aotaVar2 = aupaVar.e;
                        if (aotaVar2 == null) {
                            aotaVar2 = aota.a;
                        }
                        int i3 = aotaVar2.c;
                        acrb[] values = acrb.values();
                        int length = values.length;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            acrb acrbVar3 = values[i2];
                            if (acrbVar3.Jk == i3) {
                                acrbVar = acrbVar3;
                                break;
                            }
                            i2++;
                        }
                        return ammv.j(new acqx(acrbVar));
                    }
                }
            }
            return amlr.a;
        }
        return ammv.j(new acqx(aomfVar));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(final ajok ajokVar, Object obj) {
        final aupa aupaVar = (aupa) obj;
        TextView textView = this.c;
        aqyg aqygVar = aupaVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        awav d = ajnu.d(ajokVar);
        ammv d2 = d(aupaVar);
        if (d2.h()) {
            ajokVar.a.o((acsa) d2.c(), adyu.ce(d));
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: kzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                laa laaVar = laa.this;
                aupa aupaVar2 = aupaVar;
                ajok ajokVar2 = ajokVar;
                ammv d3 = laa.d(aupaVar2);
                if (d3.h()) {
                    ajokVar2.a.I(3, (acsa) d3.c(), null);
                }
                aahd aahdVar = laaVar.a;
                apxf apxfVar = aupaVar2.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        });
    }
}
