package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class soz extends dha {

    @dnt(a = 13)
    YogaAlign a;

    @dnt(a = 13)
    YogaAlign b;

    @dnt(a = 6)
    List c;

    @dnt(a = 13)
    public Drawable d;

    @dnt(a = 13)
    YogaFlexDirection e;

    @dnt(a = 13)
    Integer f;

    @dnt(a = 13)
    YogaJustify g;

    @dnt(a = 13)
    String v;

    @dnt(a = 13)
    Integer w;

    @dnt(a = 0)
    public float x;

    @dnt(a = 13)
    YogaWrap y;

    @dnt(a = 13)
    sxv z;

    private soz() {
        super("Container");
    }

    public static soy a(dhe dheVar) {
        soy soyVar = new soy();
        soy.d(soyVar, dheVar, new soz());
        return soyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void au(amsj amsjVar) {
        if (amsjVar == null) {
            return;
        }
        this.z = (sxv) amsjVar.v(sxv.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        dgz dgzVar;
        YogaFlexDirection yogaFlexDirection = this.e;
        List list = this.c;
        sxv sxvVar = this.z;
        Drawable drawable = this.d;
        Integer num = this.w;
        Integer num2 = this.f;
        YogaAlign yogaAlign = this.b;
        YogaWrap yogaWrap = this.y;
        YogaJustify yogaJustify = this.g;
        YogaAlign yogaAlign2 = this.a;
        String str = this.v;
        YogaFlexDirection yogaFlexDirection2 = YogaFlexDirection.COLUMN;
        int ordinal = yogaFlexDirection.ordinal();
        if (ordinal == 1) {
            dgt a = dgu.a(dheVar);
            a.j();
            dgzVar = a;
        } else if (ordinal == 2) {
            dgzVar = dll.a(dheVar);
        } else if (ordinal == 3) {
            dlk a2 = dll.a(dheVar);
            a2.h();
            dgzVar = a2;
        } else {
            dgzVar = dgu.a(dheVar);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dgzVar.g(((dha) it.next()).j());
            }
        }
        if (yogaAlign != null) {
            dgzVar.e(yogaAlign);
        }
        if (yogaWrap != null) {
            dgzVar.k(yogaWrap);
        }
        if (yogaJustify != null) {
            dgzVar.i(yogaJustify);
        }
        if (yogaAlign2 != null) {
            dgzVar.d(yogaAlign2);
        }
        if (str != null && sxvVar != null) {
            sxvVar.c = str;
        }
        if (drawable != null) {
            dgzVar.q(drawable);
        } else if (num != null || num2 != null) {
            sue sueVar = new sue();
            sueVar.a = num2 == null ? 0 : num2.intValue();
            sueVar.b = num != null ? num.intValue() : 0;
            dgzVar.q(sueVar);
        }
        return dgzVar.a();
    }
}
