package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afav implements paj {
    public final /* synthetic */ FormatStreamModel[] a;
    private final /* synthetic */ int b;

    public /* synthetic */ afav(FormatStreamModel[] formatStreamModelArr, int i) {
        this.b = i;
        this.a = formatStreamModelArr;
    }

    @Override // defpackage.paj
    public final void a(pao paoVar, pai paiVar) {
        if (this.b == 0) {
            FormatStreamModel[] formatStreamModelArr = this.a;
            List list = paoVar.b(0).b;
            for (int i = 0; i < list.size(); i++) {
                pal palVar = (pal) list.get(i);
                if (palVar.a == 0) {
                    int[] af = afbs.af(formatStreamModelArr, palVar);
                    if (af.length > 0) {
                        paiVar.n(paoVar, i, af);
                    }
                }
            }
            return;
        }
        FormatStreamModel[] formatStreamModelArr2 = this.a;
        List list2 = paoVar.b(0).b;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            pal palVar2 = (pal) list2.get(i2);
            if (palVar2.a == 1) {
                for (int i3 : afbs.af(formatStreamModelArr2, palVar2)) {
                    paiVar.o(paoVar, i2, i3);
                }
            }
        }
    }
}
