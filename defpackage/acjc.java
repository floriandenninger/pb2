package defpackage;

import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acjc implements afoi {
    final /* synthetic */ acjl a;

    public acjc(acjl acjlVar) {
        this.a = acjlVar;
    }

    @Override // defpackage.afoi
    public final void d() {
        this.a.s();
    }

    @Override // defpackage.afoi
    public final void e(Place place) {
        this.a.ai.c(place);
        this.a.aj.c(place);
        this.a.c.b(R.id.pre_stream_content);
    }
}
