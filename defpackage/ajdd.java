package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajdd implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private final ajdh a;
    private final ajdg b;
    private final String c;
    private boolean d;
    public final aahd g;
    public final Object h;
    public AlertDialog i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajdd(aahd aahdVar, ajdh ajdhVar, Object obj, String str) {
        aahdVar.getClass();
        this.g = aahdVar;
        this.a = ajdhVar;
        this.h = obj;
        this.c = str;
        this.d = false;
        this.b = ajdhVar == null ? null : new ajdg() { // from class: ajdc
            @Override // defpackage.ajdg
            public final void lP() {
                ajdd ajddVar = ajdd.this;
                if (ajddVar.i == null) {
                    return;
                }
                ajddVar.i(6);
            }
        };
    }

    protected void a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map d() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
        hashMap.put(acrc.b, Boolean.TRUE);
        return hashMap;
    }

    protected void e() {
    }

    protected void f() {
    }

    public final void i(int i) {
        amkq.N(this.i != null);
        lw(i);
        this.d = true;
        ammv n = yjj.n(this.i.getContext());
        if (n.h()) {
            Activity activity = (Activity) n.c();
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        this.i.dismiss();
    }

    public final void j(AlertDialog alertDialog) {
        alertDialog.getClass();
        amkq.N(this.i == null);
        this.i = alertDialog;
        alertDialog.setOnDismissListener(this);
    }

    public final void k() {
        amkq.N(this.i != null);
        ajdh ajdhVar = this.a;
        if (ajdhVar != null) {
            String str = this.c;
            if (str == null) {
                ajdhVar.a(this.b);
            } else {
                ajdhVar.b(this.b, str);
            }
        }
        this.i.show();
    }

    protected void lw(int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        amkq.N(dialogInterface == this.i);
        if (i >= 0) {
            a(i);
            return;
        }
        if (i == -1) {
            f();
            i(1);
        } else if (i == -3) {
            i(2);
        } else if (i == -2) {
            e();
            i(3);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.d) {
            this.d = true;
            lw(5);
        }
        ajdh ajdhVar = this.a;
        if (ajdhVar != null) {
            String str = this.c;
            if (str == null) {
                ajdhVar.d(this.b);
            } else {
                ajdhVar.e(this.b, str);
            }
        }
    }
}
