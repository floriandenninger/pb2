package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpn extends Handler {
    private final WeakReference a;

    public zpn(Looper looper, zpw zpwVar) {
        super(looper);
        this.a = new WeakReference(zpwVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SurfaceTexture surfaceTexture;
        zsc zscVar;
        zrp zrpVar;
        zrp zrpVar2;
        zpw zpwVar = (zpw) this.a.get();
        if (zpwVar == null) {
            zga.b("handleMessage: glThreadReference is Null!");
            return;
        }
        switch (message.what) {
            case 1:
                zpr zprVar = (zpr) message.obj;
                amkq.N(!zpwVar.e);
                zqs zqsVar = zpwVar.C;
                zqs zqsVar2 = zprVar.a;
                if (zqsVar != zqsVar2) {
                    zpwVar.C = zqsVar2;
                }
                zpwVar.e = zprVar.b.a();
                return;
            case 2:
                String.valueOf(String.valueOf(zpwVar.m)).length();
                zpwVar.d = false;
                zpwVar.D = false;
                zpt zptVar = zpwVar.k;
                zptVar.e.b.removeCallbacks(zptVar.d);
                return;
            case 3:
                String.valueOf(String.valueOf(zpwVar.m)).length();
                zpwVar.g.e();
                arz arzVar = zpwVar.l;
                if (arzVar == null || zpwVar.m == null) {
                    if (arzVar != null) {
                        arzVar.d();
                    }
                    zpwVar.l = new arz(art.b(), 36197, true);
                    SurfaceTexture surfaceTexture2 = zpwVar.m;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                    }
                    try {
                        zpwVar.m = new SurfaceTexture(zpwVar.l.a);
                    } catch (RuntimeException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb.append("DrishtiGlThread: internalResumeGraph: new SurfaceTexture error: ");
                        sb.append(valueOf);
                        zga.b(sb.toString());
                    }
                    zpwVar.n = false;
                    zpwVar.m.setOnFrameAvailableListener(zpwVar, zpwVar.b);
                    String.valueOf(String.valueOf(zpwVar.m)).length();
                }
                if (zpwVar.q == null) {
                    zpwVar.q = arz.b();
                }
                synchronized (zpwVar.a) {
                    if (!zpwVar.f && !zpwVar.d && (surfaceTexture = zpwVar.m) != null && (zscVar = zpwVar.x) != null) {
                        zscVar.a(surfaceTexture, zpwVar.l.a);
                    }
                }
                zpwVar.c.b();
                zpwVar.d = true;
                zpt zptVar2 = zpwVar.k;
                if (zptVar2.b != null) {
                    zptVar2.d.run();
                    return;
                }
                return;
            case 4:
                zpwVar.d = false;
                zpwVar.b();
                zqs zqsVar3 = zpwVar.C;
                if (zqsVar3 != null) {
                    zqsVar3.f();
                }
                zpwVar.b.sendEmptyMessage(5);
                return;
            case 5:
                try {
                    zpwVar.g.e();
                } catch (RuntimeException e2) {
                    zga.d("internalTearDown: focus failed: ", e2);
                }
                zpwVar.g();
                for (zpp zppVar : zpwVar.r) {
                    if (zppVar != null) {
                        zppVar.a();
                    }
                }
                zpw.j(zpwVar.q);
                zpwVar.q = null;
                zpw.j(zpwVar.l);
                zpwVar.l = null;
                SurfaceTexture surfaceTexture3 = zpwVar.m;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.setOnFrameAvailableListener(null);
                    zpwVar.m.release();
                    zpwVar.m = null;
                    zpwVar.n = false;
                }
                zpo zpoVar = zpwVar.y;
                if (zpoVar != null) {
                    synchronized (((zrs) zpoVar).m) {
                        Iterator it = ((zrs) zpoVar).m.values().iterator();
                        while (it.hasNext()) {
                            zpw.i((zpe) it.next());
                        }
                        ((zrs) zpoVar).m.clear();
                    }
                }
                try {
                    zpe.f();
                } catch (RuntimeException e3) {
                    zga.d("internalTearDown: focusNone failed: ", e3);
                }
                zpe zpeVar = zpwVar.g;
                if (zpeVar != null) {
                    zpeVar.g();
                    zpwVar.g = null;
                }
                zpo zpoVar2 = zpwVar.y;
                if (zpoVar2 != null) {
                    zrs zrsVar = (zrs) zpoVar2;
                    zrsVar.i.B = null;
                    zrsVar.h.quit();
                    zrsVar.k = null;
                    zpwVar.y = null;
                }
                zpwVar.f282J = null;
                return;
            case 6:
                Surface surface = (Surface) message.obj;
                String.valueOf(String.valueOf(surface)).length();
                if (surface == null) {
                    zpwVar.h();
                    return;
                }
                if (surface.equals(zpwVar.s)) {
                    return;
                }
                zpwVar.g();
                zpwVar.s = surface;
                if (zpwVar.v <= 0 || zpwVar.w <= 0) {
                    return;
                }
                zpwVar.p();
                return;
            case 7:
                SurfaceTexture surfaceTexture4 = (SurfaceTexture) message.obj;
                String.valueOf(String.valueOf(surfaceTexture4)).length();
                if (surfaceTexture4 == null) {
                    zpwVar.e("DrishtiGlThread::internalSetOutputTarget::outputTarget is null");
                    zpwVar.h();
                    return;
                } else {
                    if (surfaceTexture4.equals(zpwVar.t)) {
                        zpwVar.e("DrishtiGlThread::internalSetOutputTarget::same outputTarget already set");
                        return;
                    }
                    zpwVar.g();
                    zpwVar.t = surfaceTexture4;
                    if (zpwVar.v <= 0 || zpwVar.w <= 0) {
                        return;
                    }
                    zpwVar.p();
                    return;
                }
            case 8:
                arz arzVar2 = (arz) message.obj;
                int i = message.arg1;
                int i2 = message.arg2;
                amkq.N(arzVar2 == null || !zpwVar.d || zpwVar.u == null);
                zpwVar.g();
                if (arzVar2 != null) {
                    try {
                        arzVar2.c(i, i2);
                        zpwVar.u = zpe.k(arzVar2);
                        return;
                    } catch (RuntimeException e4) {
                        zga.d("internalSetOutputTarget: forTexture failed: ", e4);
                        zpwVar.u = null;
                        return;
                    }
                }
                return;
            case 9:
                zpwVar.h();
                return;
            case 10:
                int i3 = message.arg1;
                int i4 = message.arg2;
                amkq.E(i3 > 0);
                amkq.E(i4 > 0);
                if (zpwVar.v == i3 && zpwVar.w == i4) {
                    return;
                }
                zpwVar.v = i3;
                zpwVar.w = i4;
                if (zpwVar.t != null || zpwVar.s != null) {
                    zpwVar.p();
                }
                if (zpwVar.d) {
                    zpwVar.k();
                    return;
                }
                return;
            case 11:
                int intValue = ((Integer) message.obj).intValue();
                if (zpwVar.z == 0) {
                    zpwVar.i = intValue;
                    return;
                }
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Ignoring setMaxProcessingResolution: ");
                sb2.append(intValue);
                zga.l(sb2.toString());
                return;
            case 12:
                zpwVar.d(((Integer) message.obj).intValue());
                return;
            case 13:
                zpwVar.n = true;
                if (!zpwVar.q(false) || (zrpVar = zpwVar.f282J) == null) {
                    return;
                }
                zrpVar.a(System.currentTimeMillis());
                return;
            case 14:
                if (!zpwVar.q(((Boolean) message.obj).booleanValue()) || (zrpVar2 = zpwVar.f282J) == null) {
                    return;
                }
                zrpVar2.a(System.currentTimeMillis());
                return;
            case 15:
                zpwVar.o = ((Integer) message.obj).intValue();
                return;
            case 16:
                zpwVar.p = ((Float) message.obj).floatValue();
                return;
            case 17:
                zpwVar.E = true;
                return;
            default:
                String valueOf2 = String.valueOf(message.toString());
                zga.l(valueOf2.length() != 0 ? "Unhandled message: ".concat(valueOf2) : new String("Unhandled message: "));
                return;
        }
    }
}
