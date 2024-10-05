package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acxf extends ml {
    private boolean a = true;
    private int b;
    private Bundle c;

    protected abstract int a();

    protected abstract ce b(int i);

    final void c() {
        if (this.a) {
            dd supportFragmentManager = getSupportFragmentManager();
            if (g(this.b, supportFragmentManager.e(R.id.content))) {
                return;
            }
            ce b = b(this.b);
            Bundle bundle = b.m;
            if (bundle != null) {
                Bundle bundle2 = this.c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                b.af(bundle);
            } else {
                b.af(this.c);
            }
            dn k = supportFragmentManager.k();
            k.y(R.id.content, b);
            k.a();
            f(this.b, this);
        }
    }

    protected void f(int i, Activity activity) {
    }

    protected abstract boolean g(int i, ce ceVar);

    protected abstract boolean h(int i);

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        if (h(this.b)) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt("currentIndex");
            this.c = bundle.getBundle("currentData");
        } else {
            this.b = a();
            this.c = null;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b = intent.getIntExtra("com.google.android.libraries.youtube.mdx.common.newIndex", -1);
        this.c = (Bundle) intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.common.data");
        c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentIndex", this.b);
        bundle.putBundle("currentData", this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.a = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.a = false;
    }
}
