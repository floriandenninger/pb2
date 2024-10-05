package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utv extends uqq implements upq, utr {
    public final axpg a;
    public final axpg b;
    public final AtomicReference c;
    public final ajoy d;
    private final anic e;

    public utv(upp uppVar, anic anicVar, axpg axpgVar, axpg axpgVar2, azrw azrwVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(null);
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        this.e = anicVar;
        this.a = axpgVar;
        this.b = axpgVar2;
        this.d = ajoyVar;
        uppVar.a(anicVar, nvm.d, azrwVar);
        new okx(axpgVar, 2);
        atomicReference.set(ajoyVar.D(1.0f));
    }

    @Override // defpackage.upq, defpackage.uyo
    public final void a() {
        anaf.R(new Runnable() { // from class: utu
            @Override // java.lang.Runnable
            public final void run() {
                utv utvVar = utv.this;
                try {
                    AtomicReference atomicReference = utvVar.c;
                    ajoy ajoyVar = utvVar.d;
                    atomicReference.set(ajoyVar.D(((utt) utvVar.b.get()).a));
                } catch (Throwable unused) {
                    utvVar.c.set(utvVar.d.D(0.0f));
                }
            }
        }, this.e);
    }
}
