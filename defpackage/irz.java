package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.apps.youtube.app.extensions.upload.UploadFrontendIdMapHelper;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class irz implements wlx, akvt {
    AlertDialog A;
    public UploadFrontendIdMapHelper B;
    public final List C;
    public final akwd D;
    public final akvf E;
    public final akyb F;
    public final akva G;
    public final akwb H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f225J;
    public boolean K;
    public anhy L;
    anhy M;
    anhy N;
    public List R;
    public boolean S;
    public boolean T;
    public final String U;
    public final boolean W;
    public Boolean Y;
    public final UploadActivity a;
    public final akwg aa;
    public final aloh ab;
    public final axze ac;
    private final SharedPreferences ad;
    private final afsy ae;
    private final akai af;
    private final akvq ag;
    private final azrw ah;
    private final aaxn ai;
    public final anib b;
    public final aahd c;
    public final aseb d;
    public final aaea e;
    public final zyp f;
    public final zto g;
    public acra h;
    public final aksl i;
    public final gbh j;
    public final gcl k;
    public boolean l;
    public wlu m;
    public boolean n;
    public long o;
    public long p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public irx t;
    public ViewAnimatorHelper u;
    public ScrollView v;
    public ImageView w;
    public ImageView x;
    public TextView y;
    public zyd z;
    public int Z = 1;
    final List O = new ArrayList();
    public int P = 0;
    public boolean Q = false;
    public avtn V = avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
    public boolean X = false;

    public irz(UploadActivity uploadActivity, anib anibVar, aahd aahdVar, ysy ysyVar, aseb asebVar, aaea aaeaVar, aaxn aaxnVar, akwg akwgVar, zto ztoVar, aksl akslVar, akwd akwdVar, akvf akvfVar, akvq akvqVar, akyb akybVar, akva akvaVar, gbh gbhVar, gcl gclVar, afsy afsyVar, akwb akwbVar, axze axzeVar, akai akaiVar, azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        boolean z;
        boolean z2 = true;
        this.a = uploadActivity;
        this.b = anibVar;
        this.c = aahdVar;
        this.d = asebVar;
        this.ai = aaxnVar;
        this.e = aaeaVar;
        this.aa = akwgVar;
        this.g = ztoVar;
        this.i = akslVar;
        this.D = akwdVar;
        this.E = akvfVar;
        this.ag = akvqVar;
        this.F = akybVar;
        this.G = akvaVar;
        this.j = gbhVar;
        this.k = gclVar;
        this.ae = afsyVar;
        this.H = akwbVar;
        this.ac = axzeVar;
        this.af = akaiVar;
        this.ah = azrwVar;
        j();
        Intent intent = uploadActivity.getIntent();
        this.U = intent != null ? intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id") : null;
        SharedPreferences sharedPreferences = uploadActivity.getSharedPreferences("youtube", 0);
        this.ad = sharedPreferences;
        boolean z3 = sharedPreferences.getBoolean("enable_upload_video_editing", false) || asebVar.n;
        this.q = z3;
        this.r = (sharedPreferences.getBoolean("enable_upload_filters", false) || asebVar.p) && z3;
        if (asebVar.s) {
            z = true;
        } else {
            uploadActivity.getApplicationContext();
            z = false;
        }
        this.s = z;
        this.f = new zyp(uploadActivity, sharedPreferences, ysyVar, new irv(this));
        this.C = new ArrayList();
        avuj avujVar = aaeaVar.a().h;
        if (!(avujVar == null ? avuj.a : avujVar).v) {
            akwgVar.b();
            z2 = false;
        }
        this.W = z2;
        this.ab = new aloh(uploadActivity, (byte[]) null);
    }

    private static void v(anhy anhyVar) {
        if (anhyVar == null || anhyVar.isDone()) {
            return;
        }
        anhyVar.cancel(true);
    }

    private final void w(final boolean z) {
        this.Q = z;
        this.a.runOnUiThread(new Runnable() { // from class: irp
            @Override // java.lang.Runnable
            public final void run() {
                irz irzVar = irz.this;
                boolean z2 = z;
                isf isfVar = irzVar.a.Z;
                if (isfVar != null) {
                    isfVar.b(z2);
                }
            }
        });
    }

    @Override // defpackage.akvt
    public final void a(final String str) {
        this.a.runOnUiThread(new Runnable() { // from class: iro
            @Override // java.lang.Runnable
            public final void run() {
                irz irzVar = irz.this;
                String str2 = str;
                if (!irzVar.T || irzVar.a.isFinishing() || irzVar.a.isDestroyed()) {
                    return;
                }
                if (irzVar.B.f(str2)) {
                    irzVar.B.b(str2, irzVar.E);
                } else {
                    irzVar.B.d(str2);
                }
                if (irzVar.C.isEmpty()) {
                    return;
                }
                Iterator it = irzVar.C.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((alca) it.next()).e().equals(str2)) {
                        it.remove();
                        irzVar.P++;
                        break;
                    }
                }
                irzVar.m();
            }
        });
    }

    @Override // defpackage.akvt
    public final void b(String str) {
    }

    public final asht c() {
        return akwg.k(this.C, this.U);
    }

    public final void d() {
        this.a.x();
    }

    public final synchronized void e() {
        if (this.Z != 1) {
            s(7);
        }
    }

    public final void f() {
        if (this.C.isEmpty() || this.A != null || this.a.X == null || !this.Q) {
            return;
        }
        for (alca alcaVar : this.C) {
            this.F.h(alcaVar.e(), avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_FINALIZE_UPLOAD, alcaVar.d());
        }
        w(false);
        zyd zydVar = this.z;
        vsy bs = zydVar != null ? zydVar.bs() : null;
        if (bs != null) {
            this.o = bs.k() - bs.m();
        } else {
            Uri a = akva.a(this.a.getIntent());
            if (!a.equals(Uri.EMPTY)) {
                Long h = zyk.h(a);
                if (h != null) {
                    this.o = h.longValue();
                } else {
                    Iterator it = this.C.iterator();
                    while (it.hasNext()) {
                        akzl akzlVar = ((alca) it.next()).n;
                        if (akzlVar != null && (akzlVar.b & 2) != 0) {
                            long j = akzlVar.d;
                            if (j > this.o) {
                                this.o = j;
                            }
                        }
                    }
                }
            }
        }
        if (!this.n || TimeUnit.MILLISECONDS.toSeconds(this.o) < this.p) {
            s(8);
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.o);
        aaxn aaxnVar = this.ai;
        aaxnVar.b.e(aaxnVar.i(Optional.of(Float.valueOf((float) seconds)), 2), new iru(this));
    }

    public final void g(int i, asht ashtVar) {
        acqx acqxVar = new acqx(acsb.c(i));
        ((acqq) this.h).D(acqxVar);
        this.h.w(acqxVar, ashtVar);
    }

    @Override // defpackage.wlx
    public final void h() {
        this.h.d(acsb.b(9729), null, akwg.k(this.C, this.U));
        dd supportFragmentManager = this.a.getSupportFragmentManager();
        this.m = (wlu) supportFragmentManager.f("verificationFragmentTag");
        dn k = supportFragmentManager.k();
        k.m(this.m);
        k.a();
        supportFragmentManager.aa();
        this.u.b(R.id.shared_mde_view);
        w(true);
    }

    @Override // defpackage.wlx
    public final void i() {
        this.h.d(acsb.b(9729), null, akwg.k(this.C, this.U));
        s(8);
    }

    public final void j() {
        this.Z = 1;
        this.K = false;
        this.A = null;
        v(this.L);
        v(this.M);
        v(this.N);
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            v((anhy) it.next());
        }
        this.O.clear();
        w(false);
    }

    public final void k() {
        this.a.runOnUiThread(new Runnable() { // from class: irn
            @Override // java.lang.Runnable
            public final void run() {
                irz.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(euc eucVar, Context context, String str) {
        if (!this.T || eucVar.isDestroyed() || eucVar.isFinishing()) {
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(R.string.too_many_external_uploads_error_title).setMessage(str).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: irh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                irz irzVar = irz.this;
                irzVar.A = null;
                if (irzVar.C.isEmpty()) {
                    irzVar.d();
                } else {
                    dialogInterface.dismiss();
                }
            }
        }).setCancelable(false).create();
        this.A = create;
        create.show();
    }

    public final void m() {
        UploadActivity uploadActivity = this.a;
        l(uploadActivity, uploadActivity, uploadActivity.getResources().getQuantityString(R.plurals.invalid_uploads_error_msg, this.P + this.C.size()));
    }

    public final void n() {
        new akam(akal.d(this.a), this.h, Arrays.asList(new PermissionDescriptor(0, acrb.UPLOAD_VIDEO_APPROVE_STORAGE_BUTTON, acrb.UPLOAD_VIDEO_DENY_STORAGE_BUTTON)), R.string.upload_external_permission_snackbar_description, 0, bqc.e, bqc.f, this.af).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x04c9 A[Catch: all -> 0x08af, TryCatch #3 {, blocks: (B:4:0x0003, B:22:0x0022, B:24:0x002a, B:25:0x0030, B:26:0x004b, B:28:0x0051, B:30:0x0061, B:32:0x006e, B:33:0x0077, B:34:0x00a7, B:36:0x00b1, B:37:0x00bd, B:39:0x00c3, B:41:0x00c9, B:44:0x00cf, B:47:0x00d7, B:49:0x00e1, B:52:0x00ea, B:54:0x0106, B:55:0x0109, B:66:0x0112, B:68:0x011b, B:70:0x011f, B:71:0x0121, B:73:0x0129, B:74:0x0139, B:76:0x013d, B:77:0x013f, B:79:0x0145, B:81:0x0149, B:82:0x014b, B:84:0x0153, B:86:0x0157, B:87:0x0159, B:88:0x015b, B:90:0x0163, B:92:0x018f, B:93:0x01ca, B:96:0x01d8, B:97:0x01e1, B:99:0x01e5, B:100:0x01e7, B:102:0x01ed, B:103:0x01ef, B:105:0x01f5, B:107:0x01f9, B:108:0x01fb, B:110:0x0203, B:112:0x0207, B:113:0x0209, B:114:0x020b, B:116:0x020f, B:117:0x0211, B:120:0x021a, B:123:0x0220, B:124:0x0228, B:126:0x0241, B:127:0x0252, B:129:0x025a, B:131:0x0266, B:133:0x0271, B:135:0x027d, B:136:0x027f, B:141:0x028a, B:142:0x028d, B:143:0x0290, B:144:0x0292, B:146:0x02a7, B:148:0x02ab, B:150:0x02af, B:152:0x02b3, B:154:0x02b7, B:156:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:163:0x0351, B:165:0x0378, B:166:0x0367, B:170:0x0390, B:172:0x0399, B:173:0x039e, B:175:0x03a2, B:176:0x03a7, B:178:0x03ab, B:179:0x03b0, B:181:0x03b4, B:182:0x03b9, B:184:0x03bd, B:185:0x03c2, B:187:0x03c6, B:188:0x03cb, B:190:0x03cf, B:191:0x03d4, B:192:0x03f8, B:200:0x03f9, B:201:0x0400, B:202:0x0223, B:203:0x0226, B:207:0x0085, B:209:0x008b, B:212:0x009e, B:214:0x0401, B:215:0x0413, B:217:0x0419, B:219:0x041f, B:223:0x0432, B:225:0x0436, B:227:0x0442, B:229:0x044a, B:231:0x0454, B:234:0x0464, B:237:0x046a, B:240:0x0475, B:242:0x0481, B:243:0x048b, B:246:0x0486, B:249:0x045e, B:252:0x0491, B:255:0x049a, B:257:0x04b5, B:261:0x04bf, B:263:0x04c9, B:266:0x04d6, B:268:0x04dc, B:270:0x04e4, B:272:0x04ea, B:273:0x051a, B:275:0x0520, B:276:0x056a, B:278:0x0570, B:279:0x06bc, B:280:0x0585, B:282:0x058d, B:284:0x0597, B:286:0x059f, B:289:0x05b7, B:292:0x05d4, B:293:0x05d0, B:294:0x05b3, B:295:0x05e3, B:297:0x05eb, B:299:0x05f4, B:302:0x061b, B:305:0x0636, B:306:0x063a, B:309:0x0609, B:311:0x0611, B:312:0x0616, B:313:0x065c, B:315:0x0664, B:317:0x0670, B:318:0x0680, B:320:0x068c, B:321:0x069e, B:323:0x06aa, B:324:0x070d, B:326:0x0719, B:327:0x072c, B:329:0x0730, B:335:0x0737, B:337:0x073d, B:340:0x0759, B:342:0x075d, B:345:0x0766, B:348:0x0796, B:351:0x079b, B:353:0x07a3, B:354:0x07b1, B:356:0x07b7, B:358:0x07cd, B:360:0x07de, B:363:0x07e3, B:367:0x0804, B:370:0x0830, B:372:0x0834, B:375:0x0870, B:378:0x083e, B:381:0x0869, B:382:0x0877, B:384:0x0888, B:386:0x0890, B:389:0x089a, B:391:0x089e, B:395:0x08a8, B:399:0x08ae), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04dc A[Catch: all -> 0x08af, TryCatch #3 {, blocks: (B:4:0x0003, B:22:0x0022, B:24:0x002a, B:25:0x0030, B:26:0x004b, B:28:0x0051, B:30:0x0061, B:32:0x006e, B:33:0x0077, B:34:0x00a7, B:36:0x00b1, B:37:0x00bd, B:39:0x00c3, B:41:0x00c9, B:44:0x00cf, B:47:0x00d7, B:49:0x00e1, B:52:0x00ea, B:54:0x0106, B:55:0x0109, B:66:0x0112, B:68:0x011b, B:70:0x011f, B:71:0x0121, B:73:0x0129, B:74:0x0139, B:76:0x013d, B:77:0x013f, B:79:0x0145, B:81:0x0149, B:82:0x014b, B:84:0x0153, B:86:0x0157, B:87:0x0159, B:88:0x015b, B:90:0x0163, B:92:0x018f, B:93:0x01ca, B:96:0x01d8, B:97:0x01e1, B:99:0x01e5, B:100:0x01e7, B:102:0x01ed, B:103:0x01ef, B:105:0x01f5, B:107:0x01f9, B:108:0x01fb, B:110:0x0203, B:112:0x0207, B:113:0x0209, B:114:0x020b, B:116:0x020f, B:117:0x0211, B:120:0x021a, B:123:0x0220, B:124:0x0228, B:126:0x0241, B:127:0x0252, B:129:0x025a, B:131:0x0266, B:133:0x0271, B:135:0x027d, B:136:0x027f, B:141:0x028a, B:142:0x028d, B:143:0x0290, B:144:0x0292, B:146:0x02a7, B:148:0x02ab, B:150:0x02af, B:152:0x02b3, B:154:0x02b7, B:156:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:163:0x0351, B:165:0x0378, B:166:0x0367, B:170:0x0390, B:172:0x0399, B:173:0x039e, B:175:0x03a2, B:176:0x03a7, B:178:0x03ab, B:179:0x03b0, B:181:0x03b4, B:182:0x03b9, B:184:0x03bd, B:185:0x03c2, B:187:0x03c6, B:188:0x03cb, B:190:0x03cf, B:191:0x03d4, B:192:0x03f8, B:200:0x03f9, B:201:0x0400, B:202:0x0223, B:203:0x0226, B:207:0x0085, B:209:0x008b, B:212:0x009e, B:214:0x0401, B:215:0x0413, B:217:0x0419, B:219:0x041f, B:223:0x0432, B:225:0x0436, B:227:0x0442, B:229:0x044a, B:231:0x0454, B:234:0x0464, B:237:0x046a, B:240:0x0475, B:242:0x0481, B:243:0x048b, B:246:0x0486, B:249:0x045e, B:252:0x0491, B:255:0x049a, B:257:0x04b5, B:261:0x04bf, B:263:0x04c9, B:266:0x04d6, B:268:0x04dc, B:270:0x04e4, B:272:0x04ea, B:273:0x051a, B:275:0x0520, B:276:0x056a, B:278:0x0570, B:279:0x06bc, B:280:0x0585, B:282:0x058d, B:284:0x0597, B:286:0x059f, B:289:0x05b7, B:292:0x05d4, B:293:0x05d0, B:294:0x05b3, B:295:0x05e3, B:297:0x05eb, B:299:0x05f4, B:302:0x061b, B:305:0x0636, B:306:0x063a, B:309:0x0609, B:311:0x0611, B:312:0x0616, B:313:0x065c, B:315:0x0664, B:317:0x0670, B:318:0x0680, B:320:0x068c, B:321:0x069e, B:323:0x06aa, B:324:0x070d, B:326:0x0719, B:327:0x072c, B:329:0x0730, B:335:0x0737, B:337:0x073d, B:340:0x0759, B:342:0x075d, B:345:0x0766, B:348:0x0796, B:351:0x079b, B:353:0x07a3, B:354:0x07b1, B:356:0x07b7, B:358:0x07cd, B:360:0x07de, B:363:0x07e3, B:367:0x0804, B:370:0x0830, B:372:0x0834, B:375:0x0870, B:378:0x083e, B:381:0x0869, B:382:0x0877, B:384:0x0888, B:386:0x0890, B:389:0x089a, B:391:0x089e, B:395:0x08a8, B:399:0x08ae), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0719 A[Catch: all -> 0x08af, TryCatch #3 {, blocks: (B:4:0x0003, B:22:0x0022, B:24:0x002a, B:25:0x0030, B:26:0x004b, B:28:0x0051, B:30:0x0061, B:32:0x006e, B:33:0x0077, B:34:0x00a7, B:36:0x00b1, B:37:0x00bd, B:39:0x00c3, B:41:0x00c9, B:44:0x00cf, B:47:0x00d7, B:49:0x00e1, B:52:0x00ea, B:54:0x0106, B:55:0x0109, B:66:0x0112, B:68:0x011b, B:70:0x011f, B:71:0x0121, B:73:0x0129, B:74:0x0139, B:76:0x013d, B:77:0x013f, B:79:0x0145, B:81:0x0149, B:82:0x014b, B:84:0x0153, B:86:0x0157, B:87:0x0159, B:88:0x015b, B:90:0x0163, B:92:0x018f, B:93:0x01ca, B:96:0x01d8, B:97:0x01e1, B:99:0x01e5, B:100:0x01e7, B:102:0x01ed, B:103:0x01ef, B:105:0x01f5, B:107:0x01f9, B:108:0x01fb, B:110:0x0203, B:112:0x0207, B:113:0x0209, B:114:0x020b, B:116:0x020f, B:117:0x0211, B:120:0x021a, B:123:0x0220, B:124:0x0228, B:126:0x0241, B:127:0x0252, B:129:0x025a, B:131:0x0266, B:133:0x0271, B:135:0x027d, B:136:0x027f, B:141:0x028a, B:142:0x028d, B:143:0x0290, B:144:0x0292, B:146:0x02a7, B:148:0x02ab, B:150:0x02af, B:152:0x02b3, B:154:0x02b7, B:156:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:163:0x0351, B:165:0x0378, B:166:0x0367, B:170:0x0390, B:172:0x0399, B:173:0x039e, B:175:0x03a2, B:176:0x03a7, B:178:0x03ab, B:179:0x03b0, B:181:0x03b4, B:182:0x03b9, B:184:0x03bd, B:185:0x03c2, B:187:0x03c6, B:188:0x03cb, B:190:0x03cf, B:191:0x03d4, B:192:0x03f8, B:200:0x03f9, B:201:0x0400, B:202:0x0223, B:203:0x0226, B:207:0x0085, B:209:0x008b, B:212:0x009e, B:214:0x0401, B:215:0x0413, B:217:0x0419, B:219:0x041f, B:223:0x0432, B:225:0x0436, B:227:0x0442, B:229:0x044a, B:231:0x0454, B:234:0x0464, B:237:0x046a, B:240:0x0475, B:242:0x0481, B:243:0x048b, B:246:0x0486, B:249:0x045e, B:252:0x0491, B:255:0x049a, B:257:0x04b5, B:261:0x04bf, B:263:0x04c9, B:266:0x04d6, B:268:0x04dc, B:270:0x04e4, B:272:0x04ea, B:273:0x051a, B:275:0x0520, B:276:0x056a, B:278:0x0570, B:279:0x06bc, B:280:0x0585, B:282:0x058d, B:284:0x0597, B:286:0x059f, B:289:0x05b7, B:292:0x05d4, B:293:0x05d0, B:294:0x05b3, B:295:0x05e3, B:297:0x05eb, B:299:0x05f4, B:302:0x061b, B:305:0x0636, B:306:0x063a, B:309:0x0609, B:311:0x0611, B:312:0x0616, B:313:0x065c, B:315:0x0664, B:317:0x0670, B:318:0x0680, B:320:0x068c, B:321:0x069e, B:323:0x06aa, B:324:0x070d, B:326:0x0719, B:327:0x072c, B:329:0x0730, B:335:0x0737, B:337:0x073d, B:340:0x0759, B:342:0x075d, B:345:0x0766, B:348:0x0796, B:351:0x079b, B:353:0x07a3, B:354:0x07b1, B:356:0x07b7, B:358:0x07cd, B:360:0x07de, B:363:0x07e3, B:367:0x0804, B:370:0x0830, B:372:0x0834, B:375:0x0870, B:378:0x083e, B:381:0x0869, B:382:0x0877, B:384:0x0888, B:386:0x0890, B:389:0x089a, B:391:0x089e, B:395:0x08a8, B:399:0x08ae), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0730 A[Catch: all -> 0x08af, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:22:0x0022, B:24:0x002a, B:25:0x0030, B:26:0x004b, B:28:0x0051, B:30:0x0061, B:32:0x006e, B:33:0x0077, B:34:0x00a7, B:36:0x00b1, B:37:0x00bd, B:39:0x00c3, B:41:0x00c9, B:44:0x00cf, B:47:0x00d7, B:49:0x00e1, B:52:0x00ea, B:54:0x0106, B:55:0x0109, B:66:0x0112, B:68:0x011b, B:70:0x011f, B:71:0x0121, B:73:0x0129, B:74:0x0139, B:76:0x013d, B:77:0x013f, B:79:0x0145, B:81:0x0149, B:82:0x014b, B:84:0x0153, B:86:0x0157, B:87:0x0159, B:88:0x015b, B:90:0x0163, B:92:0x018f, B:93:0x01ca, B:96:0x01d8, B:97:0x01e1, B:99:0x01e5, B:100:0x01e7, B:102:0x01ed, B:103:0x01ef, B:105:0x01f5, B:107:0x01f9, B:108:0x01fb, B:110:0x0203, B:112:0x0207, B:113:0x0209, B:114:0x020b, B:116:0x020f, B:117:0x0211, B:120:0x021a, B:123:0x0220, B:124:0x0228, B:126:0x0241, B:127:0x0252, B:129:0x025a, B:131:0x0266, B:133:0x0271, B:135:0x027d, B:136:0x027f, B:141:0x028a, B:142:0x028d, B:143:0x0290, B:144:0x0292, B:146:0x02a7, B:148:0x02ab, B:150:0x02af, B:152:0x02b3, B:154:0x02b7, B:156:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:163:0x0351, B:165:0x0378, B:166:0x0367, B:170:0x0390, B:172:0x0399, B:173:0x039e, B:175:0x03a2, B:176:0x03a7, B:178:0x03ab, B:179:0x03b0, B:181:0x03b4, B:182:0x03b9, B:184:0x03bd, B:185:0x03c2, B:187:0x03c6, B:188:0x03cb, B:190:0x03cf, B:191:0x03d4, B:192:0x03f8, B:200:0x03f9, B:201:0x0400, B:202:0x0223, B:203:0x0226, B:207:0x0085, B:209:0x008b, B:212:0x009e, B:214:0x0401, B:215:0x0413, B:217:0x0419, B:219:0x041f, B:223:0x0432, B:225:0x0436, B:227:0x0442, B:229:0x044a, B:231:0x0454, B:234:0x0464, B:237:0x046a, B:240:0x0475, B:242:0x0481, B:243:0x048b, B:246:0x0486, B:249:0x045e, B:252:0x0491, B:255:0x049a, B:257:0x04b5, B:261:0x04bf, B:263:0x04c9, B:266:0x04d6, B:268:0x04dc, B:270:0x04e4, B:272:0x04ea, B:273:0x051a, B:275:0x0520, B:276:0x056a, B:278:0x0570, B:279:0x06bc, B:280:0x0585, B:282:0x058d, B:284:0x0597, B:286:0x059f, B:289:0x05b7, B:292:0x05d4, B:293:0x05d0, B:294:0x05b3, B:295:0x05e3, B:297:0x05eb, B:299:0x05f4, B:302:0x061b, B:305:0x0636, B:306:0x063a, B:309:0x0609, B:311:0x0611, B:312:0x0616, B:313:0x065c, B:315:0x0664, B:317:0x0670, B:318:0x0680, B:320:0x068c, B:321:0x069e, B:323:0x06aa, B:324:0x070d, B:326:0x0719, B:327:0x072c, B:329:0x0730, B:335:0x0737, B:337:0x073d, B:340:0x0759, B:342:0x075d, B:345:0x0766, B:348:0x0796, B:351:0x079b, B:353:0x07a3, B:354:0x07b1, B:356:0x07b7, B:358:0x07cd, B:360:0x07de, B:363:0x07e3, B:367:0x0804, B:370:0x0830, B:372:0x0834, B:375:0x0870, B:378:0x083e, B:381:0x0869, B:382:0x0877, B:384:0x0888, B:386:0x0890, B:389:0x089a, B:391:0x089e, B:395:0x08a8, B:399:0x08ae), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void o() {
        /*
            Method dump skipped, instructions count: 2229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irz.o():void");
    }

    public final boolean p() {
        return Build.VERSION.SDK_INT < 23 || !akai.f(this.a, new PermissionDescriptor[]{new PermissionDescriptor(0, acrb.UPLOAD_VIDEO_APPROVE_STORAGE_BUTTON, acrb.UPLOAD_VIDEO_DENY_STORAGE_BUTTON)});
    }

    public final boolean q() {
        wlu wluVar = this.m;
        return wluVar != null && wluVar.ar();
    }

    public final boolean r(alca alcaVar) {
        if (!this.q) {
            return false;
        }
        double floor = Math.floor(Math.random() * 10.0d);
        try {
            zyd zydVar = this.z;
            asht j = akwg.j(alcaVar.e(), alcaVar.i);
            zydVar.aU = j;
            zxn zxnVar = zydVar.aK;
            if (zxnVar != null && j != null) {
                zxnVar.a = j;
            }
            zyd zydVar2 = this.z;
            Uri a = alcaVar.a();
            zyj zyjVar = zydVar2.aH;
            if (zyjVar == null) {
                zydVar2.aG = a;
            } else if (!zydVar2.aF && !amkq.b(zyjVar.c, a)) {
                zydVar2.bu(a, null, null);
            }
            return true;
        } catch (IOException e) {
            zga.d("Failed to read the video file", e);
            if (floor == 0.0d) {
                String valueOf = String.valueOf(wcy.K(e));
                afsi.c(1, 6, valueOf.length() != 0 ? "youtubeUploadEditParse::".concat(valueOf) : new String("youtubeUploadEditParse::"), e);
            }
            return false;
        } catch (Error e2) {
            zga.d("Failed to parse the video file", e2);
            if (floor == 0.0d) {
                String valueOf2 = String.valueOf(wcy.K(e2));
                afsi.c(1, 6, valueOf2.length() != 0 ? "youtubeUploadEditParse::".concat(valueOf2) : new String("youtubeUploadEditParse::"), e2);
            }
            return false;
        } catch (RuntimeException e3) {
            zga.d("Failed to start the edit mode", e3);
            if (floor == 0.0d) {
                String valueOf3 = String.valueOf(wcy.K(e3));
                afsi.c(1, 6, valueOf3.length() != 0 ? "youtubeUploadEditParse::".concat(valueOf3) : new String("youtubeUploadEditParse::"), e3);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void s(int i) {
        int i2 = this.Z;
        if (i2 != i) {
            etx.B(i2).length();
            etx.B(i).length();
            this.Z = i;
        }
        k();
    }

    public final synchronized void t(anhy anhyVar, int i, Throwable th) {
        boolean z = th instanceof CancellationException;
        if (!z) {
            this.ac.f("Activity helper error", th, akva.k(akva.l(this.a.getIntent())));
        }
        if (anhyVar != null && !anhyVar.isCancelled() && !z) {
            s(i);
            return;
        }
        e();
    }

    @Override // defpackage.wlx
    public final void u() {
        this.h.d(acsb.b(9729), null, akwg.k(this.C, this.U));
        s(8);
    }
}
