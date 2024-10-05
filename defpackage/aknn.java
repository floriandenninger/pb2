package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aknn implements aknq {
    public final String a;
    public final File b;
    public final AtomicInteger c = new AtomicInteger(0);
    private final Executor d;
    private anhy e;

    public aknn(String str, Executor executor) {
        this.a = str;
        this.d = executor;
        this.b = new File(str);
        new aknk(this, 1);
    }

    public static void d(List list) {
        Process exec = Runtime.getRuntime().exec((String[]) list.toArray(new String[list.size()]));
        if (exec.waitFor() == 0) {
            return;
        }
        String str = new String(anbt.c(exec.getErrorStream()));
        String valueOf = String.valueOf(list);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + str.length());
        sb.append("Could not execute ");
        sb.append(valueOf);
        sb.append(" because: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    @Override // defpackage.aknq
    public final anhy a(final akne akneVar, final akoa akoaVar) {
        return anfq.h(anaf.T(new anfy() { // from class: aknm
            @Override // defpackage.anfy
            public final anhy a() {
                aknn aknnVar = aknn.this;
                akne akneVar2 = akneVar;
                aknnVar.e();
                File file = new File(aknnVar.a, ahbx.F(akneVar2));
                if (!file.exists() || !file.canRead()) {
                    return anaf.O(null);
                }
                try {
                    return anaf.O(anaf.v(file));
                } catch (FileNotFoundException unused) {
                    return anaf.O(null);
                }
            }
        }, this.d), new amml() { // from class: akng
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                akne akneVar2 = akne.this;
                akoa akoaVar2 = akoaVar;
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    String valueOf = String.valueOf(akneVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    sb.append("Could not find any value for: ");
                    sb.append(valueOf);
                    throw new aknf(sb.toString());
                }
                try {
                    return akoaVar2.a(bArr);
                } catch (IOException e) {
                    String valueOf2 = String.valueOf(akneVar2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
                    sb2.append("An error occurred while unmarshalling the value for");
                    sb2.append(valueOf2);
                    throw new IllegalArgumentException(sb2.toString(), e);
                }
            }
        }, angq.a);
    }

    @Override // defpackage.aknq
    public final anhy b(final akne akneVar, final Object obj, final aknz aknzVar) {
        return anfq.h(anaf.T(new anfy() { // from class: akni
            @Override // defpackage.anfy
            public final anhy a() {
                return anaf.O(aknz.this.a(obj));
            }
        }, this.d), new amml() { // from class: aknj
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                aknn aknnVar = aknn.this;
                akne akneVar2 = akneVar;
                byte[] bArr = (byte[]) obj2;
                aknnVar.e();
                String str = aknnVar.a;
                int andIncrement = aknnVar.c.getAndIncrement();
                StringBuilder sb = new StringBuilder(15);
                sb.append(andIncrement);
                sb.append(".tmp");
                final File file = new File(str, sb.toString());
                try {
                    File file2 = new File(aknnVar.a, ahbx.F(akneVar2));
                    anaf.t(file);
                    anaf.i(bArr, file, amsx.q(new anca[]{anca.a}));
                    anaf.t(file2);
                    if (!file.exists()) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("mv");
                    arrayList.add(file.getAbsolutePath());
                    arrayList.add(file2.getAbsolutePath());
                    aknn.d(arrayList);
                    return null;
                } catch (IOException e) {
                    aknnVar.c(new amnv() { // from class: aknl
                        @Override // defpackage.amnv
                        public final Object get() {
                            return amru.r(file);
                        }
                    });
                    aknnVar.e();
                    String valueOf = String.valueOf(akneVar2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 45);
                    sb2.append("Unexpected error when writing the value for: ");
                    sb2.append(valueOf);
                    throw new RuntimeException(sb2.toString(), e);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    String valueOf2 = String.valueOf(akneVar2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 60);
                    sb3.append("Unexpected error occurred while trying to persist data for: ");
                    sb3.append(valueOf2);
                    throw new RuntimeException(sb3.toString());
                }
            }
        }, angq.a);
    }

    public final void c(final amnv amnvVar) {
        this.e = anaf.T(new anfy() { // from class: aknh
            @Override // defpackage.anfy
            public final anhy a() {
                List<File> list = (List) amnv.this.get();
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("rm");
                    arrayList.add("-r");
                    boolean z = false;
                    for (File file : list) {
                        if (file.exists()) {
                            arrayList.add(file.getAbsolutePath());
                            z = true;
                        }
                    }
                    if (z) {
                        aknn.d(arrayList);
                    }
                }
                return anaf.O(null);
            }
        }, this.d);
    }

    public final void e() {
        anhy anhyVar = this.e;
        if (anhyVar == null || anhyVar.isDone()) {
            return;
        }
        try {
            this.e.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException unused2) {
        }
    }
}
