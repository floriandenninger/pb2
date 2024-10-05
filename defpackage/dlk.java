package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dlk extends dgz {
    public dll a;

    @Override // defpackage.dgy
    public final /* synthetic */ dha a() {
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (dll) dhaVar;
    }

    @Override // defpackage.dgz
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void g(dha dhaVar) {
        if (dhaVar == null) {
            return;
        }
        dll dllVar = this.a;
        if (dllVar.a == null) {
            dllVar.a = new ArrayList();
        }
        this.a.a.add(dhaVar);
    }

    @Override // defpackage.dgz
    public final /* bridge */ /* synthetic */ void d(YogaAlign yogaAlign) {
        dll dllVar = this.a;
        int i = dll.g;
        dllVar.c = yogaAlign;
    }

    @Override // defpackage.dgz
    public final /* bridge */ /* synthetic */ void e(YogaAlign yogaAlign) {
        dll dllVar = this.a;
        int i = dll.g;
        dllVar.b = yogaAlign;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(dhe dheVar, dll dllVar) {
        super.w(dheVar, dllVar);
        this.a = dllVar;
    }

    public final void h() {
        dll dllVar = this.a;
        int i = dll.g;
        dllVar.f = true;
    }

    @Override // defpackage.dgz
    public final /* bridge */ /* synthetic */ void i(YogaJustify yogaJustify) {
        dll dllVar = this.a;
        int i = dll.g;
        dllVar.d = yogaJustify;
    }

    public final void j(dgy dgyVar) {
        g(dgyVar.a());
    }

    @Override // defpackage.dgz
    public final /* bridge */ /* synthetic */ void k(YogaWrap yogaWrap) {
        dll dllVar = this.a;
        int i = dll.g;
        dllVar.e = yogaWrap;
    }
}
