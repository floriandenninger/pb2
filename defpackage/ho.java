package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ho {
    public static void A(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof it) {
            ((it) viewParent).c(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static void B(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof it) {
            ((it) viewParent).d(view, i);
            return;
        }
        if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static boolean C(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean D(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static boolean E(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof it) {
            return ((it) viewParent).e(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static void F(View view, aok aokVar) {
        view.setTag(R.id.view_tree_lifecycle_owner, aokVar);
    }

    public static final apq G() {
        if (apq.b == null) {
            apq.b = new apq();
        }
        apq apqVar = apq.b;
        apqVar.getClass();
        return apqVar;
    }

    public static float a(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    public static int b(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    public static int c(PlaybackState playbackState) {
        return playbackState.getState();
    }

    public static long d(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    public static long e(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    public static long f(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    public static long g(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    public static long h(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState.Builder i() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState.CustomAction.Builder j(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState.CustomAction k(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackState l(PlaybackState.Builder builder) {
        return builder.build();
    }

    public static Bundle m(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    public static CharSequence n(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    public static CharSequence o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    public static String p(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    public static List q(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }

    public static void y(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof it) {
            ((it) viewParent).kp(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void z(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof iu) {
            ((iu) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof it) {
            ((it) viewParent).kq(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }
}
