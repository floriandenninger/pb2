package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class soy extends dgy {
    public soz a;
    private final String[] d = {"children", "flexDirection"};
    private final BitSet e = new BitSet(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(soy soyVar, dhe dheVar, soz sozVar) {
        super.w(dheVar, sozVar);
        soyVar.a = sozVar;
        soyVar.e.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (soz) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final soz a() {
        o(2, this.e, this.d);
        return this.a;
    }

    public final void e(YogaAlign yogaAlign) {
        this.a.a = yogaAlign;
    }

    public final void f(YogaAlign yogaAlign) {
        this.a.b = yogaAlign;
    }

    public final void g(List list) {
        this.a.c = list;
        this.e.set(0);
    }

    public final void h(YogaFlexDirection yogaFlexDirection) {
        this.a.e = yogaFlexDirection;
        this.e.set(1);
    }

    public final void i(YogaJustify yogaJustify) {
        this.a.g = yogaJustify;
    }

    public final void j(YogaWrap yogaWrap) {
        this.a.y = yogaWrap;
    }
}
