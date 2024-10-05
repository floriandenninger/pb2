package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhq implements ahgb {
    final /* synthetic */ ahhr a;
    final /* synthetic */ ahma b;

    public ahhq(ahhr ahhrVar, ahma ahmaVar, byte[] bArr) {
        this.a = ahhrVar;
        this.b = ahmaVar;
    }

    @Override // defpackage.ahgb
    public final void a() {
        ahhr ahhrVar = this.a;
        ahhrVar.g = !ahhrVar.g;
        ahhrVar.a();
        ahma ahmaVar = this.b;
        boolean z = this.a.f;
        final ahmc ahmcVar = ahmaVar.a.a;
        final int i = true != z ? -2 : 2160;
        ahmcVar.a.post(new Runnable() { // from class: ahlx
            @Override // java.lang.Runnable
            public final void run() {
                ahmc ahmcVar2 = ahmc.this;
                int i2 = i;
                ahyt ahytVar = ahmcVar2.h;
                if (ahytVar != null) {
                    ahytVar.x(i2);
                }
            }
        });
    }
}
