package defpackage;

import android.content.Context;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class bfl implements atd {
    private final Context a;
    private final atd b;

    public bfl(Context context, String str) {
        ati atiVar = new ati();
        atiVar.b = str;
        this.a = context.getApplicationContext();
        this.b = atiVar;
    }

    @Override // defpackage.atd
    public final /* bridge */ /* synthetic */ ate a() {
        return new bfk(this.a, ((ati) this.b).a());
    }
}
