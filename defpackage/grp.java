package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class grp implements ydl {
    public final agyo a;
    final /* synthetic */ grq b;
    private final apxf c;
    private final ydl d;
    private final aahd e;

    public grp(grq grqVar, apxf apxfVar, agyo agyoVar, ydl ydlVar, aahd aahdVar) {
        this.b = grqVar;
        this.c = apxfVar;
        this.a = agyoVar;
        this.d = ydlVar;
        this.e = aahdVar;
    }

    @Override // defpackage.ydl
    public final void a() {
        this.b.b.d(new fce());
        ydl ydlVar = this.d;
        if (ydlVar != null) {
            ydlVar.a();
        }
    }

    @Override // defpackage.ydl
    public final void b() {
        this.b.b.d(new fbz());
        this.b.c.k();
        grq grqVar = this.b;
        yfb yfbVar = grqVar.v;
        if (yfbVar != null) {
            yfbVar.b();
        } else {
            grqVar.s.c(R.string.payment_purchase_cancelled);
        }
        ydl ydlVar = this.d;
        if (ydlVar != null) {
            ydlVar.b();
        }
    }

    @Override // defpackage.ydl
    public final void c(CharSequence charSequence) {
        String charSequence2;
        this.b.b.d(new fca());
        this.b.w.l();
        this.b.c.n();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = this.b.d.getString(R.string.error_generic);
        } else {
            charSequence2 = charSequence.toString();
        }
        grq grqVar = this.b;
        yfb yfbVar = grqVar.v;
        if (yfbVar != null) {
            yfbVar.c(charSequence2);
        } else {
            grqVar.s.d(charSequence2);
        }
        ydl ydlVar = this.d;
        if (ydlVar != null) {
            ydlVar.c(charSequence);
        }
    }

    @Override // defpackage.ydl
    public final void d(abeh abehVar) {
        ydl ydlVar = this.d;
        if (ydlVar != null) {
            ydlVar.d(abehVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ydl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.asfw r23) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grp.e(asfw):void");
    }

    @Override // defpackage.ydl
    public final void f() {
        this.b.w.l();
        this.b.c.n();
        String string = this.b.d.getString(R.string.payment_wallet_processing_error);
        grq grqVar = this.b;
        yfb yfbVar = grqVar.v;
        if (yfbVar != null) {
            yfbVar.c(string);
        } else {
            grqVar.s.d(string);
        }
        ydl ydlVar = this.d;
        if (ydlVar != null) {
            ydlVar.f();
        }
    }

    public final void g(String str, atrx atrxVar) {
        h(this.b.n.a().m().a(str, atrxVar, agno.OFFLINE_IMMEDIATELY, this.c.c.I(), 0));
    }

    public final void h(int i) {
        grq grqVar = this.b;
        int r = agxz.r(i, grqVar.h, grqVar.g, grqVar.l, grqVar.m);
        if (r != 0) {
            this.b.i.e(r);
        }
    }
}
