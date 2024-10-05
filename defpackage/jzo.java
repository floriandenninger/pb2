package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzo extends ajwi implements jqj {
    public final jqk a;
    private final RecyclerView b;
    private Parcelable c;
    private final axzf d;

    public jzo(ajoy ajoyVar, ajvq ajvqVar, jtz jtzVar, ypa ypaVar, zaw zawVar, ajpa ajpaVar, ajxj ajxjVar, aaea aaeaVar, aypn aypnVar, axzf axzfVar, ajxe ajxeVar, RecyclerView recyclerView, jqk jqkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(ajxe.a(ajxeVar), recyclerView, ajoyVar, ajvqVar, jtzVar, ypaVar, ajxjVar.a(jtzVar, jqkVar.b), zawVar, jqkVar.b, ajpaVar, ajxa.WI, ajwk.d, aaeaVar, aypnVar);
        this.b = recyclerView;
        this.a = jqkVar;
        this.d = axzfVar;
        if (ajxeVar instanceof jzn) {
            this.c = ((jzn) ajxeVar).a;
        }
    }

    @Override // defpackage.jqj
    public final jqk a() {
        return this.a;
    }

    @Override // defpackage.ajss, defpackage.ajwx
    public final void c() {
        super.c();
        Parcelable parcelable = this.c;
        if (parcelable != null) {
            wd wdVar = this.b.n;
            wdVar.getClass();
            wdVar.Y(parcelable);
            this.c = null;
        }
    }

    public final void d(boolean z, String... strArr) {
        Parcelable parcelable;
        wd wdVar;
        if (z) {
            wd wdVar2 = this.b.n;
            wdVar2.getClass();
            parcelable = wdVar2.P();
        } else {
            parcelable = null;
        }
        for (String str : strArr) {
            ajvc s = s(str);
            if (s instanceof jzl) {
                jzl jzlVar = (jzl) s;
                if (this.d.r() && str.equals("downloads_page_downloads_item_section_identifier")) {
                    jzlVar.K(false);
                }
                jzlVar.af();
            } else {
                String valueOf = String.valueOf(str);
                zga.b(valueOf.length() != 0 ? "Item section not found or not a ContinuableController: ".concat(valueOf) : new String("Item section not found or not a ContinuableController: "));
            }
        }
        if (parcelable == null || (wdVar = this.b.n) == null) {
            return;
        }
        wdVar.Y(parcelable);
    }

    @Override // defpackage.ajss, defpackage.ajxa
    public final void lo() {
        d(true, "downloads_page_downloads_item_section_identifier");
    }

    @Override // defpackage.ajss, defpackage.ajtz, defpackage.ajvz
    public final ajxe ph() {
        ajxe ph = super.ph();
        RecyclerView recyclerView = this.b;
        recyclerView.getClass();
        wd wdVar = recyclerView.n;
        wdVar.getClass();
        return new jzn(ph, wdVar.P());
    }
}
