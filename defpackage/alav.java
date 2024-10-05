package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alav extends albk {
    private static final amru a = amru.v(1000L, 5000L, 30000L, 60000L, 300000L);
    private final alaj b;
    private final axze c;

    public alav(aaea aaeaVar, alaj alajVar, axze axzeVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_CLEANUP, akybVar, axzeVar, alepVar, null, null, null);
        this.b = alajVar;
        this.c = axzeVar;
    }

    private final anhy s(akzs akzsVar, boolean z) {
        this.b.c();
        int i = 0;
        if ((akzsVar.d & 1) != 0) {
            File file = new File(akzsVar.al);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i2 = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        if (!file2.delete()) {
                            String.valueOf(String.valueOf(file2)).length();
                            i2 = 1;
                        }
                        i++;
                    }
                    i = i2;
                } else {
                    String.valueOf(String.valueOf(file)).length();
                    i = 1;
                }
                if (i == 0) {
                    i = !file.delete() ? 1 : 0;
                }
            }
        }
        if (akzsVar.T.size() != 0) {
            Iterator it = akzsVar.T.iterator();
            while (it.hasNext()) {
                File file3 = new File((String) it.next());
                if (file3.exists() && !file3.delete()) {
                    String.valueOf(String.valueOf(file3)).length();
                    i = 1;
                }
            }
        }
        if (i != 0) {
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_FILE_DELETION_FAILED;
            akzp akzpVar = akzsVar.an;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            return anaf.O(t(alepVar.o(avtqVar, akzpVar, a, this.c), z));
        }
        return anaf.O(t(this.d.d(), z));
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return null;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.an;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        return s(akzsVar, true);
    }

    @Override // defpackage.aldq
    public final anhy d(String str, akwm akwmVar) {
        try {
            akzs b = akwmVar.b(str);
            if (b == null) {
                return anaf.N(akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND));
            }
            return s(b, false);
        } catch (akwn e) {
            return anaf.N(e);
        }
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return agbc.p;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "CacheCleanupTask";
    }

    @Override // defpackage.albk
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        return true;
    }

    @Override // defpackage.aldq
    public final boolean j() {
        return true;
    }
}
