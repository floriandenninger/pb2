package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqb implements jpi {
    private final Context a;
    private final aahv b;
    private final shf c;
    private final ajoy d;

    public jqb(Context context, aahv aahvVar, shf shfVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = aahvVar;
        this.a = context;
        this.c = shfVar;
        this.d = ajoyVar;
    }

    @Override // defpackage.jpi
    public final int a() {
        return 164;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 224;
    }

    @Override // defpackage.jpi
    public final /* bridge */ /* synthetic */ jpg c(aakt aaktVar, String str, jph jphVar) {
        awiu awiuVar = (awiu) aaktVar;
        aahu c = this.b.c();
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aqmu.a.createBuilder();
        createBuilder.copyOnWrite();
        aqmu aqmuVar = (aqmu) createBuilder.instance;
        aqmuVar.c |= 1;
        aqmuVar.d = str;
        aqmr aqmrVar = new aqmr(createBuilder);
        if (mcy.ag(ammv.i(awiuVar), c)) {
            aqmrVar.ah(this.a.getString(R.string.travel_error_message));
            aqmrVar.ai(Integer.valueOf(acrb.DOWNLOADS_PAGE_TRAVEL_BANNER.Jk));
            aqmrVar.c(amkq.d(this.a.getString(R.string.learn_more)));
            aqmrVar.b("https://support.google.com/youtube/answer/6307365");
            aqmrVar.d(Integer.valueOf(acrb.DOWNLOADS_PAGE_TRAVEL_BANNER_LEARN_MORE_BUTTON.Jk));
        } else {
            long W = mcy.W(ammv.i(awiuVar), this.c, c);
            if (W < 2147483647L) {
                aqmrVar.ah(mcy.ae(this.a, W, false));
                aqmrVar.ai(Integer.valueOf(acrb.DOWNLOADS_PAGE_TEXIT_BANNER.Jk));
                aqmrVar.c(amkq.d(this.a.getString(R.string.learn_more)));
                aqmrVar.b("https://support.google.com/youtube/answer/6141269");
                aqmrVar.d(Integer.valueOf(acrb.DOWNLOADS_PAGE_TEXIT_BANNER_LEARN_MORE_BUTTON.Jk));
            }
        }
        return jpg.a(aqmrVar.aj());
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        return ammv.j(fhe.i());
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        String i = fhe.i();
        amsv i2 = amsx.i();
        i2.c(this.d.G(i));
        List<String> list = (List) this.b.c().f(i).g(awiu.class).P().s(jif.s).L(iub.m).Y(jif.t).L(iub.n).av().X();
        HashSet hashSet = new HashSet();
        for (String str2 : list) {
            hashSet.add(this.d.G(str2));
            hashSet.add(this.d.G(fhe.q(aalt.g(str2))));
        }
        i2.j(hashSet);
        return i2.g();
    }

    @Override // defpackage.jpi
    public final Class f() {
        return awiu.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqmt.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(2, str);
    }
}
