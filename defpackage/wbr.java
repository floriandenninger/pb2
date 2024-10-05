package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbr implements ajvb {
    public final Context a;
    private final zaw b;
    private final acra c;
    private final wia d;
    private final wib e;
    private final wid f;
    private final wic g;
    private final ajjz h;
    private ajos i;
    private final ajut j;
    private final akpq k;

    public wbr(Context context, zaw zawVar, acra acraVar, ajjz ajjzVar, wia wiaVar, wib wibVar, wid widVar, wic wicVar, ajut ajutVar, akpq akpqVar, byte[] bArr) {
        this.a = context;
        this.b = zawVar;
        this.h = ajjzVar;
        this.c = acraVar;
        this.d = wiaVar;
        this.e = wibVar;
        this.f = widVar;
        this.g = wicVar;
        this.j = ajutVar;
        this.k = akpqVar;
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        amkq.E(cls == aatd.class);
        ajnq ajnqVar = new ajnq();
        this.i = ajnqVar;
        ajnqVar.f(wbs.class, new wht(this.a, this.f, 1, null));
        this.i.f(whl.class, new whk(this.a, 0));
        this.i.f(aovb.class, new whi(this.a, R.layout.fusion_account_item_section_header, this.c));
        this.i.f(aata.class, new wbw(this.a, this.h, this.c, this.d, this.g, this.j, this.k, null));
        this.i.f(aatb.class, new wha(this.a, this.b, this.e));
        this.i.f(aovm.class, new whk(this.a, 2, (char[]) null));
        this.i.f(ajny.class, new ajoq() { // from class: wbq
            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                return new ajnz(wbr.this.a);
            }
        });
        this.i.f(wie.class, new whk(this.a, 3, (short[]) null));
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.i;
    }
}
