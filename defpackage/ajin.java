package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.Window;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajin implements slv {
    public final Context a;
    public int b;
    private final axpg c;
    private final axpg d;
    private final axpg e;
    private final axpg f;
    private ayqw g;
    private AlertDialog h;

    public ajin(Context context, axpg axpgVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4) {
        this.a = context;
        this.c = axpgVar;
        this.d = axpgVar2;
        this.e = axpgVar3;
        this.f = axpgVar4;
    }

    @Override // defpackage.slv
    public final void a() {
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.h = null;
        }
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.slv
    public final void b(awos awosVar, final slu sluVar) {
        AlertDialog.Builder builder;
        ayqw ayqwVar = this.g;
        if (ayqwVar != null) {
            ayqwVar.qc();
        }
        ayqw ayqwVar2 = new ayqw();
        this.g = ayqwVar2;
        this.b = ((Activity) this.a).getRequestedOrientation();
        final sww swwVar = (sww) this.c.get();
        int i = sluVar.i;
        if (i != -1) {
            ((Activity) this.a).setRequestedOrientation(i);
        }
        int i2 = sluVar.m;
        if (i2 == 2 || i2 == 3) {
            builder = new AlertDialog.Builder(this.a, R.style.Theme_YouTube_ElementsDialogFullScreen);
        } else {
            builder = new AlertDialog.Builder(this.a);
        }
        AlertDialog.Builder builder2 = builder;
        String str = sluVar.a;
        if (!TextUtils.isEmpty(str)) {
            builder2.setTitle(str);
        }
        if (!TextUtils.isEmpty(sluVar.b)) {
            builder2.setMessage(sluVar.b);
        }
        final swu swuVar = sluVar.g;
        final int i3 = 1;
        acra acraVar = null;
        if (!TextUtils.isEmpty(sluVar.c)) {
            final awnw awnwVar = sluVar.e;
            builder2.setPositiveButton(sluVar.c, awnwVar == null ? null : new DialogInterface.OnClickListener() { // from class: ajil
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    if (i3 != 0) {
                        swwVar.b(awnwVar, swuVar).Q();
                    } else {
                        swwVar.b(awnwVar, swuVar).Q();
                    }
                }
            });
        }
        final awnw awnwVar2 = sluVar.f;
        final int i4 = 0;
        if (!TextUtils.isEmpty(sluVar.d)) {
            builder2.setNegativeButton(sluVar.d, awnwVar2 == null ? null : new DialogInterface.OnClickListener() { // from class: ajil
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    if (i4 != 0) {
                        swwVar.b(awnwVar2, swuVar).Q();
                    } else {
                        swwVar.b(awnwVar2, swuVar).Q();
                    }
                }
            });
        }
        if (awnwVar2 != null) {
            builder2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ajik
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    sww.this.b(awnwVar2, swuVar).Q();
                }
            });
        }
        if ((awosVar.b & 1) != 0) {
            dkp dkpVar = new dkp(this.a);
            dhe dheVar = dkpVar.t;
            aomf aomfVar = sluVar.l;
            if (aomfVar != null) {
                acra acraVar2 = (acra) this.f.get();
                if (!aomfVar.H()) {
                    acraVar2.d(acsb.b(46220), null, null);
                    acraVar2.D(new acqx(aomfVar));
                }
            }
            Object obj = sluVar.k;
            if (obj instanceof acra) {
                acraVar = obj;
            } else if (sluVar.l != null) {
                acraVar = (acra) this.f.get();
            }
            if (acraVar == null) {
                acraVar = ((acqz) this.e.get()).mM();
            }
            sqq sqqVar = (sqq) this.d.get();
            sxb a = sxc.a();
            a.a = dkpVar;
            a.f(false);
            a.l = amru.r(ahbl.i(awosVar.toByteArray()));
            dho c = ComponentTree.c(dheVar, sqqVar.a(dheVar, a.a(), awosVar.toByteArray(), ajgg.w(acraVar), ayqwVar2));
            c.d = false;
            dkpVar.G(c.a());
            builder2.setView(dkpVar);
        }
        DialogInterface.OnKeyListener onKeyListener = sluVar.h;
        if (onKeyListener != null) {
            builder2.setOnKeyListener(onKeyListener);
        }
        final slt sltVar = sluVar.j;
        builder2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ajim
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ajin ajinVar = ajin.this;
                slu sluVar2 = sluVar;
                slt sltVar2 = sltVar;
                ajinVar.c();
                if (sluVar2.i != -1) {
                    ((Activity) ajinVar.a).setRequestedOrientation(ajinVar.b);
                }
                if (sltVar2 != null) {
                    sltVar2.e();
                }
            }
        });
        AlertDialog create = builder2.create();
        create.show();
        Window window = create.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setSoftInputMode(16);
        }
        if (sluVar.m == 2 && window != null) {
            window.getDecorView().setSystemUiVisibility(5894);
        }
        if (sltVar != null) {
            sltVar.f();
        }
        this.h = create;
    }

    public final void c() {
        ayqw ayqwVar = this.g;
        if (ayqwVar != null) {
            ayqwVar.qc();
            this.g = null;
        }
    }
}
