package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aexr extends aewy {
    private final afaf l;

    public aexr(afhf afhfVar, afaf afafVar, ayr ayrVar, bbx bbxVar, att attVar, bbx bbxVar2, bfg bfgVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aewj aewjVar, String str, pnd pndVar, aezm aezmVar, byte[] bArr) {
        super(afhfVar, ayrVar, bbxVar, attVar, bbxVar2, bfgVar, playerConfigModel, videoStreamingData, aewjVar, str, pndVar, aezmVar, null);
        this.l = afafVar;
    }

    @Override // defpackage.aewy
    protected final bdr k(aezx aezxVar, bel belVar) {
        bdr bdrVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < belVar.d(); i++) {
            int a = belVar.a(i);
            FormatStreamModel formatStreamModel = aezxVar.b[a];
            if (formatStreamModel.L()) {
                arrayList.add(Integer.valueOf(a));
                arrayList3.add(formatStreamModel);
            } else {
                arrayList2.add(Integer.valueOf(a));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < belVar.e().a; i2++) {
            FormatStreamModel formatStreamModel2 = aezxVar.b[i2];
            if (!formatStreamModel2.L()) {
                arrayList4.add(Integer.valueOf(i2));
                arrayList5.add(formatStreamModel2);
            }
        }
        aexn aexnVar = null;
        if (arrayList2.isEmpty()) {
            bdrVar = null;
        } else {
            aezx aezxVar2 = new aezx(aezxVar.a, (FormatStreamModel[]) arrayList5.toArray(new FormatStreamModel[0]));
            aext aextVar = new aext(belVar, anaf.aj(arrayList4), anaf.aj(arrayList2));
            axj f = this.b.f(this.c);
            bdrVar = this.l.d(f, aezxVar2.b, aear.v(f, aezxVar2), aextVar, aezxVar2.a, this.g, this.a);
        }
        if (!arrayList.isEmpty()) {
            aezx aezxVar3 = new aezx(aezxVar.a, (FormatStreamModel[]) arrayList3.toArray(new FormatStreamModel[0]));
            int[] aj = anaf.aj(arrayList);
            aext aextVar2 = new aext(belVar, aj, aj);
            PlayerConfigModel playerConfigModel = this.a;
            FormatStreamModel[] formatStreamModelArr = aezxVar3.b;
            afhf afhfVar = this.e;
            att attVar = this.g;
            String str = this.c;
            int i3 = aezxVar3.a;
            afaf afafVar = this.l;
            aexnVar = new aexn(playerConfigModel, formatStreamModelArr, afhfVar, attVar, aextVar2, str, i3, afafVar.b, afafVar.a, afafVar.c);
        }
        if (bdrVar == null) {
            if (aexnVar != null) {
                return aexnVar;
            }
            throw new IllegalStateException("no_formats_selected");
        }
        if (aexnVar == null) {
            return bdrVar;
        }
        bdr[] bdrVarArr = new bdr[belVar.d()];
        for (int i4 = 0; i4 < belVar.d(); i4++) {
            bdrVarArr[i4] = true != aezxVar.b[belVar.a(i4)].L() ? bdrVar : aexnVar;
        }
        return new aexu(belVar, bdrVarArr);
    }

    @Override // defpackage.aewy
    protected final void q(bdr bdrVar) {
    }
}
