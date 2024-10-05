package defpackage;

import android.os.Parcel;
import com.google.android.youtube.api.StandalonePlayerActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alvk extends ecq implements alvl {
    final /* synthetic */ StandalonePlayerActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alvk(StandalonePlayerActivity standalonePlayerActivity) {
        super("com.google.android.youtube.player.internal.IPlaylistEventListener");
        this.a = standalonePlayerActivity;
    }

    @Override // defpackage.alvl
    public final void a() {
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return false;
            }
            f();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.alvl
    public final void f() {
        this.a.finish();
    }

    @Override // defpackage.alvl
    public final void g() {
    }

    public alvk() {
        super("com.google.android.youtube.player.internal.IPlaylistEventListener");
    }
}
