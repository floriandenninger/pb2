package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abth implements acab {
    final /* synthetic */ abtk a;

    public abth(abtk abtkVar) {
        this.a = abtkVar;
    }

    @Override // defpackage.acab
    public final void a(acac acacVar, int i) {
        String valueOf = String.valueOf(acacVar.g());
        zga.c("MediaMuxCapturePipelineMgr", valueOf.length() != 0 ? "Encoder error for ".concat(valueOf) : new String("Encoder error for "));
        this.a.v(i);
    }
}
