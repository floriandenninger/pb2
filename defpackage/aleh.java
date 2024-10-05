package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aleh extends akye {
    public final AtomicBoolean b;
    public final ayrw c;
    public final axze d;
    private final int e;
    private final Executor f;
    private ayqx g;
    private final aypy h;

    public aleh(Executor executor, axze axzeVar, int i, int i2, akwm akwmVar, String str, ayrw ayrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(i);
        this.f = executor;
        this.d = axzeVar;
        this.e = i2;
        this.c = ayrwVar;
        aypy aypyVar = (aypy) akwmVar.a.get(str);
        aypyVar.getClass();
        this.h = aypyVar;
        this.b = new AtomicBoolean();
    }

    @Override // defpackage.akye
    protected final void e() {
        this.g = this.h.ai(azre.b(this.f)).ab(azre.b(this.f)).az(new aleg(this, 0), new aleg(this, 3), new ayrm() { // from class: alef
            @Override // defpackage.ayrm
            public final void a() {
                aleh.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akye
    public final void f() {
        Object obj = this.g;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
    }

    @Override // defpackage.akyq
    public final akyr g() {
        ayrz.c((AtomicReference) this.h.ak(1L).ay(new aleg(this, 1), new aleg(this, 2)));
        return this.b.get() ? akyr.a : akyr.a(this.e);
    }
}
