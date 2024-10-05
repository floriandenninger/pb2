package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.youtube.app.search.voice.PermissionRequestActivity;
import com.google.android.youtube.R;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ljr extends lhx implements ViewTreeObserver.OnWindowFocusChangeListener, ljm {
    public acra a;
    public final azrr ae = azrr.ab();
    public aadw af;
    public ohx ag;
    public ajoy ah;
    private ljn ai;
    private ljh aj;
    private String ak;
    private byte[] al;
    private boolean am;
    private aae an;
    public acsy b;
    public Handler c;
    public ypa d;
    public yzm e;

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.ai.o();
        this.a.t();
        if (this.ae.af() || this.ae.ae()) {
            return;
        }
        this.ae.b(new NoSuchElementException("VoiceSearchFragment destroyed without delivering a result"));
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (aih.c(qR(), "android.permission.RECORD_AUDIO") == 0) {
            q();
        } else if (!this.ae.af() && !this.ae.ae()) {
            this.an.b(new Intent().setClass(qR(), PermissionRequestActivity.class));
        }
        this.d.g(this.ai);
        this.O.getViewTreeObserver().addOnWindowFocusChangeListener(this);
    }

    @Override // defpackage.lhj
    public final boolean a() {
        if (this.ai == null || !at()) {
            return false;
        }
        this.ai.a().a();
        return true;
    }

    @Override // defpackage.ljm
    public final void f() {
        this.ae.sc(p(1));
    }

    @Override // defpackage.ljm
    public final void g(final byte[] bArr) {
        if (this.b.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.b.u("voz_rqf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        this.ai.j();
        this.c.postDelayed(new Runnable() { // from class: ljq
            @Override // java.lang.Runnable
            public final void run() {
                ljr ljrVar = ljr.this;
                ljrVar.ae.sc(ljrVar.p(-1).putExtra("RecognizedText", bArr));
            }
        }, 100L);
    }

    @Override // defpackage.ljm
    public final void h() {
        this.ae.sc(p(-1).putExtra("RegularVoiceSearch", true));
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.d.m(this.ai);
        this.O.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        int i = this.m.getInt("ParentVeType");
        String string = this.m.getString("ParentCSN");
        this.ak = this.m.getString("searchEndpointParams");
        this.al = this.m.getByteArray("SearchboxStats");
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = atmc.a.createBuilder();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = i;
        if (string != null) {
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b |= 1;
            atmcVar2.c = string;
        }
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        this.a.d(acsb.b(22678), (apxf) aongVar.build(), null);
        this.an = super.L(new aap(), new bz(D().getActivityResultRegistry()), new aac() { // from class: ljo
            @Override // defpackage.aac
            public final void a(Object obj) {
                ljr ljrVar = ljr.this;
                if (((ActivityResult) obj).a == -1) {
                    ljrVar.q();
                } else {
                    ljrVar.f();
                }
            }
        });
        this.e.b(false);
        this.am = true;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.voice_search_bottom_sheet_fragment, viewGroup, false);
        ajoy ajoyVar = this.ah;
        acra acraVar = this.a;
        Context context = (Context) ajoyVar.a.get();
        context.getClass();
        inflate.getClass();
        acraVar.getClass();
        ljh ljhVar = new ljh(context, inflate, acraVar);
        this.aj = ljhVar;
        this.ai = this.ag.b(this, ljhVar, null, this.c, this.a, this.b);
        return inflate;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            return;
        }
        this.ai.m();
    }

    public final Intent p(int i) {
        return new Intent().putExtras(this.m).putExtra("resultCode", i).putExtra("AssistantCsn", this.a.k());
    }

    public final void q() {
        if (this.ai.p()) {
            this.a.n(new acqx(acsb.c(62943)));
            if (this.b.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                this.b.u("voz_vp", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
            }
            if (evr.ay(this.af)) {
                final int i = 0;
                final int i2 = 1;
                ynm.n(this, this.ai.b(), new zfi(this) { // from class: ljp
                    public final /* synthetic */ ljr a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i == 0) {
                            this.a.r("");
                        } else {
                            this.a.r((String) obj);
                        }
                    }
                }, new zfi(this) { // from class: ljp
                    public final /* synthetic */ ljr a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            this.a.r("");
                        } else {
                            this.a.r((String) obj);
                        }
                    }
                });
                return;
            }
            r("");
            return;
        }
        h();
    }

    public final void r(String str) {
        this.ai.g(str, this.al, this.ak);
        ljn ljnVar = this.ai;
        if (!ljnVar.o) {
            ljnVar.d();
        } else if (this.am) {
            this.am = false;
            ljnVar.n();
        }
    }
}
