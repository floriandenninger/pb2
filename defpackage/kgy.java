package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgy extends ahsl implements ahew {
    public final ahez a;
    public final nsv b;
    public final ahvw c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final ahsh w;
    private boolean x;
    private final kgv y;

    public kgy(Context context, kgv kgvVar, ajjz ajjzVar, aahd aahdVar, zaz zazVar, afuh afuhVar, afxf afxfVar, acra acraVar, ahsm ahsmVar, nsv nsvVar, ahvw ahvwVar, ahez ahezVar) {
        super(context, kgvVar, ajjzVar, aahdVar, zazVar, afuhVar, afxfVar, acraVar, ahsmVar);
        this.y = kgvVar;
        this.w = new kgx(this);
        this.b = nsvVar;
        this.c = ahvwVar;
        this.a = ahezVar;
    }

    @Override // defpackage.ahew
    public final void a(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        c();
    }

    @Override // defpackage.ahsl
    public final ahsh b() {
        return this.w;
    }

    public final void c() {
        kgv kgvVar = this.y;
        boolean z = false;
        if (!this.x && !this.d && !this.e && !this.f) {
            z = true;
        }
        kgvVar.g(z);
    }
}
