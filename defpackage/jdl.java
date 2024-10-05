package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jdl implements ykl {
    final /* synthetic */ jdm a;
    private final PlayerResponseModel b;

    public jdl(jdm jdmVar, PlayerResponseModel playerResponseModel) {
        this.a = jdmVar;
        this.b = playerResponseModel;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zaw zawVar = this.a.a;
        zawVar.d(zawVar.b(exc));
        String valueOf = String.valueOf(String.valueOf(exc));
        afsi.b(1, 10, valueOf.length() != 0 ? "Could not get playability result: ".concat(valueOf) : new String("Could not get playability result: "));
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i = ((aile) obj2).c - 1;
        if (i == 0) {
            this.a.e(this.b.y());
        } else if (i != 1) {
            this.a.g(this.b.y());
        } else {
            String valueOf = String.valueOf(this.b.y());
            zga.l(valueOf.length() != 0 ? "The following video is unplayable: ".concat(valueOf) : new String("The following video is unplayable: "));
            whu.K(this.a.b, R.string.player_video_not_available, 0);
        }
        this.a.d = Optional.empty();
    }
}
