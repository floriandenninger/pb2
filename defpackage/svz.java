package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class svz implements szc {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public final Map b = DesugarCollections.synchronizedMap(new HashMap());
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final sxd d;
    public final String e;
    public final String f;
    public final Context g;
    public final Handler h;
    private final ScheduledExecutorService j;
    private boolean k;

    public svz(sxd sxdVar, String str, Context context) {
        DesugarCollections.synchronizedMap(new HashMap());
        this.h = new Handler(Looper.getMainLooper());
        this.e = "http";
        this.f = str;
        this.d = sxdVar;
        this.j = Executors.newSingleThreadScheduledExecutor();
        this.g = context;
    }

    private final synchronized void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.scheduleAtFixedRate(new Runnable() { // from class: svx
            @Override // java.lang.Runnable
            public final void run() {
                svz svzVar = svz.this;
                try {
                    aone createBuilder = awpc.a.createBuilder();
                    HashSet<String> hashSet = new HashSet();
                    hashSet.addAll(svzVar.a.keySet());
                    hashSet.addAll(svzVar.b.keySet());
                    for (String str : hashSet) {
                        aone createBuilder2 = awpd.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        awpd awpdVar = (awpd) createBuilder2.instance;
                        str.getClass();
                        awpdVar.b = 1 | awpdVar.b;
                        awpdVar.c = str;
                        if (svzVar.c.containsKey(str)) {
                            String str2 = (String) svzVar.c.get(str);
                            createBuilder2.copyOnWrite();
                            awpd awpdVar2 = (awpd) createBuilder2.instance;
                            str2.getClass();
                            awpdVar2.b = 2 | awpdVar2.b;
                            awpdVar2.d = str2;
                        }
                        createBuilder.copyOnWrite();
                        awpc awpcVar = (awpc) createBuilder.instance;
                        awpd awpdVar3 = (awpd) createBuilder2.build();
                        awpdVar3.getClass();
                        aony aonyVar = awpcVar.b;
                        if (!aonyVar.c()) {
                            awpcVar.b = aonm.mutableCopy(aonyVar);
                        }
                        awpcVar.b.add(awpdVar3);
                    }
                    byte[] byteArray = ((awpc) createBuilder.build()).toByteArray();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(svzVar.e, svzVar.f, 5000, "/stateless_manifest").openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    bufferedOutputStream.write(byteArray);
                    bufferedOutputStream.close();
                    httpURLConnection.connect();
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] c = anbt.c(inputStream);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            httpURLConnection.disconnect();
                            awoz awozVar = (awoz) aonm.parseFrom(awoz.a, c);
                            for (awpa awpaVar : awozVar.b) {
                                String str3 = awpaVar.b;
                                svzVar.c.put(str3, awpaVar.e);
                                int z = awxr.z(awpaVar.d);
                                if (z == 0) {
                                    z = 1;
                                }
                                int i = z - 1;
                                if (i == 1) {
                                    svzVar.a.put(str3, awpaVar.c.I());
                                } else if (i == 2) {
                                    awpaVar.c.I();
                                }
                                int z2 = awxr.z(awpaVar.d);
                                if (z2 != 0 && z2 == 2) {
                                    String valueOf = String.valueOf(str3);
                                    svzVar.d.b(valueOf.length() != 0 ? "/system/template/".concat(valueOf) : new String("/system/template/"), awpaVar.c.I());
                                }
                            }
                            final Context context = svzVar.g;
                            for (awpb awpbVar : awozVar.c) {
                                final String str4 = awpbVar.b;
                                final String str5 = awpbVar.c;
                                svzVar.h.post(new Runnable() { // from class: svw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Context context2 = context;
                                        String str6 = str4;
                                        String str7 = str5;
                                        String d = amkq.d(str6);
                                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 30 + String.valueOf(str7).length());
                                        sb.append("Elements Dev Server Error\n\n");
                                        sb.append(d);
                                        sb.append(" : ");
                                        sb.append(str7);
                                        Toast.makeText(context2, sb.toString(), 1).show();
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                } catch (IOException e) {
                    Log.w("DevServerTemplateLoader", "Error talking to ElementsDevServer", e);
                }
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    public final byte[] a(String str) {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = new URL(this.e, this.f, 5000, str).openConnection().getInputStream();
            try {
                byte[] c = anbt.c(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return c;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    @Override // defpackage.szc
    public final byte[] b(String str) {
        byte[] bArr;
        c();
        try {
            byte[] bArr2 = (byte[]) this.a.get(str);
            if (bArr2 != null) {
                return bArr2;
            }
            String valueOf = String.valueOf(str);
            final String concat = valueOf.length() != 0 ? "/template/".concat(valueOf) : new String("/template/");
            if (Looper.getMainLooper().isCurrentThread()) {
                try {
                    bArr = (byte[]) this.j.submit(new Callable() { // from class: svy
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return svz.this.a(concat);
                        }
                    }).get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IOException("Error talking to DevServer", e);
                }
            } else {
                bArr = a(concat);
            }
            this.a.put(str, bArr);
            return bArr;
        } catch (IOException e2) {
            Log.w("DevServerTemplateLoader", "Error talking to ElementsDevServer", e2);
            return null;
        }
    }
}
