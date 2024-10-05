package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yao {
    public String a;
    public String b;
    public final Executor c;
    public final akvq d;
    public final afsy e;
    public final yan f;
    public anhy g;
    public boolean h = false;
    public xxn i;

    public yao(String str, afsy afsyVar, Executor executor, akvq akvqVar) {
        this.a = str;
        this.c = executor;
        this.d = akvqVar;
        afsyVar.getClass();
        this.e = afsyVar;
        this.f = new yan(this);
    }

    public static /* synthetic */ void a(Throwable th) {
        zga.d("Error occurred getting resumable uploads", th);
    }

    public static /* bridge */ /* synthetic */ void c(yao yaoVar) {
        yaoVar.a = null;
    }

    public final void b() {
        try {
            this.h = false;
            anhy anhyVar = this.g;
            if (anhyVar != null && !anhyVar.isDone()) {
                this.g.cancel(true);
            }
            this.d.d(this.f);
        } catch (IllegalStateException e) {
            zga.d("Error releasing VideoIdHelper", e);
        }
    }
}
