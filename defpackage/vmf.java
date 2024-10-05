package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmf implements apo {
    private final ammv a;
    private final akht b;
    private final akht c;
    private final akht d;
    private final akht e;
    private final akht f;
    private final yfl g;

    public vmf(ammv ammvVar, akht akhtVar, akht akhtVar2, akht akhtVar3, akht akhtVar4, yfl yflVar, akht akhtVar5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = akhtVar;
        this.c = akhtVar2;
        this.d = akhtVar3;
        this.f = akhtVar4;
        this.g = yflVar;
        this.e = akhtVar5;
        this.a = ammvVar;
    }

    @Override // defpackage.apo
    public final apm a(Class cls) {
        if (cls.isAssignableFrom(vme.class)) {
            ammv ammvVar = this.a;
            akht akhtVar = this.b;
            ((vli) akhtVar.a.get()).getClass();
            ((anib) akhtVar.c.get()).getClass();
            ((aocx) akhtVar.b.get()).getClass();
            ((ajoy) akhtVar.d.get()).getClass();
            ((vlm) akhtVar.e.get()).getClass();
            vlu vluVar = new vlu((byte[]) null);
            akht akhtVar2 = this.c;
            akht akhtVar3 = this.d;
            akht akhtVar4 = this.f;
            akht akhtVar5 = this.e;
            yfl yflVar = this.g;
            ammv b = ammvVar.b(tur.q);
            ((anib) akhtVar2.c.get()).getClass();
            ((tug) akhtVar2.e.get()).getClass();
            ((wki) akhtVar2.b.get()).getClass();
            ((ajoy) akhtVar2.d.get()).getClass();
            ((baez) akhtVar2.a.get()).getClass();
            vnc vncVar = new vnc();
            vmm vmmVar = new vmm(akhtVar3, null, null);
            vms vmsVar = new vms(akhtVar3, null, null);
            vna vnaVar = new vna(akhtVar3, null, null);
            vmo vmoVar = (vmo) akhtVar4.e.get();
            vmoVar.getClass();
            anib anibVar = (anib) akhtVar4.a.get();
            anibVar.getClass();
            ajoy ajoyVar = (ajoy) akhtVar4.b.get();
            ajoyVar.getClass();
            vlm vlmVar = (vlm) akhtVar4.d.get();
            vlmVar.getClass();
            vlx vlxVar = (vlx) akhtVar4.c.get();
            vlxVar.getClass();
            vmq vmqVar = new vmq(vmoVar, anibVar, ajoyVar, vlmVar, vlxVar, null);
            anib anibVar2 = (anib) akhtVar5.c.get();
            anibVar2.getClass();
            vli vliVar = (vli) akhtVar5.a.get();
            vliVar.getClass();
            aocx aocxVar = (aocx) akhtVar5.b.get();
            aocxVar.getClass();
            vlm vlmVar2 = (vlm) akhtVar5.e.get();
            vlmVar2.getClass();
            ajoy ajoyVar2 = (ajoy) akhtVar5.d.get();
            ajoyVar2.getClass();
            vmu vmuVar = new vmu(anibVar2, vliVar, aocxVar, vlmVar2, ajoyVar2, null);
            Context context = (Context) yflVar.b.get();
            context.getClass();
            anib anibVar3 = (anib) yflVar.a.get();
            anibVar3.getClass();
            return (apm) cls.cast(new vme(b, vluVar, vncVar, vmmVar, vmsVar, vnaVar, vmqVar, vmuVar, new vml(context, anibVar3), null, null));
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unknown model class ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
