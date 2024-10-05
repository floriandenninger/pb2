package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtx implements ahtv {
    private final ahtp a;
    private final /* synthetic */ int b;

    public ahtx(ahtp ahtpVar, int i) {
        this.b = i;
        this.a = ahtpVar;
    }

    private static final apxf b(awnw awnwVar) {
        if (awnwVar == null || !awnwVar.pY(arli.a)) {
            return null;
        }
        return (apxf) awnwVar.pX(arli.a);
    }

    private static final apxf c(awnw awnwVar) {
        if (awnwVar == null || !awnwVar.pY(arli.a)) {
            return null;
        }
        return (apxf) awnwVar.pX(arli.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahtv
    public final void a(asvm asvmVar) {
        if (this.b == 0) {
            if (!asvmVar.b() || asvmVar.getMarkersListModel().b().isEmpty()) {
                return;
            }
            String d = asvmVar.d();
            List b = asvmVar.getMarkersListModel().b();
            TimelineMarker[] timelineMarkerArr = new TimelineMarker[((amvj) b).c];
            amxe it = ((amru) b).iterator();
            int i = 0;
            while (it.hasNext()) {
                asvi asviVar = (asvi) it.next();
                timelineMarkerArr[i] = new TimelineMarker(asviVar.d().longValue(), asviVar.d().longValue() + asviVar.c().longValue(), i, asviVar.a().c.size() > 0 ? ((aqyi) asviVar.a().c.get(0)).c : null, !asviVar.e() ? null : b(asviVar.b()));
                i++;
            }
            this.a.k(d, ahyo.TIMESTAMP_MARKER, timelineMarkerArr, null);
            asvp markersListModel = asvmVar.getMarkersListModel();
            this.a.d(d, markersListModel.c() ? b(markersListModel.a()) : null);
            return;
        }
        if (!asvmVar.b() || asvmVar.getMarkersListModel().b().isEmpty()) {
            return;
        }
        String d2 = asvmVar.d();
        List b2 = asvmVar.getMarkersListModel().b();
        TimelineMarker[] timelineMarkerArr2 = new TimelineMarker[((amvj) b2).c];
        amxe it2 = ((amru) b2).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            asvi asviVar2 = (asvi) it2.next();
            timelineMarkerArr2[i2] = new TimelineMarker(asviVar2.d().longValue(), asviVar2.d().longValue() + asviVar2.c().longValue(), i2, asviVar2.a().c.size() > 0 ? ((aqyi) asviVar2.a().c.get(0)).c : null, !asviVar2.e() ? null : c(asviVar2.b()));
            i2++;
        }
        this.a.k(d2, ahyo.CHAPTER, timelineMarkerArr2, null);
        asvp markersListModel2 = asvmVar.getMarkersListModel();
        this.a.d(d2, markersListModel2.c() ? c(markersListModel2.a()) : null);
    }
}
