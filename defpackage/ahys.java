package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahys implements ahyu {
    private final List a;

    public ahys(ahyu... ahyuVarArr) {
        List asList = Arrays.asList(ahyuVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahyu) it.next()).m(z);
        }
    }

    @Override // defpackage.ahyu
    public final void o(VideoQuality[] videoQualityArr, int i, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahyu) it.next()).o(videoQualityArr, i, z);
        }
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahyu) it.next()).pz(ahytVar);
        }
    }
}
