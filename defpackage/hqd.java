package defpackage;

import android.os.Bundle;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqd implements aaha {
    private final ci a;
    private final /* synthetic */ int b;

    public hqd(ci ciVar, int i) {
        this.b = i;
        this.a = ciVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        hnk hnkVar;
        int i = this.b;
        if (i == 0) {
            amkq.E(apxfVar.pY(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand));
            dd supportFragmentManager = this.a.getSupportFragmentManager();
            if (!(supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG") instanceof hpp)) {
                hpm hpmVar = new hpm();
                Bundle bundle = new Bundle();
                bundle.putByteArray("SfvMusicSearchFragmentCommandKey", apxfVar.toByteArray());
                hpmVar.af(bundle);
                dn k = supportFragmentManager.k();
                k.q(R.id.accessibility_layer_container, hpmVar, "SFV_AUDIO_SEARCH_FRAGMENT_TAG");
                k.s(null);
                k.a();
                supportFragmentManager.aa();
                return;
            }
            hpm hpmVar2 = (hpm) supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG");
            String str = ((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) apxfVar.pX(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).e;
            hpw hpwVar = hpmVar2.ag;
            hpwVar.a.clearFocus();
            whu.C(hpwVar.a);
            hpwVar.a.setText(str);
            hpmVar2.af.b(hpmVar2.ah.getText().toString());
            hpmVar2.q(str);
            return;
        }
        if (i == 1) {
            amkq.E(apxfVar.pY(autn.b));
            bue e = ((ce) Optional.ofNullable(this.a.getSupportFragmentManager().e(R.id.reel_creation_container)).get()).mN().e(R.id.reel_container);
            if (e instanceof hnl) {
                hoj q = ((hnl) e).q();
                if (!q.n || (hnkVar = q.q) == null || hnkVar.av()) {
                    return;
                }
                q.q.qh(q.c, "OverlayDialogFragment");
                return;
            }
            return;
        }
        if (i == 2) {
            amkq.E(apxfVar.pY(aurm.b));
            dd supportFragmentManager2 = this.a.getSupportFragmentManager();
            if (supportFragmentManager2.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG") instanceof hpp) {
                ((hpp) supportFragmentManager2.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG")).o(((aurm) apxfVar.pX(aurm.b)).c);
                return;
            }
            return;
        }
        if (i == 3) {
            Bundle bundle2 = new Bundle();
            bundle2.putByteArray("navigation_endpoint", apxfVar.toByteArray());
            kww kwwVar = new kww();
            kwwVar.af(bundle2);
            kwwVar.qh(this.a.getSupportFragmentManager(), "PlaylistInfoFragment");
            return;
        }
        ce f = this.a.getSupportFragmentManager().f("comment_dialog_fragment");
        if (f == null || !f.av()) {
            return;
        }
        ((bv) f).dismiss();
    }
}
