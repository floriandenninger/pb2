package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class euc extends ml implements acqz {
    private zau WK;
    public zbw a;
    public fwo b;
    public sus c;
    public yxe d;
    public axpg e;
    public ykk f;
    private boolean h = false;

    private final void d() {
        qmy au = ((yke) alta.t(this, yke.class)).au();
        int h = au.h(this, 13000000);
        if (h != 0) {
            final int i = 1;
            final int i2 = 0;
            if (h == 1 || h == 2 || h == 3) {
                Dialog a = au.a(this, h, 17, new DialogInterface.OnCancelListener(this) { // from class: eua
                    public final /* synthetic */ euc a;

                    {
                        this.a = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        if (i != 0) {
                            this.a.finish();
                        } else {
                            this.a.finish();
                        }
                    }
                });
                a.setCanceledOnTouchOutside(false);
                a.show();
            } else {
                Dialog a2 = au.a(this, h, 17, new DialogInterface.OnCancelListener(this) { // from class: eua
                    public final /* synthetic */ euc a;

                    {
                        this.a = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        if (i2 != 0) {
                            this.a.finish();
                        } else {
                            this.a.finish();
                        }
                    }
                });
                a2.setCanceledOnTouchOutside(false);
                a2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eub
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        euc.this.finish();
                    }
                });
                a2.show();
            }
        }
    }

    protected Dialog a(int i) {
        return null;
    }

    protected void h(gng gngVar) {
    }

    public void j() {
        throw null;
    }

    protected Dialog k(int i) {
        return null;
    }

    protected void mE() {
    }

    public void mF() {
        lu supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.C();
            supportActionBar.j(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fzc mH() {
        return (fzc) this.e.get();
    }

    public final zau mI() {
        if (this.WK == null) {
            lu supportActionBar = getSupportActionBar();
            supportActionBar.getClass();
            this.WK = new zau(supportActionBar.b());
        }
        return this.WK;
    }

    public acra mM() {
        throw null;
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f.b(i, i2, intent)) {
            return;
        }
        if (i != 17) {
            if ((i == 900 || i == 901) && i2 == -1) {
                Intent z = akwg.z(this, intent);
                if (z != null) {
                    startActivityForResult(z, 902);
                    return;
                }
                i2 = -1;
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        d();
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.c.a(configuration, this);
        super.onConfigurationChanged(configuration);
        zbw zbwVar = this.a;
        if (zbwVar != null) {
            zbwVar.b();
        }
        mF();
        this.b.d();
    }

    @Override // android.app.Activity
    @Deprecated
    protected final Dialog onCreateDialog(int i) {
        return onCreateDialog(i, null);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        mH().f(menu, getMenuInflater(), mI());
        this.b.d();
        mE();
        return true;
    }

    @Override // defpackage.ml, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        mH().b(menu);
        return super.onMenuOpened(i, menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            j();
            return true;
        }
        return mH().e(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        supportInvalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onResume() {
        super.onResume();
        mF();
        zbw zbwVar = this.a;
        if (zbwVar != null) {
            zbwVar.b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public void onStart() {
        this.c.a(getResources().getConfiguration(), this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        zbw zbwVar = this.a;
        if (zbwVar != null) {
            zbwVar.b();
        }
        super.onUserInteraction();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        try {
            super.startActivity(intent);
        } catch (Exception e) {
            whu.K(this, R.string.error_processing_link, 0);
            afsi.c(2, 2, "Failed to resolve intent", e);
        }
    }

    @Override // defpackage.zv, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Override // android.app.Activity
    protected final Dialog onCreateDialog(int i, Bundle bundle) {
        if (isFinishing()) {
            return null;
        }
        return bundle != null ? k(i) : a(i);
    }

    @Override // defpackage.zv, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        try {
            super.startActivityForResult(intent, i, bundle);
        } catch (Exception e) {
            whu.K(this, R.string.error_processing_link, 0);
            afsi.c(2, 2, "Failed to resolve intent", e);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(intent, bundle);
        } catch (Exception e) {
            whu.K(this, R.string.error_processing_link, 0);
            afsi.c(2, 2, "Failed to resolve intent", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.h) {
            this.h = true;
            gni K = ((gnj) alta.t(this, gnj.class)).K();
            gng gngVar = gng.LIGHT;
            int ordinal = K.a().ordinal();
            if (ordinal == 0) {
                etx.h(this);
            } else if (ordinal == 1) {
                etx.i(true, this);
            }
            h(K.a());
        }
        d();
        super.onCreate(bundle);
        this.d.a();
    }
}
