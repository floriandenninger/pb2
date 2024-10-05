package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahga extends ahhi implements ahgc {
    public final ahhp a;
    public boolean b;
    public ahgb c;
    private boolean e;
    private List f;

    public ahga(ahhp ahhpVar) {
        this.a = ahhpVar;
        this.b = false;
        this.e = true;
    }

    @Override // defpackage.ahgc
    public final void j(boolean z) {
        this.e = z;
        Iterator it = iterator();
        while (it.hasNext()) {
            ahim ahimVar = (ahim) it.next();
            if (ahimVar instanceof ahgc) {
                ((ahgc) ahimVar).j(z);
            }
        }
    }

    public final void k(ahfq ahfqVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(ahfqVar);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void l(float f, float f2, float f3) {
        super.l(f, f2, f3);
        this.a.a.f(f, f2, f3);
    }

    public final void m(float f, float f2) {
        this.a.a(f, f2);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public void p(ahjq ahjqVar) {
        ahgb ahgbVar = this.c;
        if (ahgbVar != null && this.e && this.b) {
            ahgbVar.a();
        }
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public void q(ahjq ahjqVar) {
        List list;
        if (!v() && (list = this.f) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ahfq) it.next()).a(this.b, ahjqVar.b);
            }
        }
        super.q(ahjqVar);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public void qD(boolean z, ahjq ahjqVar) {
        this.b = z;
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ahim) it.next()).qD(z, ahjqVar);
        }
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final boolean r(ahjq ahjqVar) {
        return !v() && this.e && this.a.b(ahjqVar).b();
    }

    public ahga(ahkv ahkvVar, azrw azrwVar, Bitmap bitmap, float f, Bitmap bitmap2) {
        this(new ahhp(ahkvVar.clone(), f, f));
        ahjp ahjpVar = new ahjp(bitmap, ahku.a(f, f, ahku.c), ahkvVar.clone(), azrwVar);
        ahjpVar.a(new ahil(ahjpVar, ahil.b(0.8f), ahil.b(1.0f)));
        ahjpVar.a(new ahif(ahjpVar, 0.1f, 0.2f));
        ahjpVar.d = 0.0f;
        ahjp ahjpVar2 = new ahjp(bitmap2, ahku.a(ahkt.a(bitmap2.getWidth()), ahkt.a(bitmap2.getHeight()), ahku.c), ahkvVar.clone(), azrwVar);
        ahjpVar2.a(new ahil(ahjpVar2, ahil.b(1.0f), ahil.b(1.2f)));
        ahjpVar2.d = 0.3f;
        n(ahjpVar);
        n(ahjpVar2);
    }
}
