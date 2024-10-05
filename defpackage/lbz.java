package defpackage;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lbz extends laj implements fgp {
    public azrw a;
    public anhy aA;
    View aB;
    public LinearLayoutManager aC;
    public EditText aD;
    public ListView aE;
    public View aF;
    public int aG;
    public String aH;
    public String aI;
    public aadw aJ;
    public rxm aK;
    public axzg aL;
    public axzg aM;
    public agqo aN;
    public akht aO;
    public axze aP;
    private lgt aQ;
    private lij aR;
    private anhy aS;
    private lby aT;
    private View aU;
    private View aV;
    private RecyclerView aW;
    private boolean aX;
    private String aY;
    private String aZ;
    public acsy ae;
    public SharedPreferences af;
    public aaea ag;
    public fgq ah;
    public akei ai;
    public afsy aj;
    public mak ak;
    public akcp al;
    public akeh am;
    public aksl an;
    public aahd ao;
    public ajjz aw;
    public lal az;
    public azrw b;
    private int ba;
    private String bb;
    private String bc;
    private boolean bd;
    private boolean be;
    private boolean bf;
    private boolean bg;
    private String bi;
    private boolean bj;
    private boolean bk;
    private lby bl;
    public Executor c;
    public Executor d;
    public lhd e;
    public final AtomicBoolean ax = new AtomicBoolean(true);
    public final AtomicBoolean ay = new AtomicBoolean(true);
    private int bh = -1;

    private static Rect bj(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    private static View bk(ViewGroup viewGroup, int i, int i2) {
        View bk;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.isShown()) {
                if (childAt.isClickable()) {
                    if (bj(childAt).contains(i, i2)) {
                        return childAt;
                    }
                } else if ((childAt instanceof ViewGroup) && (bk = bk((ViewGroup) childAt, i, i2)) != null) {
                    return bk;
                }
            }
        }
        return null;
    }

    private final void bl(String str, int i, String str2) {
        aone createBuilder = atmc.a.createBuilder();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = i;
        if (str != null) {
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b |= 1;
            atmcVar2.c = str;
        }
        if (!str2.isEmpty()) {
            createBuilder.copyOnWrite();
            atmc atmcVar3 = (atmc) createBuilder.instance;
            str2.getClass();
            atmcVar3.b |= 32;
            atmcVar3.f = str2;
        }
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        mM().d(acsb.b(62985), (apxf) aongVar.build(), null);
        mM().n(new acqx(acsb.c(22156)));
        mM().n(new acqx(acsb.c(64833)));
        this.aY = mM().k();
        this.ba = 62985;
        this.aZ = mM().k();
        lij lijVar = this.aR;
        lijVar.i = this.aY;
        lijVar.j = this.ba;
    }

    private final void bm() {
        if (this.bg || this.aR.f()) {
            return;
        }
        this.aD.requestFocus();
        if (this.be) {
            this.be = false;
        } else {
            bh();
            new Handler().postDelayed(new Runnable() { // from class: lbi
                @Override // java.lang.Runnable
                public final void run() {
                    lbz.this.bh();
                }
            }, 200L);
        }
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        if (this.be) {
            aF();
        }
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.ah.j(this);
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.al.g("voz-target-id");
        whu.C(this.aD);
        if (this.bd) {
            return;
        }
        if (evr.I(this.ag) && this.ae.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            return;
        }
        this.ae.u("sf_i", asmn.LATENCY_ACTION_SEARCH_UI);
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        this.aR.a(i, strArr, iArr);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void Z() {
        lay layVar;
        super.Z();
        if (this.aj.c().g()) {
            this.aD.setImeOptions(16777216);
        }
        if (this.bj || this.aR.f()) {
            this.aD.clearFocus();
            this.bj = false;
        } else {
            aunv aunvVar = this.ag.a().n;
            if (aunvVar == null) {
                aunvVar = aunv.a;
            }
            String str = aunvVar.f;
            lay[] values = lay.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    layVar = values[i];
                    if (TextUtils.equals(str, layVar.c)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    layVar = lay.SHOWN_ON_OPEN;
                    break;
                }
            }
            if (layVar == lay.SHOWN_ON_OPEN) {
                bm();
            }
        }
        akev a = this.e.a();
        a.m = this.ae;
        akep akepVar = a.b;
        akepVar.d = a.m;
        akey akeyVar = akepVar.a;
        akeyVar.b = akepVar.d;
        if (a != null) {
            aksl akslVar = this.an;
            akeyVar.a = akslVar;
            akepVar.c = akslVar;
        }
        aaxr aaxrVar = (aaxr) this.a.get();
        aaxp a2 = aaxrVar.a();
        a2.k();
        ynm.k(aaxrVar.b(a2), this.d, new ynk() { // from class: lbn
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                lbz.this.aP.r("Error occurred getting the history state", th);
            }
        }, new ynl() { // from class: lbo
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                lbz lbzVar = lbz.this;
                artc artcVar = (artc) obj;
                lbzVar.ax.set(artcVar.d);
                lbzVar.ay.set(artcVar.c);
            }
        });
        bg();
        this.bd = false;
        if (!evr.I(this.ag) || !this.ae.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.ae.t(asmn.LATENCY_ACTION_SEARCH_UI);
            this.ae.u("sr_ui", asmn.LATENCY_ACTION_SEARCH_UI);
        } else {
            this.ae.u("sr_ui", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
    }

    public final void aF() {
        whu.C(this.aD);
        this.ai.f();
        this.aR.c(r(-1).toByteArray());
    }

    public final void aG() {
        if (this.bk) {
            this.aW.ak(0);
        } else {
            this.aE.smoothScrollToPosition(0);
        }
    }

    public final void aH(aken akenVar) {
        yjk.f();
        Collection collection = akenVar.c;
        if (collection != null && !collection.isEmpty() && this.az.getCount() == 0 && evr.R(this.ag)) {
            mM().n(new acqx(acsb.c(12453)));
        }
        this.aG = -1;
        akei akeiVar = this.ai;
        akeiVar.f = new ArrayList(akenVar.c);
        akem akemVar = akenVar.b;
        Boolean bool = akemVar.a;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            akeiVar.d = booleanValue;
            if (booleanValue) {
                akeiVar.c++;
            }
        }
        if (!akenVar.a.isEmpty()) {
            int i = akemVar.b;
            akeiVar.i += i;
            if (i > akeiVar.j) {
                akeiVar.j = i;
            }
            int[] iArr = akeiVar.k;
            if (iArr != null) {
                if (i <= 1999) {
                    int i2 = akei.a[i / 100];
                    int[] iArr2 = akeiVar.k;
                    iArr2[i2] = iArr2[i2] + 1;
                } else {
                    int i3 = akei.b;
                    iArr[i3] = iArr[i3] + 1;
                }
            }
        }
        this.az.h();
        this.az.j(akenVar.d);
        this.az.g(akenVar.c);
    }

    public final void aI(String str) {
        aJ(str, -1);
    }

    public final void aJ(String str, int i) {
        this.aQ.a(str, r(i).toByteArray(), this.aY, this.ba);
        this.bd = true;
    }

    @Override // defpackage.gir
    public final aypy aP() {
        return aypy.R(gip.c);
    }

    @Override // defpackage.gir
    public final boolean bf() {
        BottomSheetBehavior bottomSheetBehavior;
        lhj lhjVar;
        lij lijVar = this.aR;
        if (evr.bd(lijVar.p) && (bottomSheetBehavior = lijVar.m) != null && bottomSheetBehavior.t == 3 && (lhjVar = (lhj) lijVar.e.mN().e(lijVar.g)) != null) {
            return lhjVar.a();
        }
        return false;
    }

    public final void bg() {
        anhy anhyVar;
        anhy anhyVar2 = this.aA;
        if (anhyVar2 != null) {
            anhyVar2.cancel(true);
        }
        if (!TextUtils.isEmpty(this.bi) && (anhyVar = this.aS) != null) {
            anhyVar.cancel(true);
        }
        this.bi = this.aH;
        SuggestVideoStateSubscriber suggestVideoStateSubscriber = (SuggestVideoStateSubscriber) this.b.get();
        final String str = suggestVideoStateSubscriber.b;
        final String str2 = suggestVideoStateSubscriber.a;
        final long seconds = suggestVideoStateSubscriber.c == -1 ? 0L : TimeUnit.MILLISECONDS.toSeconds(suggestVideoStateSubscriber.d.c() - suggestVideoStateSubscriber.c);
        this.aI = this.aH.toLowerCase(this.ap.getResources().getConfiguration().locale);
        final int selectionStart = this.aD.getSelectionStart();
        final akev a = this.e.a();
        if (!this.e.b() && this.aI.isEmpty()) {
            anhy qa = a.e.submit(new Callable() { // from class: aket
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Collection emptyList;
                    akeb b;
                    akev akevVar = akev.this;
                    aken akenVar = new aken("");
                    if (!akevVar.a.d()) {
                        emptyList = Collections.emptySet();
                    } else {
                        akeh akehVar = akevVar.i;
                        akdy akdyVar = null;
                        String a2 = akehVar != null ? akehVar.a() : null;
                        akey akeyVar = akevVar.b.a;
                        if (akeyVar != null && (b = akeyVar.b()) != null) {
                            akdyVar = b.d();
                        }
                        if (akdyVar != null) {
                            akevVar.k.set(akdyVar.b.size());
                            akeh akehVar2 = akevVar.i;
                            if (akehVar2 != null && a2.equals(akehVar2.a())) {
                                akeh akehVar3 = akevVar.i;
                                String str3 = akdyVar.e;
                                if (str3 != null) {
                                    try {
                                        akehVar3.a.set((char) Integer.parseInt(str3, 16));
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                akehVar3.c();
                            }
                            emptyList = akdyVar.b;
                        } else {
                            emptyList = Collections.emptyList();
                        }
                    }
                    akenVar.c = emptyList;
                    return akenVar;
                }
            });
            this.aA = qa;
            anaf.Y(qa, this.bl, this.d);
        }
        final String str3 = this.aI;
        final boolean z = !this.ax.get();
        final boolean z2 = !this.ay.get();
        ania schedule = a.e.schedule(new Callable() { // from class: akeu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return akev.this.d(str3, z, selectionStart, str, z2, str2, seconds);
            }
        }, 0L, TimeUnit.MILLISECONDS);
        this.aS = schedule;
        anaf.Y(schedule, this.aT, this.d);
    }

    public final void bh() {
        whu.J(this.aD);
    }

    public final void bi(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        this.aV.setVisibility(true != isEmpty ? 0 : 8);
        if (this.aX) {
            this.aU.setVisibility(true != isEmpty ? 8 : 0);
        }
    }

    @Override // defpackage.gir
    public final gad lv() {
        if (this.aq == null) {
            gac a = this.as.a();
            a.m(new amml() { // from class: lbp
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    fzf fzfVar = (fzf) obj;
                    fzfVar.b = lbz.this.aB;
                    fzfVar.d(amvs.a);
                    return fzfVar;
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r0.cA != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        if (r0.cz != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gir, defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mR(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbz.mR(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027a  */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbz.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        boolean z = true;
        if (!fhgVar.b() && !fhgVar.i()) {
            z = false;
        }
        this.bg = z;
        if (z) {
            whu.C(this.aD);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int selectionStart = this.aD.getSelectionStart();
        int selectionEnd = this.aD.getSelectionEnd();
        bm();
        EditText editText = this.aD;
        editText.setText(editText.getText());
        this.aD.setSelection(selectionStart, selectionEnd);
    }

    final asas r(int i) {
        int min;
        List e = this.az.e();
        if (this.bk) {
            min = Math.min(e.size() - 1, Math.max(this.aG, this.aC.L()));
        } else {
            min = Math.min(e.size() - 1, Math.max(this.aG, this.aE.getLastVisiblePosition()));
        }
        int a = this.az.a(i);
        akei akeiVar = this.ai;
        akeiVar.g = min;
        akeiVar.h = a;
        akev a2 = this.e.a();
        this.ai.l = a2.j();
        this.ai.m = a2.b();
        this.ai.n = this.am.b();
        return this.ai.a(a2.f());
    }

    public final void s(akef akefVar) {
        this.c.execute(new lbx(this, akefVar));
        List list = this.ai.f;
        if (list != null) {
            list.remove(akefVar);
        }
        this.az.i(akefVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbz.T(int, int, android.content.Intent):void");
    }
}
