package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahps implements ahpw {
    public final acsl a;
    public final apxf b;
    private final PlayerResponseModel c;

    public ahps(acsl acslVar, PlayerResponseModel playerResponseModel, apxf apxfVar) {
        this.a = acslVar;
        this.c = playerResponseModel;
        this.b = apxfVar;
    }

    @Override // defpackage.ahpw
    public final /* bridge */ /* synthetic */ ahpx a(ahpe ahpeVar) {
        return new ahpt(this, ahpeVar.c(this.a, this.c), this.b);
    }

    @Override // defpackage.ahpw
    public final ahqo b() {
        return ahqo.LOGGED_ATTACH_PLAYER;
    }
}
