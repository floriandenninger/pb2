package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebn extends ecl {
    private static final amsj i = new amsj((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    private final Context h;

    public ebn(ebe ebeVar, aone aoneVar, int i2, Context context) {
        super(ebeVar, "Cm/m2hUfCdldkdMMT3yEm1sAGuFpKVfLQblDoR20XcK7ttTDkHIz3fwaKTv7az9S", "aEm/NgN//tNFhysboe/lIhu1ib9P4g8tTm8w79YCsSs=", aoneVar, i2, 29);
        this.h = context;
    }

    @Override // defpackage.ecl
    protected final void a() {
        aone aoneVar = this.g;
        aoneVar.copyOnWrite();
        dvo dvoVar = (dvo) aoneVar.instance;
        dvo dvoVar2 = dvo.a;
        dvoVar.b |= 16777216;
        dvoVar.t = "E";
        AtomicReference r = i.r(this.h.getPackageName());
        if (r.get() == null) {
            synchronized (r) {
                if (r.get() == null) {
                    r.set((String) this.d.invoke(null, this.h));
                }
            }
        }
        String str = (String) r.get();
        synchronized (this.g) {
            aone aoneVar2 = this.g;
            String l = esv.l(str.getBytes(), true);
            aoneVar2.copyOnWrite();
            dvo dvoVar3 = (dvo) aoneVar2.instance;
            l.getClass();
            dvoVar3.b = 16777216 | dvoVar3.b;
            dvoVar3.t = l;
        }
    }
}
