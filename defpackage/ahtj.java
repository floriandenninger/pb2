package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahtj implements ahto {
    final /* synthetic */ ahtk a;

    public ahtj(ahtk ahtkVar) {
        this.a = ahtkVar;
    }

    @Override // defpackage.ahto
    public final void b(ahyo ahyoVar) {
        this.a.e = ahyoVar == ahyo.TIMESTAMP_MARKER;
    }

    @Override // defpackage.ahto
    public final void nr(ahyo ahyoVar, boolean z) {
        if (ahyoVar != ahyo.TIMESTAMP_MARKER) {
            return;
        }
        this.a.f = z;
    }

    @Override // defpackage.ahto
    public final void nx(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
        ahtk ahtkVar = this.a;
        if (ahtkVar.e && ahtkVar.f) {
            if (ahyoVar != ahyo.TIMESTAMP_MARKER) {
                return;
            }
        } else if (ahyoVar != ahyo.CHAPTER) {
            return;
        }
        ahtk ahtkVar2 = this.a;
        ahtkVar2.b = ahtkVar2.a.d();
        ahtk ahtkVar3 = this.a;
        ahtkVar3.d = ahtkVar3.c;
        ahtkVar3.c = timelineMarker2;
    }
}
