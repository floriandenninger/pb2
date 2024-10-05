package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dat extends Fragment {
    public final dac a;
    public final dax b;
    public cor c;
    private final Set d;
    private dat e;

    public dat() {
        dac dacVar = new dac();
        this.b = new das(this);
        this.d = new HashSet();
        this.a = dacVar;
    }

    private final void a() {
        dat datVar = this.e;
        if (datVar != null) {
            datVar.d.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a();
            dat c = cnv.b(activity).e.c(activity.getFragmentManager());
            this.e = c;
            if (equals(c)) {
                return;
            }
            this.e.d.add(this);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.b();
        a();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        a();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.d();
    }

    @Override // android.app.Fragment
    public final String toString() {
        String fragment = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder sb = new StringBuilder(String.valueOf(fragment).length() + 9 + String.valueOf(valueOf).length());
        sb.append(fragment);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
