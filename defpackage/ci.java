package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.IntentSenderRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ci extends zv implements ahn, aho {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final aom mFragmentLifecycleRegistry;
    final cm mFragments;
    boolean mResumed;
    boolean mStopped;

    public ci() {
        this.mFragments = cm.a(new ch(this));
        this.mFragmentLifecycleRegistry = new aom(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().b(LIFECYCLE_TAG, new bub() { // from class: cg
            @Override // defpackage.bub
            public final Bundle a() {
                return ci.this.m34lambda$init$0$androidsupportv4appFragmentActivity();
            }
        });
        addOnContextAvailableListener(new aab() { // from class: cf
            @Override // defpackage.aab
            public final void a(Context context) {
                ci.this.m35lambda$init$1$androidsupportv4appFragmentActivity(context);
            }
        });
    }

    private static boolean markState(dd ddVar, aoe aoeVar) {
        boolean z = false;
        for (ce ceVar : ddVar.l()) {
            if (ceVar != null) {
                if (ceVar.N() != null) {
                    z |= markState(ceVar.mN(), aoeVar);
                }
                dq dqVar = ceVar.Y;
                if (dqVar != null && ((aom) dqVar.getLifecycle()).b.a(aoe.STARTED)) {
                    ceVar.Y.a.f(aoeVar);
                    z = true;
                }
                if (ceVar.X.b.a(aoe.STARTED)) {
                    ceVar.X.f(aoeVar);
                    z = true;
                }
            }
        }
        return z;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.e.c.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            apw.a(this).c(str2, printWriter);
        }
        this.mFragments.b().E(str, fileDescriptor, printWriter, strArr);
    }

    public dd getSupportFragmentManager() {
        return this.mFragments.b();
    }

    @Deprecated
    public apw getSupportLoaderManager() {
        return apw.a(this);
    }

    /* renamed from: lambda$init$0$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ Bundle m34lambda$init$0$androidsupportv4appFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.e(aod.ON_STOP);
        return new Bundle();
    }

    /* renamed from: lambda$init$1$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m35lambda$init$1$androidsupportv4appFragmentActivity(Context context) {
        co coVar = this.mFragments.a;
        coVar.e.n(coVar, coVar, null);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), aoe.CREATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.c();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(ce ceVar) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.c();
        super.onConfigurationChanged(configuration);
        this.mFragments.a.e.r(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(aod.ON_CREATE);
        this.mFragments.a.e.s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
            cm cmVar = this.mFragments;
            return onCreatePanelMenu | cmVar.a.e.T(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.e.t();
        this.mFragmentLifecycleRegistry.e(aod.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.a.e.u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.a.e.U(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.a.e.S(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.a.e.v(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        this.mFragments.c();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.a.e.w(menu);
            i = 0;
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.e.y();
        this.mFragmentLifecycleRegistry.e(aod.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.a.e.z(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.a.e.V(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // defpackage.zv, android.app.Activity, defpackage.ahn
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.c();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.c();
        super.onResume();
        this.mResumed = true;
        this.mFragments.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(aod.ON_RESUME);
        this.mFragments.a.e.A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.c();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.a.e.q();
        }
        this.mFragments.d();
        this.mFragmentLifecycleRegistry.e(aod.ON_START);
        this.mFragments.a.e.B();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.a.e.D();
        this.mFragmentLifecycleRegistry.e(aod.ON_STOP);
    }

    public void setEnterSharedElementCallback(ej ejVar) {
        setEnterSharedElementCallback(ejVar != null ? new ahp() : null);
    }

    public void setExitSharedElementCallback(ej ejVar) {
        setExitSharedElementCallback(ejVar != null ? new ahp() : null);
    }

    public void startActivityFromFragment(ce ceVar, Intent intent, int i) {
        startActivityFromFragment(ceVar, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(ce ceVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2 = intent;
        if (i != -1) {
            if (ceVar.A == null) {
                throw new IllegalStateException("Fragment " + ceVar + " not attached to Activity");
            }
            if (dd.W(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(ceVar);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                sb.append(i);
                sb.append(" IntentSender: ");
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
            }
            dd mO = ceVar.mO();
            if (mO.r == null) {
                co coVar = mO.m;
                if (i != -1) {
                    throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
                }
                coVar.b.startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
                return;
            }
            if (bundle != null) {
                if (intent2 == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if (dd.W(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ActivityOptions ");
                    sb2.append(bundle);
                    sb2.append(" were added to fillInIntent ");
                    sb2.append(intent2);
                    sb2.append(" for fragment ");
                    sb2.append(ceVar);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            aal aalVar = new aal(intentSender);
            aalVar.a = intent2;
            aalVar.b(i3, i2);
            IntentSenderRequest a = aalVar.a();
            mO.t.addLast(new FragmentManager$LaunchedFragmentInfo(ceVar.l, i));
            if (dd.W(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Fragment ");
                sb3.append(ceVar);
                sb3.append("is launching an IntentSender for result ");
            }
            mO.r.b(a);
            return;
        }
        startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(ce ceVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            ceVar.ap(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public ci(int i) {
        super(i);
        this.mFragments = cm.a(new ch(this));
        this.mFragmentLifecycleRegistry = new aom(this);
        this.mStopped = true;
        init();
    }
}
