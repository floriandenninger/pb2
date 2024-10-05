package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gsy implements aaha {
    public static final /* synthetic */ int e = 0;
    public final adlt a;
    public final shf b;
    public final ajjz c;
    public adlr d;
    private final Context f;
    private final ihn g;
    private final iml h;
    private final axpg i;
    private final Optional j;
    private final acqz k;
    private final hbb l;
    private final aaea m;
    private final PipObserver n;
    private final aahv o;
    private final zgj p;
    private final ing q;
    private final imn r;
    private final aadw s;
    private final lkb t;

    public gsy(Context context, adlt adltVar, lkb lkbVar, ihn ihnVar, iml imlVar, hbb hbbVar, shf shfVar, axpg axpgVar, acqz acqzVar, Optional optional, aadw aadwVar, aaea aaeaVar, PipObserver pipObserver, ajjz ajjzVar, aahv aahvVar, zgj zgjVar, ing ingVar, imn imnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = context;
        this.a = adltVar;
        this.t = lkbVar;
        this.g = ihnVar;
        this.h = imlVar;
        this.l = hbbVar;
        this.b = shfVar;
        this.i = axpgVar;
        this.k = acqzVar;
        this.j = optional;
        this.s = aadwVar;
        this.m = aaeaVar;
        this.n = pipObserver;
        this.c = ajjzVar;
        this.o = aahvVar;
        this.p = zgjVar;
        this.q = ingVar;
        this.r = imnVar;
    }

    private final Optional c() {
        return Optional.ofNullable(this.m).map(ght.t);
    }

    private final void d(String str) {
        if (((Boolean) c().map(ham.b).orElse(false)).booleanValue()) {
            this.g.c(str);
        }
    }

    private final void e(final apxf apxfVar, final Map map) {
        try {
            new AlertDialog.Builder(this.f).setTitle(R.string.reel_cast_stop_casting_title).setMessage(R.string.reel_cast_stop_casting_message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: gsr
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    gsy gsyVar = gsy.this;
                    apxf apxfVar2 = apxfVar;
                    Map map2 = map;
                    adlm g = gsyVar.a.g();
                    if (g != null) {
                        gsyVar.d = new gsx(gsyVar, apxfVar2, map2, gsyVar.b.c());
                        gsyVar.a.i(gsyVar.d);
                        g.D();
                    }
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
            acqz acqzVar = this.k;
            if (acqzVar == null || acqzVar.mM() == null) {
                return;
            }
            this.k.mM().n(new acqx(acsb.c(135786)));
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public final void b(apxf apxfVar, Map map, long j) {
        apwy apwyVar;
        boolean z;
        aahv aahvVar;
        apxf apxfVar2;
        apxf apxfVar3 = apxfVar;
        if (apxfVar3.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && !((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar3.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).k && ((Boolean) c().map(ght.q).orElse(false)).booleanValue()) {
            apxfVar3 = this.l.a(apxfVar3);
        }
        final apxf apxfVar4 = apxfVar3;
        if ((((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar4.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).b & 262144) != 0 && (aahvVar = this.o) != null) {
            aahu c = aahvVar.c();
            final Class<aoob> cls = aoob.class;
            aukt auktVar = (aukt) c.f(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar4.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).s).g(aukt.class).m(ggk.g).B(new ayrw() { // from class: gsu
                @Override // defpackage.ayrw
                public final boolean a(Object obj) {
                    return cls.isInstance((Throwable) obj);
                }
            }).X();
            if (auktVar != null) {
                apxf apxfVar5 = null;
                if (auktVar.f()) {
                    apxfVar5 = auktVar.getUpdatedEndpointProto();
                } else if (auktVar.b()) {
                    try {
                        apxfVar5 = (apxf) aonm.parseFrom(apxf.a, auktVar.getUpdatedEndpoint(), aomw.b());
                    } catch (aoob e2) {
                        zga.d("Error parsing bytes for updated ReelWatchEndpoint.", e2);
                    }
                }
                if (apxfVar5 != null && apxfVar5.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    aong aongVar = (aong) apxfVar4.toBuilder();
                    aongVar.e(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar5.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                    apxfVar2 = (apxf) aongVar.build();
                    aaio c2 = ((aaih) c).c();
                    c2.g(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar4.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).s);
                    c2.b().Q();
                    apxfVar4 = apxfVar2;
                }
            }
            apxfVar2 = apxfVar4;
            aaio c22 = ((aaih) c).c();
            c22.g(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar4.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).s);
            c22.b().Q();
            apxfVar4 = apxfVar2;
        }
        aifz d = PlaybackStartDescriptor.d();
        d.a = apxfVar4;
        PlaybackStartDescriptor a = d.a();
        atsn atsnVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar4.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).l;
        if (atsnVar == null) {
            atsnVar = atsn.a;
        }
        boolean z2 = ((Boolean) c().map(ght.m).orElse(false)).booleanValue() && ((atsnVar.b & 2) != 0 || ((Boolean) c().map(ght.u).orElse(false)).booleanValue());
        if (this.q != null && !((Boolean) c().map(ght.l).orElse(false)).booleanValue()) {
            this.q.b();
        }
        this.g.j(0, 2, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar4.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint), null, j);
        Optional c3 = c();
        if (this.p != null && ((Boolean) c3.map(ght.p).orElse(false)).booleanValue()) {
            String h = a.h(this.p);
            Optional a2 = this.g.a();
            if (a2.isPresent()) {
                iml imlVar = this.h;
                acsx acsxVar = (acsx) a2.get();
                synchronized (imlVar.b) {
                    imlVar.b.put(h, acsxVar);
                }
            }
            if (z2) {
                d("r_ofs");
                imn imnVar = this.r;
                if (imnVar != null) {
                    imnVar.a.e(a, a.l(), imnVar.b, imnVar.a(h, imnVar.c.get()));
                }
                if (this.q == null || !((Boolean) c3.map(ght.n).orElse(false)).booleanValue()) {
                    z = z2;
                } else {
                    z = z2;
                    this.q.g(apxfVar4, h, false, false, true, true, afxb.a, afxb.a);
                }
                d("r_ofe");
                z2 = z;
            } else if (this.q != null) {
                this.q.e(apxfVar4, h, false, ((Boolean) c3.map(ght.o).orElse(false)).booleanValue() && !TextUtils.isEmpty(a.l()), false, afxb.a, afxb.a);
            }
        }
        aadw aadwVar = this.s;
        if (aadwVar != null) {
            apwyVar = aadwVar.b();
        } else {
            apwyVar = apwy.a;
        }
        aujl aujlVar = apwyVar.E;
        if (aujlVar == null) {
            aujlVar = aujl.a;
        }
        if (!aujlVar.c || !etx.ag(apxfVar4) || !((Optional) this.i.get()).isPresent() || !this.j.isPresent()) {
            Intent intent = new Intent(this.f, (Class<?>) this.t.a);
            intent.setFlags(262144);
            intent.putExtra("com.google.android.apps.youtube.PlaybackStartDescriptor", a);
            intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", j);
            intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY", z2);
            Bundle bundle = (Bundle) Optional.ofNullable((Bundle) yjj.u(map, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class)).orElseGet(new Supplier() { // from class: gss
                @Override // j$.util.function.Supplier
                public final Object get() {
                    gsy gsyVar = gsy.this;
                    final apxf apxfVar6 = apxfVar4;
                    return (Bundle) Optional.ofNullable(gsyVar.c).map(new Function() { // from class: gsw
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            return fhe.N(apxf.this, (ajjz) obj);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            return Function.CC.$default$compose(this, function);
                        }
                    }).map(ght.s).orElse(new Bundle());
                }
            });
            this.g.c("r_as");
            Context context = this.f;
            PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) intent.getParcelableExtra("com.google.android.apps.youtube.PlaybackStartDescriptor");
            playbackStartDescriptor.getClass();
            boolean ak = etx.ak(etx.aa(playbackStartDescriptor));
            boolean af = etx.af(playbackStartDescriptor);
            int i = true != ak ? R.anim.reel_activity_slide_up : R.anim.reel_activity_slide_in_right;
            if (bundle != null || af) {
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                context.startActivity(intent, ahe.u(context, i, R.anim.reel_activity_fade_out).t());
                return;
            }
            context.startActivity(intent);
            return;
        }
        ((giv) ((Optional) this.i.get()).get()).d(((ijt) this.j.get()).a());
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        amkq.E(apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        final long c = this.b.c();
        boolean booleanValue = ((Boolean) c().map(ght.r).orElse(false)).booleanValue();
        adlr adlrVar = this.d;
        if (adlrVar != null) {
            this.a.k(adlrVar);
        }
        if (this.a.g() != null || this.a.o()) {
            e(apxfVar, map);
            return;
        }
        PipObserver pipObserver = this.n;
        if (pipObserver == null || !booleanValue) {
            b(apxfVar, map, c);
        } else {
            pipObserver.a.U().L(gsv.a).ak(1L).ax(new ayrs() { // from class: gst
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    gsy.this.b(apxfVar, map, c);
                }
            });
        }
    }
}
