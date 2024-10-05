package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxu extends dha {

    @dnt(a = 13)
    gys a;

    @dnt(a = 3)
    boolean b;
    Integer c;
    Integer d;
    Integer e;
    Integer f;
    Integer g;
    Integer v;
    Paint w;
    Paint x;
    Paint y;

    public gxu() {
        super("ClipBounds");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new gym(context);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        gym gymVar = (gym) obj;
        gys gysVar = this.a;
        boolean z = this.b;
        int intValue = this.e.intValue();
        int intValue2 = this.d.intValue();
        int intValue3 = this.c.intValue();
        int intValue4 = this.v.intValue();
        int intValue5 = this.f.intValue();
        int intValue6 = this.g.intValue();
        Paint paint = this.y;
        Paint paint2 = this.x;
        Paint paint3 = this.w;
        gymVar.p = gysVar;
        gymVar.v = z;
        gymVar.a = intValue;
        gymVar.b = intValue2;
        gymVar.c = intValue3;
        gymVar.d = intValue4;
        gymVar.e = intValue5;
        gymVar.f = intValue6;
        gymVar.g = paint;
        gymVar.h = paint2;
        gymVar.i = paint3;
        gysVar.r = gymVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        baql baqlVar5 = new baql();
        baql baqlVar6 = new baql();
        baql baqlVar7 = new baql();
        baql baqlVar8 = new baql();
        baql baqlVar9 = new baql();
        baqlVar.a = Integer.valueOf(gym.a(dheVar.b));
        baqlVar2.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 48));
        baqlVar3.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 4));
        baqlVar4.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 2));
        baqlVar5.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 24));
        baqlVar6.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 1));
        Context context = dheVar.b;
        Paint paint = new Paint();
        paint.setColor(wbs.Q(context, R.attr.ytCallToAction));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        baqlVar7.a = paint;
        Context context2 = dheVar.b;
        Paint paint2 = new Paint();
        paint2.setColor(wbs.Q(context2, R.attr.ytThemedOverlayBackground));
        paint2.setStyle(Paint.Style.FILL);
        baqlVar8.a = paint2;
        Context context3 = dheVar.b;
        Paint paint3 = new Paint();
        paint3.setColor(wbs.Q(context3, R.attr.ytStaticWhite));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        baqlVar9.a = paint3;
        this.e = (Integer) baqlVar.a;
        this.d = (Integer) baqlVar2.a;
        this.c = (Integer) baqlVar3.a;
        this.v = (Integer) baqlVar4.a;
        this.f = (Integer) baqlVar5.a;
        this.g = (Integer) baqlVar6.a;
        this.y = (Paint) baqlVar7.a;
        this.x = (Paint) baqlVar8.a;
        this.w = (Paint) baqlVar9.a;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
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
        gxu gxuVar = (gxu) dhaVar;
        if (this.k == gxuVar.k) {
            return true;
        }
        gys gysVar = this.a;
        if (gysVar == null ? gxuVar.a == null : gysVar.equals(gxuVar.a)) {
            return this.b == gxuVar.b;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        gxu gxuVar = (gxu) super.j();
        gxuVar.c = null;
        gxuVar.d = null;
        gxuVar.e = null;
        gxuVar.f = null;
        gxuVar.g = null;
        gxuVar.v = null;
        gxuVar.w = null;
        gxuVar.x = null;
        gxuVar.y = null;
        return gxuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        gxu gxuVar = (gxu) dhaVar;
        this.c = gxuVar.c;
        this.d = gxuVar.d;
        this.e = gxuVar.e;
        this.f = gxuVar.f;
        this.g = gxuVar.g;
        this.v = gxuVar.v;
        this.w = gxuVar.w;
        this.x = gxuVar.x;
        this.y = gxuVar.y;
    }
}
