package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aios implements aiiy {
    final /* synthetic */ aiou a;

    public aios(aiou aiouVar) {
        this.a = aiouVar;
    }

    @Override // defpackage.aiiy
    public final void a(int i) {
    }

    @Override // defpackage.aiiy
    public final void b(aigr aigrVar) {
        this.a.b.d(aigrVar);
    }

    @Override // defpackage.aiiy
    public final void c() {
        aiou aiouVar = this.a;
        aiwk aiwkVar = aiouVar.e.a;
        aifk aifkVar = aiouVar.f;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayrz.c((AtomicReference) aifkVar.d.k().ax(new lgx(atomicBoolean, 11)));
        if (!atomicBoolean.get() || aiwkVar == null) {
            return;
        }
        aiwkVar.H(aiwkVar.s().g(), aiwkVar.s().h(), aiwkVar.u());
    }

    @Override // defpackage.aiiy
    public final void d(PlayerResponseModel playerResponseModel) {
    }

    @Override // defpackage.aiiy
    public final void e() {
        this.a.g.b.c(new ahdr());
    }

    @Override // defpackage.aiiy
    public final void f(aigr aigrVar) {
        this.a.a.f(aigrVar);
    }

    @Override // defpackage.aiiy
    public final void g(WatchNextResponseModel watchNextResponseModel) {
    }
}
