package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class set implements ses {
    private final /* synthetic */ int d;
    public static final /* synthetic */ set c = new set(2);
    public static final /* synthetic */ set b = new set(1);
    public static final /* synthetic */ set a = new set(0);

    private /* synthetic */ set(int i) {
        this.d = i;
    }

    @Override // defpackage.ses
    public final Object a(long j) {
        int i = this.d;
        if (i == 0) {
            return new ExperienceJni(j);
        }
        if (i != 1) {
            return new RuntimeJni(j);
        }
        ((amxh) ((amxh) NativeCallback.a.f()).i("com/google/android/libraries/ar/faceviewer/runtime/NativeCallback", "lambda$create$0", 20, "NativeCallback.java")).q("NativeCallback.setNativeHandle() called when not expected.");
        return null;
    }
}
