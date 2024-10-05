package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class unh implements ung {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/PrimesApiImpl");
    private final unq b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;

    public unh(unq unqVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, ammr ammrVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = unqVar;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.f = azrwVar4;
        this.g = azrwVar5;
        if (uqq.n() || ammrVar.p()) {
            Boolean bool = Boolean.FALSE;
            bool.getClass();
            if (bool.booleanValue()) {
                return;
            }
            ((amxh) ((amxh) a.c()).i("com/google/android/libraries/performance/primes/PrimesApiImpl", "initialize", 115, "PrimesApiImpl.java")).q("Primes instant initialization");
            try {
                WeakHashMap weakHashMap = amjw.a;
                Iterator it = ((Set) azrwVar.get()).iterator();
                while (it.hasNext()) {
                    ((upq) it.next()).a();
                }
                return;
            } catch (RuntimeException e) {
                ((amxh) ((amxh) ((amxh) a.g()).h(e)).i("com/google/android/libraries/performance/primes/PrimesApiImpl", "initialize", '{', "PrimesApiImpl.java")).q("Primes failed to initialize");
                this.b.a();
                return;
            }
        }
        String str = ammrVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 150);
        sb.append("Primes init triggered from background in package: ");
        sb.append(str);
        sb.append(". If this is an existing error, please file a bug on the Primes team to whitelist your package name.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ung
    public final void a(usc uscVar) {
        ((use) this.g.get()).b(uscVar);
    }

    @Override // defpackage.ung
    public final void b() {
        ((uqg) this.d.get()).e();
    }

    @Override // defpackage.ung
    public final void c() {
        ((uru) this.e.get()).c();
    }

    @Override // defpackage.ung
    public final void d(String str) {
        ((urj) this.f.get()).b(str);
    }
}
