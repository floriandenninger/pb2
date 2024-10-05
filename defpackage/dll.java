package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dll extends dha {
    public static final /* synthetic */ int g = 0;
    public List a;
    public YogaAlign b;
    public YogaAlign c;
    public YogaJustify d;
    public YogaWrap e;
    public boolean f;

    public dll() {
        super("Row");
    }

    public static dlk a(dhe dheVar) {
        dlk dlkVar = new dlk();
        dlkVar.f(dheVar, new dll());
        return dlkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dhi c(dhe dheVar) {
        djr m = did.m(dheVar);
        m.bH(this.f ? YogaFlexDirection.ROW_REVERSE : YogaFlexDirection.ROW);
        YogaAlign yogaAlign = this.b;
        if (yogaAlign != null) {
            m.bf(yogaAlign);
        }
        YogaAlign yogaAlign2 = this.c;
        if (yogaAlign2 != null) {
            m.be(yogaAlign2);
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify != null) {
            m.bs(yogaJustify);
        }
        YogaWrap yogaWrap = this.e;
        if (yogaWrap != null) {
            m.bE(yogaWrap);
        }
        List<dha> list = this.a;
        if (list != null) {
            for (dha dhaVar : list) {
                if (dheVar.k()) {
                    return dhe.a;
                }
                if (dheVar.l()) {
                    m.aA(dhaVar);
                } else {
                    m.bi(dhaVar);
                }
            }
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        dll dllVar = (dll) dhaVar;
        if (this.k == dllVar.k) {
            return true;
        }
        List list = this.a;
        if (list != null) {
            if (dllVar.a == null || list.size() != dllVar.a.size()) {
                return false;
            }
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                if (!((dha) this.a.get(i)).f((dha) dllVar.a.get(i))) {
                    return false;
                }
            }
        } else if (dllVar.a != null) {
            return false;
        }
        YogaAlign yogaAlign = this.b;
        if (yogaAlign == null ? dllVar.b != null : !yogaAlign.equals(dllVar.b)) {
            return false;
        }
        YogaAlign yogaAlign2 = this.c;
        if (yogaAlign2 == null ? dllVar.c != null : !yogaAlign2.equals(dllVar.c)) {
            return false;
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify == null ? dllVar.d == null : yogaJustify.equals(dllVar.d)) {
            return this.f == dllVar.f;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}
