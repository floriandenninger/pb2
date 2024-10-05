package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabt {
    public final SharedPreferences a;
    public final shf b;
    public final azrw c;
    public final yxx d;
    public final Context e;
    private final amnv f;
    private final amnv g;
    private final amnv h;

    public aabt(SharedPreferences sharedPreferences, shf shfVar, azrw azrwVar, yxx yxxVar, Context context) {
        final int i = 0;
        this.f = amkq.x(new amnv(this) { // from class: aabs
            public final /* synthetic */ aabt a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i2 = i;
                if (i2 == 0) {
                    aabt aabtVar = this.a;
                    Context context2 = aabtVar.e;
                    return new aarh(aabtVar.a, aabtVar.b, aabtVar.c, aabtVar.d, context2 != null ? context2.getFilesDir() : null);
                }
                if (i2 == 1) {
                    aabt aabtVar2 = this.a;
                    aarh b = aabtVar2.b();
                    yxx yxxVar2 = aabtVar2.d;
                    if (yxxVar2 == null || ((yxxVar2.f(yxx.C) & 8) == 0 && aabtVar2.d.f(yxx.E) == 0)) {
                        return new aadw(b.b, null, b);
                    }
                    return new aadw(b.b, b.c, b);
                }
                aabt aabtVar3 = this.a;
                aaea aaeaVar = new aaea(aabtVar3.b().a, aabtVar3.b());
                aaqh.e = aaeaVar;
                return aaeaVar;
            }
        });
        final int i2 = 2;
        this.g = amkq.x(new amnv(this) { // from class: aabs
            public final /* synthetic */ aabt a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i22 = i2;
                if (i22 == 0) {
                    aabt aabtVar = this.a;
                    Context context2 = aabtVar.e;
                    return new aarh(aabtVar.a, aabtVar.b, aabtVar.c, aabtVar.d, context2 != null ? context2.getFilesDir() : null);
                }
                if (i22 == 1) {
                    aabt aabtVar2 = this.a;
                    aarh b = aabtVar2.b();
                    yxx yxxVar2 = aabtVar2.d;
                    if (yxxVar2 == null || ((yxxVar2.f(yxx.C) & 8) == 0 && aabtVar2.d.f(yxx.E) == 0)) {
                        return new aadw(b.b, null, b);
                    }
                    return new aadw(b.b, b.c, b);
                }
                aabt aabtVar3 = this.a;
                aaea aaeaVar = new aaea(aabtVar3.b().a, aabtVar3.b());
                aaqh.e = aaeaVar;
                return aaeaVar;
            }
        });
        final int i3 = 1;
        this.h = amkq.x(new amnv(this) { // from class: aabs
            public final /* synthetic */ aabt a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i22 = i3;
                if (i22 == 0) {
                    aabt aabtVar = this.a;
                    Context context2 = aabtVar.e;
                    return new aarh(aabtVar.a, aabtVar.b, aabtVar.c, aabtVar.d, context2 != null ? context2.getFilesDir() : null);
                }
                if (i22 == 1) {
                    aabt aabtVar2 = this.a;
                    aarh b = aabtVar2.b();
                    yxx yxxVar2 = aabtVar2.d;
                    if (yxxVar2 == null || ((yxxVar2.f(yxx.C) & 8) == 0 && aabtVar2.d.f(yxx.E) == 0)) {
                        return new aadw(b.b, null, b);
                    }
                    return new aadw(b.b, b.c, b);
                }
                aabt aabtVar3 = this.a;
                aaea aaeaVar = new aaea(aabtVar3.b().a, aabtVar3.b());
                aaqh.e = aaeaVar;
                return aaeaVar;
            }
        });
        this.a = sharedPreferences;
        this.b = shfVar;
        this.c = azrwVar;
        this.d = yxxVar;
        this.e = context;
    }

    public final aaea a() {
        return (aaea) this.g.get();
    }

    public final aarh b() {
        return (aarh) this.f.get();
    }

    public final aadw c() {
        return (aadw) this.h.get();
    }
}
