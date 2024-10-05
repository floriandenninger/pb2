package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alcs extends albk {
    private final alaj a;
    private final albx b;
    private final aleh c;
    private final akwg e;
    private final axze f;

    public alcs(aaea aaeaVar, alaj alajVar, akwg akwgVar, akyb akybVar, axze axzeVar, alep alepVar, albx albxVar, aleh alehVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_SOURCE_VIDEO_CHECK, akybVar, axzeVar, alepVar, null, null, null);
        this.a = alajVar;
        this.e = akwgVar;
        this.f = axzeVar;
        this.b = albxVar;
        this.c = alehVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.c;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.aj;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        this.e.e();
        this.a.d(2, Uri.parse(akzsVar.g), null).f(null);
        return anaf.O(t(this.d.d(), true));
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.g;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "SourceFileCheckerTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 4) == 0 || (i & 64) == 0) ? false : true;
    }

    @Override // defpackage.albk
    public final akwp k(Throwable th, akzs akzsVar, boolean z) {
        if (th instanceof FileNotFoundException) {
            axze axzeVar = this.f;
            akzq a = akzq.a(akzsVar.l);
            if (a == null) {
                a = akzq.UNKNOWN_UPLOAD;
            }
            axzeVar.f("SourceFileCheckerTask File Not Found", th, a);
            return t(this.d.c(this.b.a(akzsVar)), z);
        }
        return super.k(th, akzsVar, z);
    }
}
