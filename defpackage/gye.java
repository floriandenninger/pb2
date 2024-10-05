package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gye extends dha {

    @dnt(a = 13)
    gys a;

    @dnt(a = 3)
    boolean b;
    Integer c;

    public gye() {
        super("ClipTimeIndex");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new gze(context);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        gze gzeVar = (gze) obj;
        gys gysVar = this.a;
        boolean z = this.b;
        int intValue = this.c.intValue();
        Context context = dheVar.b;
        Paint paint = new Paint();
        paint.setTextSize(context.getResources().getDisplayMetrics().scaledDensity * 12.0f);
        paint.setTypeface(ajct.ROBOTO_REGULAR.a(context));
        paint.setColor(wbs.Q(context, R.attr.ytTextPrimary));
        paint.setAntiAlias(true);
        gzeVar.a = paint;
        gzeVar.f = z;
        gzeVar.e = intValue;
        gysVar.o = gzeVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        baqlVar.a = Integer.valueOf(gym.a(dheVar.b));
        this.c = (Integer) baqlVar.a;
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
        gye gyeVar = (gye) dhaVar;
        if (this.k == gyeVar.k) {
            return true;
        }
        gys gysVar = this.a;
        if (gysVar == null ? gyeVar.a == null : gysVar.equals(gyeVar.a)) {
            return this.b == gyeVar.b;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        gye gyeVar = (gye) super.j();
        gyeVar.c = null;
        return gyeVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        this.c = ((gye) dhaVar).c;
    }
}
