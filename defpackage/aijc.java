package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijc {
    public final ypa a;
    private final aarm b;
    private final aijp c;
    private final abdt d;
    private final Set e;
    private final aaea f;
    private final aelm g;
    private final afsy h;
    private final ajoy i;

    public aijc(ypa ypaVar, aarm aarmVar, ajoy ajoyVar, afsy afsyVar, aijp aijpVar, Set set, abdt abdtVar, aaea aaeaVar, aelm aelmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ypaVar.getClass();
        this.a = ypaVar;
        aarmVar.getClass();
        this.b = aarmVar;
        aijpVar.getClass();
        this.c = aijpVar;
        set.getClass();
        this.e = set;
        abdtVar.getClass();
        this.d = abdtVar;
        this.f = aaeaVar;
        this.g = aelmVar;
        this.i = ajoyVar;
        this.h = afsyVar;
    }

    public final aypy a(aarn aarnVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar) {
        aypy J2;
        aaox h = aaox.h(this.f, playbackStartDescriptor.f(), str, playbackStartDescriptor.c(), aigdVar.h, playbackStartDescriptor.z());
        if (h != null && !TextUtils.isEmpty(playbackStartDescriptor.l())) {
            h.f(playbackStartDescriptor.l());
            h.d.set(aosz.ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_PHASE_TWO);
        }
        String l = playbackStartDescriptor.l();
        final acsx acsxVar = aigdVar.b;
        this.a.d(new ahdl());
        if (acsxVar != null) {
            acsxVar.c("sw_s");
            aone createBuilder = asmb.a.createBuilder();
            if (str != null) {
                createBuilder.copyOnWrite();
                asmb asmbVar = (asmb) createBuilder.instance;
                asmbVar.b |= 2048;
                asmbVar.k = str;
            }
            String h2 = zhq.h(l);
            createBuilder.copyOnWrite();
            asmb asmbVar2 = (asmb) createBuilder.instance;
            asmbVar2.b |= 33554432;
            asmbVar2.p = h2;
            acsxVar.a((asmb) createBuilder.build());
        }
        aelm aelmVar = this.g;
        if (aelmVar == null || h == null) {
            return aypy.J(new UnsupportedOperationException("requestStreamingWatch only available through onesie."));
        }
        aelk aelkVar = (aelk) aelmVar;
        afjf c = aelkVar.c(acsxVar);
        c.V();
        aesn a = aelkVar.j.a(h.b);
        aelw aelwVar = new aelw(aelkVar.h, h.b, aelkVar.f);
        aelkVar.g.b(a, h.b);
        if (h.g == null) {
            J2 = aypy.J(new IllegalArgumentException("Onesie requests must have a non-null videoId."));
        } else {
            try {
                aejb a2 = aelkVar.e.a(h, aelwVar, adyu.l(aelz.i(((aelk) aelmVar).c, ((aelk) aelmVar).i, ((aelk) aelmVar).d)), c, aarnVar);
                aelkVar.e(h, a, c);
                J2 = a2.a();
            } catch (aelx e) {
                int i = e.a;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    aelwVar.c("unavailable.hotconfig", e);
                } else if (i2 == 1) {
                    aelwVar.c("unavailable.keyexpired", e);
                }
                J2 = aypy.J(e);
            }
        }
        aysw.c(16, "initialCapacity");
        azfn azfnVar = new azfn(J2);
        ayrv ayrvVar = aynu.l;
        azix azixVar = new azix(azfnVar, aysu.b(aypy.I()));
        ayrv ayrvVar2 = aynu.l;
        new ayqw(azixVar.ax(new ayrs() { // from class: aijb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aijc.this.a.d(new ahdk());
            }
        }), azixVar.ax(new ayrs() { // from class: aija
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acsx acsxVar2 = acsx.this;
                if (acsxVar2 != null) {
                    acsxVar2.c("sw_r");
                }
            }
        }));
        return azfnVar;
    }

    public final aarn b(PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar) {
        aijr c = this.c.c(playbackStartDescriptor, -1, this.e, aigdVar.b, str);
        abdu a = this.d.a(playbackStartDescriptor.l(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.i(), playbackStartDescriptor.y(), new aijj(this.a, aigdVar.b));
        ajoy ajoyVar = this.i;
        afsx c2 = this.h.c();
        ajoyVar.getClass();
        c2.getClass();
        aijl aijlVar = new aijl(ajoyVar, c2, null, null, null);
        aijlVar.a = ammv.j(c);
        aijlVar.b = ammv.j(a);
        aijlVar.m(playbackStartDescriptor.y());
        return this.b.a(aijlVar, asbm.a, afwv.a, afrl.l, abxm.j);
    }
}
