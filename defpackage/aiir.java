package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiir {
    public final Executor a;
    private final shf b;
    private final ajyg c;
    private final ajyw d;

    public aiir(shf shfVar, ajyg ajygVar, ajyw ajywVar, Executor executor, byte[] bArr, byte[] bArr2) {
        shfVar.getClass();
        this.b = shfVar;
        this.c = ajygVar;
        this.d = ajywVar;
        executor.getClass();
        this.a = executor;
    }

    public static aiiq a(final PlaybackStartDescriptor playbackStartDescriptor, final aigd aigdVar, final aaea aaeaVar, final String str, final amml ammlVar, amml ammlVar2, boolean z, Executor executor) {
        if (TextUtils.isEmpty(playbackStartDescriptor.l())) {
            anhy anhyVar = (anhy) ammlVar2.apply(playbackStartDescriptor);
            return new aiiq(anfq.i(anhyVar, new anfz() { // from class: aiim
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    PlaybackStartDescriptor a;
                    atys e;
                    PlaybackStartDescriptor playbackStartDescriptor2 = PlaybackStartDescriptor.this;
                    aigd aigdVar2 = aigdVar;
                    String str2 = str;
                    amml ammlVar3 = ammlVar;
                    aaea aaeaVar2 = aaeaVar;
                    WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
                    String str3 = watchNextResponseModel.b;
                    if (watchNextResponseModel.c == null || (e = aifk.e(aaeaVar2)) == null || !e.D) {
                        aifz e2 = playbackStartDescriptor2.e();
                        e2.n = str3;
                        a = e2.a();
                    } else {
                        aifz d = PlaybackStartDescriptor.d();
                        d.p = playbackStartDescriptor2.f;
                        d.a = watchNextResponseModel.c;
                        a = d.a();
                        if (TextUtils.isEmpty(a.l())) {
                            aifz e3 = a.e();
                            e3.n = str3;
                            a = e3.a();
                        }
                    }
                    return (anhy) ammlVar3.apply(aiip.a(a, aigdVar2, str2, true));
                }
            }, executor), ammv.j(anhyVar));
        }
        return new aiiq((anhy) ammlVar.apply(aiip.a(playbackStartDescriptor, aigdVar, str, z)), amlr.a);
    }

    private final anhy c(final ayqj ayqjVar, final ayrv ayrvVar, final amml ammlVar, final Object obj) {
        return aci.c(new aeu() { // from class: aiil
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                aiir aiirVar = aiir.this;
                ayqj ayqjVar2 = ayqjVar;
                ayrv ayrvVar2 = ayrvVar;
                final amml ammlVar2 = ammlVar;
                final Object obj2 = obj;
                return ayqjVar2.G(ayrvVar2).I(azre.b(aiirVar.a)).J(new ayrv() { // from class: aiio
                    @Override // defpackage.ayrv
                    public final Object a(Object obj3) {
                        amml ammlVar3 = amml.this;
                        Object obj4 = obj2;
                        Throwable th = (Throwable) obj3;
                        if (!(th instanceof UnsupportedOperationException)) {
                            afsi.c(2, 10, "Error performing streaming watch.", th);
                        }
                        return wbs.J((anhy) ammlVar3.apply(obj4));
                    }
                }).W(new aiin(aesVar, 0), new aiin(aesVar, 2));
            }
        });
    }

    public final aiiq b(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, String str, aypy aypyVar, amml ammlVar, amml ammlVar2, boolean z) {
        ayqj at = aypyVar.L(aflz.e).at();
        ajyg ajygVar = this.c;
        long d = this.b.d();
        aaqz aaqzVar = (aaqz) ajygVar.d.get();
        aaqzVar.getClass();
        afsy afsyVar = (afsy) ajygVar.a.get();
        afsyVar.getClass();
        aapf aapfVar = (aapf) ajygVar.c.get();
        aapfVar.getClass();
        Set set = (Set) ajygVar.b.get();
        set.getClass();
        anhy c = c(at, new aijt(aaqzVar, afsyVar, aapfVar, set, str, d), ammlVar, aiip.a(playbackStartDescriptor, aigdVar, str, z));
        ayqj at2 = aypyVar.L(aflz.f).at();
        ajyw ajywVar = this.d;
        aaqz aaqzVar2 = (aaqz) ajywVar.a.get();
        aaqzVar2.getClass();
        afsy afsyVar2 = (afsy) ajywVar.c.get();
        afsyVar2.getClass();
        aapw aapwVar = (aapw) ajywVar.b.get();
        aapwVar.getClass();
        return new aiiq(c, ammv.j(c(at2, new aijx(aaqzVar2, afsyVar2, aapwVar), ammlVar2, playbackStartDescriptor)));
    }
}
