package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kfq implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ kfq t = new kfq(19);
    public static final /* synthetic */ kfq s = new kfq(18);
    public static final /* synthetic */ kfq r = new kfq(17);
    public static final /* synthetic */ kfq q = new kfq(16);
    public static final /* synthetic */ kfq p = new kfq(15);
    public static final /* synthetic */ kfq o = new kfq(14);
    public static final /* synthetic */ kfq n = new kfq(13);
    public static final /* synthetic */ kfq m = new kfq(12);
    public static final /* synthetic */ kfq l = new kfq(11);
    public static final /* synthetic */ kfq k = new kfq(10);
    public static final /* synthetic */ kfq j = new kfq(9);
    public static final /* synthetic */ kfq i = new kfq(8);
    public static final /* synthetic */ kfq h = new kfq(7);
    public static final /* synthetic */ kfq g = new kfq(6);
    public static final /* synthetic */ kfq f = new kfq(5);
    public static final /* synthetic */ kfq e = new kfq(4);
    public static final /* synthetic */ kfq d = new kfq(3);
    public static final /* synthetic */ kfq c = new kfq(2);
    public static final /* synthetic */ kfq b = new kfq(1);
    public static final /* synthetic */ kfq a = new kfq(0);

    public /* synthetic */ kfq(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                return ((ajbl) obj).z();
            case 1:
                return ((aioc) obj).V();
            case 2:
                return Boolean.valueOf(((arib) obj) == arib.INLINE_PLAYBACK_TRIGGER_STYLE_USER);
            case 3:
                return Boolean.valueOf(((aric) obj) == aric.INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD);
            case 4:
                arhn arhnVar = (arhn) obj;
                acqx acqxVar = InteractiveInlineMutedControlsOverlay.a;
                return Boolean.valueOf(arhnVar == arhn.INLINE_AUDIO_CONTROL_UI_STYLE_PER_PLAYER || arhnVar == arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED || arhnVar == arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION || arhnVar == arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION);
            case 5:
                arhr arhrVar = (arhr) obj;
                acqx acqxVar2 = InteractiveInlineMutedControlsOverlay.a;
                return Boolean.valueOf(arhrVar == arhr.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_DEFAULT);
            case 6:
                arhr arhrVar2 = (arhr) obj;
                acqx acqxVar3 = InteractiveInlineMutedControlsOverlay.a;
                return Boolean.valueOf(arhrVar2 != arhr.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN);
            case 7:
                arib aribVar = (arib) obj;
                acqx acqxVar4 = InteractiveInlineMutedControlsOverlay.a;
                return Boolean.valueOf(aribVar == arib.INLINE_PLAYBACK_TRIGGER_STYLE_USER);
            case 8:
                fof fofVar = (fof) obj;
                aone builder = fofVar.toBuilder();
                int i2 = fofVar.k;
                builder.copyOnWrite();
                fof fofVar2 = (fof) builder.instance;
                fofVar2.b |= 128;
                fofVar2.k = i2 + 1;
                return (fof) builder.build();
            case 9:
                return ((aioc) obj).V();
            case 10:
                return ((ajbl) obj).R();
            case 11:
                return ((ajbl) obj).S();
            case 12:
                fof fofVar3 = (fof) obj;
                aone builder2 = fofVar3.toBuilder();
                int i3 = ((fof) fofVar3.toBuilder().instance).j;
                builder2.copyOnWrite();
                fof fofVar4 = (fof) builder2.instance;
                fofVar4.b |= 64;
                fofVar4.j = i3 + 1;
                return (fof) builder2.build();
            case 13:
                aone builder3 = ((fof) obj).toBuilder();
                builder3.copyOnWrite();
                fof fofVar5 = (fof) builder3.instance;
                fofVar5.b |= 2;
                fofVar5.d = true;
                return (fof) builder3.build();
            case 14:
                lqx lqxVar = ((lqw) obj).c;
                if (lqxVar == null) {
                    lqxVar = lqx.a;
                }
                return lqxVar.c;
            case 15:
                return Boolean.valueOf(!TextUtils.isEmpty((Spanned) obj));
            case 16:
                return ajcq.b((aqyg) obj);
            case 17:
                aqyg aqygVar = ((atnc) obj).c;
                return aqygVar == null ? aqyg.a : aqygVar;
            case 18:
                return Boolean.valueOf(1 == (((atnz) obj).b & 1));
            case 19:
                return Boolean.valueOf(((fof) obj).c);
            default:
                return String.valueOf(kqh.d((kqs) obj));
        }
    }
}
