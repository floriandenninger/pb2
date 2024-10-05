package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akst {
    public final aktg a;
    public aone b;

    public akst(aktg aktgVar) {
        this.a = aktgVar;
    }

    public static void b(aktg aktgVar, azrw azrwVar) {
        apfe apfeVar;
        int i = akso.a;
        List<File> p = akbc.p(aktgVar, akth.ANR);
        File file = new File(aktgVar.b.getCacheDir(), akth.ANR.d);
        try {
            if (file.exists()) {
                p.add(file);
            }
        } catch (SecurityException e) {
            akbc.r(String.format("AnrJV2 !v1journal '%s'", file), e);
        }
        for (File file2 : p) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    apfeVar = (apfe) aonm.parseFrom(apfe.a, fileInputStream, aomw.b());
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                    break;
                }
            } catch (Exception e2) {
                akbc.r(String.format("AnrJV2 !read '%s'", file2), e2);
                apfeVar = null;
            }
            if (apfeVar != null) {
                String.valueOf(String.valueOf(apfeVar)).length();
                arpn a = arpp.a();
                a.copyOnWrite();
                ((arpp) a.instance).ca(apfeVar);
                ((acpl) azrwVar.get()).c((arpp) a.build());
            }
            akbc.q(file2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Thread thread) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            if (sb.length() + stackTraceElement.toString().length() > 2000) {
                break;
            }
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b = null;
        akbc.q(akbc.t(this.a));
    }
}
