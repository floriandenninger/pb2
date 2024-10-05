package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jdk implements ykl {
    final /* synthetic */ jdm a;

    public jdk(jdm jdmVar) {
        this.a = jdmVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zaw zawVar = this.a.a;
        zawVar.d(zawVar.b(exc));
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj2;
        jdm jdmVar = this.a;
        jdmVar.d = Optional.of(new jdl(jdmVar, playerResponseModel));
        jdm jdmVar2 = this.a;
        if (jdmVar2.d.isPresent()) {
            jdmVar2.c.k(playerResponseModel.q(), (ykl) jdmVar2.d.get(), playerResponseModel.y());
        }
    }
}
