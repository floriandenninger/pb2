package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.ProcessorBase;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zrs implements zqt, vxb, zqf, zpo {
    public final Rect a;
    public final boolean b;
    public zsq c;
    public final List d;
    public final Map e;
    public ztp f;
    public final zrx g;
    public final HandlerThread h;
    public final zpw i;
    public final zqg j;
    public ProcessorBase k;
    public zqr l;
    public final HashMap m;
    public volatile boolean n;
    public volatile boolean o;
    public Bitmap p;
    public long q;
    public boolean r;
    Runnable s;
    public final zpi t;
    private final zqc u;
    private zvk v;
    private DataSetObserver w;
    private boolean x;
    private final zqi y;
    private ztl z;

    static {
        zpb.a();
    }

    public zrs(Context context, zsc zscVar, EGLContext eGLContext) {
        this(context, zscVar, eGLContext, true, null, true);
    }

    public static boolean D() {
        return zpb.a.get();
    }

    private final void F(final ztp ztpVar) {
        this.i.o(this.j, new zpq() { // from class: zri
            @Override // defpackage.zpq
            public final boolean a() {
                zrs zrsVar = zrs.this;
                ztp ztpVar2 = ztpVar;
                final zqg zqgVar = zrsVar.j;
                if (zqgVar.m && !zqgVar.k) {
                    byte[] bArr = ztpVar2.a;
                    if (bArr != null) {
                        try {
                            zqgVar.c.e(bArr);
                            zqgVar.j.size();
                            for (int i = 0; i < zqgVar.j.size(); i++) {
                                final String str = ((FilterMapTable$FilterDescriptor) zqgVar.j.get(i)).a;
                                String lowerCase = str.toLowerCase(Locale.US);
                                String format = String.format(Locale.US, "render_%s_preview", lowerCase);
                                String format2 = String.format(Locale.US, "render_%s_thumb", lowerCase);
                                try {
                                    zqgVar.c.b(format, new PacketCallback() { // from class: zqd
                                        @Override // com.google.mediapipe.framework.PacketCallback
                                        public final void process(Packet packet) {
                                            zqg zqgVar2 = zqg.this;
                                            if (zqgVar2.h != null) {
                                                zqgVar2.h.a(PacketGetter.a(packet));
                                            }
                                        }
                                    });
                                    try {
                                        zqgVar.c.b(format2, new PacketCallback() { // from class: zqe
                                            @Override // com.google.mediapipe.framework.PacketCallback
                                            public final void process(Packet packet) {
                                                zqg zqgVar2 = zqg.this;
                                                String str2 = str;
                                                if (zqgVar2.o != null) {
                                                    final GraphTextureFrame a = PacketGetter.a(packet);
                                                    final zrs zrsVar2 = zqgVar2.o.a;
                                                    for (final TextureView textureView : zrsVar2.q(str2)) {
                                                        if (textureView == null || !textureView.isAvailable()) {
                                                            zrsVar2.r(textureView);
                                                        } else {
                                                            zrsVar2.i.b.post(new Runnable() { // from class: zre
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    zrs zrsVar3 = zrs.this;
                                                                    TextureView textureView2 = textureView;
                                                                    TextureFrame textureFrame = a;
                                                                    SurfaceTexture surfaceTexture = textureView2.getSurfaceTexture();
                                                                    if (zrsVar3.i.d) {
                                                                        if (surfaceTexture == null) {
                                                                            zga.l("renderGpuPacketToTexture: null textureView Surface");
                                                                        } else {
                                                                            zpe zpeVar = (zpe) zrsVar3.m.get(surfaceTexture);
                                                                            if (zpeVar == null) {
                                                                                synchronized (zrsVar3.m) {
                                                                                    try {
                                                                                        zpeVar = zpe.a().b(surfaceTexture);
                                                                                        zrsVar3.m.put(surfaceTexture, zpeVar);
                                                                                    } catch (RuntimeException e) {
                                                                                        zga.d("renderGpuPacketToTexture: forSurfaceTexture failed: ", e);
                                                                                    }
                                                                                }
                                                                            }
                                                                            arz a2 = arz.a(((GraphTextureFrame) textureFrame).a);
                                                                            if (zpeVar != null) {
                                                                                zpw zpwVar = zrsVar3.i;
                                                                                zpwVar.c.a(a2, zpeVar, textureView2.getWidth(), textureView2.getHeight());
                                                                            }
                                                                            zpw.j(a2);
                                                                        }
                                                                    }
                                                                    textureFrame.release();
                                                                    zrsVar3.r(textureView2);
                                                                }
                                                            });
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                    } catch (MediaPipeException e) {
                                        String valueOf = String.valueOf(format2);
                                        zga.f("KazooProcessor", valueOf.length() != 0 ? "addPacketCallback failed for stream: ".concat(valueOf) : new String("addPacketCallback failed for stream: "), e);
                                    }
                                } catch (MediaPipeException e2) {
                                    String valueOf2 = String.valueOf(format);
                                    zga.f("KazooProcessor", valueOf2.length() != 0 ? "addPacketCallback failed for stream: ".concat(valueOf2) : new String("addPacketCallback failed for stream: "), e2);
                                }
                            }
                            PacketCallback packetCallback = zqgVar.i;
                            if (packetCallback != null) {
                                try {
                                    zqgVar.c.b("output_events", packetCallback);
                                } catch (MediaPipeException e3) {
                                    zga.f("KazooProcessor", "addPacketCallback failed for stream: output_events", e3);
                                }
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("asset_base", zqgVar.d.b(ztpVar2.b));
                            try {
                                zqgVar.c.f(hashMap);
                                try {
                                    zqgVar.c.h();
                                    zqgVar.k = true;
                                    if (zrsVar.c == null) {
                                        zrsVar.B();
                                        if (zrsVar.C()) {
                                            zrsVar.A();
                                            return true;
                                        }
                                    }
                                    return true;
                                } catch (MediaPipeException e4) {
                                    zga.f("KazooProcessor", "startRunningGraph failed", e4);
                                }
                            } catch (MediaPipeException e5) {
                                zga.f("KazooProcessor", "setInputSidePackets failed", e5);
                            }
                        } catch (MediaPipeException e6) {
                            zga.f("KazooProcessor", "loadBinaryGraph failed", e6);
                        }
                    } else {
                        zga.c("KazooProcessor", "No MediaPipe graph setup provided!");
                    }
                }
                zga.b("KazooProcessor Supergraph setup failed.");
                zrsVar.f = ztpVar2;
                return false;
            }
        });
    }

    public final void A() {
        this.i.b.removeCallbacks(this.s);
        if (this.c == null) {
            this.i.b.postDelayed(this.s, this.q);
        } else {
            zga.b("DrishtiGl: VideoEffectPipelineDrishti.updateAllFilterThumbnailsDelayed ignored");
        }
    }

    public final void B() {
        zvk zvkVar = this.v;
        if (zvkVar != null) {
            zqg zqgVar = this.j;
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(zqgVar.j, zvkVar.c);
            if (a != null) {
                zqgVar.e(a, amvo.b);
            }
        }
    }

    public final boolean C() {
        List list;
        zvk zvkVar = this.v;
        if (zvkVar == null || (list = zvkVar.e) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TextureView p = p(((FilterMapTable$FilterDescriptor) it.next()).a);
            if (p == null || !p.isAvailable()) {
                return false;
            }
        }
        return true;
    }

    public final void E() {
        this.j.l = true;
    }

    @Override // defpackage.zqt
    public final vxb a() {
        return this;
    }

    @Override // defpackage.vxb
    public final void aH(boolean z) {
        if (this.n) {
            return;
        }
        if (this.o) {
            if (z) {
                this.i.b.removeCallbacks(this.s);
            } else {
                A();
            }
        }
        this.j.n.aH(z);
    }

    @Override // defpackage.zqt
    public final zrx b() {
        return this.g;
    }

    @Override // defpackage.zqt
    public final void c(int i) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(11, Integer.valueOf(i)));
    }

    @Override // defpackage.zqt
    public final void d(float f) {
        zqg zqgVar = this.j;
        StringBuilder sb = new StringBuilder(45);
        sb.append("setPreviewMinTargetFramerate: ");
        sb.append(f);
        zqgVar.n.a = f;
    }

    @Override // defpackage.zqt
    public final void e(SurfaceTexture surfaceTexture, int i, int i2) {
        amkq.N(!this.n);
        amkq.E(i > 0);
        amkq.E(i2 > 0);
        zpw zpwVar = this.i;
        zpwVar.B = null;
        Handler handler = zpwVar.b;
        handler.sendMessage(handler.obtainMessage(7, surfaceTexture));
        B();
        this.i.n(i, i2);
        if (this.r) {
            this.i.l();
        }
    }

    @Override // defpackage.zqt
    public final void f(int i, int i2) {
        amkq.N(!this.n);
        amkq.E(true);
        amkq.E(true);
        this.i.n(i, i2);
    }

    @Override // defpackage.zqt
    public final void g(float f) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(16, Float.valueOf(f)));
    }

    @Override // defpackage.zqt
    public final void h() {
        amkq.N(!this.n);
        this.o = false;
        if (this.x) {
            this.i.b.sendEmptyMessage(2);
        }
    }

    @Override // defpackage.zqt
    public final void i() {
        zvk zvkVar;
        List list;
        amkq.N(!this.n);
        this.o = false;
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((zsk) it.next()).a();
            }
            this.d.clear();
        }
        x(false);
        zqr zqrVar = this.l;
        if (zqrVar != null) {
            zqrVar.c();
            this.l = null;
        }
        zvk zvkVar2 = this.v;
        if (zvkVar2 != null && (list = zvkVar2.e) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TextureView p = p(((FilterMapTable$FilterDescriptor) it2.next()).a);
                if (p != null) {
                    p.setSurfaceTextureListener(null);
                }
            }
        }
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver != null && (zvkVar = this.v) != null) {
            zvkVar.unregisterObserver(dataSetObserver);
            this.w = null;
        }
        if (this.x) {
            zpw zpwVar = this.i;
            synchronized (zpwVar.a) {
                zpwVar.f = true;
            }
            zpwVar.b.sendEmptyMessage(4);
        }
        this.n = true;
    }

    @Override // defpackage.zqt
    public final boolean j() {
        boolean z = true;
        amkq.N(!this.n);
        this.o = true;
        if (this.x) {
            z = false;
        } else {
            this.x = true;
        }
        this.i.l();
        return z;
    }

    @Override // defpackage.zqt
    public final zpt k() {
        return this.i.k;
    }

    @Override // defpackage.zqt
    public final void l(ztl ztlVar, zvk zvkVar) {
        amkq.N(this.z == null);
        amkq.N(this.v == null);
        ztlVar.getClass();
        this.z = ztlVar;
        zvkVar.getClass();
        this.v = zvkVar;
        zro zroVar = new zro(this);
        this.w = zroVar;
        zvkVar.registerObserver(zroVar);
        for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : zvkVar.e) {
            zvkVar.b(filterMapTable$FilterDescriptor.a).setSurfaceTextureListener(new zrr(this, filterMapTable$FilterDescriptor.a));
        }
        List list = zvkVar.e;
        zto ztoVar = ztlVar.a;
        t(list, new ztp(ztoVar.c, ztoVar.a.d()), ztlVar.a.a(avwy.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS));
    }

    @Override // defpackage.zqt
    public final void m() {
        zrp zrpVar = new zrp();
        this.i.f282J = zrpVar;
        this.j.p = zrpVar;
    }

    @Override // defpackage.zqt
    public final void n(Bitmap bitmap) {
        zpt zptVar = this.i.k;
        amkq.E(true);
        bitmap.getClass();
        zptVar.b = bitmap;
        zptVar.c = Math.round(33.333333333333336d);
        if (zptVar.e.d) {
            zptVar.d.run();
        }
    }

    @Override // defpackage.zqt
    public final void o() {
        this.i.b.sendEmptyMessage(9);
    }

    public final TextureView p(String str) {
        List q = q(str);
        if (q.isEmpty()) {
            return null;
        }
        return (TextureView) q.get(0);
    }

    public final List q(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        zvk zvkVar = this.v;
        if (zvkVar != null) {
            arrayList.add(zvkVar.b(str));
            return arrayList;
        }
        synchronized (this.e) {
            for (ztr ztrVar : this.e.values()) {
                if (str.equals(ztrVar.a)) {
                    arrayList.add(ztrVar.a());
                }
            }
        }
        return arrayList;
    }

    public final void r(TextureView textureView) {
        ztr ztrVar = (ztr) this.e.remove(textureView);
        if (ztrVar != null) {
            ztrVar.c.a(ztrVar.a);
            if (textureView != null) {
                u(textureView.getSurfaceTexture());
            }
        }
    }

    public final void s(String str) {
        if (this.r) {
            zga.c("PresetFilterDebug", str);
        }
    }

    public final void t(List list, ztp ztpVar, boolean z) {
        amkq.N(!this.j.h());
        if (list == null) {
            zga.b("No FilterDescriptors provided!");
            return;
        }
        if (ztpVar == null) {
            zga.b("No Kazoo Supergraph setup provided!");
            return;
        }
        this.j.d(list);
        if (this.c != null) {
            synchronized (this.d) {
                this.d.add(this.c.e(new zsn() { // from class: zqw
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        zrs zrsVar = zrs.this;
                        zrsVar.j.e((FilterMapTable$FilterDescriptor) obj, zrsVar.c.g().d);
                    }
                }));
                List list2 = this.d;
                zsq zsqVar = this.c;
                final zqg zqgVar = this.j;
                zqgVar.getClass();
                list2.add(zsqVar.d(new zsj() { // from class: zrl
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        zqg zqgVar2 = zqg.this;
                        String str = (String) obj;
                        synchronized (zqgVar2.f) {
                            if (zqgVar2.m) {
                                zqgVar2.a.a(str);
                            } else {
                                zqgVar2.f.add(str);
                            }
                        }
                    }
                }));
                this.d.add(this.c.f(new zso() { // from class: zqy
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        zrs zrsVar = zrs.this;
                        List<ztr> list3 = (List) obj;
                        synchronized (zrsVar.e) {
                            for (ztr ztrVar : list3) {
                                zrsVar.e.put(ztrVar.a(), ztrVar);
                            }
                        }
                        zrsVar.j.g((List) Collection.EL.stream(list3).map(opb.l).collect(Collectors.toList()));
                    }
                }));
            }
        }
        if (z) {
            this.j.i = this.y;
        }
        zqg zqgVar2 = this.j;
        zpw zpwVar = this.i;
        zpwVar.getClass();
        zqgVar2.h = new zra(zpwVar);
        this.j.o = new zrj(this);
        F(ztpVar);
    }

    public final void u(SurfaceTexture surfaceTexture) {
        synchronized (this.m) {
            zpe zpeVar = (zpe) this.m.get(surfaceTexture);
            if (zpeVar != null) {
                zpw.i(zpeVar);
                this.m.remove(surfaceTexture);
            }
        }
    }

    public final void v() {
        w(new zrn(this, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(Runnable runnable) {
        this.i.b.post(runnable);
    }

    public final void x(boolean z) {
        ztp ztpVar;
        zqg zqgVar = this.j;
        zqgVar.m = z;
        synchronized (zqgVar.f) {
            if (zqgVar.m) {
                Iterator it = zqgVar.f.iterator();
                while (it.hasNext()) {
                    zqgVar.a.a((String) it.next());
                }
                zqgVar.f.clear();
            }
        }
        if (!z || (ztpVar = this.f) == null) {
            return;
        }
        this.f = null;
        F(ztpVar);
    }

    public final void y(final zsq zsqVar) {
        amkq.N(this.c == null);
        synchronized (this.d) {
            zsqVar.getClass();
            this.c = zsqVar;
            s("VideoEffectPipelineDrishti::setEffectsProvider");
            List list = this.d;
            final zqx zqxVar = new zqx(this, zsqVar, 1);
            synchronized (((ztd) zsqVar).k) {
                ztp ztpVar = ((ztd) zsqVar).g;
                if (ztpVar != null) {
                    zqxVar.a(ztpVar);
                } else {
                    wcy.y(((ztd) zsqVar).k, zqxVar);
                }
            }
            final ztd ztdVar = (ztd) zsqVar;
            final byte[] bArr = null;
            list.add(new zsk(zqxVar, bArr) { // from class: zsy
                public final /* synthetic */ zqx b;

                @Override // defpackage.zsk
                public final void a() {
                    ztd ztdVar2 = ztd.this;
                    zqx zqxVar2 = this.b;
                    synchronized (ztdVar2.k) {
                        ztdVar2.k.remove(zqxVar2);
                    }
                }
            });
            List list2 = this.d;
            final zsp zspVar = new zsp() { // from class: zqz
                /* JADX WARN: Type inference failed for: r2v4, types: [zrk, java.lang.Object] */
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    FilterMapTable$FilterDescriptor a;
                    Effect a2;
                    final zrs zrsVar = zrs.this;
                    zsq zsqVar2 = zsqVar;
                    zrsVar.s("VideoEffectPipelineDrishti::XenoSetupListenerCallback");
                    zrsVar.s("VideoEffectPipelineDrishti::prepareXenoVideoProcessor");
                    awys awysVar = new awys(zrsVar.i.a());
                    zpw zpwVar = zrsVar.i;
                    zpwVar.getClass();
                    awysVar.c(new zra(zpwVar));
                    zrsVar.i.o(awysVar, new zpq() { // from class: zrh
                        @Override // defpackage.zpq
                        public final boolean a() {
                            zrs.this.s("VideoEffectPipelineDrishti::setXenoProcessor onSetUp");
                            return true;
                        }
                    });
                    zrsVar.k = awysVar;
                    List list3 = zrsVar.d;
                    final ?? r2 = new zfi() { // from class: zrk
                        @Override // defpackage.zfi
                        public final void a(Object obj2) {
                            zrs zrsVar2 = zrs.this;
                            final Effect effect = (Effect) obj2;
                            if (zrsVar2.k == null) {
                                zga.l("Set effect called without initialized xenoProcessor.");
                                return;
                            }
                            if (effect == null) {
                                zrsVar2.s("VideoEffectPipelineDrishti::setXenoEffect to bypass mode ");
                            } else {
                                String valueOf = String.valueOf(effect.toString());
                                zrsVar2.s(valueOf.length() != 0 ? "VideoEffectPipelineDrishti::setXenoEffect: ".concat(valueOf) : new String("VideoEffectPipelineDrishti::setXenoEffect: "));
                            }
                            final ProcessorBase processorBase = zrsVar2.k;
                            final zrb zrbVar = new zrb(zrsVar2, effect);
                            long j = 0;
                            if (effect != null && effect.b.get()) {
                                j = effect.a;
                            }
                            ProcessorBase.nativeSetEffect(processorBase.d, j, new ProcessorBase.Callback() { // from class: awyt
                                @Override // com.google.research.xeno.effect.ProcessorBase.Callback
                                public final void onCompletion(boolean z, String str) {
                                    ProcessorBase processorBase2 = ProcessorBase.this;
                                    Effect effect2 = effect;
                                    ProcessorBase.Callback callback = zrbVar;
                                    if (z) {
                                        processorBase2.i = effect2;
                                    } else if (!str.equals("xeno::effect::EffectWasReconfiguredStatus()")) {
                                        processorBase2.i = null;
                                    }
                                    zrb zrbVar2 = (zrb) callback;
                                    zrs zrsVar3 = zrbVar2.a;
                                    Effect effect3 = zrbVar2.b;
                                    if (!z) {
                                        String valueOf2 = String.valueOf(str);
                                        zga.b(valueOf2.length() != 0 ? "Error setting Xeno effect. ".concat(valueOf2) : new String("Error setting Xeno effect. "));
                                        String obj3 = effect3.toString();
                                        StringBuilder sb = new StringBuilder(String.valueOf(obj3).length() + 58 + String.valueOf(str).length());
                                        sb.append("VideoEffectPipelineDrishti::setXenoEffect ERROR: ");
                                        sb.append(obj3);
                                        sb.append(", error: ");
                                        sb.append(str);
                                        zrsVar3.s(sb.toString());
                                        return;
                                    }
                                    if (effect3 == null || effect3.a() == null) {
                                        return;
                                    }
                                    boolean z2 = zrsVar3.b;
                                    int intValue = effect3.a().intValue();
                                    Handler handler = zrsVar3.i.b;
                                    handler.sendMessage(handler.obtainMessage(12, Integer.valueOf(intValue + (!z2 ? 1 : 0))));
                                    String valueOf3 = String.valueOf(effect3.toString());
                                    zrsVar3.s(valueOf3.length() != 0 ? "VideoEffectPipelineDrishti::setXenoEffect SUCCESS: ".concat(valueOf3) : new String("VideoEffectPipelineDrishti::setXenoEffect SUCCESS: "));
                                }
                            });
                        }
                    };
                    final ztd ztdVar2 = (ztd) zsqVar2;
                    synchronized (ztdVar2.o) {
                        if (((ztd) zsqVar2).b != null && (a = FilterMapTable$FilterDescriptor.a(((ztd) zsqVar2).s, ((ztd) zsqVar2).u)) != null && (a2 = ((ztd) zsqVar2).b.a(a.a)) != null) {
                            r2.a(a2);
                        }
                        wcy.y(((ztd) zsqVar2).o, r2);
                    }
                    list3.add(new zsk() { // from class: zsu
                        @Override // defpackage.zsk
                        public final void a() {
                            ztd ztdVar3 = ztd.this;
                            zrk zrkVar = r2;
                            synchronized (ztdVar3.o) {
                                ztdVar3.o.remove(zrkVar);
                            }
                        }
                    });
                    List list4 = zrsVar.d;
                    final zqx zqxVar2 = new zqx(zrsVar, zsqVar2, 0);
                    synchronized (ztdVar2.j) {
                        Map map = ((ztd) zsqVar2).f;
                        if (map != null) {
                            zqxVar2.a(map);
                        } else {
                            wcy.y(((ztd) zsqVar2).j, zqxVar2);
                        }
                    }
                    list4.add(new zsk() { // from class: zta
                        @Override // defpackage.zsk
                        public final void a() {
                            ztd ztdVar3 = ztd.this;
                            zqx zqxVar3 = zqxVar2;
                            synchronized (ztdVar3.j) {
                                ztdVar3.j.remove(zqxVar3);
                            }
                        }
                    });
                }
            };
            synchronized (((ztd) zsqVar).l) {
                if (((ztd) zsqVar).x) {
                    zspVar.a(null);
                } else {
                    wcy.y(((ztd) zsqVar).l, zspVar);
                }
            }
            final ztd ztdVar2 = (ztd) zsqVar;
            list2.add(new zsk() { // from class: ztb
                @Override // defpackage.zsk
                public final void a() {
                    ztd ztdVar3 = ztd.this;
                    zsp zspVar2 = zspVar;
                    synchronized (ztdVar3.l) {
                        ztdVar3.l.remove(zspVar2);
                    }
                }
            });
        }
    }

    public final void z(int i) {
        Handler handler = this.i.b;
        handler.sendMessage(handler.obtainMessage(15, Integer.valueOf(i)));
    }

    public zrs(Context context, zsc zscVar, EGLContext eGLContext, boolean z, zpi zpiVar, boolean z2) {
        this.a = new Rect();
        this.q = 500L;
        this.s = new zrn(this, 0);
        context.getClass();
        HandlerThread handlerThread = new HandlerThread(zpw.class.getSimpleName());
        this.h = handlerThread;
        handlerThread.start();
        zqc zqcVar = new zqc();
        this.u = zqcVar;
        this.d = new ArrayList();
        this.e = new ConcurrentHashMap();
        zpw zpwVar = new zpw(zscVar, handlerThread.getLooper(), eGLContext, z);
        this.i = zpwVar;
        zpwVar.y = this;
        aaea ce = ((zrq) alta.t(context, zrq.class)).ce();
        avxn avxnVar = ce.a().s;
        int Y = awxr.Y((avxnVar == null ? avxn.a : avxnVar).h);
        zpwVar.K = Y == 0 ? 1 : Y;
        avxn avxnVar2 = ce.a().s;
        this.b = (avxnVar2 == null ? avxn.a : avxnVar2).m;
        this.j = new zqg(zqcVar, zpwVar, zpwVar.a(), this, zpiVar, z2);
        this.t = zpiVar;
        this.m = new HashMap();
        zqi zqiVar = new zqi(context);
        this.y = zqiVar;
        this.g = new zrx(zqcVar, zqiVar);
    }
}
