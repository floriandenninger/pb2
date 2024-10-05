package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ape extends Fragment {
    public static final /* synthetic */ int b = 0;
    public aoz a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, aod aodVar) {
        if (activity instanceof aon) {
            ((aon) activity).a().e(aodVar);
        } else if (activity instanceof aok) {
            aof lifecycle = ((aok) activity).getLifecycle();
            if (lifecycle instanceof aom) {
                ((aom) lifecycle).e(aodVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new apd());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ape(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private final void c(aod aodVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aodVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(aod.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c(aod.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        c(aod.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        aoz aozVar = this.a;
        if (aozVar != null) {
            aozVar.a.a();
        }
        c(aod.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        aoz aozVar = this.a;
        if (aozVar != null) {
            aozVar.a.b();
        }
        c(aod.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        c(aod.ON_STOP);
    }
}
