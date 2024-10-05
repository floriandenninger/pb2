package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahbg {
    final /* synthetic */ ahbh a;

    public ahbg(ahbh ahbhVar) {
        this.a = ahbhVar;
    }

    public final /* bridge */ /* synthetic */ int a(Object obj) {
        ahbh ahbhVar = this.a;
        int i = ahbhVar.m;
        ahbhVar.d((PlayerResponseModel) obj);
        if (aifk.e(this.a.h).o || i != 3) {
            return 1;
        }
        ahbh ahbhVar2 = this.a;
        if (ahbhVar2.m == 2 || ahbhVar2.c.m) {
            return 1;
        }
        ((aiow) ahbhVar2.g.get()).d(new aigr(13, 3, this.a.a.getString(R.string.unplayable_in_background)));
        return 2;
    }

    public final /* bridge */ /* synthetic */ int b() {
        if (this.a.e.v()) {
            return 1;
        }
        ahbh ahbhVar = this.a;
        int i = ahbhVar.m;
        if (i == 0) {
            throw null;
        }
        if (i != 3) {
            return 1;
        }
        ahbhVar.b();
        return 2;
    }
}
