package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiie implements ykl {
    final /* synthetic */ PlayerResponseModel a;
    final /* synthetic */ aiih b;

    public aiie(aiih aiihVar, PlayerResponseModel playerResponseModel) {
        this.b = aiihVar;
        this.a = playerResponseModel;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.g = null;
        String y = this.a.y();
        this.b.p = null;
        aiih aiihVar = this.b;
        aiif aiifVar = aiihVar.f;
        if (aiifVar != null) {
            ((aiou) aiifVar).b.d(new aigr(4, true, 1, aiihVar.c.b(exc), exc, y));
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.b.g = null;
        aiih aiihVar = this.b;
        aiihVar.g((PlayerResponseModel) obj2, aiihVar.o, null);
    }
}
