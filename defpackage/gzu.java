package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gzu {
    public final Context a;
    public final aifs b;
    public final azrw c;
    public final zaw d;
    public final fgj e;
    private final azrw f;
    private final aivo g;

    public gzu(Context context, aifs aifsVar, azrw azrwVar, azrw azrwVar2, aivo aivoVar, zaw zawVar, fgj fgjVar) {
        this.a = context;
        this.b = aifsVar;
        this.f = azrwVar;
        this.c = azrwVar2;
        this.g = aivoVar;
        this.d = zawVar;
        this.e = fgjVar;
    }

    public final hg a() {
        return this.g.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gzy b() {
        c().K();
        a().c();
        return gzy.a;
    }

    public final ainy c() {
        return (ainy) this.f.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        aixh n;
        PlayerResponseModel c;
        aryi q;
        if (!f() && !e()) {
            return false;
        }
        if (f() || (n = c().n()) == null || (c = n.c()) == null || (q = c.q()) == null) {
            return true;
        }
        return ahbx.j(q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.b.k;
    }

    final boolean f() {
        aifs aifsVar = this.b;
        return aifsVar.f != null || aifsVar.m;
    }
}
