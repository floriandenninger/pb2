package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.youtube.upload.service.UploadService;
import com.google.android.libraries.youtube.upload.service.UploadsBootReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akze implements akxi, akyp, alby, aldm {
    public final Context c;
    public final Executor d;
    public final akwm e;
    public final aldn f;
    public final akzg g;
    public final albz h;
    public int i;
    final zgd k;
    String m;
    public final axze q;
    private final shf r;
    private final akxh s;
    private final akyo t;
    private final akyk u;
    boolean a = false;
    boolean b = false;
    int j = 0;
    public final Object l = new Object();
    final HashMap n = new HashMap();
    final Set o = new HashSet();
    final Set p = new HashSet();
    private final yne v = new akzc(UploadService.class);

    public akze(Context context, shf shfVar, Executor executor, akwm akwmVar, axze axzeVar, aldn aldnVar, akxh akxhVar, akzg akzgVar, akyo akyoVar, akyk akykVar, albz albzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = context;
        this.r = shfVar;
        this.d = executor;
        this.e = akwmVar;
        this.q = axzeVar;
        this.f = aldnVar;
        this.s = akxhVar;
        this.g = akzgVar;
        this.t = akyoVar;
        this.u = akykVar;
        this.h = albzVar;
        this.k = new akzb(akzgVar);
    }

    private final void I(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Job finished ".concat(valueOf);
        }
        synchronized (this.l) {
            akzd akzdVar = (akzd) this.n.get(str);
            if (akzdVar != null) {
                akzdVar.c = true;
                this.o.add(str);
            }
        }
    }

    public final void A(final String str) {
        this.d.execute(new Runnable() { // from class: akyv
            @Override // java.lang.Runnable
            public final void run() {
                akze akzeVar = akze.this;
                String str2 = str;
                synchronized (akzeVar.l) {
                    akzeVar.z(str2);
                }
                akzeVar.G();
            }
        });
    }

    @Deprecated
    public final void B(akzi akziVar) {
        D(null);
        this.d.execute(new akyt(this, akziVar, 1));
    }

    public final void C() {
        if (this.b) {
            return;
        }
        this.s.p(this);
        this.t.b(this);
        this.u.b(this);
        this.f.a(this);
        this.h.a.addIfAbsent(this);
        this.b = true;
        H();
    }

    public final void D(Uri uri) {
        Intent intent = new Intent(this.c, (Class<?>) UploadService.class);
        if (uri != null) {
            try {
                this.c.getContentResolver().takePersistableUriPermission(uri, 1);
            } catch (SecurityException unused) {
            }
            intent.setData(uri);
            intent.setFlags(1);
        }
        yny.f(this.c, intent);
    }

    public final void E(Uri uri) {
        yjk.f();
        D(uri);
        this.d.execute(new akyz(this, 0));
    }

    public final void F() {
        akzj akzjVar = (akzj) this.v.b();
        if (akzjVar != null) {
            UploadService uploadService = akzjVar.a;
            uploadService.a = false;
            if (Build.VERSION.SDK_INT < 24 || uploadService.getApplicationInfo().targetSdkVersion < 24) {
                uploadService.stopForeground(false);
            } else {
                uploadService.stopForeground(2);
            }
            uploadService.stopSelf();
            this.v.d(this.c);
            if (this.a) {
                Context context = this.c;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) UploadsBootReceiver.class), 2, 1);
                this.a = false;
            }
        }
        NotificationManager notificationManager = (NotificationManager) this.c.getSystemService("notification");
        if (this.p.isEmpty()) {
            notificationManager.cancel(5);
        } else {
            H();
            dy dyVar = (dy) this.k.get();
            this.g.a(dyVar, this.j);
            notificationManager.notify(5, dyVar.b());
        }
        if (this.b) {
            this.s.q(this);
            this.t.d(this);
            this.u.d(this);
            this.f.b.remove(this);
            this.h.a.remove(this);
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G() {
        this.d.execute(new Runnable() { // from class: akza
            /* JADX WARN: Removed duplicated region for block: B:22:0x0272 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:11:0x0010, B:12:0x002e, B:14:0x003d, B:15:0x0041, B:17:0x0057, B:19:0x0258, B:20:0x026a, B:22:0x0272, B:23:0x0278, B:25:0x027e, B:27:0x028b, B:29:0x028f, B:30:0x0292, B:33:0x0061, B:35:0x0090, B:36:0x009a, B:38:0x00a6, B:40:0x00ac, B:41:0x0113, B:43:0x011b, B:44:0x0125, B:46:0x012a, B:47:0x0134, B:49:0x013c, B:50:0x0168, B:52:0x0177, B:56:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:66:0x01b7, B:68:0x01be, B:70:0x01f2, B:72:0x01f6, B:74:0x0211, B:76:0x022d, B:78:0x0232, B:84:0x0248, B:86:0x024c, B:87:0x0255, B:88:0x023b, B:90:0x0219, B:92:0x0223, B:96:0x01cd, B:98:0x01d2, B:101:0x01dc, B:103:0x01e1, B:104:0x01e7, B:106:0x01ec, B:114:0x00f2, B:116:0x00f8, B:117:0x0103, B:119:0x0109, B:123:0x0025), top: B:3:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x028f A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:11:0x0010, B:12:0x002e, B:14:0x003d, B:15:0x0041, B:17:0x0057, B:19:0x0258, B:20:0x026a, B:22:0x0272, B:23:0x0278, B:25:0x027e, B:27:0x028b, B:29:0x028f, B:30:0x0292, B:33:0x0061, B:35:0x0090, B:36:0x009a, B:38:0x00a6, B:40:0x00ac, B:41:0x0113, B:43:0x011b, B:44:0x0125, B:46:0x012a, B:47:0x0134, B:49:0x013c, B:50:0x0168, B:52:0x0177, B:56:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:66:0x01b7, B:68:0x01be, B:70:0x01f2, B:72:0x01f6, B:74:0x0211, B:76:0x022d, B:78:0x0232, B:84:0x0248, B:86:0x024c, B:87:0x0255, B:88:0x023b, B:90:0x0219, B:92:0x0223, B:96:0x01cd, B:98:0x01d2, B:101:0x01dc, B:103:0x01e1, B:104:0x01e7, B:106:0x01ec, B:114:0x00f2, B:116:0x00f8, B:117:0x0103, B:119:0x0109, B:123:0x0025), top: B:3:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0198 A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:11:0x0010, B:12:0x002e, B:14:0x003d, B:15:0x0041, B:17:0x0057, B:19:0x0258, B:20:0x026a, B:22:0x0272, B:23:0x0278, B:25:0x027e, B:27:0x028b, B:29:0x028f, B:30:0x0292, B:33:0x0061, B:35:0x0090, B:36:0x009a, B:38:0x00a6, B:40:0x00ac, B:41:0x0113, B:43:0x011b, B:44:0x0125, B:46:0x012a, B:47:0x0134, B:49:0x013c, B:50:0x0168, B:52:0x0177, B:56:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:66:0x01b7, B:68:0x01be, B:70:0x01f2, B:72:0x01f6, B:74:0x0211, B:76:0x022d, B:78:0x0232, B:84:0x0248, B:86:0x024c, B:87:0x0255, B:88:0x023b, B:90:0x0219, B:92:0x0223, B:96:0x01cd, B:98:0x01d2, B:101:0x01dc, B:103:0x01e1, B:104:0x01e7, B:106:0x01ec, B:114:0x00f2, B:116:0x00f8, B:117:0x0103, B:119:0x0109, B:123:0x0025), top: B:3:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01b7 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:11:0x0010, B:12:0x002e, B:14:0x003d, B:15:0x0041, B:17:0x0057, B:19:0x0258, B:20:0x026a, B:22:0x0272, B:23:0x0278, B:25:0x027e, B:27:0x028b, B:29:0x028f, B:30:0x0292, B:33:0x0061, B:35:0x0090, B:36:0x009a, B:38:0x00a6, B:40:0x00ac, B:41:0x0113, B:43:0x011b, B:44:0x0125, B:46:0x012a, B:47:0x0134, B:49:0x013c, B:50:0x0168, B:52:0x0177, B:56:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:66:0x01b7, B:68:0x01be, B:70:0x01f2, B:72:0x01f6, B:74:0x0211, B:76:0x022d, B:78:0x0232, B:84:0x0248, B:86:0x024c, B:87:0x0255, B:88:0x023b, B:90:0x0219, B:92:0x0223, B:96:0x01cd, B:98:0x01d2, B:101:0x01dc, B:103:0x01e1, B:104:0x01e7, B:106:0x01ec, B:114:0x00f2, B:116:0x00f8, B:117:0x0103, B:119:0x0109, B:123:0x0025), top: B:3:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01f6 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:11:0x0010, B:12:0x002e, B:14:0x003d, B:15:0x0041, B:17:0x0057, B:19:0x0258, B:20:0x026a, B:22:0x0272, B:23:0x0278, B:25:0x027e, B:27:0x028b, B:29:0x028f, B:30:0x0292, B:33:0x0061, B:35:0x0090, B:36:0x009a, B:38:0x00a6, B:40:0x00ac, B:41:0x0113, B:43:0x011b, B:44:0x0125, B:46:0x012a, B:47:0x0134, B:49:0x013c, B:50:0x0168, B:52:0x0177, B:56:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:66:0x01b7, B:68:0x01be, B:70:0x01f2, B:72:0x01f6, B:74:0x0211, B:76:0x022d, B:78:0x0232, B:84:0x0248, B:86:0x024c, B:87:0x0255, B:88:0x023b, B:90:0x0219, B:92:0x0223, B:96:0x01cd, B:98:0x01d2, B:101:0x01dc, B:103:0x01e1, B:104:0x01e7, B:106:0x01ec, B:114:0x00f2, B:116:0x00f8, B:117:0x0103, B:119:0x0109, B:123:0x0025), top: B:3:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0232 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:11:0x0010, B:12:0x002e, B:14:0x003d, B:15:0x0041, B:17:0x0057, B:19:0x0258, B:20:0x026a, B:22:0x0272, B:23:0x0278, B:25:0x027e, B:27:0x028b, B:29:0x028f, B:30:0x0292, B:33:0x0061, B:35:0x0090, B:36:0x009a, B:38:0x00a6, B:40:0x00ac, B:41:0x0113, B:43:0x011b, B:44:0x0125, B:46:0x012a, B:47:0x0134, B:49:0x013c, B:50:0x0168, B:52:0x0177, B:56:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:66:0x01b7, B:68:0x01be, B:70:0x01f2, B:72:0x01f6, B:74:0x0211, B:76:0x022d, B:78:0x0232, B:84:0x0248, B:86:0x024c, B:87:0x0255, B:88:0x023b, B:90:0x0219, B:92:0x0223, B:96:0x01cd, B:98:0x01d2, B:101:0x01dc, B:103:0x01e1, B:104:0x01e7, B:106:0x01ec, B:114:0x00f2, B:116:0x00f8, B:117:0x0103, B:119:0x0109, B:123:0x0025), top: B:3:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0244  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0219 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:11:0x0010, B:12:0x002e, B:14:0x003d, B:15:0x0041, B:17:0x0057, B:19:0x0258, B:20:0x026a, B:22:0x0272, B:23:0x0278, B:25:0x027e, B:27:0x028b, B:29:0x028f, B:30:0x0292, B:33:0x0061, B:35:0x0090, B:36:0x009a, B:38:0x00a6, B:40:0x00ac, B:41:0x0113, B:43:0x011b, B:44:0x0125, B:46:0x012a, B:47:0x0134, B:49:0x013c, B:50:0x0168, B:52:0x0177, B:56:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:66:0x01b7, B:68:0x01be, B:70:0x01f2, B:72:0x01f6, B:74:0x0211, B:76:0x022d, B:78:0x0232, B:84:0x0248, B:86:0x024c, B:87:0x0255, B:88:0x023b, B:90:0x0219, B:92:0x0223, B:96:0x01cd, B:98:0x01d2, B:101:0x01dc, B:103:0x01e1, B:104:0x01e7, B:106:0x01ec, B:114:0x00f2, B:116:0x00f8, B:117:0x0103, B:119:0x0109, B:123:0x0025), top: B:3:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x01c7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 665
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.akza.run():void");
            }
        });
    }

    public final void H() {
        int i;
        synchronized (this.l) {
            if (this.u.i()) {
                i = 1;
            } else {
                i = this.u.h() ? 2 : 0;
            }
            this.j = i;
        }
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.akxi
    public final void b(String str, long j, long j2) {
        synchronized (this.l) {
            if (str == null) {
                return;
            }
            akzd akzdVar = (akzd) this.n.get(str);
            if (akzdVar == null) {
                return;
            }
            akzdVar.g = j;
            akzdVar.f = j2;
            G();
        }
    }

    @Override // defpackage.akxi
    public final void c(String str, akzw akzwVar) {
        G();
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void d(String str, aufk aufkVar) {
    }

    @Override // defpackage.akxi
    public final void e(String str, double d) {
        synchronized (this.l) {
            if (str == null) {
                return;
            }
            akzd akzdVar = (akzd) this.n.get(str);
            if (akzdVar == null) {
                return;
            }
            akzdVar.h = d;
            G();
        }
    }

    @Override // defpackage.akxi
    public final void f(String str, long j, long j2, double d) {
        if (str == null) {
            return;
        }
        synchronized (this.l) {
            akzd akzdVar = (akzd) this.n.get(str);
            if (akzdVar == null) {
                return;
            }
            akzdVar.e = j;
            akzdVar.f = j2;
            G();
        }
    }

    @Override // defpackage.akxi
    public final void g(String str, akzp akzpVar) {
        G();
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void h(akzs akzsVar) {
    }

    @Override // defpackage.akxi
    public final void i(String str, akzs akzsVar) {
        G();
    }

    @Override // defpackage.akxi
    public final void j(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadFailed ".concat(valueOf);
        }
        I(str);
        G();
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void k(String str, boolean z) {
    }

    @Override // defpackage.akxi
    public final void l(String str, avuh avuhVar) {
        G();
    }

    @Override // defpackage.akxi
    public final void m(String str, String str2) {
        G();
    }

    @Override // defpackage.akxi
    public final void n(String str, akzr akzrVar) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onVideoStatusChange ".concat(valueOf);
        }
        if (akzrVar != akzr.UNKNOWN) {
            I(str);
        }
        G();
    }

    @Override // defpackage.akxi
    public final void o(String str, int i) {
        G();
    }

    @Override // defpackage.aldm
    public final void p(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanAbortedExecution ".concat(valueOf);
        }
        I(str);
        G();
    }

    @Override // defpackage.aldm
    public final void q(String str, akzs akzsVar) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanAdded ".concat(valueOf);
        }
        if (this.h.b(akzsVar)) {
            return;
        }
        I(str);
        G();
    }

    @Override // defpackage.aldm
    public final void r(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanCompleted ".concat(valueOf);
        }
        I(str);
        G();
    }

    @Override // defpackage.akyp
    public final void rW(akyq akyqVar) {
        this.d.execute(new akyz(this, 1));
    }

    @Override // defpackage.aldm
    public final void s(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanPaused ".concat(valueOf);
        }
        H();
        G();
    }

    @Override // defpackage.aldm
    public final void t(String str) {
        synchronized (this.l) {
            I(str);
            this.p.add(str);
        }
        G();
    }

    public final void u(akzi akziVar) {
        String str = akziVar.a;
        Bitmap bitmap = akziVar.b;
        byte[] bArr = akziVar.c;
        if (((akzd) this.n.get(str)) != null) {
            return;
        }
        akzd akzdVar = new akzd(str);
        akzdVar.b = this.r.c();
        akzdVar.i = bArr;
        if (bitmap != null) {
            Resources resources = this.c.getResources();
            try {
                akzdVar.d = ThumbnailUtils.extractThumbnail(bitmap, (int) resources.getDimension(R.dimen.notification_large_icon_width), (int) resources.getDimension(R.dimen.notification_large_icon_height));
            } catch (IllegalArgumentException e) {
                zga.i("Extracting thumbnail failed", e);
                akzdVar.d = null;
            }
        }
        this.n.put(akzdVar.a, akzdVar);
        this.p.remove(akzdVar.a);
        if (this.m == null) {
            this.m = akzdVar.a;
        }
    }

    public final void v(final String str) {
        D(null);
        ynm.j(anfq.i(anaf.T(new anfy() { // from class: akyx
            @Override // defpackage.anfy
            public final anhy a() {
                akze akzeVar = akze.this;
                String str2 = str;
                synchronized (akzeVar.l) {
                    akzeVar.w();
                    akzeVar.u(akzi.a(str2).a());
                    akzeVar.C();
                }
                return anhv.a;
            }
        }, this.d), new anfz() { // from class: akyy
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                akze akzeVar = akze.this;
                akzeVar.f.i(str);
                akzeVar.G();
                return anhv.a;
            }
        }, this.d), this.d, new ynk() { // from class: akys
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                akze akzeVar = akze.this;
                zga.f("ForegroundUploadController", "Cannot cancel the executing flow.", th);
                akzeVar.q.e("Cannot cancel the executing flow.", th);
                akzeVar.G();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        akzj akzjVar = (akzj) this.v.b();
        if (akzjVar == null) {
            akzjVar = (akzj) this.v.a(this.c);
        }
        Notification b = ((dy) this.k.get()).b();
        UploadService uploadService = akzjVar.a;
        if (!uploadService.a) {
            uploadService.a = true;
            uploadService.startForeground(5, b);
        }
        if (this.a) {
            return;
        }
        Context context = this.c;
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) UploadsBootReceiver.class), 1, 1);
        this.a = true;
    }

    public final void x(alcb alcbVar) {
        this.d.execute(new akyu(this, alcbVar, 1));
    }

    @Override // defpackage.alby
    public final void y(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanNotificationCompleted ".concat(valueOf);
        }
        I(str);
        G();
    }

    public final void z(String str) {
        String str2;
        akzd akzdVar = (akzd) this.n.remove(str);
        String str3 = this.m;
        if (str3 == null || !str3.equals(str) || akzdVar == null) {
            return;
        }
        synchronized (this.l) {
            long j = akzdVar.b;
            str2 = null;
            long j2 = Long.MAX_VALUE;
            for (String str4 : this.n.keySet()) {
                akzd akzdVar2 = (akzd) this.n.get(str4);
                if (!akzdVar2.c) {
                    long j3 = akzdVar2.b;
                    if (j3 > j && j3 < j2) {
                        str2 = str4;
                        j2 = j3;
                    }
                }
            }
        }
        this.m = str2;
    }
}
