package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class prr extends ppu {
    private final pth a;

    public prr() {
        super("Mp4WebvttDecoder");
        this.a = new pth();
    }

    @Override // defpackage.ppu
    protected final ppw q(byte[] bArr, int i, boolean z) {
        ppp c;
        this.a.E(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.a.a() > 0) {
            if (this.a.a() >= 8) {
                int d = this.a.d();
                if (this.a.d() == 1987343459) {
                    pth pthVar = this.a;
                    int i2 = d - 8;
                    CharSequence charSequence = null;
                    ppo ppoVar = null;
                    while (i2 > 0) {
                        if (i2 >= 8) {
                            int d2 = pthVar.d();
                            int d3 = pthVar.d();
                            int i3 = d2 - 8;
                            String F = pts.F(pthVar.a, pthVar.b, i3);
                            pthVar.H(i3);
                            i2 = (i2 - 8) - i3;
                            if (d3 == 1937011815) {
                                ppoVar = prz.b(F);
                            } else if (d3 == 1885436268) {
                                charSequence = prz.a(null, F.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new ppy("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (ppoVar != null) {
                        ppoVar.a = charSequence;
                        c = ppoVar.a();
                    } else {
                        c = prz.c(charSequence);
                    }
                    arrayList.add(c);
                } else {
                    this.a.H(d - 8);
                }
            } else {
                throw new ppy("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new pqw(arrayList, 3, null);
    }
}
