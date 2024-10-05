package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whw implements ajvb {
    public ajos a;
    private final Context b;
    private final zaw c;
    private final acra d;
    private final wia e;
    private final wib f;
    private final wid g;
    private final ajjs h;

    public whw(Context context, zaw zawVar, acra acraVar, ajjs ajjsVar, wia wiaVar, wib wibVar, wid widVar) {
        this.b = context;
        this.c = zawVar;
        this.h = ajjsVar;
        this.d = acraVar;
        this.e = wiaVar;
        this.f = wibVar;
        this.g = widVar;
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        this.a = new ajnq();
        amkq.E(cls == aatd.class);
        this.a.f(whl.class, new whk(this.b, 0));
        this.a.f(aovb.class, new whi(this.b, R.layout.account_item_section_header, this.d));
        this.a.f(aata.class, new whf(this.b, this.h, this.d, this.e));
        this.a.f(aatb.class, new wha(this.b, this.c, this.f));
        this.a.f(whu.class, new wht(this.b, this.g, 0));
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.a;
    }
}
