package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iek extends iel {
    public final ReelWatchActivity a;
    public final ihn b;
    public final azrw c;
    public final iml d;
    public final fxj e;
    public final ykk f;
    public final ifw g;
    public final yqw h;
    public final yxe i;
    public final sus j;
    public final aadw k;
    private final gfw m;

    public iek(ReelWatchActivity reelWatchActivity, gfw gfwVar, ihn ihnVar, azrw azrwVar, iml imlVar, aadw aadwVar, fxj fxjVar, ykk ykkVar, ifw ifwVar, yqw yqwVar, yxe yxeVar, sus susVar, byte[] bArr, byte[] bArr2) {
        this.a = reelWatchActivity;
        this.m = gfwVar;
        this.b = ihnVar;
        this.c = azrwVar;
        this.d = imlVar;
        this.k = aadwVar;
        this.e = fxjVar;
        this.f = ykkVar;
        this.g = ifwVar;
        this.h = yqwVar;
        this.i = yxeVar;
        this.j = susVar;
    }

    public static Optional a(Intent intent) {
        return Optional.ofNullable(intent).map(ham.g);
    }

    public final void b() {
        final Intent intent = this.a.getIntent();
        azrw azrwVar = this.c;
        String str = azrwVar == null ? " !reelBackstack;" : "";
        if (azrwVar != null) {
            if (intent == null) {
                str = str.concat(" !intent;");
            } else {
                apxf b = ((hav) azrwVar.get()).b();
                if (b != null && b.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    return;
                }
                Optional map = a(intent).map(ham.h);
                map.ifPresent(new Consumer() { // from class: iej
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        iek iekVar = iek.this;
                        Intent intent2 = intent;
                        ((hav) iekVar.c.get()).e((apxf) obj, intent2.getExtras());
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
                if (!map.isPresent()) {
                    str = str.concat(" !command;");
                }
            }
        }
        if (ammx.e(str)) {
            return;
        }
        if (this.m != null) {
            String valueOf = String.valueOf(str);
            gfw.v(2, valueOf.length() != 0 ? "ReelWatchActivity.replaceFragment failed:".concat(valueOf) : new String("ReelWatchActivity.replaceFragment failed:"));
        }
        this.a.finish();
    }
}
