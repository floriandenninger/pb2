package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afdu {
    protected final adxr c;
    public aesa d = aesa.a;
    public final afhs e;

    public afdu(adxr adxrVar, afhs afhsVar) {
        this.c = adxrVar;
        this.e = afhsVar;
    }

    public final void c(aesa aesaVar, VideoStreamingData videoStreamingData) {
        this.d = aesaVar;
        boolean D = videoStreamingData.D();
        boolean z = true;
        boolean z2 = false;
        if (D) {
            Iterator it = videoStreamingData.p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (d((FormatStreamModel) it.next())) {
                    z2 = true;
                    break;
                }
            }
            Iterator it2 = videoStreamingData.o.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = z2;
                    break;
                } else if (d((FormatStreamModel) it2.next())) {
                    break;
                }
            }
        } else {
            z = false;
        }
        afic aficVar = afic.ABR;
        if (this.e.o().L) {
            return;
        }
        aesaVar.g(D, z);
    }

    public final boolean d(FormatStreamModel formatStreamModel) {
        adyb h;
        if (formatStreamModel.J()) {
            adyl adylVar = (adyl) this.c;
            amsx p = amsx.p((Collection) adylVar.b.get());
            String i = adylVar.g.C() ? adylVar.i(formatStreamModel.b, formatStreamModel.e, true) : adyl.m(p, formatStreamModel.b, formatStreamModel.e);
            if (i != null && (h = adylVar.h(p, i)) != null && h.c() != null && adyl.n(p, i, 0L, h.c()[0]) && !this.c.f(formatStreamModel)) {
                return true;
            }
        }
        return false;
    }
}
