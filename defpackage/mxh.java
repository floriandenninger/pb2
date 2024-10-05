package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxh implements ajom {
    private final View a;
    private final View b;
    private final View c;
    private final View d;
    private final View e;
    private final /* synthetic */ int f;

    public mxh(Context context, int i, byte[] bArr) {
        this.f = i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_video_ghost_card, (ViewGroup) null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.thumbnail_layout);
        this.d = inflate.findViewById(R.id.title);
        this.c = inflate.findViewById(R.id.author);
        this.e = inflate.findViewById(R.id.numViews);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f != 0 ? this.a : this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.f == 0) {
            mcy.v(this.b);
            mcy.v(this.c);
            mcy.v(this.d);
            mcy.v(this.e);
            return;
        }
        mcy.v(this.b);
        mcy.v(this.d);
        mcy.v(this.c);
        mcy.v(this.e);
    }

    public mxh(Context context, int i) {
        this.f = i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.video_with_context_ghost_card, (ViewGroup) null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.thumbnail_layout);
        this.c = inflate.findViewById(R.id.channel_avatar);
        this.d = inflate.findViewById(R.id.title);
        this.e = inflate.findViewById(R.id.subtitle);
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        if (this.f == 0) {
            int i = ((fhh) obj).a * 3;
            mcy.u(this.b, i);
            int i2 = i + 1;
            mcy.u(this.c, i2);
            mcy.u(this.d, i2);
            mcy.u(this.e, i + 2);
            return;
        }
        throw null;
    }
}
