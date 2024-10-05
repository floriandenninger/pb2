package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alju extends fh {
    final /* synthetic */ aljw a;
    final /* synthetic */ aljv b;

    public alju(aljv aljvVar, aljw aljwVar) {
        this.b = aljvVar;
        this.a = aljwVar;
    }

    @Override // defpackage.fh
    public final void a(Typeface typeface) {
        aljv aljvVar = this.b;
        aljvVar.k = Typeface.create(typeface, aljvVar.c);
        this.b.m = true;
        this.a.b(this.b.k);
    }

    @Override // defpackage.fh
    public final void e() {
        this.b.m = true;
        this.a.c();
    }
}
