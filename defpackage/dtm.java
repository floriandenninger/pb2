package defpackage;

import android.text.TextUtils;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtm extends dgy {
    public dtn a;
    private final String[] e = {"text"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void d(dtm dtmVar, dhe dheVar, dtn dtnVar) {
        super.w(dheVar, dtnVar);
        dtmVar.a = dtnVar;
        dtmVar.d.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (dtn) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dtn a() {
        o(1, this.d, this.e);
        return this.a;
    }

    public final void e(int i) {
        this.a.S = i;
    }

    public final void f(TextUtils.TruncateAt truncateAt) {
        this.a.e = truncateAt;
    }
}
