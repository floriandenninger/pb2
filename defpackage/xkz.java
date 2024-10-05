package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkz extends xlc {
    public ahyr a;
    public xla f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final Context j;
    private final int k;

    public xkz(Context context) {
        super(xka.a().a());
        this.j = context;
        this.k = R.string.ad_learn_more;
    }

    public static final boolean a(boolean z, boolean z2, boolean z3) {
        return (!z || z2 || z3) ? false : true;
    }

    @Override // defpackage.xkt
    public final /* synthetic */ void b(Object obj, boolean z) {
        xka xkaVar = (xka) obj;
        CharSequence charSequence = xkaVar.c;
        boolean z2 = xkaVar.b;
        this.i = xkaVar.a;
        int i = 8;
        if (!((xka) this.b).c.equals(charSequence) || ((xka) this.b).b != z2) {
            if (z2) {
                if ("<NONE>".equals(charSequence)) {
                    charSequence = this.j.getResources().getString(this.k);
                }
                ahyr ahyrVar = this.a;
                if (ahyrVar != null) {
                    ahyrVar.b(charSequence);
                }
            } else {
                ahyr ahyrVar2 = this.a;
                if (ahyrVar2 != null) {
                    ahyrVar2.c(8);
                }
            }
        }
        ahyr ahyrVar3 = this.a;
        if (ahyrVar3 != null) {
            if (z && a(z2, this.i, this.g)) {
                i = 0;
            }
            ahyrVar3.c(i);
        }
    }
}
