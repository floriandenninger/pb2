package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class egr implements Runnable {
    public final /* synthetic */ ehb a;
    private final /* synthetic */ int b;

    public /* synthetic */ egr(ehb ehbVar, int i) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, char[] cArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, float[] fArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, int[] iArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, short[] sArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, boolean[] zArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, byte[][] bArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, char[][] cArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, float[][] fArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, int[][] iArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, short[][] sArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, boolean[][] zArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, byte[][][] bArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, char[][][] cArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, int[][][] iArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, short[][][] sArr) {
        this.b = i;
        this.a = ehbVar;
    }

    public egr(ehb ehbVar, int i, boolean[][][] zArr) {
        this.b = i;
        this.a = ehbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((akpv) this.a.W.get()).b();
                return;
            case 1:
                this.a.e(false);
                return;
            case 2:
                ehb ehbVar = this.a;
                ((eni) ehbVar.aP.get()).f(((elf) ehbVar.av.get()).a());
                return;
            case 3:
                ((acpl) this.a.aG.get()).a();
                return;
            case 4:
                ((ahzx) this.a.aE.get()).a((ahzs) this.a.aF.get());
                this.a.c();
                return;
            case 5:
                ((akrk) this.a.u.get()).c();
                this.a.c();
                return;
            case 6:
                esv.I(this.a.bd);
                dwy.a(this.a.bd);
                return;
            case 7:
                ((ysl) this.a.Q.get()).c();
                this.a.c();
                return;
            case 8:
                ((jkj) this.a.F.get()).b();
                return;
            case 9:
                ((agdj) this.a.H.get()).a();
                return;
            case 10:
                ((aktr) this.a.aK.get()).a();
                return;
            case 11:
                ehb ehbVar2 = this.a;
                new yxm(ehbVar2.bd, (yxn) ehbVar2.as.get(), (ypa) ehbVar2.h.get()).a();
                ehbVar2.c();
                this.a.c();
                return;
            case 12:
                ((aado) this.a.ak.get()).a();
                this.a.c();
                return;
            case 13:
                aabv.d((aawl) this.a.C.get());
                wbs.i((ylf) this.a.ap.get(), (aadw) this.a.au.get());
                return;
            case 14:
                afze.e((aaea) this.a.at.get(), (ylf) this.a.ap.get(), (shf) this.a.aH.get(), 0, false);
                aaea aaeaVar = (aaea) this.a.at.get();
                ylf ylfVar = (ylf) this.a.ap.get();
                azrw azrwVar = this.a.am;
                azrwVar.getClass();
                afzb.c(aaeaVar, ylfVar, new egv(azrwVar, 0));
                this.a.c();
                return;
            case 15:
                ((acql) this.a.A.get()).c();
                return;
            case 16:
                if (evr.aM((aadw) this.a.au.get())) {
                    ((aadd) this.a.aL.get()).b();
                    return;
                }
                return;
            case 17:
                this.a.aD.get();
                return;
            case 18:
                if (((ysy) this.a.aq.get()).n()) {
                    ComponentName componentName = new ComponentName(this.a.bd, "com.google.android.youtube.ManageNetworkUsageActivity");
                    PackageManager packageManager = this.a.bd.getPackageManager();
                    if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                        packageManager.setComponentEnabledSetting(componentName, 1, 1);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                yrx yrxVar = (yrx) this.a.aQ.get();
                if (yrxVar.a()) {
                    ajyw ajywVar = (ajyw) this.a.B.get();
                    for (Uri uri : yrxVar.b) {
                        ajywVar.c(uri);
                    }
                    return;
                }
                return;
            default:
                if (YouTubeBackupAgent.f((zfy) this.a.aw.get())) {
                    YouTubeBackupAgent.g(this.a.bd);
                    ehb ehbVar3 = this.a;
                    ehbVar3.b = YouTubeBackupAgent.a(ehbVar3.bd);
                    return;
                }
                return;
        }
    }
}
