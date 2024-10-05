package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akc {
    public final akb a;

    public akc(akb akbVar) {
        this.a = akbVar;
    }

    public akc(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new ajz(uri, clipDescription, uri2);
        } else {
            this.a = new aka(uri, clipDescription, uri2);
        }
    }
}
