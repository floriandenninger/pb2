package defpackage;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hom implements amml {
    private final /* synthetic */ int a;

    public hom(int i) {
        this.a = i;
    }

    @Override // defpackage.amml
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        if (i == 0) {
            aorq aorqVar = (aorq) obj;
            aone createBuilder = aqqq.a.createBuilder();
            if ((aorqVar.b & 1) != 0) {
                int i2 = aorqVar.c;
                createBuilder.copyOnWrite();
                aqqq aqqqVar = (aqqq) createBuilder.instance;
                aqqqVar.b |= 1;
                aqqqVar.c = i2;
            }
            if ((aorqVar.b & 2) != 0) {
                int i3 = aorqVar.d;
                createBuilder.copyOnWrite();
                aqqq aqqqVar2 = (aqqq) createBuilder.instance;
                aqqqVar2.b |= 2;
                aqqqVar2.d = i3;
            }
            aont aontVar = aorqVar.e;
            createBuilder.copyOnWrite();
            aqqq aqqqVar3 = (aqqq) createBuilder.instance;
            aont aontVar2 = aqqqVar3.e;
            if (!aontVar2.c()) {
                aqqqVar3.e = aonm.mutableCopy(aontVar2);
            }
            aolo.addAll((Iterable) aontVar, (List) aqqqVar3.e);
            if ((aorqVar.b & 4) != 0) {
                int cc = amkq.cc(aorqVar.f);
                if (cc == 0 || cc != 2) {
                    createBuilder.copyOnWrite();
                    aqqq aqqqVar4 = (aqqq) createBuilder.instance;
                    aqqqVar4.f = 0;
                    aqqqVar4.b = 4 | aqqqVar4.b;
                } else {
                    createBuilder.copyOnWrite();
                    aqqq aqqqVar5 = (aqqq) createBuilder.instance;
                    aqqqVar5.f = 1;
                    aqqqVar5.b = 4 | aqqqVar5.b;
                }
            }
            return (aqqq) createBuilder.build();
        }
        if (i == 1) {
            return ((clu) obj).b;
        }
        if (i == 2) {
            axbl axblVar = (axbl) obj;
            axbl axblVar2 = axbl.ALIGN_HORIZONTAL_UNSPECIFIED;
            int ordinal = axblVar.ordinal();
            if (ordinal == 0) {
                return awag.ALIGN_HORIZONTAL_UNSPECIFIED;
            }
            if (ordinal == 1) {
                return awag.ALIGN_HORIZONTAL_ALIGN_LEFT;
            }
            if (ordinal == 2) {
                return awag.ALIGN_HORIZONTAL_ALIGN_CENTER;
            }
            if (ordinal != 3) {
                String valueOf = String.valueOf(axblVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            return awag.ALIGN_HORIZONTAL_ALIGN_RIGHT;
        }
        if (i == 3) {
            axch axchVar = (axch) obj;
            axch axchVar2 = axch.FONT_FAMILY_UNSPECIFIED;
            switch (axchVar) {
                case FONT_FAMILY_UNSPECIFIED:
                    return awah.FONT_FAMILY_UNSPECIFIED;
                case CLASSIC:
                    return awah.FONT_FAMILY_CLASSIC;
                case LIGHT:
                    return awah.FONT_FAMILY_LIGHT;
                case HEAVY:
                    return awah.FONT_FAMILY_HEAVY;
                case MARKER:
                    return awah.FONT_FAMILY_MARKER;
                case BRUSH:
                    return awah.FONT_FAMILY_BRUSH;
                case TYPEWRITER:
                    return awah.FONT_FAMILY_TYPEWRITER;
                default:
                    String valueOf2 = String.valueOf(axchVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                    sb2.append("unknown enum value: ");
                    sb2.append(valueOf2);
                    throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (i != 4) {
            if (i == 5) {
                agce agceVar = (agce) obj;
                agce agceVar2 = agce.USER_CHANGED;
                int ordinal2 = agceVar.ordinal();
                if (ordinal2 == 0) {
                    return agci.USER_CHANGED;
                }
                if (ordinal2 == 1) {
                    return agci.LOCALE_CHANGED;
                }
                if (ordinal2 != 2) {
                    String valueOf3 = String.valueOf(agceVar);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                    sb3.append("unknown enum value: ");
                    sb3.append(valueOf3);
                    throw new IllegalArgumentException(sb3.toString());
                }
                return agci.FCM_TOKEN_CHANGED;
            }
            return Boolean.valueOf(Arrays.asList(((Constructor) obj).getParameterTypes()).contains(String.class));
        }
        iow iowVar = (iow) obj;
        aone createBuilder2 = axdx.a.createBuilder();
        String str = iowVar.a;
        createBuilder2.copyOnWrite();
        axdx axdxVar = (axdx) createBuilder2.instance;
        str.getClass();
        axdxVar.b = 1 | axdxVar.b;
        axdxVar.c = str;
        String str2 = iowVar.b;
        createBuilder2.copyOnWrite();
        axdx axdxVar2 = (axdx) createBuilder2.instance;
        str2.getClass();
        axdxVar2.b = 2 | axdxVar2.b;
        axdxVar2.d = str2;
        int spanStart = iowVar.d.b.getText().getSpanStart(iowVar.c);
        createBuilder2.copyOnWrite();
        axdx axdxVar3 = (axdx) createBuilder2.instance;
        axdxVar3.b = 4 | axdxVar3.b;
        axdxVar3.e = spanStart;
        int spanEnd = iowVar.d.b.getText().getSpanEnd(iowVar.c);
        createBuilder2.copyOnWrite();
        axdx axdxVar4 = (axdx) createBuilder2.instance;
        axdxVar4.b |= 8;
        axdxVar4.f = spanEnd;
        return (axdx) createBuilder2.build();
    }
}
