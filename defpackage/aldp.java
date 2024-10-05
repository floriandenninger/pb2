package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aldp extends akwq {
    final /* synthetic */ ayrs a;
    final /* synthetic */ akzp b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ayro d;
    final /* synthetic */ aldq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldp(aldq aldqVar, akyb akybVar, akzp akzpVar, ayrs ayrsVar, akzp akzpVar2, boolean z, ayro ayroVar) {
        super(akybVar, akzpVar);
        this.e = aldqVar;
        this.a = ayrsVar;
        this.b = akzpVar2;
        this.c = z;
        this.d = ayroVar;
    }

    @Override // defpackage.akwq
    public final ayro d() {
        return this.d;
    }

    @Override // defpackage.akwq
    public final void e(aone aoneVar) {
        ayrs ayrsVar = this.a;
        if (ayrsVar != null) {
            try {
                ayrsVar.a(aoneVar);
            } catch (Exception unused) {
            }
        }
        int l = akwg.l(this.b.c);
        if (l == 0 || l != 4 || ((akzs) aoneVar.instance).af) {
            return;
        }
        if (!this.c || !this.e.h()) {
            if (this.c || !this.e.j()) {
                return;
            }
            aoneVar.copyOnWrite();
            akzs akzsVar = (akzs) aoneVar.instance;
            akzsVar.c |= 67108864;
            akzsVar.af = true;
            return;
        }
        aoneVar.copyOnWrite();
        akzs akzsVar2 = (akzs) aoneVar.instance;
        akzsVar2.c = 67108864 | akzsVar2.c;
        akzsVar2.af = true;
        avtr avtrVar = this.e.j;
        aoneVar.copyOnWrite();
        akzs akzsVar3 = (akzs) aoneVar.instance;
        akzsVar3.ag = avtrVar.S;
        akzsVar3.c |= 134217728;
        avtq b = avtq.b(this.b.d);
        if (b == null) {
            b = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        aoneVar.copyOnWrite();
        akzs akzsVar4 = (akzs) aoneVar.instance;
        akzsVar4.ah = b.aB;
        akzsVar4.c |= 268435456;
    }
}
