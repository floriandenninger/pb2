package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kfc {
    public final ci a;
    public final kem b;
    public final kfb c;
    public boolean d;

    public kfc(ci ciVar, kfb kfbVar) {
        ciVar.getClass();
        this.a = ciVar;
        this.c = kfbVar;
        kem kemVar = new kem(ciVar.getString(R.string.playback_rate_title), new kfa(this));
        this.b = kemVar;
        kemVar.e = whu.y(ciVar, R.drawable.yt_outline_play_arrow_half_circle_black_24, R.attr.ytTextPrimary);
    }

    public final void a(avve[] avveVarArr, int i) {
        this.c.b(avveVarArr, i);
        String str = null;
        if (avveVarArr != null && i >= 0 && i < avveVarArr.length) {
            str = mcy.T(avveVarArr[i]);
        }
        this.b.d(str);
    }

    public final void b(boolean z) {
        this.b.g(z);
    }
}
