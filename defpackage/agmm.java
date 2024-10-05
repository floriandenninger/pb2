package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmm implements agmn {
    public final Context a;
    public final String b;
    public final yxn c;
    public final agsg d;
    public agml e;
    public final aadw f;
    private final zgj g;
    private final ajjz h;
    private final aisn i;
    private final azrw j;
    private final aksl k;
    private final File l;
    private File m;
    private File n;
    private File o;
    private final axzg p;

    public agmm(Context context, String str, zgj zgjVar, ajjz ajjzVar, aisn aisnVar, yxn yxnVar, aadw aadwVar, agsg agsgVar, azrw azrwVar, aksl akslVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        File file = new File(A(context, str), "data");
        this.a = context;
        this.b = str;
        this.g = zgjVar;
        this.h = ajjzVar;
        this.i = aisnVar;
        this.c = yxnVar;
        this.f = aadwVar;
        this.d = agsgVar;
        this.j = azrwVar;
        this.k = akslVar;
        this.p = axzgVar;
        this.l = file;
    }

    private static File A(Context context, String str) {
        zhq.m(str);
        File filesDir = context.getFilesDir();
        String str2 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str).length());
        sb.append("offline");
        sb.append(str2);
        sb.append(str);
        return new File(filesDir, sb.toString());
    }

    private static File B(Context context, String str, agsg agsgVar) {
        zhq.m(str);
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return null;
            }
            String str2 = File.separator;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str).length());
            sb.append("offline");
            sb.append(str2);
            sb.append(str);
            File file = new File(externalFilesDir, sb.toString());
            if (file.exists()) {
                return file;
            }
            String str3 = File.separator;
            String x = agsgVar.x(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 7 + String.valueOf(x).length());
            sb2.append("offline");
            sb2.append(str3);
            sb2.append(x);
            return new File(externalFilesDir, sb2.toString());
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static File C(yxn yxnVar, String str, String str2, agsg agsgVar) {
        yxnVar.getClass();
        zhq.m(str2);
        if (!yxnVar.k(str)) {
            return null;
        }
        File b = yxnVar.b(str);
        String str3 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 7 + String.valueOf(str2).length());
        sb.append("offline");
        sb.append(str3);
        sb.append(str2);
        File file = new File(b, sb.toString());
        if (file.exists()) {
            return file;
        }
        File b2 = yxnVar.b(str);
        String str4 = File.separator;
        String x = agsgVar.x(str2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 7 + String.valueOf(x).length());
        sb2.append("offline");
        sb2.append(str4);
        sb2.append(x);
        return new File(b2, sb2.toString());
    }

    private static void E(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                F(file);
                file.delete();
            } catch (IOException e) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                zga.n(valueOf.length() != 0 ? "[Offline] Failed to delete directory ".concat(valueOf) : new String("[Offline] Failed to delete directory "), e);
            }
        }
    }

    @Deprecated
    private static void F(File file) {
        if (!file.isDirectory()) {
            zga.l("[Offline] Failed to delete directory since the directory file is null or it is not a directory ");
            return;
        }
        if (file.getCanonicalPath().equals(file.getAbsolutePath())) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.getClass();
                    if (file2.isDirectory()) {
                        F(file2);
                    }
                    if (!file2.delete()) {
                        String valueOf = String.valueOf(file2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb.append("Failed to delete ");
                        sb.append(valueOf);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Error listing files for ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
    }

    private static final File G(File file, Uri uri) {
        String sb;
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        int lastIndexOf = uri2.lastIndexOf(File.separator);
        if (!uri2.startsWith("file") || lastIndexOf < 0 || lastIndexOf >= uri2.length() - 1) {
            int lastIndexOf2 = uri2.lastIndexOf(46);
            String substring = (lastIndexOf2 <= 0 || lastIndexOf2 <= lastIndexOf || lastIndexOf2 == uri2.length() + (-1)) ? "" : uri2.substring(lastIndexOf2);
            int hashCode = uri2.hashCode();
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 11);
            sb2.append(hashCode);
            sb2.append(substring);
            sb = sb2.toString();
        } else {
            sb = uri2.substring(lastIndexOf + 1);
        }
        return new File(file, sb);
    }

    public static void v(Context context, yxn yxnVar, String str, agsg agsgVar) {
        E(A(context, str));
        E(B(context, str, agsgVar));
        for (Map.Entry entry : yxnVar.h().entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                E(C(yxnVar, (String) entry.getKey(), str, agsgVar));
            }
        }
    }

    public static final void x(File file) {
        if (file.exists() && file.isDirectory()) {
            try {
                F(file);
                file.delete();
            } catch (IOException e) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("[Offline] Failed to delete directory ");
                sb.append(valueOf);
                zga.n(sb.toString(), e);
            }
        }
    }

    public static final avgg y(atqa atqaVar) {
        if ((atqaVar.b & 2) == 0) {
            return null;
        }
        avgg avggVar = atqaVar.d;
        return avggVar == null ? avgg.a : avggVar;
    }

    private final File z(String str) {
        return new File(e(str), "thumbnails");
    }

    public final aami a(String str, aami aamiVar) {
        ArrayList arrayList = new ArrayList();
        for (aamh aamhVar : aamiVar.a) {
            File f = f(str, aamhVar.a());
            if (f.exists()) {
                arrayList.add(new aamh(Uri.fromFile(f), aamhVar.a, aamhVar.b));
            }
        }
        return new aami(arrayList);
    }

    public final aami b(String str, aami aamiVar) {
        ArrayList arrayList = new ArrayList();
        for (aamh aamhVar : aamiVar.a) {
            File m = m(str, aamhVar.a());
            if (m.exists()) {
                arrayList.add(new aamh(Uri.fromFile(m), aamhVar.a, aamhVar.b));
            }
        }
        return new aami(arrayList);
    }

    public final aami c(String str, aami aamiVar) {
        ArrayList arrayList = new ArrayList();
        for (aamh aamhVar : aamiVar.a) {
            File i = i(str, aamhVar.a());
            if (i.exists()) {
                arrayList.add(new aamh(Uri.fromFile(i), aamhVar.a, aamhVar.b));
            }
        }
        aami aamiVar2 = new aami(arrayList);
        return aamiVar2.a.isEmpty() ? aamiVar : aamiVar2;
    }

    public final aami d(String str, aami aamiVar) {
        aami b = b(str, aamiVar);
        return b.a.isEmpty() ? aamiVar : b;
    }

    public final File e(String str) {
        if (this.m == null) {
            this.m = new File(this.l, "channels");
        }
        return new File(this.m, str);
    }

    public final File f(String str, Uri uri) {
        return G(z(str), uri);
    }

    public final File g(String str) {
        if (this.o == null) {
            this.o = new File(this.l, "playlists");
        }
        return new File(this.o, str);
    }

    public final File h(String str) {
        zhq.m(str);
        return new File(g(str), "thumbnails");
    }

    public final File i(String str, Uri uri) {
        return G(h(str), uri);
    }

    public final File j(String str, Uri uri) {
        return G(n(str), uri);
    }

    public final File k(String str) {
        zhq.m(str);
        if (this.n == null) {
            this.n = new File(this.l, "videos");
        }
        return new File(this.n, str);
    }

    public final File l(String str) {
        return new File(k(str), "thumbnails");
    }

    public final File m(String str, Uri uri) {
        return G(l(str), uri);
    }

    public final File n(String str) {
        return new File(k(str), "tmpthumbnails");
    }

    public final File o(boolean z, String str) {
        File b;
        atoy n = agzr.n(this.f);
        if (n == null || !n.h) {
            return D(z, str);
        }
        try {
            if (z) {
                b = this.a.getExternalFilesDir(null);
            } else {
                b = this.c.b(str);
            }
            if (b == null) {
                r(z, "MIGRATION_ERROR_OUT");
                return null;
            }
            String str2 = File.separator;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str3).length());
            sb.append("offline");
            sb.append(str2);
            sb.append(str3);
            File file = new File(b, sb.toString());
            String x = this.d.x(this.b);
            boolean z2 = !x.equals(this.b);
            if (!file.exists()) {
                if (z2 || this.d.M(this.b, this.g.a())) {
                    return D(z, str);
                }
                r(z, "MIGRATION_ERROR_OUT");
                return null;
            }
            r(z, "MIGRATION_INITIALIZED");
            if (!z2) {
                x = this.g.a();
                if (!this.d.M(this.b, x)) {
                    r(z, "MIGRATION_IDENTITY_NONCE_MAPPING_FAILED");
                    return D(z, str);
                }
            }
            String str4 = File.separator;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 7 + String.valueOf(x).length());
            sb2.append("offline");
            sb2.append(str4);
            sb2.append(x);
            try {
                if (file.renameTo(new File(b, sb2.toString()))) {
                    r(z, "MIGRATION_RENAME_SUCCESS");
                } else {
                    r(z, "MIGRATION_RENAME_FAILED");
                }
            } catch (NullPointerException unused) {
                r(z, "MIGRATION_RENAME_NULL_POINTER_EXCEPTION");
            } catch (SecurityException unused2) {
                r(z, "MIGRATION_RENAME_SECURITY_EXCEPTION");
            }
            return D(z, str);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused3) {
            return null;
        }
    }

    @Override // defpackage.agmn
    public final String p(String str, SubtitleTrack subtitleTrack) {
        zhq.m(str);
        subtitleTrack.getClass();
        yjk.e();
        ykm c = ykm.c();
        this.i.b(new aism(subtitleTrack), c);
        File file = new File(k(str), "subtitles");
        String c2 = subtitleTrack.c();
        int hashCode = subtitleTrack.hashCode();
        StringBuilder sb = new StringBuilder(c2.length() + 12);
        sb.append(c2);
        sb.append('_');
        sb.append(hashCode);
        File file2 = new File(file, sb.toString());
        anaf.t(file2);
        anaf.u((byte[]) c.get(), file2);
        return file2.getAbsolutePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(Uri uri, File file) {
        Boolean bool;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45356751L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45356751L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45356751L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue() && "file".equals(uri.getScheme())) {
            return;
        }
        anaf.t(file);
        ykm c = ykm.c();
        ((afvq) this.j.get()).c(uri, c);
        long longValue = ((Long) c.get()).longValue();
        File parentFile = file.getParentFile();
        if (parentFile == null || wbs.aB(this.f.b(), parentFile) < longValue) {
            throw new agtx(file.length());
        }
        ykm c2 = ykm.c();
        this.h.m(uri, c2);
        try {
            byte[] bArr = (byte[]) c2.get(30L, TimeUnit.SECONDS);
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (TimeoutException e) {
            throw new aeep(e);
        }
    }

    protected final void r(boolean z, String str) {
        aksl akslVar = this.k;
        if (akslVar != null) {
            ((viz) akslVar.i.get()).b(true != z ? "MIGRATION_LOCATION_SDCARD" : "MIGRATION_LOCATION_PRIMARY", str);
        }
    }

    public final void s(agng agngVar) {
        avgg y;
        yjk.e();
        atqa atqaVar = agngVar.l;
        if (atqaVar == null || (y = y(atqaVar)) == null) {
            return;
        }
        for (aamh aamhVar : new aami(ahbj.j(y, Collections.singletonList(480))).a) {
            q(aamhVar.a(), i(agngVar.a, aamhVar.a()));
        }
    }

    public final void t(String str, avgg avggVar) {
        yjk.e();
        ArrayList arrayList = new ArrayList();
        apwy b = this.f.b();
        if ((b.b & 65536) != 0) {
            atoy atoyVar = b.m;
            if (atoyVar == null) {
                atoyVar = atoy.a;
            }
            arrayList.addAll(atoyVar.c);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(240);
            arrayList.add(480);
        }
        for (aamh aamhVar : new aami(ahbj.j(avggVar, arrayList)).a) {
            q(aamhVar.a(), m(str, aamhVar.a()));
        }
    }

    @Override // defpackage.agmn
    public final void u(agnb agnbVar) {
        yjk.e();
        String str = agnbVar.a;
        atos atosVar = agnbVar.d.c;
        if (atosVar == null) {
            atosVar = atos.a;
        }
        avgg avggVar = atosVar.d;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        if (a(str, new aami(avggVar)).a.isEmpty()) {
            String str2 = agnbVar.a;
            zhq.m(str2);
            x(z(str2));
            yjk.e();
            atos atosVar2 = agnbVar.d.c;
            if (atosVar2 == null) {
                atosVar2 = atos.a;
            }
            avgg avggVar2 = atosVar2.d;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            for (aamh aamhVar : new aami(ahbj.j(avggVar2, Collections.singletonList(240))).a) {
                q(aamhVar.a(), f(agnbVar.a, aamhVar.a()));
            }
        }
    }

    public final boolean w() {
        if (!this.d.P()) {
            return false;
        }
        return this.c.k(this.d.y(this.c));
    }

    private final File D(boolean z, String str) {
        if (!z) {
            File C = C(this.c, str, this.b, this.d);
            if (C != null) {
                return new File(C, "streams");
            }
            return null;
        }
        File B = B(this.a, this.b, this.d);
        if (B != null) {
            return new File(B, "streams");
        }
        return null;
    }
}
