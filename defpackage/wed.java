package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.FirstTimeUnicornSignInRendererOuterClass;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class wed {
    private static final boolean[][] f = {new boolean[]{false, false, false, true, false, false, true, true, true, true}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, false, true, true, false, false, false, false, false, false}, new boolean[]{false, false, false, true, false, true, true, true, false, false}, new boolean[]{false, false, false, true, false, false, false, false, false, false}, new boolean[]{false, true, true, true, true, true, false, true, false, false}, new boolean[]{false, true, true, true, true, true, true, false, false, false}, new boolean[]{false, true, true, true, false, true, false, false, false, false}, new boolean[]{false, true, true, true, false, true, false, false, false, false}};
    aqws d;
    PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer e;
    private final aahd g;
    private final Handler h;
    private final wfv i;
    private boolean l = false;
    private final Set j = Collections.newSetFromMap(new WeakHashMap());
    private InlineAuthCommandOuterClass$InlineAuthCommand k = null;
    int a = 0;
    FingerprintAuthRendererOuterClass$FingerprintAuthRenderer b = null;
    PasswordAuthRendererOuterClass$PasswordAuthRenderer c = null;

    public wed(aahd aahdVar, Handler handler, wfv wfvVar) {
        this.g = aahdVar;
        this.h = handler;
        this.i = wfvVar;
    }

    public final void a(wej wejVar) {
        this.j.add(wejVar);
    }

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i) {
        for (wej wejVar : this.j) {
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.k;
        if (inlineAuthCommandOuterClass$InlineAuthCommand == null || (inlineAuthCommandOuterClass$InlineAuthCommand.b & 2) == 0) {
            return;
        }
        aahd aahdVar = this.g;
        apxf apxfVar = inlineAuthCommandOuterClass$InlineAuthCommand.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i) {
        if (this.l) {
            aahd aahdVar = this.g;
            apxf apxfVar = this.k.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
        for (wej wejVar : this.j) {
            if (wejVar != null) {
                wejVar.b();
            }
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.k;
        if (inlineAuthCommandOuterClass$InlineAuthCommand == null || (inlineAuthCommandOuterClass$InlineAuthCommand.b & 1) == 0) {
            return;
        }
        aahd aahdVar2 = this.g;
        apxf apxfVar2 = inlineAuthCommandOuterClass$InlineAuthCommand.c;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar2.c(apxfVar2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f(wfu wfuVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void h(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void i(aqws aqwsVar);

    public final void j(int i) {
        int i2 = this.a;
        this.a = i;
        final int i3 = 3;
        if (!f[i2][i]) {
            j(3);
            return;
        }
        final int i4 = 0;
        final int i5 = 1;
        final int i6 = 2;
        switch (i) {
            case 1:
                if (i2 == 8) {
                    d(2);
                    return;
                }
                if (i2 == 9) {
                    d(3);
                    return;
                } else if (i2 == 6) {
                    d(1);
                    return;
                } else {
                    d(0);
                    return;
                }
            case 2:
                if (i2 == 8) {
                    c(2);
                    return;
                }
                if (i2 == 9) {
                    c(3);
                    return;
                } else if (i2 == 6) {
                    c(1);
                    return;
                } else {
                    c(0);
                    return;
                }
            case 3:
                for (wej wejVar : this.j) {
                }
                j(2);
                return;
            case 4:
                this.h.post(new Runnable(this) { // from class: wec
                    public final /* synthetic */ wed a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i5;
                        if (i7 == 0) {
                            wed wedVar = this.a;
                            wedVar.e(wedVar.b);
                            return;
                        }
                        if (i7 == 1) {
                            wed wedVar2 = this.a;
                            HashSet hashSet = new HashSet();
                            wcy.b(0, hashSet);
                            if (wedVar2.l()) {
                                wcy.b(1, hashSet);
                            }
                            wedVar2.f(new wfu(anaf.aj(hashSet)));
                            return;
                        }
                        if (i7 == 2) {
                            wed wedVar3 = this.a;
                            wedVar3.g(wedVar3.c);
                        } else if (i7 != 3) {
                            wed wedVar4 = this.a;
                            wedVar4.h(wedVar4.e);
                        } else {
                            wed wedVar5 = this.a;
                            wedVar5.i(wedVar5.d);
                        }
                    }
                });
                return;
            case 5:
                for (wej wejVar2 : this.j) {
                    if (wejVar2 != null) {
                        wejVar2.a();
                    }
                }
                InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.k;
                if ((inlineAuthCommandOuterClass$InlineAuthCommand.b & 8) != 0) {
                    aahd aahdVar = this.g;
                    apxf apxfVar = inlineAuthCommandOuterClass$InlineAuthCommand.f;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                    return;
                }
                return;
            case 6:
                this.h.post(new Runnable(this) { // from class: wec
                    public final /* synthetic */ wed a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i4;
                        if (i7 == 0) {
                            wed wedVar = this.a;
                            wedVar.e(wedVar.b);
                            return;
                        }
                        if (i7 == 1) {
                            wed wedVar2 = this.a;
                            HashSet hashSet = new HashSet();
                            wcy.b(0, hashSet);
                            if (wedVar2.l()) {
                                wcy.b(1, hashSet);
                            }
                            wedVar2.f(new wfu(anaf.aj(hashSet)));
                            return;
                        }
                        if (i7 == 2) {
                            wed wedVar3 = this.a;
                            wedVar3.g(wedVar3.c);
                        } else if (i7 != 3) {
                            wed wedVar4 = this.a;
                            wedVar4.h(wedVar4.e);
                        } else {
                            wed wedVar5 = this.a;
                            wedVar5.i(wedVar5.d);
                        }
                    }
                });
                return;
            case 7:
                this.h.post(new Runnable(this) { // from class: wec
                    public final /* synthetic */ wed a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i6;
                        if (i7 == 0) {
                            wed wedVar = this.a;
                            wedVar.e(wedVar.b);
                            return;
                        }
                        if (i7 == 1) {
                            wed wedVar2 = this.a;
                            HashSet hashSet = new HashSet();
                            wcy.b(0, hashSet);
                            if (wedVar2.l()) {
                                wcy.b(1, hashSet);
                            }
                            wedVar2.f(new wfu(anaf.aj(hashSet)));
                            return;
                        }
                        if (i7 == 2) {
                            wed wedVar3 = this.a;
                            wedVar3.g(wedVar3.c);
                        } else if (i7 != 3) {
                            wed wedVar4 = this.a;
                            wedVar4.h(wedVar4.e);
                        } else {
                            wed wedVar5 = this.a;
                            wedVar5.i(wedVar5.d);
                        }
                    }
                });
                return;
            case 8:
                this.h.post(new Runnable(this) { // from class: wec
                    public final /* synthetic */ wed a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i3;
                        if (i7 == 0) {
                            wed wedVar = this.a;
                            wedVar.e(wedVar.b);
                            return;
                        }
                        if (i7 == 1) {
                            wed wedVar2 = this.a;
                            HashSet hashSet = new HashSet();
                            wcy.b(0, hashSet);
                            if (wedVar2.l()) {
                                wcy.b(1, hashSet);
                            }
                            wedVar2.f(new wfu(anaf.aj(hashSet)));
                            return;
                        }
                        if (i7 == 2) {
                            wed wedVar3 = this.a;
                            wedVar3.g(wedVar3.c);
                        } else if (i7 != 3) {
                            wed wedVar4 = this.a;
                            wedVar4.h(wedVar4.e);
                        } else {
                            wed wedVar5 = this.a;
                            wedVar5.i(wedVar5.d);
                        }
                    }
                });
                return;
            default:
                final int i7 = 4;
                this.h.post(new Runnable(this) { // from class: wec
                    public final /* synthetic */ wed a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i72 = i7;
                        if (i72 == 0) {
                            wed wedVar = this.a;
                            wedVar.e(wedVar.b);
                            return;
                        }
                        if (i72 == 1) {
                            wed wedVar2 = this.a;
                            HashSet hashSet = new HashSet();
                            wcy.b(0, hashSet);
                            if (wedVar2.l()) {
                                wcy.b(1, hashSet);
                            }
                            wedVar2.f(new wfu(anaf.aj(hashSet)));
                            return;
                        }
                        if (i72 == 2) {
                            wed wedVar3 = this.a;
                            wedVar3.g(wedVar3.c);
                        } else if (i72 != 3) {
                            wed wedVar4 = this.a;
                            wedVar4.h(wedVar4.e);
                        } else {
                            wed wedVar5 = this.a;
                            wedVar5.i(wedVar5.d);
                        }
                    }
                });
                return;
        }
    }

    public void k(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        if (this.a != 0) {
            j(3);
            return;
        }
        this.k = inlineAuthCommandOuterClass$InlineAuthCommand;
        boolean z = inlineAuthCommandOuterClass$InlineAuthCommand.h.size() != 0 && ((aulq) inlineAuthCommandOuterClass$InlineAuthCommand.h.get(0)).pY(FirstTimeUnicornSignInRendererOuterClass.firstTimeUnicornSignInRenderer);
        boolean z2 = inlineAuthCommandOuterClass$InlineAuthCommand.h.size() != 0 && ((aulq) inlineAuthCommandOuterClass$InlineAuthCommand.h.get(0)).pY(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.passwordBiometricAuthRenderer);
        aulq aulqVar = inlineAuthCommandOuterClass$InlineAuthCommand.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer) || z || z2) {
            aulq aulqVar2 = inlineAuthCommandOuterClass$InlineAuthCommand.g;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            if (aulqVar2.pY(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer)) {
                aulq aulqVar3 = inlineAuthCommandOuterClass$InlineAuthCommand.g;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                this.c = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) aulqVar3.pX(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
            }
            if ((inlineAuthCommandOuterClass$InlineAuthCommand.b & 4) != 0) {
                aahd aahdVar = this.g;
                apxf apxfVar = inlineAuthCommandOuterClass$InlineAuthCommand.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
            if (inlineAuthCommandOuterClass$InlineAuthCommand.h.size() != 0) {
                aulq aulqVar4 = (aulq) inlineAuthCommandOuterClass$InlineAuthCommand.h.get(0);
                if (aulqVar4.pY(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.fingerprintAuthRenderer)) {
                    this.b = (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) aulqVar4.pX(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.fingerprintAuthRenderer);
                } else if (aulqVar4.pY(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer)) {
                    this.c = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) aulqVar4.pX(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
                } else if (aulqVar4.pY(FirstTimeUnicornSignInRendererOuterClass.firstTimeUnicornSignInRenderer)) {
                    this.d = (aqws) aulqVar4.pX(FirstTimeUnicornSignInRendererOuterClass.firstTimeUnicornSignInRenderer);
                } else if (aulqVar4.pY(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.passwordBiometricAuthRenderer)) {
                    this.e = (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) aulqVar4.pX(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.passwordBiometricAuthRenderer);
                }
                if (l()) {
                    j(6);
                    return;
                }
                if (this.d != null) {
                    j(8);
                    return;
                } else if (this.e != null) {
                    j(9);
                    return;
                } else {
                    j(7);
                    return;
                }
            }
            j(7);
            return;
        }
        if ((inlineAuthCommandOuterClass$InlineAuthCommand.b & 8) != 0) {
            aahd aahdVar2 = this.g;
            apxf apxfVar2 = inlineAuthCommandOuterClass$InlineAuthCommand.f;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.c(apxfVar2, null);
        }
        j(3);
    }

    public final boolean l() {
        return this.b != null && this.i.a();
    }

    public final void m() {
        this.l = true;
    }
}
