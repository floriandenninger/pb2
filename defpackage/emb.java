package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class emb extends elj {
    public env a;
    public Handler b;
    public elf c;
    public aaea d;
    public ymp e;
    public ammv f;
    public yys g;
    public eni h;
    public aadw i;
    public adpl j;

    protected int f() {
        throw null;
    }

    protected int g() {
        throw null;
    }

    protected int h() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Intent i() {
        Intent intent = new Intent(getIntent());
        intent.setComponent(new ComponentName(this, (Class<?>) j()));
        intent.putExtra("alias", getClass().getName());
        intent.setFlags(g());
        return intent;
    }

    protected abstract Class j();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(Intent intent) {
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }

    protected boolean l(boolean z) {
        throw null;
    }

    protected boolean m() {
        throw null;
    }

    protected void n() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        c();
        this.g.h(1);
        etx.h(this);
        super.onCreate(bundle);
        this.e.a();
        int f = f();
        this.c.b(f);
        this.h.f(f);
        if (evr.bk(this.i)) {
            this.j.a.c(new emk(f));
        }
        aswb aswbVar = this.d.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (aswbVar.ak) {
            l(true);
            k((Intent) ((azrw) ((amna) this.f).a).get());
        } else {
            env envVar = this.a;
            Intent i = i();
            n();
            Intent b = envVar.b(i);
            if (b != null) {
                l(true);
                k(b);
            } else if (l(false)) {
                if (h() == 0) {
                    k(i());
                } else {
                    this.b.postDelayed(new Runnable() { // from class: ema
                        @Override // java.lang.Runnable
                        public final void run() {
                            emb embVar = emb.this;
                            embVar.k(embVar.i());
                        }
                    }, h());
                }
            } else if (m()) {
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }
        this.e.a();
        this.g.d(1);
    }
}
