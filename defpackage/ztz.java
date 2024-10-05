package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ztz {
    File a;
    File b;
    public final Context c;
    public final Object d = new Object();
    public final List e = new ArrayList();
    public final Set f = new HashSet();
    public final boolean g;
    public zuf h;
    public boolean i;
    private final ysl j;
    private final Set k;
    private final zty l;
    private volatile boolean m;

    public ztz(Context context, ysl yslVar, zty ztyVar, boolean z, final zuf zufVar) {
        this.c = context;
        yslVar.getClass();
        this.j = yslVar;
        ztyVar.getClass();
        this.l = ztyVar;
        this.g = z;
        this.k = new HashSet();
        if (z) {
            this.h = zufVar;
            zufVar.c.execute(new Runnable() { // from class: zub
                @Override // java.lang.Runnable
                public final void run() {
                    zuf zufVar2 = zuf.this;
                    yjk.e();
                    zufVar2.a = new zom(zufVar2.b, 1, zoz.b, zoz.i, zufVar2.d);
                }
            });
        }
    }

    static File a(Context context) {
        File file = new File(context.getFilesDir(), zoz.a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(Context context) {
        File file = new File(context.getFilesDir(), zoz.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return str.replace("://", "/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private final void j(Context context, File file) {
        AssetManager assets = context.getAssets();
        try {
            String[] list = assets.list("kazoo");
            if (list == null || (list.length) == 0) {
                return;
            }
            for (String str : list) {
                String path = new File("kazoo", str).getPath();
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                        InputStream open = assets.open(path);
                        if (this.g) {
                            byte[] c = anbt.c(open);
                            zuf zufVar = this.h;
                            if (zufVar != null) {
                                zufVar.a(str, c, new zue() { // from class: ztv
                                    @Override // defpackage.zue
                                    public final void a(boolean z) {
                                        if (z) {
                                            return;
                                        }
                                        zga.b("Error writing data to disk cache.");
                                    }
                                });
                            } else {
                                zga.b("Error saving assert, null cache wrapper.");
                            }
                        } else {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            e(open, fileOutputStream);
                            open.close();
                            fileOutputStream.close();
                        }
                    } catch (IOException | SecurityException e) {
                        String valueOf = String.valueOf(str);
                        zga.d(valueOf.length() != 0 ? "Error saving asset: ".concat(valueOf) : new String("Error saving asset: "), e);
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    private final void k(String str) {
        if (this.i) {
            zga.c("PresetFilterDebug", str);
        }
    }

    private final void l(File file) {
        synchronized (this.d) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    l(file2);
                } else {
                    this.e.add(file2.getAbsolutePath());
                }
            }
        }
    }

    public final String d() {
        return String.valueOf(a(this.c).getAbsolutePath()).concat("/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Set set) {
        String lastPathSegment;
        yjk.e();
        g();
        if (set == null || set.isEmpty()) {
            return;
        }
        String valueOf = String.valueOf(set);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("fetchNewAssets: ");
        sb.append(valueOf);
        k(sb.toString());
        String.valueOf(String.valueOf(set)).length();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            if (this.g) {
                String c = c(str);
                String path = new File(this.b.getPath(), c).getPath();
                this.f.add(c);
                lastPathSegment = path;
            } else {
                lastPathSegment = Uri.parse(str).getLastPathSegment();
            }
            synchronized (this.d) {
                if (this.e.contains(lastPathSegment)) {
                    this.l.d(str, lastPathSegment);
                    String valueOf2 = String.valueOf(lastPathSegment);
                    k(valueOf2.length() != 0 ? "onAssetReady already available: ".concat(valueOf2) : new String("onAssetReady already available: "));
                } else if (!this.k.contains(str)) {
                    String valueOf3 = String.valueOf(str);
                    if (valueOf3.length() != 0) {
                        "httpRequestQueue.add: ".concat(valueOf3);
                    }
                    this.j.a(new ztx(this, str, new cnk() { // from class: ztt
                        @Override // defpackage.cnk
                        public final void kY(cnq cnqVar) {
                            cnh cnhVar;
                            String valueOf4 = String.valueOf(str);
                            zga.b(valueOf4.length() != 0 ? "Error fetching asset: ".concat(valueOf4) : new String("Error fetching asset: "));
                            if (cnqVar == null || (cnhVar = cnqVar.b) == null) {
                                return;
                            }
                            int i = cnhVar.a;
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Response status code: ");
                            sb2.append(i);
                            zga.b(sb2.toString());
                        }
                    }, lastPathSegment, str));
                    this.k.add(str);
                }
            }
        }
    }

    public final void g() {
        yjk.e();
        if (this.m) {
            return;
        }
        if (this.g) {
            Context context = this.c;
            yjk.e();
            File b = b(context);
            j(context, b);
            this.b = b;
        } else {
            Context context2 = this.c;
            yjk.e();
            File a = a(context2);
            j(context2, a);
            this.a = a;
        }
        synchronized (this.d) {
            if (this.g) {
                l(this.b);
            } else {
                try {
                    for (File file : this.a.listFiles()) {
                        if (file.isFile()) {
                            this.e.add(file.getName());
                        }
                    }
                } catch (SecurityException e) {
                    zga.d("Error finding built-in assets: ", e);
                }
            }
        }
        this.j.c();
        this.m = true;
    }

    public final void h(String str, String str2) {
        synchronized (this.d) {
            this.e.add(str2);
            this.l.d(str, str2);
            String valueOf = String.valueOf(str2);
            k(valueOf.length() != 0 ? "onAssetReady new: ".concat(valueOf) : new String("onAssetReady new: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String[] i() {
        String[] strArr;
        yjk.e();
        g();
        synchronized (this.d) {
            strArr = new String[this.e.size()];
            this.e.toArray(strArr);
        }
        return strArr;
    }
}
