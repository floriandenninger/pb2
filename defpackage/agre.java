package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agre extends agpo implements ypd {
    private final Context e;

    public agre(Context context, agsn agsnVar, String str) {
        super(agsnVar, str);
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpo
    public Pair a() {
        if (!g()) {
            return super.a();
        }
        List emptyList = Collections.emptyList();
        List k = this.a.m().k();
        if (!k.isEmpty()) {
            r3 = k.size() > 1 ? agng.b(k.size(), this.e.getString(R.string.single_videos_playlist_title), null, null) : null;
            emptyList = k;
        }
        return b(r3, emptyList);
    }

    @Override // defpackage.agpo
    public final boolean e() {
        return (TextUtils.isEmpty(this.b) || g()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return TextUtils.equals("PPSV", this.b);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agku.class, aglb.class};
        }
        if (i == 0) {
            if (!g()) {
                return null;
            }
            a();
            return null;
        }
        if (i == 1) {
            if (!g()) {
                return null;
            }
            a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
