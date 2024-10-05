package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.SaveImageToDeviceEndpointOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gul implements aaha {
    private static final atub c;
    public final aahd a;
    public final Executor b;
    private final Context d;
    private final azrw e;
    private final Handler f;
    private final akhk g;
    private final akai h;
    private final Activity i;

    static {
        aone createBuilder = atub.a.createBuilder();
        atua atuaVar = atua.WRITE_EXTERNAL_STORAGE;
        createBuilder.copyOnWrite();
        atub atubVar = (atub) createBuilder.instance;
        atubVar.c = atuaVar.m;
        atubVar.b |= 1;
        c = (atub) createBuilder.build();
    }

    public gul(Context context, azrw azrwVar, aahd aahdVar, Executor executor, Handler handler, akhk akhkVar, akai akaiVar, Activity activity) {
        this.d = context;
        this.e = azrwVar;
        aahdVar.getClass();
        this.a = aahdVar;
        executor.getClass();
        this.b = executor;
        this.f = handler;
        akhkVar.getClass();
        this.g = akhkVar;
        akaiVar.getClass();
        this.h = akaiVar;
        this.i = activity;
    }

    public final void b(boolean z, final apxf apxfVar, final Map map) {
        if (z) {
            this.f.post(new Runnable() { // from class: guh
                @Override // java.lang.Runnable
                public final void run() {
                    gul gulVar = gul.this;
                    gulVar.a.c(apxfVar, map);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[Catch: SecurityException -> 0x00b0, DONT_GENERATE, TRY_LEAVE, TryCatch #10 {SecurityException -> 0x00b0, blocks: (B:24:0x0060, B:28:0x0099, B:51:0x0095, B:40:0x0074, B:42:0x007a, B:44:0x0080), top: B:23:0x0060, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.aums r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gul.c(aums, java.util.Map):void");
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, final Map map) {
        if (apxfVar.pY(SaveImageToDeviceEndpointOuterClass.saveImageToDeviceEndpoint)) {
            final aums aumsVar = (aums) apxfVar.pX(SaveImageToDeviceEndpointOuterClass.saveImageToDeviceEndpoint);
            akhk akhkVar = this.g;
            atub atubVar = c;
            if (akhkVar.c(atubVar)) {
                this.b.execute(new Runnable() { // from class: gui
                    @Override // java.lang.Runnable
                    public final void run() {
                        gul.this.c(aumsVar, map);
                    }
                });
                return;
            }
            if (!this.h.i(this.i, 0)) {
                this.h.d(akai.l(0));
                this.g.d(atubVar, new guk(this, aumsVar, map));
                return;
            }
            boolean z = (aumsVar.b & 64) != 0;
            apxf apxfVar2 = aumsVar.i;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            b(z, apxfVar2, map);
        }
    }
}
