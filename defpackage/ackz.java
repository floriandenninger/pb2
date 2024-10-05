package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackz implements abqo {
    final /* synthetic */ abrd a;
    final /* synthetic */ acle b;

    public ackz(acle acleVar, abrd abrdVar) {
        this.b = acleVar;
        this.a = abrdVar;
    }

    @Override // defpackage.abqo
    public final void a(boolean z) {
        acle acleVar = this.b;
        acleVar.o = z;
        abrd abrdVar = this.a;
        boolean z2 = false;
        if (!acleVar.b && z) {
            z2 = true;
        }
        abrdVar.a = z2;
        abse abseVar = acleVar.m;
        if (abseVar != null) {
            abseVar.c();
        }
    }
}
