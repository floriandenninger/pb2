package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nna extends fks implements ahop, aioa {
    public final Context a;
    public final ywr b;
    public final azrw c;
    public volatile boolean d;
    public boolean e;
    private final ahos f;
    private final aioc g;
    private final ayqw h;

    public nna(Context context, ywr ywrVar, fln flnVar, azrw azrwVar, ahos ahosVar, aioc aiocVar) {
        super(flnVar);
        this.a = context;
        ywrVar.getClass();
        this.b = ywrVar;
        azrwVar.getClass();
        this.c = azrwVar;
        ahosVar.getClass();
        this.f = ahosVar;
        this.g = aiocVar;
        this.h = new ayqw();
    }

    @Override // defpackage.flm
    public final void kG() {
        this.h.c();
        this.f.f = null;
    }

    @Override // defpackage.flm
    public final void kH() {
        this.h.g(kI(this.g));
        this.f.f = this;
        if (!this.e || ((awwl) this.b.c()).d) {
            return;
        }
        this.e = false;
        ((ainy) this.c.get()).b();
        this.f.g();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new ayrs() { // from class: nmz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlayerResponseModel b;
                PlayerConfigModel c;
                nna nnaVar = nna.this;
                ahef ahefVar = (ahef) obj;
                if (ahefVar.c() != aign.VIDEO_PLAYING || (b = ahefVar.b()) == null || (c = b.c()) == null) {
                    return;
                }
                nnaVar.d = c.aq();
            }
        }, ktf.t)};
    }
}
