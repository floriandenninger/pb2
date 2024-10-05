package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahqf implements ahqi {
    final /* synthetic */ ahqk a;
    private final PlayerResponseModel b;
    private final apxf c;

    public ahqf(ahqk ahqkVar, PlayerResponseModel playerResponseModel, apxf apxfVar) {
        this.a = ahqkVar;
        this.b = playerResponseModel;
        this.c = apxfVar;
    }

    @Override // defpackage.ahqi
    public final ahqj a(apxf apxfVar) {
        return new ahqj(this.a, apxfVar, true);
    }

    @Override // defpackage.ahqi
    public final ahqo b() {
        return ahqo.LOGGED_ATTACH_PLAYER;
    }

    @Override // defpackage.ahqi
    public final apxf c() {
        return this.c;
    }

    @Override // defpackage.ahqi
    public final Optional d(ahdv ahdvVar) {
        return Optional.of(new ahqg(this.a, ahdvVar.a(), ahdvVar.d()));
    }

    @Override // defpackage.ahqi
    public final void e() {
        ahpe ahpeVar = this.a.a;
        ahpeVar.c(ahpeVar.e, this.b);
    }
}
