package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxy extends dha {

    @dnt(a = 13)
    gys a;

    @dnt(a = 3)
    boolean b;
    Integer c;
    Integer d;
    Integer e;
    Paint f;
    Integer g;

    public gxy() {
        super("ClipPlaybackMarker");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new gyt(context);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        gyt gytVar = (gyt) obj;
        gys gysVar = this.a;
        boolean z = this.b;
        int intValue = this.e.intValue();
        int intValue2 = this.g.intValue();
        int intValue3 = this.d.intValue();
        Paint paint = this.f;
        int intValue4 = this.c.intValue();
        gytVar.b = intValue;
        gytVar.c = intValue2;
        gytVar.d = intValue3;
        gytVar.a = paint;
        gytVar.f = intValue4;
        gysVar.s = gytVar;
        gytVar.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        baql baqlVar5 = new baql();
        baqlVar.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 4));
        baqlVar2.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 4));
        baqlVar3.a = Integer.valueOf(yjk.K(dheVar.b.getResources().getDisplayMetrics(), 2));
        Context context = dheVar.b;
        Paint paint = new Paint();
        paint.setColor(wbs.Q(context, R.attr.ytBrandRed));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        baqlVar4.a = paint;
        baqlVar5.a = Integer.valueOf(gym.a(dheVar.b));
        this.e = (Integer) baqlVar.a;
        this.g = (Integer) baqlVar2.a;
        this.d = (Integer) baqlVar3.a;
        this.f = (Paint) baqlVar4.a;
        this.c = (Integer) baqlVar5.a;
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
        gxy gxyVar = (gxy) dhaVar;
        if (this.k == gxyVar.k) {
            return true;
        }
        gys gysVar = this.a;
        if (gysVar == null ? gxyVar.a == null : gysVar.equals(gxyVar.a)) {
            return this.b == gxyVar.b;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        gxy gxyVar = (gxy) super.j();
        gxyVar.c = null;
        gxyVar.d = null;
        gxyVar.e = null;
        gxyVar.f = null;
        gxyVar.g = null;
        return gxyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        gxy gxyVar = (gxy) dhaVar;
        this.c = gxyVar.c;
        this.d = gxyVar.d;
        this.e = gxyVar.e;
        this.f = gxyVar.f;
        this.g = gxyVar.g;
    }
}
