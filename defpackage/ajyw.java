package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajyw {
    public final azrw a;
    public final azrw b;
    public final azrw c;

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, short[] sArr) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, byte[] bArr, byte[] bArr2) {
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr, char[] cArr, byte[] bArr) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public final ajyv a(acra acraVar, ViewGroup viewGroup) {
        Context context = (Context) this.a.get();
        context.getClass();
        acraVar.getClass();
        Handler handler = (Handler) this.b.get();
        handler.getClass();
        ajsa ajsaVar = (ajsa) this.c.get();
        ajsaVar.getClass();
        viewGroup.getClass();
        return new ajyv(context, acraVar, handler, ajsaVar, viewGroup);
    }

    public final ahvq b(ahvc ahvcVar, ahxt ahxtVar) {
        ainy ainyVar = (ainy) this.c.get();
        ainyVar.getClass();
        ypa ypaVar = (ypa) this.a.get();
        ypaVar.getClass();
        aivo aivoVar = (aivo) this.b.get();
        aivoVar.getClass();
        ahvcVar.getClass();
        ahxtVar.getClass();
        return new ahvq(ainyVar, ypaVar, aivoVar, ahvcVar, ahxtVar);
    }

    public final void c(Uri uri) {
        yjk.e();
        if (((ysy) this.c.get()).o()) {
            long c = ((shf) this.a.get()).c();
            String.format(Locale.US, "Prewarm %s", uri);
            afur afurVar = new afur(this, uri.toString(), new afsl(2), c, null, null, null);
            afurVar.h = false;
            afurVar.s();
            ((ysl) this.b.get()).a(afurVar);
        }
    }

    public final afol d(afok afokVar, afoi afoiVar) {
        acra acraVar = (acra) this.c.get();
        acraVar.getClass();
        afot afotVar = (afot) this.b.get();
        afotVar.getClass();
        aaxn aaxnVar = (aaxn) this.a.get();
        aaxnVar.getClass();
        afokVar.getClass();
        afoiVar.getClass();
        return new afol(acraVar, afotVar, aaxnVar, afokVar, afoiVar, null);
    }

    public final ybz e(View view) {
        Context context = (Context) this.a.get();
        context.getClass();
        ajut ajutVar = (ajut) this.c.get();
        ajutVar.getClass();
        ajjz ajjzVar = (ajjz) this.b.get();
        ajjzVar.getClass();
        view.getClass();
        return new ybz(context, ajutVar, ajjzVar, view);
    }

    public final weo f(wed wedVar, ViewGroup viewGroup) {
        Context context = (Context) this.c.get();
        context.getClass();
        wfz wfzVar = (wfz) this.b.get();
        wfzVar.getClass();
        aahd aahdVar = (aahd) this.a.get();
        aahdVar.getClass();
        wedVar.getClass();
        return new weo(context, wfzVar, aahdVar, wedVar, viewGroup);
    }

    public final b g(aahd aahdVar) {
        aahdVar.getClass();
        ysy ysyVar = (ysy) this.c.get();
        ysyVar.getClass();
        afsy afsyVar = (afsy) this.a.get();
        afsyVar.getClass();
        abab ababVar = (abab) this.b.get();
        ababVar.getClass();
        return new b(aahdVar, ysyVar, afsyVar, ababVar);
    }

    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b h(aahd aahdVar) {
        aahdVar.getClass();
        ysy ysyVar = (ysy) this.c.get();
        ysyVar.getClass();
        afsy afsyVar = (afsy) this.a.get();
        afsyVar.getClass();
        abdd abddVar = (abdd) this.b.get();
        abddVar.getClass();
        return new com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b(aahdVar, ysyVar, afsyVar, abddVar);
    }

    public final npz i(acra acraVar, asht ashtVar, npy npyVar) {
        Context context = (Context) this.a.get();
        context.getClass();
        ajdw ajdwVar = (ajdw) this.c.get();
        ajdwVar.getClass();
        axpg axpgVar = ((axqv) this.b).get();
        axpgVar.getClass();
        acraVar.getClass();
        return new npz(context, ajdwVar, axpgVar, acraVar, ashtVar, npyVar);
    }

    public final nou j(acra acraVar, asht ashtVar, apbq apbqVar) {
        Context context = (Context) this.a.get();
        context.getClass();
        ajdw ajdwVar = (ajdw) this.c.get();
        ajdwVar.getClass();
        axpg axpgVar = ((axqv) this.b).get();
        axpgVar.getClass();
        acraVar.getClass();
        apbqVar.getClass();
        return new nou(context, ajdwVar, axpgVar, acraVar, ashtVar, apbqVar);
    }

    public final lzz k(acra acraVar, arfm arfmVar) {
        mda mdaVar = (mda) this.a.get();
        mdaVar.getClass();
        Context context = (Context) this.c.get();
        context.getClass();
        akht akhtVar = (akht) this.b.get();
        arfmVar.getClass();
        return new lzz(mdaVar, context, akhtVar, acraVar, arfmVar, null);
    }

    public final ltq l(ausu ausuVar, arcz arczVar, lto ltoVar, ajxe ajxeVar) {
        Context context = (Context) this.a.get();
        context.getClass();
        ajvb ajvbVar = (ajvb) this.b.get();
        ajvbVar.getClass();
        ypa ypaVar = (ypa) this.c.get();
        ypaVar.getClass();
        ausuVar.getClass();
        arczVar.getClass();
        return new ltq(context, ajvbVar, ypaVar, ausuVar, arczVar, ltoVar, ajxeVar);
    }

    public final lss m(ausu ausuVar, arcz arczVar, lto ltoVar, ajxe ajxeVar) {
        Context context = (Context) this.a.get();
        context.getClass();
        ajvb ajvbVar = (ajvb) this.b.get();
        ajvbVar.getClass();
        ypa ypaVar = (ypa) this.c.get();
        ypaVar.getClass();
        ausuVar.getClass();
        arczVar.getClass();
        return new lss(context, ajvbVar, ypaVar, ausuVar, arczVar, ltoVar, ajxeVar);
    }

    public final lil n(String str) {
        fuu fuuVar = (fuu) this.c.get();
        fuuVar.getClass();
        agcm agcmVar = (agcm) this.b.get();
        agcmVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.get();
        scheduledExecutorService.getClass();
        str.getClass();
        return new lil(fuuVar, agcmVar, scheduledExecutorService, str, null, null, null);
    }

    public final kzg o(we weVar, we weVar2, int i) {
        Activity activity = (Activity) this.a.get();
        activity.getClass();
        ajjz ajjzVar = (ajjz) this.b.get();
        ajjzVar.getClass();
        return new kzg(activity, ajjzVar, weVar, weVar2, i);
    }

    public final iox p(CoordinatorLayout coordinatorLayout, EditText editText, ViewGroup viewGroup, apxf apxfVar, acra acraVar, avuu avuuVar, boolean z) {
        Context context = (Context) this.a.get();
        context.getClass();
        jlb jlbVar = (jlb) this.b.get();
        jlbVar.getClass();
        coordinatorLayout.getClass();
        editText.getClass();
        viewGroup.getClass();
        apxfVar.getClass();
        acraVar.getClass();
        avuuVar.getClass();
        return new iox(context, jlbVar, coordinatorLayout, editText, viewGroup, apxfVar, acraVar, avuuVar, z, (byte[]) null, (byte[]) null);
    }

    public final gce q(atcf atcfVar, acra acraVar, akbl akblVar) {
        aahd aahdVar = (aahd) this.c.get();
        aahdVar.getClass();
        shf shfVar = (shf) this.a.get();
        shfVar.getClass();
        ((acqz) this.b.get()).getClass();
        acraVar.getClass();
        return new gce(aahdVar, shfVar, atcfVar, acraVar, akblVar);
    }

    public final fqw r(fqy fqyVar, View view) {
        ajjz ajjzVar = (ajjz) this.b.get();
        ajjzVar.getClass();
        Context context = (Context) this.a.get();
        context.getClass();
        ajut ajutVar = (ajut) this.c.get();
        ajutVar.getClass();
        view.getClass();
        return new fqw(ajjzVar, context, ajutVar, fqyVar, view);
    }

    public final fjo s(String str, atsb atsbVar, apmg apmgVar, azrw azrwVar, azrw azrwVar2, acra acraVar) {
        fjs fjsVar = (fjs) this.c.get();
        fjsVar.getClass();
        agyr agyrVar = (agyr) this.b.get();
        agyrVar.getClass();
        aahd aahdVar = (aahd) this.a.get();
        aahdVar.getClass();
        str.getClass();
        azrwVar.getClass();
        azrwVar2.getClass();
        acraVar.getClass();
        return new fjo(fjsVar, agyrVar, aahdVar, str, atsbVar, apmgVar, azrwVar, azrwVar2, acraVar);
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, byte[] bArr4) {
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, char[] cArr2, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int[] iArr, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr, byte[] bArr4) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, byte[] bArr, char[] cArr2, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr, char[] cArr2, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, short[] sArr, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, short[] sArr, byte[] bArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, int[] iArr, byte[] bArr2) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, boolean[] zArr, byte[] bArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, char[] cArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr, byte[] bArr2, char[] cArr2) {
        this.c = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr, byte[] bArr, char[] cArr) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, char[] cArr, char[] cArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, char[] cArr2, char[] cArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, short[] sArr, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int[] iArr, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, byte[] bArr, short[] sArr) {
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr, short[] sArr2) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, boolean[] zArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(Context context) {
        axqr a = axqs.a(context);
        this.b = a;
        skn sknVar = new skn(a);
        this.a = sknVar;
        this.c = axqq.b(new oux((azrw) a, (azrw) sknVar, 6, (short[]) null));
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, char[] cArr2, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, short[] sArr, byte[] bArr2) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int[] iArr, byte[] bArr) {
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, byte[] bArr, char[] cArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr, char[] cArr2) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, short[] sArr) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        azrwVar.getClass();
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr, byte[] bArr2) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, char[] cArr) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, char[] cArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, char[] cArr) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, short[] sArr) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, char[] cArr) {
        this.b = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, byte[] bArr) {
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    public ajyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }
}
