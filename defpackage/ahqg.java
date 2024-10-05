package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahqg implements ahqi {
    final /* synthetic */ ahqk a;
    private final WatchNextResponseModel b;
    private final apxf c;

    public ahqg(ahqk ahqkVar, WatchNextResponseModel watchNextResponseModel, apxf apxfVar) {
        this.a = ahqkVar;
        this.b = watchNextResponseModel;
        this.c = apxfVar;
    }

    @Override // defpackage.ahqi
    public final ahqj a(apxf apxfVar) {
        return new ahqj(this.a, apxfVar, true);
    }

    @Override // defpackage.ahqi
    public final ahqo b() {
        return ahqo.LOGGED_ATTACH_WATCH_NEXT;
    }

    @Override // defpackage.ahqi
    public final apxf c() {
        return this.c;
    }

    @Override // defpackage.ahqi
    public final Optional d(ahdv ahdvVar) {
        return Optional.empty();
    }

    @Override // defpackage.ahqi
    public final void e() {
        ahpe ahpeVar = this.a.a;
        ahpeVar.d(ahpeVar.e, this.b);
    }
}
