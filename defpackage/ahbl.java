package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahbl {
    public static final Class[] a(ahez ahezVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahdv.class, ahef.class, ahel.class};
        }
        if (i == 0) {
            ahezVar.s((ahcx) obj);
            return null;
        }
        if (i == 1) {
            ahezVar.u((ahdv) obj);
            return null;
        }
        if (i == 2) {
            ahezVar.c((ahef) obj);
            return null;
        }
        if (i == 3) {
            ahezVar.v((ahel) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static boolean b(int i) {
        if (i == 79 || i == 130 || i == 126 || i == 127) {
            return true;
        }
        switch (i) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                return false;
        }
    }

    public static final Class[] c(ahxg ahxgVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdu.class};
        }
        if (i == 0) {
            ahxgVar.g();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static boolean d(int i) {
        return e(i, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14);
    }

    public static boolean e(int i, int... iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static int f(int i) {
        return i - 1;
    }

    public static boolean g(PlayerResponseModel playerResponseModel, shf shfVar) {
        VideoStreamingData videoStreamingData;
        return (playerResponseModel == null || (videoStreamingData = playerResponseModel.c) == null || !videoStreamingData.A(shfVar.d())) ? false : true;
    }

    public static int h(int i) {
        return i - 1;
    }

    public static swt i(Object obj) {
        return j(obj, null);
    }

    public static swt j(Object obj, asht ashtVar) {
        ajgb a = ajgc.a();
        a.a = obj;
        if (ashtVar != null) {
            a.b = ashtVar;
        }
        final ajgc a2 = a.a();
        return new swt() { // from class: ajgd
            @Override // defpackage.swt
            public final sws a(sws swsVar) {
                swsVar.d = ajgc.this;
                return swsVar;
            }
        };
    }

    public static final void k(int i, aomf aomfVar, swu swuVar) {
        int i2;
        ammv g = ahbn.g(swuVar);
        if (g.h()) {
            switch (i - 1) {
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 1025;
                    break;
                case 3:
                    i2 = 9;
                    break;
                case 4:
                    i2 = 65;
                    break;
                case 5:
                    i2 = 4097;
                    break;
                case 6:
                    i2 = 8193;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            if (i2 != 1) {
                ((acra) g.c()).I(i2, new acqx(aomfVar), null);
            }
        }
    }

    public static apmg l(aqdt aqdtVar) {
        if ((aqdtVar.b & 64) == 0) {
            return null;
        }
        apmh apmhVar = aqdtVar.i;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        return apmgVar == null ? apmg.a : apmgVar;
    }

    public static apmg m(aqdt aqdtVar) {
        if ((aqdtVar.b & 32) == 0) {
            return null;
        }
        apmh apmhVar = aqdtVar.h;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        return apmgVar == null ? apmg.a : apmgVar;
    }

    public static CharSequence n(aqdt aqdtVar) {
        aqyg aqygVar;
        apmg l = l(aqdtVar);
        if (l == null) {
            if ((aqdtVar.b & 4194304) != 0) {
                aqygVar = aqdtVar.q;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            return ajcq.b(aqygVar);
        }
        aqyg aqygVar2 = l.i;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        return ajcq.b(aqygVar2);
    }

    public static CharSequence o(aqdt aqdtVar) {
        aqyg aqygVar;
        apmg m = m(aqdtVar);
        if (m == null) {
            if ((aqdtVar.b & 2097152) != 0) {
                aqygVar = aqdtVar.p;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            return ajcq.b(aqygVar);
        }
        aqyg aqygVar2 = m.i;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        return ajcq.b(aqygVar2);
    }

    public static CharSequence p(aqdt aqdtVar, aahd aahdVar) {
        CharSequence[] charSequenceArr;
        CharSequence charSequence = null;
        if (aqdtVar.g.size() != 0) {
            charSequenceArr = new CharSequence[aqdtVar.g.size()];
            for (int i = 0; i < aqdtVar.g.size(); i++) {
                charSequenceArr[i] = aahk.a((aqyg) aqdtVar.g.get(i), aahdVar, false);
            }
        } else {
            charSequenceArr = null;
        }
        if (charSequenceArr == null) {
            return null;
        }
        CharSequence concat = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
        for (CharSequence charSequence2 : charSequenceArr) {
            charSequence = charSequence == null ? charSequence2 : TextUtils.concat(charSequence, concat, charSequence2);
        }
        return charSequence;
    }
}
