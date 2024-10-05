package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxw extends dha {

    @dnt(a = 13)
    gys a;
    Integer b;

    public gxw() {
        super("ClipDurationText");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new TextView(context);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        TextView textView = (TextView) obj;
        int intValue = this.b.intValue();
        gys gysVar = this.a;
        Context context = dheVar.b;
        gysVar.p = textView;
        textView.setTextSize(12.0f);
        textView.setTypeface(ajct.ROBOTO_REGULAR.a(context));
        textView.setTextColor(intValue);
        textView.setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        baqlVar.a = Integer.valueOf(wbs.Q(dheVar.b, R.attr.ytTextSecondary));
        this.b = (Integer) baqlVar.a;
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
        gxw gxwVar = (gxw) dhaVar;
        if (this.k == gxwVar.k) {
            return true;
        }
        gys gysVar = this.a;
        return gysVar == null ? gxwVar.a == null : gysVar.equals(gxwVar.a);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        gxw gxwVar = (gxw) super.j();
        gxwVar.b = null;
        return gxwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        this.b = ((gxw) dhaVar).b;
    }
}
