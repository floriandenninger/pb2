package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alay extends alct {
    public static final /* synthetic */ int c = 0;
    private static final Duration e = Duration.ofSeconds(2);
    private static final Duration f = Duration.ofSeconds(1);
    final Duration a;
    final Duration b;
    private final Context g;
    private final shf h;
    private final aaea i;
    private final akym k;
    private final alej l;
    private final akxh m;
    private final akyb n;

    public alay(Context context, shf shfVar, aaea aaeaVar, akym akymVar, alej alejVar, axze axzeVar, akxh akxhVar, akyb akybVar, albx albxVar, alaj alajVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(avtr.UPLOAD_PROCESSOR_TYPE_COPY_FILE, shfVar, aaeaVar, axzeVar, akybVar, albxVar, alajVar, alepVar, null, null, null);
        this.a = e;
        this.b = f;
        this.g = context;
        this.h = shfVar;
        this.i = aaeaVar;
        this.k = akymVar;
        this.l = alejVar;
        this.m = akxhVar;
        this.n = akybVar;
    }

    private static void s(File file, long j) {
        if (file.getFreeSpace() < j) {
            throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INSUFFICIENT_SPACE_TO_START);
        }
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.k;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.A;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0243  */
    @Override // defpackage.albk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy c(java.lang.String r43, defpackage.akwm r44, defpackage.akzs r45) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alay.c(java.lang.String, akwm, akzs):anhy");
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return agbc.q;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "CopyFileTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return false;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 2) == 0 || (i & 64) == 0) ? false : true;
    }
}
