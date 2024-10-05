package defpackage;

import android.os.Build;
import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksv extends Thread {
    public volatile boolean a;
    final /* synthetic */ aksw b;
    private final Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aksv(aksw akswVar) {
        super("ANRGuard-Thread");
        this.b = akswVar;
        this.c = new Runnable() { // from class: aksu
            @Override // java.lang.Runnable
            public final void run() {
                aksv.this.a = false;
            }
        };
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        aone builder;
        int i = akso.a;
        Thread thread = this.b.c.getLooper().getThread();
        aksr aksrVar = this.b.b;
        if (aksrVar.c.a.exists()) {
            try {
                apfe apfeVar = (apfe) ((aone) apfe.a.createBuilder().mergeFrom(anaf.v(aksrVar.c.a), aomw.b())).build();
                String.valueOf(String.valueOf(apfeVar)).length();
                arpn a = arpp.a();
                a.copyOnWrite();
                ((arpp) a.instance).ca(apfeVar);
                aksrVar.d.c((arpp) a.build());
                aksrVar.a();
            } catch (IOException e) {
                afsi.c(2, 27, "Unable to flush ANR", e);
            }
        }
        this.b.d.a();
        while (!interrupted()) {
            this.a = true;
            this.b.c.post(this.c);
            try {
                TimeUnit.MILLISECONDS.sleep(this.b.a);
                this.b.d.a();
                if (Debug.isDebuggerConnected()) {
                    this.b.b.a();
                } else if (!this.a) {
                    aksw akswVar = this.b;
                    aksr aksrVar2 = akswVar.b;
                    long j = akswVar.a;
                    apfe apfeVar2 = aksrVar2.g;
                    if (apfeVar2 != null) {
                        if (aksrVar2.f) {
                            aone builder2 = apfeVar2.toBuilder();
                            builder2.copyOnWrite();
                            apfe apfeVar3 = (apfe) builder2.instance;
                            apfeVar3.b |= 1;
                            apfeVar3.c = true;
                            aksrVar2.b(builder2, j);
                            int i2 = Build.VERSION.SDK_INT;
                            builder2.copyOnWrite();
                            apfe apfeVar4 = (apfe) builder2.instance;
                            apfeVar4.b |= 64;
                            apfeVar4.i = i2;
                            int a2 = zgx.a(aksrVar2.a);
                            builder2.copyOnWrite();
                            apfe apfeVar5 = (apfe) builder2.instance;
                            apfeVar5.b |= 128;
                            apfeVar5.j = a2;
                            aksrVar2.g = (apfe) builder2.build();
                            String.valueOf(String.valueOf(aksrVar2.g)).length();
                            arpn a3 = arpp.a();
                            apfe apfeVar6 = aksrVar2.g;
                            a3.copyOnWrite();
                            ((arpp) a3.instance).ca(apfeVar6);
                            aksrVar2.d.c((arpp) a3.build());
                        }
                        aksrVar2.a();
                    }
                } else {
                    aksw akswVar2 = this.b;
                    aksr aksrVar3 = akswVar2.b;
                    long j2 = akswVar2.a;
                    apfe apfeVar7 = aksrVar3.g;
                    if (apfeVar7 != null) {
                        builder = apfeVar7.toBuilder();
                    } else {
                        builder = apfe.a.createBuilder();
                        long c = aksrVar3.b.c() - j2;
                        builder.copyOnWrite();
                        apfe apfeVar8 = (apfe) builder.instance;
                        apfeVar8.b |= 8;
                        apfeVar8.f = c;
                    }
                    aksrVar3.b(builder, j2);
                    int i3 = aksrVar3.e;
                    if (i3 > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                            sb.append(stackTraceElement);
                            sb.append("\n");
                        }
                        String sb2 = sb.toString();
                        if (sb.length() > i3) {
                            sb2 = sb2.substring(0, i3);
                        }
                        builder.copyOnWrite();
                        apfe apfeVar9 = (apfe) builder.instance;
                        sb2.getClass();
                        apfeVar9.b |= 4;
                        apfeVar9.e = sb2;
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    builder.copyOnWrite();
                    apfe apfeVar10 = (apfe) builder.instance;
                    apfeVar10.b |= 64;
                    apfeVar10.i = i4;
                    int a4 = zgx.a(aksrVar3.a);
                    builder.copyOnWrite();
                    apfe apfeVar11 = (apfe) builder.instance;
                    apfeVar11.b |= 128;
                    apfeVar11.j = a4;
                    aksrVar3.g = (apfe) builder.build();
                    try {
                        String.valueOf(String.valueOf(aksrVar3.g)).length();
                        aksq aksqVar = aksrVar3.c;
                        apfe apfeVar12 = aksrVar3.g;
                        if (!aksqVar.b) {
                            aksqVar.b = true;
                            File parentFile = aksqVar.a.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                        }
                        anaf.u(apfeVar12.toByteArray(), aksqVar.a);
                    } catch (IOException e2) {
                        afsi.c(2, 27, "Unable to record ANR", e2);
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
