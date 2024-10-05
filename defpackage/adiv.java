package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adiv implements aixh {
    public PlayerResponseModel a;
    private final WeakReference b;

    public adiv(aiwk aiwkVar) {
        amkq.N(true);
        this.b = new WeakReference(aiwkVar);
    }

    @Override // defpackage.aixh
    public final long a() {
        return 0L;
    }

    @Override // defpackage.aixh
    public final long b() {
        aiwk aiwkVar = (aiwk) this.b.get();
        if (aiwkVar != null) {
            return aiwkVar.k();
        }
        return 0L;
    }

    @Override // defpackage.aixh
    public final PlayerResponseModel c() {
        return this.a;
    }

    @Override // defpackage.aixh
    public final aixm d() {
        return null;
    }

    @Override // defpackage.aixh
    public final ajbv e() {
        return null;
    }

    @Override // defpackage.aixh
    public final String f() {
        aiwk aiwkVar = (aiwk) this.b.get();
        if (aiwkVar != null) {
            return aiwkVar.u();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.b.clear();
    }

    @Override // defpackage.aixh
    public final ajbf h() {
        return null;
    }
}
