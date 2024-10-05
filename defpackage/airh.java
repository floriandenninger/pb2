package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class airh {
    public aire a;
    public String b;
    public final ajyw c;
    private final aiov d;

    public airh(ajyw ajywVar, aiov aiovVar, byte[] bArr, byte[] bArr2) {
        this.c = ajywVar;
        this.d = aiovVar;
    }

    public final void a() {
        this.d.a.X(new ayrs() { // from class: airg
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                airh airhVar = airh.this;
                ahef ahefVar = (ahef) obj;
                aign c = ahefVar.c();
                aign aignVar = aign.NEW;
                int ordinal = c.ordinal();
                String str = null;
                if (ordinal == 0) {
                    airhVar.b = null;
                    aire aireVar = airhVar.a;
                    if (aireVar != null) {
                        aireVar.f = true;
                        Thread thread = aireVar.g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                        airhVar.a = null;
                        return;
                    }
                    return;
                }
                if (ordinal == 5 || ordinal == 8) {
                    PlayerResponseModel a = ahefVar.c().h() ? ahefVar.a() : ahefVar.b();
                    if (a != null) {
                        VideoStreamingData videoStreamingData = a.c;
                        Uri parse = (videoStreamingData == null || videoStreamingData.b.i.isEmpty()) ? null : Uri.parse(videoStreamingData.b.i);
                        apwx apwxVar = a.c().c.H;
                        if (apwxVar == null) {
                            apwxVar = apwx.a;
                        }
                        int i = apwxVar.b;
                        if (ahefVar.a() != null) {
                            str = ahefVar.k();
                        } else if (ahefVar.b() != null) {
                            str = ahefVar.e();
                        }
                        String str2 = str;
                        String y = a.y();
                        if (y.equals(airhVar.b)) {
                            return;
                        }
                        airhVar.b = y;
                        ajyw ajywVar = airhVar.c;
                        Executor executor = (Executor) ajywVar.c.get();
                        executor.getClass();
                        afhf afhfVar = (afhf) ajywVar.a.get();
                        afhfVar.getClass();
                        ptk ptkVar = (ptk) ajywVar.b.get();
                        ptkVar.getClass();
                        final aire aireVar2 = new aire(executor, afhfVar, ptkVar, parse, i, str2);
                        airhVar.a = aireVar2;
                        if (aireVar2.d != null) {
                            aireVar2.a.execute(new Runnable() { // from class: aird
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ath athVar;
                                    long j;
                                    ate ateVar;
                                    int g;
                                    aire aireVar3 = aire.this;
                                    yjk.e();
                                    aireVar3.g = Thread.currentThread();
                                    int i2 = 4096;
                                    byte[] bArr = new byte[4096];
                                    aireVar3.c.a(-10);
                                    long j2 = -1;
                                    boolean z = false;
                                    while (!aireVar3.f && !z) {
                                        try {
                                            int i3 = aireVar3.e;
                                            if (i3 > 0) {
                                                Thread.sleep(i3);
                                            }
                                            aireVar3.c.d();
                                            athVar = aireVar3.d;
                                            j = athVar.g;
                                        } catch (InterruptedException unused) {
                                            z = false;
                                        }
                                        try {
                                            try {
                                                j2 = aireVar3.b.h(athVar);
                                                while (!aireVar3.f && (g = aireVar3.b.g(bArr, 0, i2)) >= 0) {
                                                    j += g;
                                                }
                                                long j3 = aireVar3.d.g;
                                            } catch (Throwable th) {
                                                try {
                                                    aireVar3.b.j();
                                                } catch (IOException unused2) {
                                                }
                                                throw th;
                                                break;
                                            }
                                        } catch (ptj unused3) {
                                            long j4 = j;
                                            ath athVar2 = aireVar3.d;
                                            if (j4 > athVar2.g) {
                                                aireVar3.d = new ath(athVar2.a, j4, j2, athVar2.i);
                                            }
                                            ateVar = aireVar3.b;
                                            ateVar.j();
                                            z = false;
                                            i2 = 4096;
                                        } catch (IOException unused4) {
                                            aireVar3.f = true;
                                            try {
                                                ateVar = aireVar3.b;
                                                ateVar.j();
                                            } catch (IOException unused5) {
                                                z = false;
                                                i2 = 4096;
                                            }
                                            z = false;
                                            i2 = 4096;
                                        }
                                        try {
                                            aireVar3.b.j();
                                        } catch (IOException unused6) {
                                        } catch (InterruptedException unused7) {
                                            z = true;
                                            aireVar3.f = true;
                                            i2 = 4096;
                                        }
                                        z = true;
                                        i2 = 4096;
                                    }
                                    aireVar3.c.c(-10);
                                }
                            });
                        }
                    }
                }
            }
        });
    }
}
