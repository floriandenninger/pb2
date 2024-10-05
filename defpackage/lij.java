package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioRecord;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.aok;
import defpackage.ayrz;
import defpackage.lij;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lij implements ViewTreeObserver.OnGlobalLayoutListener {
    static final acsc a = acsb.c(65799);
    static final acsc b = acsb.c(65800);
    static final acsc c = acsb.c(65812);
    private final akai A;
    private final lkb B;
    private final obr C;
    private final boolean D;
    private final String E;
    private byte[] F;
    private Intent G;
    private final aoj H;
    public final acsy d;
    public final ce e;
    public final Activity f;
    public final int g;
    public final int h;
    public String i;
    public int j;
    public boolean k;
    public boolean l;
    public BottomSheetBehavior m;
    public ayqx n;
    public boolean o;
    public final aadw p;
    public final axzg q;
    private final aaea r;
    private final akfz s;
    private final lhd t;
    private final akei u;
    private final akeh v;
    private final acra w;
    private final lgt x;
    private final ainy y;
    private AudioRecord z;

    public lij(acsy acsyVar, aadw aadwVar, aaea aaeaVar, akfz akfzVar, lhd lhdVar, akei akeiVar, akeh akehVar, ainy ainyVar, akai akaiVar, lkb lkbVar, obr obrVar, axzg axzgVar, ce ceVar, lgt lgtVar, String str, acra acraVar, int i, int i2, boolean z, byte[] bArr, byte[] bArr2) {
        any anyVar = new any() { // from class: com.google.android.apps.youtube.app.search.voice.VoiceInputController$1
            @Override // defpackage.aoa
            public final void lc(aok aokVar) {
                lij.this.e.O.getViewTreeObserver().removeOnGlobalLayoutListener(lij.this);
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void lg(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final void lh(aok aokVar) {
                Object obj = lij.this.n;
                if (obj != null) {
                    ayrz.c((AtomicReference) obj);
                }
            }

            @Override // defpackage.any, defpackage.aoa
            public final void nu(aok aokVar) {
                lij lijVar = lij.this;
                lijVar.o = lijVar.g();
                lij.this.e.O.getViewTreeObserver().addOnGlobalLayoutListener(lij.this);
            }

            @Override // defpackage.aoa
            public final /* synthetic */ void nv(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void ot(aok aokVar) {
            }
        };
        this.H = anyVar;
        this.d = acsyVar;
        this.p = aadwVar;
        this.r = aaeaVar;
        this.s = akfzVar;
        this.t = lhdVar;
        this.u = akeiVar;
        this.v = akehVar;
        this.e = ceVar;
        this.f = ceVar.C();
        this.x = lgtVar;
        this.E = str;
        this.w = acraVar;
        this.y = ainyVar;
        this.A = akaiVar;
        this.B = lkbVar;
        this.C = obrVar;
        this.g = i;
        this.h = i2;
        this.D = z;
        this.q = axzgVar;
        akeiVar.g();
        if (evr.bd(aadwVar)) {
            ceVar.X.b(anyVar);
        }
    }

    private final Intent h() {
        Intent intent;
        if (evr.J(this.r)) {
            this.z = this.s.a();
        }
        if (j()) {
            intent = new Intent(this.f, (Class<?>) this.B.a).addFlags(131072);
        } else {
            intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        }
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.addFlags(262144);
        return intent;
    }

    private final void i(Intent intent) {
        if (this.e.mN().e(this.g) != null) {
            return;
        }
        if (g()) {
            whu.B(this.f);
            this.G = intent;
            return;
        }
        final int i = 0;
        if (this.C.f()) {
            this.C.h(0);
        }
        this.e.O.findViewById(this.g).setVisibility(0);
        if (this.h > 0) {
            this.e.O.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: lig
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    lij lijVar = lij.this;
                    DisplayMetrics displayMetrics = lijVar.f.getResources().getDisplayMetrics();
                    int K = yjk.K(displayMetrics, 270);
                    int K2 = (((i5 - i3) - yjk.K(displayMetrics, 8)) - K) % yjk.K(displayMetrics, lijVar.h);
                    View findViewById = view.findViewById(lijVar.g);
                    findViewById.getLayoutParams().height = K + K2;
                    if (findViewById.isInLayout()) {
                        return;
                    }
                    findViewById.requestLayout();
                }
            });
        }
        Bundle extras = intent.getExtras();
        ljr ljrVar = new ljr();
        ljrVar.af(extras);
        dn k = this.e.mN().k();
        k.p(this.g, ljrVar);
        if (((Boolean) this.q.v().x(false).aJ().e(0).aB()).booleanValue()) {
            k.d();
        } else {
            k.a();
        }
        this.m.G(3);
        this.m.y(new lii(this, ljrVar));
        ayqj E = ljrVar.ae.E();
        Object obj = this.n;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        final int i2 = 1;
        this.n = E.W(new ayrs(this) { // from class: lih
            public final /* synthetic */ lij a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                if (i2 == 0) {
                    lij lijVar = this.a;
                    afsi.c(2, 32, "VoiceSearchFragment error result", (Throwable) obj2);
                    BottomSheetBehavior bottomSheetBehavior = lijVar.m;
                    if (bottomSheetBehavior == null || bottomSheetBehavior.t != 3) {
                        return;
                    }
                    bottomSheetBehavior.G(5);
                    return;
                }
                lij lijVar2 = this.a;
                Intent intent2 = (Intent) obj2;
                lijVar2.n = null;
                int intExtra = intent2.getIntExtra("resultCode", CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                lijVar2.m.G(5);
                if (intExtra == -1) {
                    lijVar2.b(intent2);
                } else {
                    lijVar2.d.m(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                }
            }
        }, new ayrs(this) { // from class: lih
            public final /* synthetic */ lij a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                if (i == 0) {
                    lij lijVar = this.a;
                    afsi.c(2, 32, "VoiceSearchFragment error result", (Throwable) obj2);
                    BottomSheetBehavior bottomSheetBehavior = lijVar.m;
                    if (bottomSheetBehavior == null || bottomSheetBehavior.t != 3) {
                        return;
                    }
                    bottomSheetBehavior.G(5);
                    return;
                }
                lij lijVar2 = this.a;
                Intent intent2 = (Intent) obj2;
                lijVar2.n = null;
                int intExtra = intent2.getIntExtra("resultCode", CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                lijVar2.m.G(5);
                if (intExtra == -1) {
                    lijVar2.b(intent2);
                } else {
                    lijVar2.d.m(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                }
            }
        });
    }

    private final boolean j() {
        return (!evr.J(this.r) || this.k || zev.f(this.f)) ? false : true;
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (!akai.a(this.f, strArr, iArr).isEmpty()) {
                    this.w.I(3, new acqx(c), null);
                    d();
                    return;
                } else {
                    this.w.I(3, new acqx(b), null);
                    return;
                }
            }
            this.w.I(3, new acqx(a), null);
            d();
        }
    }

    public final void b(Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        byte[] byteArrayExtra = intent.getByteArrayExtra("RecognizedText");
        boolean booleanExtra = intent.getBooleanExtra("RegularVoiceSearch", false);
        String stringExtra = intent.getStringExtra("AssistantCsn");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            if (evr.I(this.r) && this.d.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                this.d.u("voz_mf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
            }
            lgt lgtVar = this.x;
            if (lgtVar != null) {
                lgtVar.a(stringArrayListExtra.get(0), this.F, this.i, 64833);
                return;
            }
            return;
        }
        if (byteArrayExtra == null) {
            if (booleanExtra) {
                this.k = true;
                d();
                return;
            } else {
                this.d.m(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                return;
            }
        }
        if (this.x != null) {
            byte[] bArr = this.F;
            if (bArr == null || bArr.length == 0) {
                this.F = intent.getByteArrayExtra("SearchboxStats");
            }
            this.x.b(byteArrayExtra, stringExtra, this.F);
        }
    }

    public final void c(byte[] bArr) {
        this.F = bArr;
        this.w.I(3, new acqx(acsb.c(64833)), null);
        if (evr.I(this.r)) {
            this.d.t(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (evr.J(this.r) && aih.c(this.f, "android.permission.RECORD_AUDIO") != 0) {
            try {
                for (String str : this.f.getPackageManager().getPackageInfo(this.f.getPackageName(), 4096).requestedPermissions) {
                    if (str.contains("android.permission.RECORD_AUDIO")) {
                        this.w.n(new acqx(a));
                        this.w.n(new acqx(b));
                        this.w.n(new acqx(c));
                        this.A.d(new String[]{"android.permission.RECORD_AUDIO"});
                        this.e.ac(new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        return;
                    }
                }
                afsi.b(2, 32, "Permission not declared in manifest: android.permission.RECORD_AUDIO");
            } catch (PackageManager.NameNotFoundException e) {
                zga.o("VoiceInputController", "PackageInfo not found", e);
            }
            this.k = true;
        }
        d();
    }

    public final void d() {
        if (evr.I(this.r) && this.d.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.d.u("voz_ms", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        Intent h = h();
        if (this.F == null) {
            this.u.f();
            akev a2 = this.t.a();
            this.u.l = a2.j();
            this.u.m = a2.b();
            this.u.n = this.v.b();
            this.F = this.u.a(a2.f()).toByteArray();
        }
        if (j()) {
            h.putExtra("SearchboxStats", this.F);
            AudioRecord audioRecord = this.z;
            if (audioRecord != null) {
                h.putExtra("MicSampleRate", audioRecord.getSampleRate());
                h.putExtra("MicAudioFormatEncoding", this.z.getAudioFormat());
                h.putExtra("MicChannelConfig", this.z.getChannelConfiguration());
            }
            h.putExtra("ParentCSN", this.i);
            h.putExtra("ParentVeType", this.j);
            h.putExtra("searchEndpointParams", this.E);
            h.putExtra("disableHalfPlateSuggestions", this.D);
        }
        ainy ainyVar = this.y;
        if (ainyVar != null) {
            ainyVar.a();
        }
        if (!j() || !evr.bd(this.p) || this.l || this.g == 0) {
            this.e.startActivityForResult(h, 1000);
        } else {
            i(h);
        }
    }

    public final boolean e() {
        return h().resolveActivity(this.f.getPackageManager()) != null;
    }

    public final boolean f() {
        BottomSheetBehavior bottomSheetBehavior = this.m;
        return bottomSheetBehavior != null && bottomSheetBehavior.t == 3;
    }

    public final boolean g() {
        ko s = jw.s(this.e.O);
        if (s != null) {
            return s.y(8);
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean g = g();
        if (g != this.o) {
            this.o = g;
            if (g) {
                if (f()) {
                    this.m.G(5);
                }
            } else {
                Intent intent = this.G;
                if (intent != null) {
                    i(intent);
                    this.G = null;
                }
            }
        }
    }
}
