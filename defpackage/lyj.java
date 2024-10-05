package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyj implements aioa {
    public final Context a;
    public final akbw b;
    public final ywr c;
    public final aok d;
    public final azrw e;
    public final aioc f;
    public final ayqw g;

    public lyj(Context context, akbw akbwVar, azrw azrwVar, aioc aiocVar, ywr ywrVar, aok aokVar) {
        this.a = context;
        akbwVar.getClass();
        this.b = akbwVar;
        azrwVar.getClass();
        this.e = azrwVar;
        this.f = aiocVar;
        this.c = ywrVar;
        this.d = aokVar;
        this.g = new ayqw();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new ayrs() { // from class: lyh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aiwk aiwkVar;
                lyj lyjVar = lyj.this;
                if (((ahef) obj).c() != aign.PLAYBACK_LOADED || (aiwkVar = ((ainy) lyjVar.e.get()).p.a) == null || (aiwkVar.ao().c & 8) == 0 || ((lym) lyjVar.c.c()).c) {
                    return;
                }
                akbw akbwVar = lyjVar.b;
                akbx e = akbwVar.m().e(R.drawable.ic_spatial_audio);
                e.c = lyjVar.a.getString(R.string.spatial_audio_mealbar_title);
                e.d = lyjVar.a.getString(R.string.spatial_audio_mealbar_message);
                akbx a = e.a(lyjVar.a.getString(R.string.app_got_it), null);
                a.m = new lyi(lyjVar);
                akbwVar.o(a.f());
            }
        }, ktf.h)};
    }
}
