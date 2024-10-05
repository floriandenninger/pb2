package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiws implements aixh {
    public final WeakReference a;
    public WeakReference b = new WeakReference(null);

    public aiws(aiwq aiwqVar) {
        this.a = new WeakReference(aiwqVar);
    }

    @Override // defpackage.aixh
    public final long a() {
        ajbl ajblVar = (ajbl) this.b.get();
        if (ajblVar != null) {
            return ajblVar.p().i;
        }
        return 0L;
    }

    @Override // defpackage.aixh
    public final long b() {
        ajbl ajblVar = (ajbl) this.b.get();
        if (ajblVar != null) {
            return ajblVar.p().e;
        }
        return 0L;
    }

    @Override // defpackage.aixh
    public final PlayerResponseModel c() {
        ajbl ajblVar = (ajbl) this.b.get();
        if (ajblVar != null) {
            return ajblVar.c();
        }
        return null;
    }

    @Override // defpackage.aixh
    public final aixm d() {
        ajbl ajblVar = (ajbl) this.b.get();
        if (ajblVar != null) {
            return ajblVar.n();
        }
        return null;
    }

    @Override // defpackage.aixh
    public final ajbv e() {
        aiwq aiwqVar = (aiwq) this.a.get();
        if (aiwqVar != null) {
            return aiwqVar.f;
        }
        return null;
    }

    @Override // defpackage.aixh
    public final String f() {
        aiwk aiwkVar = (aiwk) this.a.get();
        if (aiwkVar != null) {
            return aiwkVar.u();
        }
        return null;
    }

    @Override // defpackage.aixh
    public final ajbf h() {
        aiwk aiwkVar = (aiwk) this.a.get();
        if (aiwkVar != null) {
            return aiwkVar.al();
        }
        return null;
    }
}
