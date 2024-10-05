package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class iqw extends euc implements iqj, ips {
    public ypa A;
    public aypn B;
    public aaea C;
    public ajvb D;
    public azrw E;
    public acra F;
    public ajvq G;
    public akai H;
    public ajoy I;

    /* renamed from: J, reason: collision with root package name */
    public ajxj f224J;
    public afol K;
    public akam L;
    ajwi Q;
    public ajyw R;
    public sxd y;
    public zaw z;
    public final iqx M = new iqx(this);
    public boolean N = false;
    public boolean O = false;
    final iqu P = new iqu(this);
    private final ayra g = new ayra();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean A() {
        aaea aaeaVar = this.C;
        if (aaeaVar == null) {
            return false;
        }
        astj astjVar = aaeaVar.a().c;
        if (astjVar == null) {
            astjVar = astj.a;
        }
        return astjVar.k;
    }

    protected boolean B() {
        return this.N;
    }

    @Override // defpackage.iqj
    public final ayph i(asty astyVar) {
        if (!A() || akai.g(this)) {
            return w(astyVar);
        }
        return ayph.j(new iqr(this, astyVar, 0));
    }

    public abstract int l();

    public abstract View m();

    @Override // defpackage.euc, defpackage.acqz
    public acra mM() {
        return this.F;
    }

    public abstract ViewAnimatorHelper n();

    @Override // defpackage.zv, android.app.Activity
    public void onBackPressed() {
        if (n().a() != R.id.location_search_view) {
            if (this.M.e()) {
                this.M.b();
                return;
            } else if (B()) {
                new AlertDialog.Builder(this).setTitle(R.string.stop_upload_dialog_title).setMessage(R.string.stop_upload_dialog_body).setPositiveButton(R.string.stop_upload_dialog_positive, new DialogInterface.OnClickListener() { // from class: iqq
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        iqw.this.x();
                    }
                }).setNegativeButton(R.string.stop_upload_dialog_negative, hgs.c).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: iqn
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        dialogInterface.dismiss();
                    }
                }).show();
                return;
            } else {
                x();
                return;
            }
        }
        this.P.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.g.e()) {
            return;
        }
        this.g.qc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onPause() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        if (recyclerView != null && recyclerView.hasFocus()) {
            recyclerView.clearFocus();
        }
        super.onPause();
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        akam akamVar = this.L;
        if (akamVar == null || !akamVar.b(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public abstract ammv p();

    public abstract void s();

    public abstract void u(aone aoneVar);

    public final ayph w(asty astyVar) {
        return ayph.j(new iqr(this, astyVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x() {
        this.M.a();
        if (isTaskRoot()) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r14v0, types: [ajos, java.lang.Object] */
    public final void y(aamd aamdVar, arvr arvrVar) {
        yjk.f();
        if (this.Q == null) {
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.ab(1);
            recyclerView.af(linearLayoutManager);
            ajxi a = this.f224J.a(aasm.n, this.F);
            ?? r14 = this.D.get();
            r14.f(aszh.class, new ajou(this.E));
            ajwi ajwiVar = new ajwi(null, recyclerView, this.I, this.G, aasm.n, this.A, a, this.z, this.F, r14, ajxa.WI, ajwk.d, this.C, this.B);
            this.Q = ajwiVar;
            ajwiVar.c();
        }
        this.Q.h();
        this.Q.M(aamdVar);
        if ((arvrVar.b & 2) != 0) {
            ammv p = p();
            if (p.h()) {
                aone createBuilder = avfh.a.createBuilder();
                aone createBuilder2 = awph.a.createBuilder();
                String uri = ((iqv) p.c()).a.toString();
                createBuilder2.copyOnWrite();
                awph awphVar = (awph) createBuilder2.instance;
                uri.getClass();
                awphVar.c = 1;
                awphVar.d = uri;
                createBuilder.copyOnWrite();
                avfh avfhVar = (avfh) createBuilder.instance;
                awph awphVar2 = (awph) createBuilder2.build();
                awphVar2.getClass();
                avfhVar.c = awphVar2;
                avfhVar.b |= 1;
                String str = ((iqv) p.c()).b;
                createBuilder.copyOnWrite();
                avfh avfhVar2 = (avfh) createBuilder.instance;
                avfhVar2.b |= 2;
                avfhVar2.d = str;
                this.y.b(arvrVar.d, ((avfh) createBuilder.build()).toByteArray());
            }
        }
        if ((arvrVar.b & 1) != 0) {
            this.g.a(this.y.a(arvrVar.c).L(gsv.i).Y(gpd.m).M(gpd.n).ab(ayqr.a()).ax(new ayrs() { // from class: iqt
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    iqw iqwVar = iqw.this;
                    atdv atdvVar = (atdv) obj;
                    iqwVar.N = atdvVar.b;
                    iqwVar.O = atdvVar.c;
                    iqwVar.s();
                }
            }));
        }
    }

    public final void z() {
        m().setVisibility(0);
        n().b(l());
    }
}
