package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class irs implements zfi {
    public final /* synthetic */ irz a;
    private final /* synthetic */ int b;

    public /* synthetic */ irs(irz irzVar, int i) {
        this.b = i;
        this.a = irzVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.a.getSupportActionBar().f();
            return;
        }
        boolean z = true;
        if (i == 1) {
            this.a.a.getSupportActionBar().r();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                irz irzVar = this.a;
                irzVar.t(irzVar.L, 4, (Throwable) obj);
                return;
            } else if (i != 4) {
                irz irzVar2 = this.a;
                irzVar2.t(irzVar2.N, 7, (Throwable) obj);
                return;
            } else {
                irz irzVar3 = this.a;
                irzVar3.t(irzVar3.M, 5, (Throwable) obj);
                return;
            }
        }
        irz irzVar4 = this.a;
        Boolean bool = (Boolean) obj;
        if (!irzVar4.Q) {
            irzVar4.e();
            return;
        }
        boolean booleanValue = bool.booleanValue();
        irzVar4.f225J = booleanValue;
        if (booleanValue) {
            amkq.O(irzVar4.z != null, "Video editing fragment is not initialized");
            View findViewById = irzVar4.a.findViewById(R.id.video_edit_fragment_container);
            try {
                zyd zydVar = irzVar4.z;
                ScrollView scrollView = irzVar4.v;
                scrollView.getClass();
                View view = findViewById == null ? zydVar.O : findViewById;
                amkq.O(view != null, "Upload video edit fragment root view does not exist");
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == scrollView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                amkq.E(z);
                zydVar.a = scrollView;
                zydVar.a.getViewTreeObserver().addOnScrollChangedListener(zydVar);
                findViewById.setVisibility(0);
            } catch (RuntimeException e) {
                irzVar4.ac.e("Cannot setup the video edit fragment", e);
                irzVar4.f225J = false;
                findViewById.setVisibility(8);
            }
        }
        irzVar4.s(5);
    }
}
