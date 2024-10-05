package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgu extends dha {
    public static final /* synthetic */ int g = 0;
    public List a;
    public YogaAlign b;
    public YogaAlign c;
    public YogaJustify d;
    public YogaWrap e;
    public boolean f;

    public dgu() {
        super("Column");
    }

    public static dgt a(dhe dheVar) {
        dgt dgtVar = new dgt();
        dgtVar.h(dheVar, new dgu());
        return dgtVar;
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
        m.bH(this.f ? YogaFlexDirection.COLUMN_REVERSE : YogaFlexDirection.COLUMN);
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
        dgu dguVar = (dgu) dhaVar;
        if (this.k == dguVar.k) {
            return true;
        }
        List list = this.a;
        if (list != null) {
            if (dguVar.a == null || list.size() != dguVar.a.size()) {
                return false;
            }
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                if (!((dha) this.a.get(i)).f((dha) dguVar.a.get(i))) {
                    return false;
                }
            }
        } else if (dguVar.a != null) {
            return false;
        }
        YogaAlign yogaAlign = this.b;
        if (yogaAlign == null ? dguVar.b != null : !yogaAlign.equals(dguVar.b)) {
            return false;
        }
        YogaAlign yogaAlign2 = this.c;
        if (yogaAlign2 == null ? dguVar.c != null : !yogaAlign2.equals(dguVar.c)) {
            return false;
        }
        YogaJustify yogaJustify = this.d;
        if (yogaJustify == null ? dguVar.d == null : yogaJustify.equals(dguVar.d)) {
            return this.f == dguVar.f;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}
