package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aduc implements ykl {
    final /* synthetic */ adul a;

    public aduc(adul adulVar) {
        this.a = adulVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zga.d("Failed to fetch player response", exc);
        this.a.d = null;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj2;
        this.a.d = null;
        if (playerResponseModel.y().isEmpty()) {
            zga.m(adul.a, "Video id for auto play player response is empty.");
            playerResponseModel = null;
        }
        adul adulVar = this.a;
        adua b = adulVar.i.b();
        adty a = this.a.i.k.a();
        a.a = playerResponseModel;
        b.e = a.a();
        adulVar.m(b);
        this.a.b(7);
    }
}
