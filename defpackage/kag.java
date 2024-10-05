package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kag implements kbj {
    private final jng a;
    private final ammv b;

    public kag(jng jngVar, ammv ammvVar) {
        this.a = jngVar;
        this.b = ammvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        aqnf b;
        Long l;
        aqmz aqmzVar;
        if (!juaVar.b.h()) {
            b = aqnf.b(((aqng) juaVar.c.instance).c);
            if (b == null) {
                b = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
        } else {
            aqnd aqndVar = (aqnd) juaVar.b.c();
            if (aqndVar.b == 2) {
                aqmzVar = (aqmz) aqndVar.c;
            } else {
                aqmzVar = aqmz.a;
            }
            b = aqnf.b(aqmzVar.d);
            if (b == null) {
                b = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
        }
        if (this.b.h()) {
            jng jngVar = this.a;
            int intValue = ((Integer) this.b.c()).intValue();
            jni jniVar = jngVar.d;
            aonk aonkVar = aqnh.b;
            aone createBuilder = aqnh.a.createBuilder();
            String d = amkq.d(jngVar.a.getString(R.string.expand_button_message, Integer.valueOf(intValue)));
            createBuilder.copyOnWrite();
            aqnh aqnhVar = (aqnh) createBuilder.instance;
            d.getClass();
            aqnhVar.c |= 8;
            aqnhVar.d = d;
            createBuilder.copyOnWrite();
            aqnh aqnhVar2 = (aqnh) createBuilder.instance;
            aqnhVar2.e = b.e;
            aqnhVar2.c |= 16;
            String j = fhe.j();
            createBuilder.copyOnWrite();
            aqnh aqnhVar3 = (aqnh) createBuilder.instance;
            j.getClass();
            aqnhVar3.c |= 64;
            aqnhVar3.g = j;
            int i = acrb.DOWNLOADS_PAGE_DOWNLOADS_SECTION_EXPAND_BUTTON.Jk;
            createBuilder.copyOnWrite();
            aqnh aqnhVar4 = (aqnh) createBuilder.instance;
            aqnhVar4.c |= 32;
            aqnhVar4.f = i;
            aqvj aqvjVar = jngVar.f.a.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45354176L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45354176L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45354176L);
                l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
            } else {
                l = 0L;
            }
            long longValue = l.longValue();
            int i2 = (int) longValue;
            if (longValue == i2) {
                int aj = aobq.aj(i2);
                createBuilder.copyOnWrite();
                aqnh aqnhVar5 = (aqnh) createBuilder.instance;
                int i3 = aj - 1;
                if (aj != 0) {
                    aqnhVar5.h = i3;
                    aqnhVar5.c |= 128;
                    ammv b2 = jniVar.b(R.raw.downloads_page_expand_button_element_android, aonkVar, (aqnh) createBuilder.build());
                    if (b2.h()) {
                        aone createBuilder2 = askg.a.createBuilder();
                        aqrf aqrfVar = (aqrf) b2.c();
                        createBuilder2.copyOnWrite();
                        askg askgVar = (askg) createBuilder2.instance;
                        askgVar.av = aqrfVar;
                        askgVar.h |= 1048576;
                        return amru.r(new kbh((askg) createBuilder2.build()));
                    }
                } else {
                    throw null;
                }
            } else {
                throw new ArithmeticException();
            }
        }
        return amru.q();
    }
}
