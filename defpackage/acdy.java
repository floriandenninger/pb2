package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdy implements ComponentCallbacks, acda, acdp, accq, accz, aceg, acdk {
    public final Context a;
    public final acei b;
    public final acdn c;
    public final acdw d;
    public final NetworkOperationView e;
    public final acdx f;
    public final String g;
    public boolean h;
    public int i = 1;
    public final anzg j;
    private final ViewGroup k;
    private final WindowManager l;

    public acdy(Context context, wdm wdmVar, acra acraVar, axpg axpgVar, ajut ajutVar, ajjz ajjzVar, SharedPreferences sharedPreferences, acdx acdxVar) {
        this.a = context;
        this.f = acdxVar;
        this.j = new anzg(sharedPreferences, null);
        acdn acdnVar = new acdn(context, ajutVar, acraVar);
        this.c = acdnVar;
        acdnVar.y = this;
        acdnVar.o(55);
        acdw acdwVar = (acdw) axpgVar.get();
        this.d = acdwVar;
        acdwVar.g.gravity = 83;
        acdwVar.c();
        this.b = new acei(context, wdmVar, ajjzVar);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.spinner_window, (ViewGroup) null);
        this.k = viewGroup;
        this.e = (NetworkOperationView) viewGroup.findViewById(R.id.choose_thumbnail_network_operation);
        this.g = context.getResources().getString(R.string.lc_going_live);
        this.l = (WindowManager) context.getSystemService("window");
    }

    public static boolean m(acdy acdyVar) {
        return (acdyVar == null || acdyVar.i == 1) ? false : true;
    }

    public static boolean n(int i) {
        if (i != 1) {
            return true;
        }
        try {
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            Log.e("ScreencastControls", "Screencast controls not initialized", e);
            return false;
        }
    }

    @Override // defpackage.acda
    public final void a() {
        ajce ajceVar;
        acdw acdwVar = this.d;
        if (acdwVar != null) {
            if (!acdwVar.u && (ajceVar = acdwVar.t) != null) {
                acdwVar.u = true;
                acdwVar.h.z(ajceVar);
            }
            this.d.d.setVisibility(0);
        }
    }

    public final void b() {
        WindowManager.LayoutParams ct = adyu.ct();
        ct.width = -1;
        ct.height = -1;
        this.k.measure(0, 0);
        if (this.k.getParent() == null) {
            this.l.addView(this.k, ct);
        }
    }

    public final void c() {
        String str;
        if (n(this.i) && this.i != 5) {
            e();
            this.c.b();
            acdn acdnVar = this.c;
            acdnVar.E = true;
            acdnVar.r();
            this.c.l.setVisibility(0);
            acdn acdnVar2 = this.c;
            acdnVar2.c.setVisibility(8);
            acdnVar2.d.setVisibility(0);
            acdnVar2.d.g(SystemClock.elapsedRealtime());
            acei aceiVar = this.b;
            if (n(aceiVar.u) && aceiVar.u != 5) {
                aceiVar.g(false);
                aceiVar.c();
                aceiVar.d.setVisibility(8);
                aceiVar.a();
                aceiVar.g(true);
                aceiVar.u = 5;
            }
            int i = this.i;
            if (i == 4) {
                this.i = 5;
                ScreencastHostService screencastHostService = (ScreencastHostService) this.f;
                if (m(screencastHostService.m)) {
                    screencastHostService.m.j(acdm.DEFAULT, screencastHostService.getString(R.string.screencast_stream_transmitting));
                    screencastHostService.p.a = true;
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    str = "UNINITIALIZED";
                    break;
                case 2:
                    str = "INITIALIZED";
                    break;
                case 3:
                    str = "INITIAL";
                    break;
                case 4:
                    str = "LAUNCHING";
                    break;
                case 5:
                    str = "ACTIVE";
                    break;
                case 6:
                    str = "ERROR";
                    break;
                case 7:
                    str = "DONE";
                    break;
                default:
                    str = "null";
                    break;
            }
            if (i == 0) {
                throw null;
            }
            StringBuilder sb = new StringBuilder(str.length() + 49);
            sb.append("Unexpected state ");
            sb.append(str);
            sb.append(", not proceeding to ACTIVE state");
            Log.w("ScreencastControls", sb.toString());
        }
    }

    public final void d() {
        if (n(this.i) && this.i != 7) {
            e();
            acei aceiVar = this.b;
            if (n(aceiVar.u) && aceiVar.u != 7) {
                aceiVar.a();
                aceiVar.g(false);
                aceiVar.c();
                aceiVar.d.setVisibility(0);
                aceiVar.u = 7;
            }
            this.c.b();
            this.c.c();
            acdw acdwVar = this.d;
            if (acdwVar != null) {
                acdwVar.b();
                this.d.a();
            }
            this.i = 7;
            ((ScreencastHostService) this.f).k();
        }
    }

    public final void e() {
        if (this.k.getParent() != null) {
            this.e.setVisibility(8);
            this.l.removeView(this.k);
        }
    }

    public final void f() {
        acdw acdwVar = this.d;
        if (acdwVar != null) {
            acdwVar.c();
        }
    }

    public final void g(boolean z) {
        this.c.q(z);
    }

    public final void h(String str) {
        b();
        this.e.d();
        this.e.b.setText(str);
        this.e.a(0);
        this.e.setVisibility(0);
    }

    public final void i(int i) {
        b();
        this.e.d();
        this.e.a(4);
        this.e.a.setText(i);
        this.e.setVisibility(0);
    }

    public final void j(acdm acdmVar, String str) {
        acdn acdnVar = this.c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        acdnVar.v.removeCallbacks(acdnVar.u);
        Animator animator = acdnVar.x;
        if (animator != null) {
            animator.cancel();
        }
        acdnVar.f(false);
        acdnVar.p.setBackgroundResource(acdmVar.c);
        acdnVar.q.setTextColor(aih.d(acdnVar.f, acdmVar.d));
        acdnVar.q.setText(str);
        acdnVar.q.announceForAccessibility(str);
        acdnVar.v.removeCallbacks(acdnVar.u);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(acdnVar.p, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new acdh(acdnVar));
        acdnVar.w = ofFloat;
        acdnVar.w.start();
        acdnVar.v.postDelayed(acdnVar.u, 3000L);
    }

    public final void k() {
        acdw acdwVar = this.d;
        if (acdwVar != null) {
            acdwVar.c();
        }
    }

    public final void l(atgf atgfVar) {
        if (atgfVar == null) {
            return;
        }
        acdn acdnVar = this.c;
        atgd atgdVar = atgfVar.d;
        if (atgdVar == null) {
            atgdVar = atgd.a;
        }
        if (atgdVar.b == 65153809) {
            apmg apmgVar = (apmg) atgdVar.c;
            acdnVar.D = apmgVar.t.I();
            acdnVar.o.D(new acqx(acdnVar.D));
            if ((apmgVar.b & 65536) != 0) {
                ImageButton imageButton = acdnVar.e;
                aots aotsVar = apmgVar.r;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                imageButton.setContentDescription(aotsVar.c);
            }
        }
        ajce ajceVar = null;
        if ((atgfVar.b & 16) != 0) {
            apxf apxfVar = atgfVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) apxfVar.pX(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
            if (liveChatEndpointOuterClass$LiveChatEndpoint != null && (liveChatEndpointOuterClass$LiveChatEndpoint.b & 2) != 0) {
                asrc asrcVar = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asrcVar == null) {
                    asrcVar = asrc.a;
                }
                if ((asrcVar.b & 1) != 0) {
                    asrc asrcVar2 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asrcVar2 == null) {
                        asrcVar2 = asrc.a;
                    }
                    aulm aulmVar = asrcVar2.c;
                    if (aulmVar == null) {
                        aulmVar = aulm.a;
                    }
                    ajceVar = ahbj.o(aulmVar);
                } else {
                    asrc asrcVar3 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asrcVar3 == null) {
                        asrcVar3 = asrc.a;
                    }
                    if ((asrcVar3.b & 2) != 0) {
                        asrc asrcVar4 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asrcVar4 == null) {
                            asrcVar4 = asrc.a;
                        }
                        avgs avgsVar = asrcVar4.d;
                        if (avgsVar == null) {
                            avgsVar = avgs.a;
                        }
                        ajceVar = ahbj.o(avgsVar);
                    } else {
                        asrc asrcVar5 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asrcVar5 == null) {
                            asrcVar5 = asrc.a;
                        }
                        if ((asrcVar5.b & 4) != 0) {
                            asrc asrcVar6 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                            if (asrcVar6 == null) {
                                asrcVar6 = asrc.a;
                            }
                            asjj asjjVar = asrcVar6.e;
                            if (asjjVar == null) {
                                asjjVar = asjj.a;
                            }
                            ajceVar = ahbj.o(asjjVar);
                        } else {
                            asrc asrcVar7 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                            if (asrcVar7 == null) {
                                asrcVar7 = asrc.a;
                            }
                            if ((asrcVar7.b & 8) != 0) {
                                asrc asrcVar8 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                                if (asrcVar8 == null) {
                                    asrcVar8 = asrc.a;
                                }
                                asrd asrdVar = asrcVar8.f;
                                if (asrdVar == null) {
                                    asrdVar = asrd.a;
                                }
                                ajceVar = ahbj.o(asrdVar);
                            } else {
                                asrc asrcVar9 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                                if (asrcVar9 == null) {
                                    asrcVar9 = asrc.a;
                                }
                                if ((asrcVar9.b & 16) != 0) {
                                    asrc asrcVar10 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                                    if (asrcVar10 == null) {
                                        asrcVar10 = asrc.a;
                                    }
                                    auah auahVar = asrcVar10.g;
                                    if (auahVar == null) {
                                        auahVar = auah.a;
                                    }
                                    ajceVar = ahbj.o(auahVar);
                                }
                            }
                        }
                    }
                }
            }
        }
        acdw acdwVar = this.d;
        if (acdwVar == null || ajceVar == null) {
            return;
        }
        acdwVar.t = ajceVar;
        if (acdwVar.r == null) {
            acdwVar.r = new acdv(acdwVar);
        }
        if (acdwVar.d.getParent() == null) {
            acdwVar.f.addView(acdwVar.d, acdwVar.g);
        }
        acdwVar.d.setVisibility(8);
        acdwVar.h.w(acdwVar.r);
        if (this.h) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.b.onConfigurationChanged(configuration);
        int L = yjk.L(this.a);
        Rect rect = this.b.k;
        int height = (this.c.b.getHeight() * 5) / 4;
        if ((this.c.a.gravity & 48) == 48) {
            if (rect.bottom >= L - height) {
                this.c.o(87);
            }
        } else if (rect.top <= height) {
            this.c.o(55);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
