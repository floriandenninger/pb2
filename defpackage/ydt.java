package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ydt implements wej, yfi {
    final aahd a;
    final apxf b;
    private final ydl c;

    public ydt(aahd aahdVar, apxf apxfVar, ydl ydlVar) {
        this.a = aahdVar;
        this.b = apxfVar;
        this.c = ydlVar;
    }

    @Override // defpackage.wej
    public final void a() {
        ydl ydlVar = this.c;
        if (ydlVar != null) {
            ydlVar.b();
        }
    }

    @Override // defpackage.wej
    public final void b() {
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("PostTransactionCallback", this);
            this.a.c(this.b, hashMap);
        }
    }

    @Override // defpackage.yfi
    public final void g() {
        ydl ydlVar = this.c;
        if (ydlVar != null) {
            ydlVar.c(null);
        }
    }

    @Override // defpackage.yfi
    public final void h() {
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        ydl ydlVar = this.c;
        if (ydlVar != null) {
            ydlVar.e(asfwVar);
        }
    }
}
