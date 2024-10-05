package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbc extends ncb {
    public final TextView a;
    public final RatingBar b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public nbc(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, View view3, Context context, aahd aahdVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mgu mguVar, mhg mhgVar, ajop ajopVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajjzVar, ajutVar, ajuwVar, view, view2, view3, context, aahdVar, inlinePlaybackLifecycleController, mguVar, mhgVar, ajopVar, ajywVar, akbdVar, null, null, null, null, null);
        this.a = (TextView) view3.findViewById(R.id.rating_text);
        this.b = (RatingBar) view3.findViewById(R.id.rating_bar);
        this.c = (TextView) view3.findViewById(R.id.price_text);
        this.d = (TextView) view3.findViewById(R.id.description);
        this.e = (ImageView) view3.findViewById(R.id.channel_thumbnail);
    }
}
