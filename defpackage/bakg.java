package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bakg extends bake implements Serializable, baka {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile bajf b;

    public bakg() {
        this(bajk.a(), bale.O());
    }

    @Override // defpackage.baka
    public final long st() {
        return this.a;
    }

    @Override // defpackage.baka
    public final bajf su() {
        return this.b;
    }

    public bakg(long j, bajf bajfVar) {
        this.b = bajk.d(bajfVar);
        this.a = j;
    }

    public bakg(long j, bajn bajnVar) {
        this(j, bale.P(bajnVar));
    }
}
