package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmw implements ahto {
    public final ahtp a;
    public final ArrayList b;
    public final ArrayList c;
    public long d;
    private boolean e;

    public fmw(ahtp ahtpVar) {
        ahtpVar.getClass();
        this.a = ahtpVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // defpackage.ahto
    public final void b(ahyo ahyoVar) {
        if (ahyoVar == ahyo.CHAPTER || ahyoVar == ahyo.TIMESTAMP_MARKER) {
            if (ahyoVar == ahyo.TIMESTAMP_MARKER) {
                this.b.clear();
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahto) arrayList.get(i)).b(ahyoVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ammv d(ahyk ahykVar) {
        TimelineMarker[] m = this.a.m(ahyo.TIMESTAMP_MARKER);
        return (!this.e || m == null || m.length <= 0 || !ahykVar.s()) ? amlr.a : ammv.j(m);
    }

    @Override // defpackage.ahto
    public final void nr(ahyo ahyoVar, boolean z) {
        if (ahyoVar == ahyo.CHAPTER || ahyoVar == ahyo.TIMESTAMP_MARKER) {
            if (ahyoVar == ahyo.TIMESTAMP_MARKER) {
                this.e = z;
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahto) arrayList.get(i)).nr(ahyoVar, z);
            }
        }
    }

    @Override // defpackage.ahto
    public final void nx(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ahto) arrayList.get(i2)).nx(timelineMarker, timelineMarker2, ahyoVar, i);
        }
    }
}
