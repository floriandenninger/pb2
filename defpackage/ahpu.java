package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahpu implements ahpw {
    public final acsl a;
    public final apxf b;
    private final WatchNextResponseModel c;

    public ahpu(acsl acslVar, WatchNextResponseModel watchNextResponseModel, apxf apxfVar) {
        this.a = acslVar;
        this.c = watchNextResponseModel;
        this.b = apxfVar;
    }

    @Override // defpackage.ahpw
    public final /* bridge */ /* synthetic */ ahpx a(ahpe ahpeVar) {
        return new ahpv(this, ahpeVar.d(this.a, this.c), this.b);
    }

    @Override // defpackage.ahpw
    public final ahqo b() {
        return ahqo.LOGGED_ATTACH_WATCH_NEXT;
    }
}
