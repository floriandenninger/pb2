package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SelectTaggedVideoButtonRendererOuterClass;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xxp extends xzb implements xum {
    public static final /* synthetic */ int bl = 0;
    private static final ColorDrawable bm = new ColorDrawable(0);
    public String aA;
    public String aB;
    public xzp aC;
    public EditText aD;
    public BackstagePollEditorView aE;
    public ajpd aF;
    public ammv aG;
    public View aH;
    public View aI;
    public String aJ;
    public String aK;
    public String aL;
    public boolean aM;
    public int aN;
    public DialogInterface.OnDismissListener aO;
    public xzt aP;
    public TextView aQ;
    public View aR;
    public ImageView aS;
    public TextView aT;
    public avhm aU;
    public aqyg aV;
    public aqyg aW;
    ayqx aX;
    public bamc aY;
    public RecyclerView aZ;
    public ajjz ae;
    public aahd af;
    public xun ag;
    public ajvb ah;
    public afsy ai;
    public akvq aj;
    public acra ak;
    public ajoy al;
    public xwp am;
    public ajjs an;
    public xtb ao;
    public aahv ap;
    public akbv aq;
    public akcy ar;
    public Executor as;
    public ayqi at;
    public shf au;
    public xud av;
    public xtn aw;
    public xuv ax;
    public apjf ay;
    public xxq az;
    public RecyclerView ba;
    public View bb;
    amru bc;
    public xzn bd;
    public boolean be = false;
    ViewTreeObserver.OnGlobalLayoutListener bf;
    ViewTreeObserver.OnGlobalLayoutListener bg;
    public boolean bh;
    public vgz bi;
    public ajyw bj;
    public ajyw bk;
    private MenuItem bn;
    private View bo;
    private xzu bp;
    private ajpd bq;
    private View br;
    private View bs;
    private FrameLayout bt;
    private ajkj bu;
    private int bv;
    private int bw;
    private TextView bx;
    private ImageView by;
    private Pattern bz;

    public static xxp aF(apjf apjfVar) {
        apjfVar.getClass();
        xxp xxpVar = new xxp();
        Bundle bundle = new Bundle();
        amkq.cn(bundle, "renderer", apjfVar);
        xxpVar.af(bundle);
        return xxpVar;
    }

    private final apxf aY() {
        apja apjaVar = this.ay.l;
        if (apjaVar == null) {
            apjaVar = apja.a;
        }
        if ((apjaVar.b & 1) != 0) {
            apja apjaVar2 = this.ay.l;
            if (apjaVar2 == null) {
                apjaVar2 = apja.a;
            }
            apmg apmgVar = apjaVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 16384) != 0) {
                apja apjaVar3 = this.ay.l;
                if (apjaVar3 == null) {
                    apjaVar3 = apja.a;
                }
                apmg apmgVar2 = apjaVar3.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apxf apxfVar = apmgVar2.o;
                return apxfVar == null ? apxf.a : apxfVar;
            }
        }
        return null;
    }

    private final void aZ() {
        arej arejVar;
        arej arejVar2;
        arej arejVar3;
        ammv aG = aG();
        if (this.bb.getVisibility() == 0 && aG.h()) {
            aulq aulqVar = ((aupe) aG.c()).c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            arel arelVar = ((apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer)).m;
            if (arelVar == null) {
                arelVar = arel.a;
            }
            if (arelVar.b == 102716411) {
                aulq aulqVar2 = ((aupe) aG.c()).c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                akbv akbvVar = this.aq;
                arel arelVar2 = apmgVar.m;
                if (arelVar2 == null) {
                    arelVar2 = arel.a;
                }
                if (arelVar2.b == 102716411) {
                    arejVar3 = (arej) arelVar2.c;
                } else {
                    arejVar3 = arej.a;
                }
                akbvVar.b(arejVar3, this.bb, apmgVar, this.ak);
                return;
            }
        }
        apja apjaVar = this.ay.l;
        if (apjaVar == null) {
            apjaVar = apja.a;
        }
        apmg apmgVar2 = apjaVar.c;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        arel arelVar3 = apmgVar2.m;
        if (arelVar3 == null) {
            arelVar3 = arel.a;
        }
        if (arelVar3.b != 102716411) {
            apjf apjfVar = this.ay;
            if ((apjfVar.c & 64) != 0) {
                aulq aulqVar3 = apjfVar.B;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                apmg apmgVar3 = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
                arel arelVar4 = apmgVar3.m;
                if (arelVar4 == null) {
                    arelVar4 = arel.a;
                }
                if (arelVar4.b == 102716411) {
                    akbv akbvVar2 = this.aq;
                    arel arelVar5 = apmgVar3.m;
                    if (arelVar5 == null) {
                        arelVar5 = arel.a;
                    }
                    if (arelVar5.b == 102716411) {
                        arejVar = (arej) arelVar5.c;
                    } else {
                        arejVar = arej.a;
                    }
                    akbvVar2.b(arejVar, this.aS, apmgVar3, this.ak);
                    return;
                }
                return;
            }
            return;
        }
        apja apjaVar2 = this.ay.l;
        if (apjaVar2 == null) {
            apjaVar2 = apja.a;
        }
        apmg apmgVar4 = apjaVar2.c;
        if (apmgVar4 == null) {
            apmgVar4 = apmg.a;
        }
        akbv akbvVar3 = this.aq;
        arel arelVar6 = apmgVar4.m;
        if (arelVar6 == null) {
            arelVar6 = arel.a;
        }
        if (arelVar6.b == 102716411) {
            arejVar2 = (arej) arelVar6.c;
        } else {
            arejVar2 = arej.a;
        }
        akbvVar3.b(arejVar2, this.by, apmgVar4, this.ak);
    }

    private final void bb(View view, avzv avzvVar, boolean z) {
        View findViewById = view.findViewById(R.id.video_removal_button);
        whu.I(findViewById, z);
        findViewById.setOnClickListener(new xxd(this, 3));
        ajok ajokVar = new ajok();
        ajokVar.a(this.ak);
        View c = this.bp.c(ajokVar, avzvVar);
        whu.I(this.aH, true);
        this.bt.addView(c);
        this.aJ = avzvVar.f;
    }

    private final void bc(Dialog dialog, int i) {
        new AlertDialog.Builder(C()).setMessage(i).setNegativeButton(R.string.comments_discard_negative_button, new hgs(10)).setPositiveButton(R.string.comments_discard_positive_button, new xxh(this, dialog)).setCancelable(false).create().show();
    }

    private final boolean bd() {
        ajpd ajpdVar;
        if (!TextUtils.isEmpty(this.aA)) {
            return true;
        }
        ajpd ajpdVar2 = this.aF;
        if (ajpdVar2 == null || ajpdVar2.isEmpty()) {
            return !(bj() != 3 || (ajpdVar = this.bq) == null || ajpdVar.isEmpty()) || this.aZ.getVisibility() == 0;
        }
        return true;
    }

    private final boolean be() {
        aqyg aqygVar;
        String trim = this.aD.getText().toString().trim();
        apjf apjfVar = this.ay;
        if ((apjfVar.b & 128) != 0) {
            aqygVar = apjfVar.j;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return !TextUtils.equals(trim, zhq.d(ajcq.b(aqygVar)));
    }

    private final boolean bf() {
        return TextUtils.getTrimmedLength(this.aD.getText()) > 0;
    }

    private final boolean bg() {
        xzp xzpVar = this.aC;
        if (xzpVar != null && xzpVar.c()) {
            return true;
        }
        ajpd ajpdVar = this.aF;
        if (ajpdVar != null && !ajpdVar.isEmpty()) {
            return true;
        }
        ajpd ajpdVar2 = this.bq;
        return !(ajpdVar2 == null || ajpdVar2.isEmpty()) || this.aH.getVisibility() == 0 || this.aE.getVisibility() == 0 || this.aZ.getVisibility() == 0;
    }

    private final boolean bh() {
        return qX().getConfiguration().orientation == 1;
    }

    private final boolean bi() {
        audl audlVar;
        apjf apjfVar = this.ay;
        if ((apjfVar.b & 32768) != 0) {
            audlVar = apjfVar.q;
            if (audlVar == null) {
                audlVar = audl.a;
            }
        } else {
            audlVar = null;
        }
        if (audlVar == null) {
            return false;
        }
        apmh apmhVar = audlVar.c;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        return (apmhVar.b & 1) != 0;
    }

    private final int bj() {
        apjf apjfVar = this.ay;
        if (apjfVar != null) {
            int i = apjfVar.b;
            if ((i & 2048) != 0) {
                if ((i & 4096) != 0) {
                    int aY = anaf.aY(apjfVar.n);
                    if (aY == 0) {
                        return 1;
                    }
                    return aY;
                }
                apjn apjnVar = apjfVar.m;
                if (apjnVar == null) {
                    apjnVar = apjn.a;
                }
                int i2 = apjnVar.b;
                if (i2 == 50577878) {
                    return 4;
                }
                if (i2 != 120744665) {
                    return i2 == 50732276 ? 6 : 2;
                }
                return 3;
            }
        }
        return 2;
    }

    @Override // defpackage.xum
    public final void a() {
        xzp xzpVar = this.aC;
        if (xzpVar != null) {
            xzpVar.b(3);
        }
        aM();
    }

    public final ammv aG() {
        apjf apjfVar = this.ay;
        if (apjfVar == null) {
            return amlr.a;
        }
        aulq aulqVar = apjfVar.f94J;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return ammv.i((aupe) aulqVar.pX(SelectTaggedVideoButtonRendererOuterClass.selectTaggedVideoButtonRenderer));
    }

    public final auec aH() {
        audz audzVar;
        if ((this.ay.c & 65536) == 0 || (audzVar = (audz) this.ap.a(this.ai.c()).f(this.ay.H).g(audz.class).X()) == null || (audzVar.b.b & 2) == 0) {
            return null;
        }
        return audzVar.getPostCreationData();
    }

    public final Pattern aI() {
        if (this.bz == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("(?:%[0-9a-fA-F]{2}|[-\\w./&?+=~:;\\'!(){}@#,*$ -\ud7ff\ue000-﷏ﷰ-�က0-\u1fffd\u20000-⿿d\u30000-㿿d䀀0-俿d倀0-忿d怀0-濿d瀀0-翿d耀0-迿d退0-鿿dꀀ0-꿿d뀀0-뿿d쀀0-쿿d퀀0-\udfffd\ue0000-\uefffd\uf0000-\uffffdက00-ჿfd])*");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(?:%[0-9a-fA-F]{2}|[-\\w/&?+=~:;\\'!(@#*$ -\ud7ff\ue000-﷏ﷰ-�က0-\u1fffd\u20000-⿿d\u30000-㿿d䀀0-俿d倀0-忿d怀0-濿d瀀0-翿d耀0-迿d退0-鿿dꀀ0-꿿d뀀0-뿿d쀀0-쿿d퀀0-\udfffd\ue0000-\uefffd\uf0000-\uffffdက00-ჿfd])");
            this.bz = Pattern.compile("(?i)(https?://" + ((CharSequence) sb) + ((CharSequence) sb2) + ")");
        }
        return this.bz;
    }

    public final void aJ() {
        whu.I(this.br, false);
    }

    public final void aK() {
        whu.I(this.bs, false);
    }

    public final void aL() {
        aqyg aqygVar = null;
        this.ak.I(3, new acqx(acsb.c(47866)), null);
        Dialog dialog = this.d;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        apjf apjfVar = this.ay;
        if ((apjfVar.b & 128) != 0 && (aqygVar = apjfVar.j) == null) {
            aqygVar = aqyg.a;
        }
        if (TextUtils.isEmpty(ajcq.b(aqygVar))) {
            apjn apjnVar = this.ay.m;
            if (apjnVar == null) {
                apjnVar = apjn.a;
            }
            if (apjnVar.b != 120744665) {
                if (bf() || bg()) {
                    bc(dialog, R.string.discard_post);
                    return;
                }
                dialog.cancel();
            }
        }
        if (be()) {
            bc(dialog, R.string.discard_edits);
            return;
        }
        dialog.cancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r4.aI.getVisibility() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r0 = r4.ay;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if ((r0.b & 67108864) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r0 = r0.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r0 = defpackage.aqyg.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (android.text.TextUtils.isEmpty(defpackage.ajcq.b(r0)) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r0 = r4.ay;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if ((r0.b & 67108864) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        r1 = r0.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r1 = defpackage.aqyg.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        r0 = defpackage.ajcq.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
    
        if ((r4.ay.b & 128) != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aM() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.aM():void");
    }

    public final void aN() {
        String replaceAll = aI().matcher(this.aD.getText()).replaceAll("");
        if (replaceAll == null || replaceAll.contentEquals(this.aD.getText())) {
            return;
        }
        this.aD.setText(replaceAll);
        this.aD.setSelection(replaceAll.length());
    }

    public final void aO(aqyg aqygVar) {
        MenuItem menuItem = this.bn;
        if (menuItem == null || aqygVar == null) {
            return;
        }
        menuItem.setTitle(ajcq.b(aqygVar));
    }

    public final void aP(boolean z) {
        MenuItem menuItem = this.bn;
        if (menuItem == null) {
            return;
        }
        menuItem.setEnabled(z);
    }

    public final void aQ(List list) {
        aqyg aqygVar;
        final BackstagePollEditorView backstagePollEditorView = this.aE;
        backstagePollEditorView.c();
        apmh apmhVar = backstagePollEditorView.a.c;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        amkq.N(1 == (apmhVar.b & 1));
        amkq.O(backstagePollEditorView.b == null, "Create option button can be added only once.");
        backstagePollEditorView.b = (TextView) LayoutInflater.from(backstagePollEditorView.getContext()).inflate(R.layout.backstage_poll_editor_create_option, (ViewGroup) backstagePollEditorView, false);
        TextView textView = backstagePollEditorView.b;
        apmh apmhVar2 = backstagePollEditorView.a.c;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 256) != 0) {
            apmh apmhVar3 = backstagePollEditorView.a.c;
            if (apmhVar3 == null) {
                apmhVar3 = apmh.a;
            }
            apmg apmgVar2 = apmhVar3.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            aqygVar = apmgVar2.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        backstagePollEditorView.b.setOnClickListener(new View.OnClickListener() { // from class: xwq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackstagePollEditorView backstagePollEditorView2 = BackstagePollEditorView.this;
                backstagePollEditorView2.b("");
                xxj xxjVar = backstagePollEditorView2.c;
                if (xxjVar != null) {
                    xxjVar.a();
                }
            }
        });
        TextView textView2 = backstagePollEditorView.b;
        whu.E(textView2, textView2.getBackground());
        backstagePollEditorView.addView(backstagePollEditorView.b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            backstagePollEditorView.b((String) it.next());
        }
        for (int size = backstagePollEditorView.a().size(); size < backstagePollEditorView.a.e; size++) {
            backstagePollEditorView.b("");
        }
        this.aE.setVisibility(0);
        aM();
    }

    public final boolean aS() {
        apjf apjfVar = this.ay;
        return (apjfVar == null || (apjfVar.b & 4) == 0) ? false : true;
    }

    public final boolean aT() {
        int aY;
        int aE;
        apjf apjfVar = this.ay;
        return (apjfVar == null || (aY = anaf.aY(apjfVar.n)) == 0 || aY != 5 || (aE = aobq.aE(this.ay.w)) == 0 || aE != 3) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aU() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.aU():boolean");
    }

    @Override // defpackage.xum
    public final void b(String str) {
        this.aA = str;
        xzp xzpVar = this.aC;
        if (xzpVar != null) {
            xzpVar.b(4);
        }
        aM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0165, code lost:
    
        if (r0 > r7) goto L55;
     */
    @Override // defpackage.xum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.drawable.Drawable r7, int r8) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.c(android.graphics.drawable.Drawable, int):void");
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        super.lZ();
        Object obj = this.aX;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        if ((this.ay.c & 1024) != 0) {
            aalc c = this.ap.a(this.ai.c()).c();
            c.g(this.ay.D);
            c.b().Q();
        }
        this.ag.b(this);
        this.ao.f(this.aC);
        ajpd ajpdVar = this.aF;
        if (ajpdVar != null) {
            ajpdVar.clear();
        }
        ajpd ajpdVar2 = this.bq;
        if (ajpdVar2 != null) {
            ajpdVar2.clear();
        }
        this.bp.e(this.bt);
        amru amruVar = this.bc;
        if (amruVar != null) {
            int i = ((amvj) amruVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                ((ayqx) amruVar.get(i2)).qc();
            }
        }
        if (this.be) {
            xtn xtnVar = this.aw;
            xtnVar.e = null;
            xtnVar.f = null;
            xtnVar.b.b(xtnVar);
            amru amruVar2 = xtnVar.h;
            int i3 = ((amvj) amruVar2).c;
            for (int i4 = 0; i4 < i3; i4++) {
                ((ayqx) amruVar2.get(i4)).qc();
            }
            xud xudVar = this.av;
            yjk.f();
            xudVar.f.clear();
            xudVar.g.clear();
            xzn xznVar = this.bd;
            if (xznVar != null) {
                amru amruVar3 = xznVar.i;
                int i5 = ((amvj) amruVar3).c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((ayqx) amruVar3.get(i6)).qc();
                }
                xznVar.g.f(xznVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Type inference failed for: r1v2, types: [ajos, java.lang.Object] */
    @Override // defpackage.bv, defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mR(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.mR(android.os.Bundle):void");
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(bm);
        window.setSoftInputMode(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0510  */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxp.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        TextView textView;
        super.onConfigurationChanged(configuration);
        if (!bh()) {
            aJ();
            aK();
        }
        if (!aS() || (textView = this.aQ) == null) {
            return;
        }
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this.bf);
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.aO;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.ak.t();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new xxm(this, C(), this.b);
    }

    public final void aR(auec auecVar) {
        boolean z = false;
        if (this.aJ != null || (this.ay.c & 65536) == 0) {
            whu.I(this.bb, false);
            return;
        }
        if (auecVar != null && (auecVar.b & 1) != 0) {
            z = true;
        }
        whu.I(this.bb, true ^ z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [ajos, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [ajos, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ajos, java.lang.Object] */
    private final void ba(View view, apjn apjnVar, apjg apjgVar) {
        apji apjiVar;
        final apiq apiqVar;
        aqrf aqrfVar;
        apiq apiqVar2;
        Integer num;
        int aE = aobq.aE(this.ay.w);
        if (aE == 0) {
            aE = 1;
        }
        int i = aE - 1;
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                int i3 = apjnVar.b;
                if (i3 == 120744665) {
                    this.aF = new ajpd();
                    ajox a = this.al.a(this.ah.get());
                    a.h(this.aF);
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.image_attachment);
                    recyclerView.af(new LinearLayoutManager());
                    recyclerView.ac(a);
                    ajpd ajpdVar = this.aF;
                    if (apjnVar.b == 120744665) {
                        apiqVar2 = (apiq) apjnVar.c;
                    } else {
                        apiqVar2 = apiq.a;
                    }
                    ajpdVar.add(apiqVar2);
                    whu.I(recyclerView, true);
                    return;
                }
                if (i3 == 50577878) {
                    bb(view, (avzv) apjnVar.c, false);
                    return;
                }
                if (i3 == 153515154) {
                    this.bq = new ajpd();
                    ajox a2 = this.al.a(this.ah.get());
                    a2.h(this.bq);
                    RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.attachment_view);
                    recyclerView2.af(new LinearLayoutManager());
                    recyclerView2.ac(a2);
                    if (apjnVar.b == 153515154) {
                        aqrfVar = (aqrf) apjnVar.c;
                    } else {
                        aqrfVar = aqrf.a;
                    }
                    this.bq.add(ajds.a(aqrfVar));
                    whu.I(recyclerView2, true);
                    return;
                }
                return;
            }
            apjf apjfVar = this.ay;
            if ((apjfVar.b & 536870912) != 0) {
                num = Integer.valueOf((aobq.aE(apjfVar.w) != 0 ? r6 : 1) - 1);
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Unsupported purpose: ");
            sb.append(valueOf);
            zga.b(sb.toString());
            return;
        }
        if (apjnVar == null || apjnVar.b != 120744665) {
            if (apjnVar != null && apjnVar.b == 50577878) {
                bb(view, (avzv) apjnVar.c, true);
                return;
            }
            if (apjgVar != null && apjgVar.b == 34 && bi()) {
                if (apjgVar.b == 34) {
                    apjiVar = (apji) apjgVar.c;
                } else {
                    apjiVar = apji.a;
                }
                aQ(apjiVar.b);
                return;
            }
            return;
        }
        apjn apjnVar2 = this.ay.m;
        if (apjnVar2 == null) {
            apjnVar2 = apjn.a;
        }
        if (apjnVar2.b == 120744665) {
            apjf apjfVar2 = this.ay;
            if ((apjfVar2.b & 134217728) != 0) {
                apjh apjhVar = apjfVar2.v;
                if (apjhVar == null) {
                    apjhVar = apjh.a;
                }
                if (!apjhVar.b.isEmpty()) {
                    if (apjnVar2.b == 120744665) {
                        apiqVar = (apiq) apjnVar2.c;
                    } else {
                        apiqVar = apiq.a;
                    }
                    whu.I(this.aI, true);
                    this.aF = new ajpd();
                    ajox a3 = this.al.a(this.ah.get());
                    a3.h(this.aF);
                    final ImageView imageView = (ImageView) view.findViewById(R.id.prefilled_image_removal_button);
                    RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.prefilled_image);
                    recyclerView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xxg
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                            apiq apiqVar3 = apiq.this;
                            ImageView imageView2 = imageView;
                            int i12 = xxp.bl;
                            avgg avggVar = apiqVar3.b;
                            if (avggVar == null) {
                                avggVar = avgg.a;
                            }
                            yny.z(imageView2, yny.u((i6 - i4) - ((int) (ahbw.A(avggVar) * (i7 - i5)))), ViewGroup.MarginLayoutParams.class);
                        }
                    });
                    recyclerView3.af(new LinearLayoutManager());
                    recyclerView3.ac(a3);
                    this.aF.add(apiqVar);
                    apjh apjhVar2 = this.ay.v;
                    if (apjhVar2 == null) {
                        apjhVar2 = apjh.a;
                    }
                    this.aA = apjhVar2.b;
                    apjh apjhVar3 = this.ay.v;
                    if (apjhVar3 == null) {
                        apjhVar3 = apjh.a;
                    }
                    this.aB = apjhVar3.c;
                    imageView.setOnClickListener(new xxd(this, i2));
                    return;
                }
            }
            zga.b("prefilled image post missed encryptedBlobId");
        }
    }
}
