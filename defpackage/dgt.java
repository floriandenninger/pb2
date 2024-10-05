package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgt extends dgz {
    public dgu a;

    @Override // defpackage.dgy
    public final /* synthetic */ dha a() {
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (dgu) dhaVar;
    }

    @Override // defpackage.dgz
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(YogaAlign yogaAlign) {
        dgu dguVar = this.a;
        int i = dgu.g;
        dguVar.c = yogaAlign;
    }

    @Override // defpackage.dgz
    public final /* bridge */ /* synthetic */ void e(YogaAlign yogaAlign) {
        dgu dguVar = this.a;
        int i = dgu.g;
        dguVar.b = yogaAlign;
    }

    @Override // defpackage.dgz
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void g(dha dhaVar) {
        if (dhaVar == null) {
            return;
        }
        dgu dguVar = this.a;
        if (dguVar.a == null) {
            dguVar.a = new ArrayList();
        }
        this.a.a.add(dhaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(dhe dheVar, dgu dguVar) {
        super.w(dheVar, dguVar);
        this.a = dguVar;
    }

    @Override // defpackage.dgz
    public final /* bridge */ /* synthetic */ void i(YogaJustify yogaJustify) {
        dgu dguVar = this.a;
        int i = dgu.g;
        dguVar.d = yogaJustify;
    }

    public final void j() {
        dgu dguVar = this.a;
        int i = dgu.g;
        dguVar.f = true;
    }

    @Override // defpackage.dgz
    public final /* bridge */ /* synthetic */ void k(YogaWrap yogaWrap) {
        dgu dguVar = this.a;
        int i = dgu.g;
        dguVar.e = yogaWrap;
    }

    public final void l(dgy dgyVar) {
        g(dgyVar.a());
    }
}
