package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anwf implements anwg {
    private final anwy a;

    public anwf(final Context context) {
        this.a = new anva(new anwy() { // from class: anwe
            @Override // defpackage.anwy
            public final Object a() {
                return anwh.a(context);
            }
        });
    }

    @Override // defpackage.anwg
    public final int a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = ((anwh) this.a.a()).c(str, currentTimeMillis);
        boolean b = ((anwh) this.a.a()).b(currentTimeMillis);
        if (c && b) {
            return 4;
        }
        if (b) {
            return 3;
        }
        return c ? 2 : 1;
    }
}
