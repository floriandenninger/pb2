package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import dalvik.system.DexClassLoader;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebe {
    public final Context a;
    public ExecutorService b;
    public DexClassLoader c;
    public byte[] d;
    public final boolean h;
    public eac k;
    public eay o;
    private final Map p;
    public volatile pvh e = null;
    public volatile boolean f = false;
    public Future g = null;
    public volatile dvo i = null;
    public Future j = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public ebe(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.p = new HashMap();
        if (this.o != null) {
            return;
        }
        this.o = new eay(context);
    }

    public static final void d(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            String.format("File %s not found. No need for deletion", file.getAbsolutePath());
        }
    }

    public static final void i(String str) {
        d(new File(str));
    }

    public final int a() {
        if (this.k == null) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (eac.c == null) {
                synchronized (eac.class) {
                    if (eac.c == null) {
                        eac.c = new Random();
                    }
                }
            }
            return eac.c.nextInt();
        }
    }

    public final pvh b() {
        if (!this.f) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        Future future = this.g;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.g = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.g.cancel(true);
            }
        }
        return this.e;
    }

    public final Method c(String str, String str2) {
        eck eckVar = (eck) this.p.get(new Pair(str, str2));
        if (eckVar == null) {
            return null;
        }
        if (eckVar.d != null) {
            return eckVar.d;
        }
        try {
            if (eckVar.f.await(2L, TimeUnit.SECONDS)) {
                return eckVar.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        if (this.m) {
            Future<?> submit = this.b.submit(new ebc(this, i));
            if (i == 0) {
                this.j = submit;
            }
        }
    }

    public final void f(File file) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1629828815138"));
        if (!file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1629828815138"));
        if (file3.exists()) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                d(file2);
                return;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        d(file2);
                        try {
                            fileInputStream2.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    try {
                        try {
                            dvq dvqVar = (dvq) aonm.parseFrom(dvq.a, bArr, aomw.a());
                            if ("1629828815138".equals(new String(dvqVar.e.I())) && Arrays.equals(dvqVar.d.I(), dzi.c(dvqVar.c.I())) && Arrays.equals(dvqVar.f.I(), Build.VERSION.SDK.getBytes())) {
                                byte[] a = eaq.a(this.d, new String(dvqVar.c.I()));
                                file3.createNewFile();
                                fileOutputStream = new FileOutputStream(file3);
                                try {
                                    fileOutputStream.write(a, 0, a.length);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStream.close();
                                        return;
                                    } catch (IOException unused3) {
                                        return;
                                    }
                                } catch (eap | IOException | NoSuchAlgorithmException unused4) {
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                            return;
                                        } catch (IOException unused6) {
                                            return;
                                        }
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused7) {
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException unused8) {
                                        throw th;
                                    }
                                }
                            }
                            d(file2);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused9) {
                            }
                        } catch (IOException unused10) {
                        }
                    } catch (NullPointerException unused11) {
                        fileInputStream2.close();
                    }
                } catch (eap | IOException | NoSuchAlgorithmException unused12) {
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (eap | IOException | NoSuchAlgorithmException unused13) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final void g(String str, String str2, Class... clsArr) {
        if (this.p.containsKey(new Pair(str, str2))) {
            return;
        }
        this.p.put(new Pair(str, str2), new eck(this, str, str2, clsArr));
    }

    public final void h(File file) {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1629828815138"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1629828815138"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        d(file3);
                        return;
                    }
                    System.out.print("test");
                    System.out.print("test");
                    System.out.print("test");
                    aone createBuilder = dvq.a.createBuilder();
                    aomf x = aomf.x(Build.VERSION.SDK.getBytes());
                    createBuilder.copyOnWrite();
                    dvq dvqVar = (dvq) createBuilder.instance;
                    dvqVar.b |= 8;
                    dvqVar.f = x;
                    aomf x2 = aomf.x("1629828815138".getBytes());
                    createBuilder.copyOnWrite();
                    dvq dvqVar2 = (dvq) createBuilder.instance;
                    dvqVar2.b |= 4;
                    dvqVar2.e = x2;
                    byte[] bytes = eaq.b(this.d, bArr).getBytes();
                    aomf x3 = aomf.x(bytes);
                    createBuilder.copyOnWrite();
                    dvq dvqVar3 = (dvq) createBuilder.instance;
                    dvqVar3.b = 1 | dvqVar3.b;
                    dvqVar3.c = x3;
                    aomf x4 = aomf.x(dzi.c(bytes));
                    createBuilder.copyOnWrite();
                    dvq dvqVar4 = (dvq) createBuilder.instance;
                    dvqVar4.b = 2 | dvqVar4.b;
                    dvqVar4.d = x4;
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] byteArray = ((dvq) createBuilder.build()).toByteArray();
                        fileOutputStream.write(byteArray, 0, byteArray.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        d(file3);
                    } catch (eap | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        d(file3);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        d(file3);
                        throw th;
                    }
                } catch (eap | IOException | NoSuchAlgorithmException unused9) {
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (eap | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
