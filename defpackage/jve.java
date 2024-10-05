package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jve implements agsk {
    private final afsy a;
    private final aais b;
    private final Context c;

    public jve(Context context, afsy afsyVar, aais aaisVar) {
        this.c = context;
        this.a = afsyVar;
        this.b = aaisVar;
    }

    @Override // defpackage.agsk
    public final aryr a(aryr aryrVar, String str) {
        aong aongVar = (aong) aryrVar.toBuilder();
        yjk.e();
        aqoz aqozVar = (aqoz) this.b.a(this.a.c()).f(fhe.l(str)).g(aqoz.class).X();
        if (aqozVar != null && (((aqozVar.b.c & 2) == 0 || aqozVar.getPlaybackStartSeconds().longValue() == 0) && !aqozVar.getLicenses().isEmpty() && !((aqpd) aqozVar.getLicenses().get(0)).f)) {
            aryi aryiVar = aryrVar.f;
            if (aryiVar == null) {
                aryiVar = aryi.a;
            }
            int i = (int) (((aqpd) aqozVar.getLicenses().get(0)).e / 3600);
            String quantityString = this.c.getResources().getQuantityString(R.plurals.rental_expiry_notice, i, Integer.valueOf(i));
            aone createBuilder = awhf.a.createBuilder();
            aong aongVar2 = (aong) aqyg.a.createBuilder();
            aongVar2.copyOnWrite();
            aqyg aqygVar = (aqyg) aongVar2.instance;
            quantityString.getClass();
            aqygVar.b |= 1;
            aqygVar.d = quantityString;
            aqyg aqygVar2 = (aqyg) aongVar2.build();
            createBuilder.copyOnWrite();
            awhf awhfVar = (awhf) createBuilder.instance;
            aqygVar2.getClass();
            awhfVar.c = aqygVar2;
            awhfVar.b |= 4;
            awhf awhfVar2 = (awhf) createBuilder.build();
            aryz aryzVar = aryiVar.m;
            if (aryzVar == null) {
                aryzVar = aryz.a;
            }
            aone builder = aryzVar.toBuilder();
            builder.copyOnWrite();
            aryz aryzVar2 = (aryz) builder.instance;
            awhfVar2.getClass();
            aryzVar2.c = awhfVar2;
            aryzVar2.b = 86428467;
            aryz aryzVar3 = (aryz) builder.build();
            aone builder2 = aryiVar.toBuilder();
            builder2.copyOnWrite();
            aryi aryiVar2 = (aryi) builder2.instance;
            aryzVar3.getClass();
            aryiVar2.m = aryzVar3;
            aryiVar2.b |= 65536;
            aryi aryiVar3 = (aryi) builder2.build();
            aongVar.copyOnWrite();
            aryr aryrVar2 = (aryr) aongVar.instance;
            aryiVar3.getClass();
            aryrVar2.f = aryiVar3;
            aryrVar2.b |= 4;
            atyi atyiVar = aryrVar.e;
            if (atyiVar == null) {
                atyiVar = atyi.a;
            }
            atxt atxtVar = atyiVar.g;
            if (atxtVar == null) {
                atxtVar = atxt.a;
            }
            aone builder3 = atxtVar.toBuilder();
            builder3.copyOnWrite();
            atxt atxtVar2 = (atxt) builder3.instance;
            atxtVar2.b |= 32;
            atxtVar2.e = true;
            atxt atxtVar3 = (atxt) builder3.build();
            aone builder4 = atyiVar.toBuilder();
            builder4.copyOnWrite();
            atyi atyiVar2 = (atyi) builder4.instance;
            atxtVar3.getClass();
            atyiVar2.g = atxtVar3;
            atyiVar2.b |= 128;
            atyi atyiVar3 = (atyi) builder4.build();
            aongVar.copyOnWrite();
            aryr aryrVar3 = (aryr) aongVar.instance;
            atyiVar3.getClass();
            aryrVar3.e = atyiVar3;
            aryrVar3.b |= 2;
        }
        return (aryr) aongVar.build();
    }
}
