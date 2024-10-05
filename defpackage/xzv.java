package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xzv implements akrj {
    public boolean a = false;
    private final /* synthetic */ int b;

    public xzv(int i) {
        this.b = i;
    }

    @Override // defpackage.akrj
    public final void b(Bundle bundle) {
    }

    @Override // defpackage.akrj
    public final void a(String str, Bundle bundle) {
        if (this.b != 0) {
            if (this.a) {
                bundle.putString("has_viewed_stories_on_home", "YES");
            }
        } else if (this.a) {
            bundle.putString("has_viewed_community_posts_on_home", "YES");
        }
    }
}
