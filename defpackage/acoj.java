package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import com.google.protos.youtube.api.innertube.LogStreamEventsCommandOuterClass$LogStreamEventsCommand;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoj implements absq {
    public final abrb a;
    public final absp b;
    public final abrd c;
    public abrd d;
    public final Handler e;
    public final acnk f;
    public acnd g;
    public Handler h;
    public aclw i;
    public acmd j;
    public MediaFormat k;
    public MediaFormat l;
    public boolean m;
    public boolean n;
    public absn o;
    public final axze p;
    private final Context q;
    private final ysl r;
    private final acmw s;
    private final abrd t;
    private abru u;
    private abqv v;
    private EGLContext w;
    private Thread x;
    private acoh y;

    public acoj(Context context, ysl yslVar, axze axzeVar, final abrn abrnVar, abrb abrbVar, absp abspVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.e = handler;
        this.q = context;
        yslVar.getClass();
        this.r = yslVar;
        this.p = axzeVar;
        this.a = abrbVar;
        abspVar.getClass();
        this.b = abspVar;
        this.c = new abrd(abrbVar);
        this.f = new acnk();
        v();
        if (axzeVar.l()) {
            this.u = new abru();
            this.v = new abqv(this.u);
            this.d = new abrd(this.v);
            this.j = new acmq(context, abrnVar, abspVar, this.u, this.v);
            this.y = new acoh(this);
        }
        this.t = new abrd(new acoi(this));
        this.s = new acmw(context, handler, abrnVar);
        if (abrnVar.a() == null) {
            abrnVar.c(new abrk() { // from class: acnq
                @Override // defpackage.abrk
                public final void a() {
                    final acoj acojVar = acoj.this;
                    final abrn abrnVar2 = abrnVar;
                    acojVar.h.post(new Runnable() { // from class: acoe
                        @Override // java.lang.Runnable
                        public final void run() {
                            acoj.this.r(abrnVar2.a());
                        }
                    });
                }
            });
        } else {
            r(abrnVar.a());
        }
    }

    @Override // defpackage.absq
    public final abrd a() {
        return this.t;
    }

    @Override // defpackage.absq
    public final absi b() {
        return null;
    }

    @Override // defpackage.absq
    public final void c(final LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand) {
        this.h.post(new Runnable() { // from class: acnt
            @Override // java.lang.Runnable
            public final void run() {
                FileInputStream fileInputStream;
                acoj acojVar = acoj.this;
                LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand2 = logStreamEventsCommandOuterClass$LogStreamEventsCommand;
                acnh acnhVar = acojVar.g.i;
                String str = logStreamEventsCommandOuterClass$LogStreamEventsCommand2.b;
                String str2 = logStreamEventsCommandOuterClass$LogStreamEventsCommand2.c;
                PeerConnection peerConnection = acnhVar.c;
                if (peerConnection != null) {
                    peerConnection.nativeStopRtcEventLog();
                }
                File[] listFiles = new File(acnhVar.a.getFilesDir(), "rtc_event_logs/").listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file = listFiles[i];
                        String.valueOf(String.valueOf(file)).length();
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    File[] fileArr = listFiles;
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    listFiles = fileArr;
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    int length2 = byteArray.length;
                                    String encodeToString = Base64.encodeToString(byteArray, 2);
                                    JSONObject jSONObject = new JSONObject();
                                    JSONObject jSONObject2 = new JSONObject();
                                    JSONObject jSONObject3 = new JSONObject();
                                    JSONObject jSONObject4 = new JSONObject();
                                    JSONObject jSONObject5 = new JSONObject();
                                    JSONObject jSONObject6 = new JSONObject();
                                    JSONObject jSONObject7 = new JSONObject();
                                    File[] fileArr2 = listFiles;
                                    try {
                                        jSONObject4.put("name", "YouTube");
                                        jSONObject5.put("name", "1");
                                        jSONObject3.put("app_info", jSONObject4);
                                        jSONObject3.put("platform_info", jSONObject5);
                                        jSONObject2.put("client_info", jSONObject3);
                                        jSONObject7.put("session_id", str2);
                                        jSONObject6.put("rtc_event_log", encodeToString);
                                        jSONObject6.put("client_header", jSONObject7);
                                        jSONObject.put("header", jSONObject2);
                                        jSONObject.put("compression", "NONE");
                                        jSONObject.put("event", jSONObject6);
                                    } catch (JSONException e) {
                                        zga.f("RtcEventLogger", "Could not construct RtcEventLogRequest with exception=", e);
                                    }
                                    String valueOf = String.valueOf(str);
                                    if (valueOf.length() != 0) {
                                        "Uploading RtcEventLogRequest to ".concat(valueOf);
                                    }
                                    acnhVar.b.a(new acng(jSONObject, str, aftv.b, afsl.a));
                                    i++;
                                    listFiles = fileArr2;
                                } catch (IOException e2) {
                                    zga.f("RtcEventLogger", "Failed to rtc event log file ", e2);
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                        }
                    }
                }
                acnhVar.a();
            }
        });
    }

    @Override // defpackage.absq
    public final void d(final RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand) {
        this.h.post(new Runnable() { // from class: acnu
            @Override // java.lang.Runnable
            public final void run() {
                acoj acojVar = acoj.this;
                RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand2 = recordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
                acnh acnhVar = acojVar.g.i;
                acnhVar.d = recordStreamEventsCommandOuterClass$RecordStreamEventsCommand2;
                acnhVar.a();
                acnhVar.c();
            }
        });
    }

    @Override // defpackage.absq
    public final void e() {
        v();
    }

    @Override // defpackage.absq
    public final void f(abso absoVar) {
        if (this.x.isAlive()) {
            this.h.post(new acnr(this, absoVar, 0));
        } else {
            this.e.post(new acnr(this, absoVar, 2));
        }
    }

    @Override // defpackage.absq
    public final void g(abso absoVar) {
        this.h.post(new acnr(this, absoVar, 3));
    }

    @Override // defpackage.absq
    public final void h(abtl abtlVar) {
        acmw acmwVar = this.s;
        if (acmwVar != null) {
            acmwVar.f = abtlVar;
        }
    }

    @Override // defpackage.absq
    public final void i(final absn absnVar, final abso absoVar) {
        this.h.post(new Runnable() { // from class: acof
            /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x01ba  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x01cb  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 468
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acof.run():void");
            }
        });
    }

    @Override // defpackage.absq
    public final boolean j() {
        return this.m;
    }

    @Override // defpackage.absq
    public final boolean k() {
        return this.g.d();
    }

    @Override // defpackage.absq
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.absq
    public final abru m() {
        acmd acmdVar = this.j;
        if (acmdVar != null) {
            return ((acmq) acmdVar).c;
        }
        return null;
    }

    @Override // defpackage.absq
    public final void n(final boolean z, final abwf abwfVar) {
        this.h.post(new Runnable() { // from class: acnv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                acoj acojVar = acoj.this;
                boolean z2 = z;
                abwf abwfVar2 = abwfVar;
                if (acojVar.n) {
                    acojVar.m = z2;
                    i = 1;
                } else {
                    boolean e = acojVar.g.e(z2);
                    boolean d = acojVar.g.d();
                    acojVar.m = d;
                    acmd acmdVar = acojVar.j;
                    i = e;
                    if (acmdVar != null) {
                        acmdVar.a(d);
                        i = e;
                    }
                }
                abwfVar2.a(i ^ 1, acojVar.m);
            }
        });
    }

    @Override // defpackage.absq
    public final void o(final abwa abwaVar) {
        this.h.post(new Runnable() { // from class: acns
            @Override // java.lang.Runnable
            public final void run() {
                acoj acojVar = acoj.this;
                final abwa abwaVar2 = abwaVar;
                acojVar.i.a();
                acojVar.g.b();
                acojVar.o = null;
                acmd acmdVar = acojVar.j;
                if (acmdVar != null) {
                    final acmq acmqVar = (acmq) acmdVar;
                    acmqVar.b.post(new Runnable() { // from class: acmj
                        @Override // java.lang.Runnable
                        public final void run() {
                            acmq acmqVar2 = acmq.this;
                            acmqVar2.u = abwaVar2;
                            acac acacVar = acmqVar2.n;
                            if (acacVar != null) {
                                acacVar.l(acmqVar2.t);
                            }
                            acac acacVar2 = acmqVar2.m;
                            if (acacVar2 != null) {
                                acacVar2.l(acmqVar2.t);
                            }
                            acap acapVar = acmqVar2.k;
                            if (acapVar != null) {
                                acapVar.c(null, null);
                                acmqVar2.k.b(null, null);
                                acmqVar2.k.j();
                                acmqVar2.k.i();
                                acmqVar2.k = null;
                            }
                            acmqVar2.b.postDelayed(acmqVar2.r, 250L);
                        }
                    });
                } else {
                    acojVar.e.post(new Runnable() { // from class: acoa
                        @Override // java.lang.Runnable
                        public final void run() {
                            abwa.this.a(0);
                        }
                    });
                }
            }
        });
    }

    @Override // defpackage.absq
    public final void p(abso absoVar) {
        this.h.post(new acnr(this, absoVar, 1));
    }

    @Override // defpackage.absq
    public final void q(final boolean z, final boolean z2, final Integer num, final Integer num2, MediaFormat mediaFormat, MediaFormat mediaFormat2, final String str, final String str2, acap acapVar, Bundle bundle, final abso absoVar) {
        this.k = mediaFormat2;
        this.l = mediaFormat;
        this.h.post(new Runnable() { // from class: acod
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                acoj acojVar = acoj.this;
                boolean z3 = z;
                boolean z4 = z2;
                Integer num3 = num;
                Integer num4 = num2;
                String str3 = str;
                String str4 = str2;
                abso absoVar2 = absoVar;
                acojVar.m = z3;
                amkq.E(true);
                absoVar2.getClass();
                if (acojVar.g == null) {
                    absoVar2.a(8);
                    return;
                }
                acmd acmdVar = acojVar.j;
                if (acmdVar != null) {
                    acmdVar.a(z3);
                }
                int i2 = 1920;
                if (num3 == null || num4 == null || num3.intValue() <= 0 || num4.intValue() <= 0) {
                    if (acojVar.p.i().I) {
                        int i3 = true != z4 ? 3840 : 2160;
                        int i4 = true != z4 ? 2160 : 3840;
                        i = i3;
                        i2 = i4;
                    } else if (acojVar.p.i().H) {
                        int i5 = true != z4 ? 1920 : 1080;
                        if (true != z4) {
                            i = i5;
                            i2 = 1080;
                        } else {
                            i = i5;
                        }
                    } else {
                        int i6 = true != z4 ? 1280 : 720;
                        if (true != z4) {
                            i = i6;
                            i2 = 720;
                        } else {
                            i = i6;
                            i2 = 1280;
                        }
                    }
                } else {
                    i = num3.intValue();
                    i2 = num4.intValue();
                }
                abrb abrbVar = acojVar.a;
                amkq.E(i >= 0 && i2 >= 0);
                abrbVar.a = i;
                abrbVar.b = i2;
                acnd acndVar = acojVar.g;
                Handler handler = acojVar.h;
                acnk acnkVar = acojVar.f;
                handler.getClass();
                acndVar.j = handler;
                acndVar.k = z3;
                str3.getClass();
                acndVar.l = str3;
                str4.getClass();
                acndVar.m = str4;
                acndVar.n = i;
                acndVar.o = i2;
                acndVar.p = acnkVar;
                absoVar2.a(0);
            }
        });
    }

    public final void r(abqu abquVar) {
        abquVar.getClass();
        this.w = abquVar.b;
        Context context = this.q;
        ysl yslVar = this.r;
        EGLContext eGLContext = this.w;
        List cl = adyu.cl(this.p.j());
        aony aonyVar = this.p.i().D;
        ArrayList arrayList = new ArrayList();
        if (aonyVar != null) {
            Iterator it = aonyVar.iterator();
            while (it.hasNext()) {
                arrayList.add(acls.a((String) it.next()));
            }
        }
        boolean z = this.p.i().z;
        boolean z2 = this.p.i().Q;
        int i = this.p.i().x;
        float f = this.p.i().y;
        int i2 = this.p.i().w;
        boolean z3 = this.p.i().f114J;
        acnd acndVar = new acnd(context, yslVar, eGLContext, cl, arrayList, z, z2, i, f, i2, this.y, this.s);
        this.g = acndVar;
        acmw acmwVar = this.s;
        if (acmwVar != null) {
            acmwVar.e = acndVar;
        }
    }

    public final void s() {
        acnk acnkVar = this.f;
        acnkVar.b = null;
        acnkVar.a = null;
        acnkVar.c = 0;
        acnkVar.d = 0L;
        acnkVar.e = 0L;
        this.i.a();
        this.g.b();
        acmd acmdVar = this.j;
        if (acmdVar != null) {
            acmq acmqVar = (acmq) acmdVar;
            acmqVar.b.post(new acmg(acmqVar, 3));
        }
    }

    public final void t(int i, abso absoVar) {
        this.e.post(new acnz(absoVar, i, 0));
    }

    public final void u(final int i) {
        if (adyu.cP(i)) {
            if (this.x.isAlive()) {
                this.h.post(new Runnable() { // from class: acob
                    @Override // java.lang.Runnable
                    public final void run() {
                        acoj.this.s();
                    }
                });
            } else {
                this.e.post(new Runnable() { // from class: acob
                    @Override // java.lang.Runnable
                    public final void run() {
                        acoj.this.s();
                    }
                });
            }
        }
        this.e.post(new Runnable() { // from class: acoc
            @Override // java.lang.Runnable
            public final void run() {
                acoj acojVar = acoj.this;
                int i2 = i;
                absn absnVar = acojVar.o;
                if (absnVar != null) {
                    absnVar.a(i2);
                }
            }
        });
    }

    final void v() {
        HandlerThread handlerThread = new HandlerThread("WebRtcPipelineThread", 0);
        handlerThread.start();
        this.h = new Handler(handlerThread.getLooper());
        this.x = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acnw
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acoj acojVar = acoj.this;
                zga.f("WebRtcCapturePipelineMgr", "WebRTC pipeline thread died unexpectedly", th);
                acojVar.u(37);
            }
        });
        Handler handler = this.h;
        final aclv aclvVar = new aclv();
        abrb abrbVar = this.a;
        abro abroVar = new abro() { // from class: acnx
            @Override // defpackage.abro
            public final void a() {
                aclt acltVar = aclv.this.a;
                if (acltVar != null) {
                    acltVar.a.run();
                }
            }
        };
        Handler handler2 = this.h;
        abrbVar.c = abroVar;
        abrbVar.d = handler2;
        this.i = new aclw(aclvVar, new acny(this), handler);
    }
}
