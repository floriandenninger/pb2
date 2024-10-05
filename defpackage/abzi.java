package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abzi implements afwx {
    public final abxw a;
    private final Handler b;
    private final acra c;

    public abzi(Handler handler, acra acraVar, abxw abxwVar) {
        this.b = handler;
        this.c = acraVar;
        this.a = abxwVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        Handler handler = this.b;
        final abxw abxwVar = this.a;
        handler.post(new Runnable() { // from class: abzg
            @Override // java.lang.Runnable
            public final void run() {
                abxw.this.e();
            }
        });
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        final arrn arrnVar = (arrn) obj;
        if (arrnVar != null) {
            this.c.D(new acqx(arrnVar.e.I()));
        }
        this.b.post(new Runnable() { // from class: abzh
            @Override // java.lang.Runnable
            public final void run() {
                abzi abziVar = abzi.this;
                abziVar.a.h(arrnVar);
            }
        });
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
